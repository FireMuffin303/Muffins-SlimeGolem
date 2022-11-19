package firemuffin303.slimegolem.entity;

import firemuffin303.slimegolem.block.ModBlocks;
import firemuffin303.slimegolem.block.SlimeAlgaeBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Shearable;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.GolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.*;
import net.minecraft.util.math.random.ChunkRandom;
import net.minecraft.world.GameRules;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class SlimeGolemEntity extends GolemEntity implements Shearable {
    private static final TrackedData<Byte> SLIME_GOLEM_FLAGS;
    private static final TrackedData<Boolean> PLACE_ALGAE;
    private static final byte HAS_PUMPKIN_FLAG = 16;
    private static final float EYE_HEIGHT = 1.7F;


    protected SlimeGolemEntity(EntityType<? extends GolemEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new EscapeDangerGoal(this, 1.25D));
        this.goalSelector.add(2, new WanderAroundFarGoal(this, 1.0D, 1.0000001E-5F));
        this.goalSelector.add(3, new LookAtEntityGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.add(4, new LookAroundGoal(this));
    }

    public static DefaultAttributeContainer.Builder createAttributes() {
        return MobEntity.createMobAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 10.0D).add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.20000000298023224D);
    }

    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(SLIME_GOLEM_FLAGS, (byte)16);
        this.dataTracker.startTracking(PLACE_ALGAE,true);
    }

    @Override
    protected ActionResult interactMob(PlayerEntity player, Hand hand) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isOf(Items.SHEARS) && this.isShearable()) {
            this.sheared(SoundCategory.PLAYERS);
            this.emitGameEvent(GameEvent.SHEAR, player);
            if (!this.world.isClient) {
                itemStack.damage(1, player, (playerx) -> {
                    playerx.sendToolBreakStatus(hand);
                });
            }

            return ActionResult.success(this.world.isClient);
        }else {
            if(itemStack.isOf(Items.SLIME_BALL) && !isAllowPlaceAlgae()){
                setAllowPlaceAlgae(true);
                float g = 1.0F + (this.random.nextFloat() - this.random.nextFloat()) * 0.2F;
                this.playSound(SoundEvents.ENTITY_SLIME_SQUISH,1.0F,g);
                if(!player.getAbilities().creativeMode) {
                    itemStack.decrement(1);
                }
                return  ActionResult.success(this.world.isClient);

            } else if(itemStack.isOf(Items.HONEYCOMB) && isAllowPlaceAlgae()){
                setAllowPlaceAlgae(false);
                float g = 1.0F + (this.random.nextFloat() - this.random.nextFloat()) * 0.2F;
                this.playSound(SoundEvents.ITEM_HONEYCOMB_WAX_ON,1.0F,g);
                if(!player.getAbilities().creativeMode){
                    itemStack.decrement(1);
                }
                return ActionResult.success(this.world.isClient);
            }
            return ActionResult.PASS;
        }
    }

    @Override
    public void tickMovement() {
        super.tickMovement();
        if(this.isAllowPlaceAlgae()){
            if(!this.world.isClient){
                ChunkPos chunkPos = this.getChunkPos();
                boolean isSlimeChunk = ChunkRandom.getSlimeRandom(chunkPos.x,chunkPos.z,((StructureWorldAccess)world).getSeed(),987234911L).nextInt(10) == 0;
                int i = MathHelper.floor(this.getX());
                int j = MathHelper.floor(this.getY());
                int k = MathHelper.floor(this.getZ());
                BlockPos blockPos = new BlockPos(i, j, k);
                if(isSlimeChunk){
                    if (!this.world.getGameRules().getBoolean(GameRules.DO_MOB_GRIEFING)) {
                        return;
                    }
                    BlockState blockState = ModBlocks.SLIME_ALGAE.getDefaultState().with(SlimeAlgaeBlock.getProperty(Direction.DOWN),true);

                    for(int l = 0; l < 4; ++l) {
                        i = MathHelper.floor(this.getX() + (double)((float)(l % 2 * 2 - 1) * 0.25F));
                        j = MathHelper.floor(this.getY());
                        k = MathHelper.floor(this.getZ() + (double)((float)(l / 2 % 2 * 2 - 1) * 0.25F));
                        BlockPos blockPos2 = new BlockPos(i, j, k);
                        if (this.world.getBlockState(blockPos2).isAir() && blockState.canPlaceAt(this.world, blockPos2)) {
                            this.world.setBlockState(blockPos2, blockState);
                            this.world.emitGameEvent(GameEvent.BLOCK_PLACE, blockPos2, GameEvent.Emitter.of(this, blockState));
                        }
                    }
                }
            }
        }
    }

    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        nbt.putBoolean("PlaceAlgae",this.isAllowPlaceAlgae());
        nbt.putBoolean("Pumpkin", this.hasPumpkin());
    }

    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        if (nbt.contains("PlaceAlgae")){
            this.setAllowPlaceAlgae(nbt.getBoolean("PlaceAlgae"));
        }
        if (nbt.contains("Pumpkin")) {
            this.setHasPumpkin(nbt.getBoolean("Pumpkin"));
        }

    }

    @Override
    public void sheared(SoundCategory shearedSoundCategory) {
        this.world.playSoundFromEntity((PlayerEntity)null, this, SoundEvents.ENTITY_SNOW_GOLEM_SHEAR, shearedSoundCategory, 1.0F, 1.0F);
        if (!this.world.isClient()) {
            this.setHasPumpkin(false);
            this.dropStack(new ItemStack(Items.CARVED_PUMPKIN), 1F);
        }

    }

    @Override
    public boolean isShearable() {
        return this.isAlive() && this.hasPumpkin();
    }

    public void setAllowPlaceAlgae(boolean bl){
        this.dataTracker.set(PLACE_ALGAE,bl);
    }

    public boolean isAllowPlaceAlgae(){
        return this.dataTracker.get(PLACE_ALGAE);
    }

    public boolean hasPumpkin() {
        return ((Byte)this.dataTracker.get(SLIME_GOLEM_FLAGS) & 16) != 0;
    }

    public void setHasPumpkin(boolean hasPumpkin) {
        byte b = (Byte)this.dataTracker.get(SLIME_GOLEM_FLAGS);
        if (hasPumpkin) {
            this.dataTracker.set(SLIME_GOLEM_FLAGS, (byte)(b | 16));
        } else {
            this.dataTracker.set(SLIME_GOLEM_FLAGS, (byte)(b & -17));
        }

    }

    @Override
    public Vec3d getLeashOffset() {
        return new Vec3d(0.0D,this.getStandingEyeHeight() * 0.4D,(double)(this.getWidth() * 0.4F));
    }

    static {
        PLACE_ALGAE = DataTracker.registerData(SlimeGolemEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
        SLIME_GOLEM_FLAGS = DataTracker.registerData(SlimeGolemEntity.class, TrackedDataHandlerRegistry.BYTE);
    }
}

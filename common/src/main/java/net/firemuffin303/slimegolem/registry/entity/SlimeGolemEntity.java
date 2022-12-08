package net.firemuffin303.slimegolem.registry.entity;

import net.firemuffin303.slimegolem.registry.block.ModBlock;
import net.firemuffin303.slimegolem.registry.block.SlimeAlgaeBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Shearable;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.animal.AbstractGolem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.levelgen.WorldgenRandom;

public class SlimeGolemEntity extends AbstractGolem implements Shearable {
    private static final EntityDataAccessor<Byte> DATA_PUMPKIN_ID;
    private static final EntityDataAccessor<Boolean> PLACE_ALGAE;
    private static final byte PUMPKIN_FLAG = 16;
    protected SlimeGolemEntity(EntityType<? extends AbstractGolem> entityType, Level level) {
        super(entityType, level);
    }
    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(2, new WaterAvoidingRandomStrollGoal(this, 1.0D, 1.0000001E-5F));
        this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));

    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 10.0D).add(Attributes.MOVEMENT_SPEED, 0.20000000298023224D);
    }

    protected InteractionResult mobInteract(Player player, InteractionHand interactionHand) {
        ItemStack itemStack = player.getItemInHand(interactionHand);
        if (itemStack.is(Items.SHEARS) && this.readyForShearing()) {
            this.shear(SoundSource.PLAYERS);
            this.gameEvent(GameEvent.SHEAR, player);
            if (!this.level.isClientSide) {
                itemStack.hurtAndBreak(1, player, (playerx) -> {
                    playerx.broadcastBreakEvent(interactionHand);
                });
            }

            return InteractionResult.sidedSuccess(this.level.isClientSide);
        } else {
            if(itemStack.is(Items.SLIME_BALL) && !isAllowedPlaceAlgae()){
                setAllowPlaceAlgae(true);
                float g = 1.0F + (this.random.nextFloat() - this.random.nextFloat()) * 0.2F;
                this.playSound(SoundEvents.SLIME_SQUISH,1.0F,g);
                if(!player.getAbilities().instabuild){
                    itemStack.shrink(1);
                }
                return InteractionResult.sidedSuccess(this.level.isClientSide);
            }else if(itemStack.is(Items.HONEYCOMB) && isAllowedPlaceAlgae()){
                setAllowPlaceAlgae(false);
                float g = 1.0F + (this.random.nextFloat() - this.random.nextFloat()) * 0.2F;
                this.playSound(SoundEvents.SLIME_SQUISH,1.0F,g);
                if(!player.getAbilities().instabuild){
                    itemStack.shrink(1);
                }
                return InteractionResult.sidedSuccess(this.level.isClientSide);
            }
            return InteractionResult.PASS;
        }
    }

    @Override
    public void aiStep() {
        super.aiStep();
        if(isAllowedPlaceAlgae()){
            if (!this.level.isClientSide) {
                ChunkPos chunkPos = this.chunkPosition();
                boolean isSlimeChunk = WorldgenRandom.seedSlimeChunk(chunkPos.x, chunkPos.z, ((WorldGenLevel)level).getSeed(), 987234911L).nextInt(10) == 0;
                if(isSlimeChunk){
                    if (!this.level.getGameRules().getBoolean(GameRules.RULE_MOBGRIEFING)) {
                        return;
                    }

                    BlockState blockState = ModBlock.SLIME_ALGAE.get().defaultBlockState().setValue(SlimeAlgaeBlock.getFaceProperty(Direction.DOWN),true);

                    for(int l = 0; l < 4; ++l) {
                        int i = Mth.floor(this.getX() + (double)((float)(l % 2 * 2 - 1) * 0.25F));
                        int j = Mth.floor(this.getY());
                        int k = Mth.floor(this.getZ() + (double)((float)(l / 2 % 2 * 2 - 1) * 0.25F));
                        BlockPos blockPos2 = new BlockPos(i, j, k);
                        if (this.level.getBlockState(blockPos2).isAir() && blockState.canSurvive(this.level, blockPos2)) {
                            this.level.setBlockAndUpdate(blockPos2, blockState);
                            this.level.gameEvent(GameEvent.BLOCK_PLACE, blockPos2, GameEvent.Context.of(this, blockState));
                        }
                    }
                }
            }
        }

    }

    public boolean isAllowedPlaceAlgae(){
        return this.entityData.get(PLACE_ALGAE);
    }

    public void setAllowPlaceAlgae(boolean bl){
        this.entityData.set(PLACE_ALGAE,bl);
    }

    public boolean hasPumpkin() {
        return ((Byte)this.entityData.get(DATA_PUMPKIN_ID) & 16) != 0;
    }

    public void setPumpkin(boolean bl) {
        byte b = (Byte)this.entityData.get(DATA_PUMPKIN_ID);
        if (bl) {
            this.entityData.set(DATA_PUMPKIN_ID, (byte)(b | 16));
        } else {
            this.entityData.set(DATA_PUMPKIN_ID, (byte)(b & -17));
        }

    }

    protected SoundEvent getHurtSound(DamageSource damageSource) {
        return SoundEvents.SLIME_HURT_SMALL;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.SLIME_DEATH_SMALL;
    }


    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_PUMPKIN_ID, (byte)16);
        this.entityData.define(PLACE_ALGAE,true);
    }

    @Override
    public void shear(SoundSource soundSource) {
        this.level.playSound((Player)null, this, SoundEvents.SNOW_GOLEM_SHEAR, soundSource, 1.0F, 1.0F);
        if (!this.level.isClientSide()) {
            this.setPumpkin(false);
            this.spawnAtLocation(new ItemStack(Items.CARVED_PUMPKIN), 1.0F);
        }

    }

    @Override
    public boolean readyForShearing() {
        return this.isAlive() && this.hasPumpkin();
    }

    static {
        DATA_PUMPKIN_ID = SynchedEntityData.defineId(SlimeGolemEntity.class, EntityDataSerializers.BYTE);
        PLACE_ALGAE = SynchedEntityData.defineId(SlimeGolemEntity.class, EntityDataSerializers.BOOLEAN);
    }

}

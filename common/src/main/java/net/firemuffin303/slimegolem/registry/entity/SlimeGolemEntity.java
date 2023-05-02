package net.firemuffin303.slimegolem.registry.entity;

import com.google.common.collect.Maps;
import net.firemuffin303.slimegolem.registry.ModLootTables;
import net.firemuffin303.slimegolem.registry.block.ModBlock;
import net.firemuffin303.slimegolem.registry.block.SlimeAlgaeBlock;
import net.firemuffin303.slimegolem.registry.item.ModItem;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.animal.AbstractGolem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.*;
import net.minecraft.world.level.levelgen.WorldgenRandom;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class SlimeGolemEntity extends AbstractGolem implements Shearable {
    private static final EntityDataAccessor<Byte> DATA_PUMPKIN_ID;
    private static final EntityDataAccessor<Byte> DATA_COLOR_ID;
    private static final EntityDataAccessor<Boolean> IS_WAXED;
    private static final EntityDataAccessor<Boolean> DATA_CAN_DANCE_DROP;
    private static final EntityDataAccessor<Boolean> DATA_DANCING;
    private static final Map<DyeColor, float[]> COLORARRAY_BY_COLOR;
    private long danceDropCooldown;
    private final DynamicGameEventListener<SlimeGolemEntity.JukeboxListener> dynamicJukeboxListener;
    @Nullable
    private BlockPos jukebox;

    protected SlimeGolemEntity(EntityType<? extends AbstractGolem> entityType, Level level) {
        super(entityType, level);
        PositionSource positionSource = new EntityPositionSource(this, this.getEyeHeight());
        this.dynamicJukeboxListener = new DynamicGameEventListener(new SlimeGolemEntity.JukeboxListener(positionSource, GameEvent.JUKEBOX_PLAY.getNotificationRadius()));
    }

    private static float[] createSlimeColor(DyeColor dyeColor) {
        if (dyeColor == DyeColor.WHITE) {
            return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
        } else if(dyeColor == DyeColor.LIME){
            return new float[]{0.4588235f, 0.7254901f, 0.3921568f};
        }else{
            float[] fs = dyeColor.getTextureDiffuseColors();
            return new float[]{fs[0] , fs[1] , fs[2]};
        }
    }

    public static float[] getColorArray(DyeColor dyeColor) {
        return COLORARRAY_BY_COLOR.get(dyeColor);
    }

    public DyeColor getColor() {
        return DyeColor.byId(this.entityData.get(DATA_COLOR_ID) & 15);
    }

    public void setColor(DyeColor dyeColor) {
        byte b = this.entityData.get(DATA_COLOR_ID);
        this.entityData.set(DATA_COLOR_ID, (byte)(b & 240 | dyeColor.getId() & 15));
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

    @Override
    public void aiStep() {
        super.aiStep();
        if(!isWaxed()){
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

        if (this.isDancing() && this.shouldStopDancing() && this.tickCount % 20 == 0) {
            this.setDancing(false);
            this.jukebox = null;
        }

        this.updateDanceDropCooldown();
    }

    private boolean shouldStopDancing() {
        return this.jukebox == null || !this.jukebox.closerToCenterThan(this.position(), (double)GameEvent.JUKEBOX_PLAY.getNotificationRadius()) || !this.level.getBlockState(this.jukebox).is(Blocks.JUKEBOX);
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
        }else if((itemStack.getItem() instanceof DyeItem item)){
            if(this.isAlive() && this.getColor() != item.getDyeColor()){
                this.level.playSound(player,this, SoundEvents.DYE_USE,SoundSource.PLAYERS,1.0f,1.0f);
                if(!player.level.isClientSide ){
                    this.setColor(item.getDyeColor());
                    if(!player.getAbilities().instabuild){
                        itemStack.shrink(1);
                    }
                }
                return InteractionResult.sidedSuccess(this.level.isClientSide);
            }
        }else if(itemStack.is(Items.SLIME_BALL) && isWaxed()){
            setWax(false);
            float g = 1.0F + (this.random.nextFloat() - this.random.nextFloat()) * 0.2F;
            this.playSound(SoundEvents.SLIME_SQUISH,1.0F,g);
            if(!player.getAbilities().instabuild){
                itemStack.shrink(1);
            }
            return InteractionResult.sidedSuccess(this.level.isClientSide);

        }else if(itemStack.is(Items.HONEYCOMB) && !isWaxed()){
            setWax(true);
            float g = 1.0F + (this.random.nextFloat() - this.random.nextFloat()) * 0.2F;
            this.playSound(SoundEvents.SLIME_SQUISH,1.0F,g);
            if(!player.getAbilities().instabuild){
                itemStack.shrink(1);
            }
            return InteractionResult.sidedSuccess(this.level.isClientSide);

        }else if(itemStack.is(ModItem.SLIME_PIE.get()) && this.canDanceDrop() && this.isDancing()){
            dropDanceItem(player);
            if (!player.getAbilities().instabuild) {
                itemStack.shrink(1);
            }
            this.spawnHeartParticle();
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

    private void dropDanceItem(Player player){
        if(!this.level.isClientSide) {
            LootTable table = this.level.getServer().getLootTables().get(ModLootTables.SLIME_GOLEM_DANCE_DROP);
            List<ItemStack> list = table.getRandomItems((new LootContext.Builder((ServerLevel) this.level)).withParameter(LootContextParams.ORIGIN,this.position()).withParameter(LootContextParams.THIS_ENTITY, this).withRandom(this.level.random).create(LootContextParamSets.GIFT));
            if (!list.isEmpty()) {
                Iterator<ItemStack> iterator = list.iterator();

                while (iterator.hasNext()) {
                    ItemStack itemStack = iterator.next();
                    this.spawnAtLocation(itemStack, 1);
                    this.resetDanceDropCooldown();
                    float g = 1.0F + (this.random.nextFloat() - this.random.nextFloat()) * 0.2F;
                    this.playSound(SoundEvents.SLIME_SQUISH, 1.0f, g);
                }
            }
        }
    }



    public void addAdditionalSaveData(CompoundTag compoundTag) {
        super.addAdditionalSaveData(compoundTag);
        compoundTag.putBoolean("IsWaxed", this.isWaxed());
        compoundTag.putBoolean("Pumpkin",this.hasPumpkin());
        compoundTag.putByte("Color", (byte)this.getColor().getId());
        compoundTag.putBoolean("CanDanceDrop",this.canDanceDrop());
        compoundTag.putLong("DanceDropCooldown",this.danceDropCooldown);
    }

    public void readAdditionalSaveData(CompoundTag compoundTag) {
        super.readAdditionalSaveData(compoundTag);
        this.setWax(compoundTag.getBoolean("IsWaxed"));
        this.setPumpkin(compoundTag.getBoolean("Pumpkin"));
        this.setColor(DyeColor.byId(compoundTag.getByte("Color")));
        this.entityData.set(DATA_CAN_DANCE_DROP,compoundTag.getBoolean("CanDanceDrop"));
        this.danceDropCooldown = compoundTag.getInt("DanceDropCooldown");

    }

    @Override
    public void updateDynamicGameEventListener(BiConsumer<DynamicGameEventListener<?>, ServerLevel> biConsumer) {
        Level level = this.level;
        if(level instanceof ServerLevel serverLevel){
            biConsumer.accept(this.dynamicJukeboxListener,serverLevel);
        }
    }

    public boolean isWaxed(){
        return this.entityData.get(IS_WAXED);
    }

    public void setWax(boolean bl){
        this.entityData.set(IS_WAXED,bl);
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

    public void setJukeboxPlaying(BlockPos blockPos, boolean bl) {
        if (bl) {
            if (!this.isDancing()) {
                this.jukebox = blockPos;
                this.setDancing(true);
            }
        } else if (blockPos.equals(this.jukebox) || this.jukebox == null) {
            this.jukebox = null;
            this.setDancing(false);
        }
    }

    public void setDancing(boolean bl){
        if(!this.level.isClientSide){
            this.entityData.set(DATA_DANCING,bl);
        }
    }

    public boolean isDancing(){
        return this.entityData.get(DATA_DANCING);
    }

    private void resetDanceDropCooldown(){
        this.danceDropCooldown = 6000L;
        this.entityData.set(DATA_CAN_DANCE_DROP,false);
    }

    private void updateDanceDropCooldown(){
        if(this.danceDropCooldown > 0L){
            --this.danceDropCooldown;
        }

        if(!this.level.isClientSide() && this.danceDropCooldown == 0L && !this.canDanceDrop()){
            this.entityData.set(DATA_CAN_DANCE_DROP,true);
        }
    }

    private boolean canDanceDrop(){
        return this.entityData.get(DATA_CAN_DANCE_DROP);
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
        this.entityData.define(IS_WAXED,false);
        this.entityData.define(DATA_COLOR_ID, (byte)DyeColor.LIME.getId());
        this.entityData.define(DATA_CAN_DANCE_DROP,false);
        this.entityData.define(DATA_DANCING,false);
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

    @Override
    public Vec3 getLeashOffset() {
        return new Vec3(0.0D,this.getEyeHeight() * 0.6D,this.getBbWidth()*0.1D);
    }

    private void spawnHeartParticle() {
        double d = this.random.nextGaussian() * 0.02D;
        double e = this.random.nextGaussian() * 0.02D;
        double f = this.random.nextGaussian() * 0.02D;
        this.level.addParticle(ParticleTypes.HEART, this.getRandomX(1.0D), this.getRandomY() + 0.5D, this.getRandomZ(1.0D), d, e, f);
    }

    static {
        DATA_PUMPKIN_ID = SynchedEntityData.defineId(SlimeGolemEntity.class, EntityDataSerializers.BYTE);
        IS_WAXED = SynchedEntityData.defineId(SlimeGolemEntity.class, EntityDataSerializers.BOOLEAN);
        DATA_CAN_DANCE_DROP = SynchedEntityData.defineId(SlimeGolemEntity.class,EntityDataSerializers.BOOLEAN);
        DATA_DANCING = SynchedEntityData.defineId(SlimeGolemEntity.class,EntityDataSerializers.BOOLEAN);
        DATA_COLOR_ID = SynchedEntityData.defineId(SlimeGolemEntity.class, EntityDataSerializers.BYTE);
        COLORARRAY_BY_COLOR = Maps.newEnumMap((Map) Arrays.stream(DyeColor.values()).collect(Collectors.toMap((dyeColor) -> {
            return dyeColor;
        }, SlimeGolemEntity::createSlimeColor)));
    }

    class JukeboxListener implements GameEventListener {
        private final PositionSource listenerSource;
        private final int listenerRadius;

        public JukeboxListener(PositionSource positionSource, int i) {
            this.listenerSource = positionSource;
            this.listenerRadius = i;
        }

        public PositionSource getListenerSource() {
            return this.listenerSource;
        }

        public int getListenerRadius() {
            return this.listenerRadius;
        }

        public boolean handleGameEvent(ServerLevel serverLevel, GameEvent.Message message) {
            if (message.gameEvent() == GameEvent.JUKEBOX_PLAY) {
                SlimeGolemEntity.this.setJukeboxPlaying(new BlockPos(message.source()), true);
                return true;
            } else if (message.gameEvent() == GameEvent.JUKEBOX_STOP_PLAY) {
                SlimeGolemEntity.this.setJukeboxPlaying(new BlockPos(message.source()), false);
                return true;
            } else {
                return false;
            }
        }
    }
}

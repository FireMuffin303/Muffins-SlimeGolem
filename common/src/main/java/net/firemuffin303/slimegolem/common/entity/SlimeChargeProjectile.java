package net.firemuffin303.slimegolem.common.entity;

import com.mojang.logging.LogUtils;
import net.firemuffin303.slimegolem.common.registry.ModTags;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.event.ItemEvent;
import java.util.List;

public class SlimeChargeProjectile extends AbstractHurtingProjectile implements ItemSupplier {
    protected boolean isGrounded;
    protected int lifeTime;
    @Nullable
    protected BlockState stickTo;
    public SlimeChargeProjectile(EntityType<? extends AbstractHurtingProjectile> entityType, Level level) {
        super(entityType, level);
        this.lifeTime = 500;
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        super.defineSynchedData(builder);
    }


    @Override
    public void tick() {
        super.tick();
        if(this.isGrounded){
            if(!this.level().isClientSide){
                if(this.lifeTime < 0){
                    this.discard();
                }

                List<Projectile> projectiles = this.level().getEntitiesOfClass(Projectile.class,this.getBoundingBox(),projectile -> {
                    return  !projectile.getType().is(ModTags.CAN_GO_PASS_SLIME_CHARGE);
                });

                if(!projectiles.isEmpty()){
                    for (Projectile projectile : projectiles){
                        //projectile.makeStuckInBlock(this.level().getBlockState(this.blockPosition()),new Vec3(0.25, 0.05000000074505806, 0.25));
                        if(projectile instanceof AbstractArrow abstractArrow){
                            ItemStack itemStack = abstractArrow.getPickupItemStackOrigin().copy();
                            ItemEntity item = new ItemEntity(this.level(),abstractArrow.getX(),abstractArrow.getY(),abstractArrow.getZ(),itemStack);
                            this.level().addFreshEntity(item);
                            abstractArrow.discard();
                        }
                    }
                }
            }


            List<LivingEntity> list = this.level().getEntitiesOfClass(LivingEntity.class,this.getBoundingBox(),livingEntity -> {
                return  !livingEntity.isSpectator() && !livingEntity.hasEffect(MobEffects.OOZING);
            });

            if(!list.isEmpty()){
                for (LivingEntity livingEntity : list){
                    livingEntity.makeStuckInBlock(this.level().getBlockState(this.blockPosition()),new Vec3(0.66, 0.25000000074505806, 0.66));
                }
            }

            this.lifeTime--;
        }else {
            this.applyGravity();
        }
    }

    @Override
    protected void onHitBlock(BlockHitResult blockHitResult) {
        this.stickTo = this.level().getBlockState(blockHitResult.getBlockPos());
        super.onHitBlock(blockHitResult);
        Vec3 vec3 = blockHitResult.getLocation().subtract(this.getX(), this.getY(), this.getZ());
        this.setDeltaMovement(vec3);
        Vec3 vec32 = vec3.normalize().scale(0.05000000074505806);
        this.setPosRaw(this.getX() - vec32.x, this.getY() - vec32.y, this.getZ() - vec32.z);
        this.isGrounded = true;
    }

    @Override
    protected boolean shouldBurn() {
        return false;
    }

    public boolean isGrounded(){
        return this.isGrounded;
    }

    @Override
    protected boolean canHitEntity(Entity entity) {
        if(entity instanceof SlimeChargeProjectile){
            return true;
        }
        return super.canHitEntity(entity);
    }

    @Override
    public boolean isPickable() {
        return false;
    }



    @Override
    public boolean save(CompoundTag compoundTag) {
        compoundTag.putBoolean("isGrounded",this.isGrounded);
        compoundTag.putInt("lifeTime",this.lifeTime);
        return super.save(compoundTag);
    }

    @Override
    public void load(CompoundTag compoundTag) {
        super.load(compoundTag);
        this.isGrounded = compoundTag.getBoolean("isGrounded");
        this.lifeTime = compoundTag.getInt("lifeTime");
    }



    @Override
    public ItemStack getItem() {
        return ItemStack.EMPTY;
    }

    @Override
    protected @Nullable ParticleOptions getTrailParticle() {
        return null;
    }

    @Override
    protected double getDefaultGravity() {
        return 0.045;
    }
}

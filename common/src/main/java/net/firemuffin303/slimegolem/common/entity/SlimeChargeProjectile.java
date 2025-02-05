package net.firemuffin303.slimegolem.common.entity;

import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.firemuffin303.slimegolem.common.registry.ModMobEffects;
import net.firemuffin303.slimegolem.common.registry.ModParticleTypes;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.ProjectileDeflection;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.ExplosionDamageCalculator;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.SimpleExplosionDamageCalculator;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class SlimeChargeProjectile extends AbstractHurtingProjectile implements ItemSupplier {
    private int noDeflectTicks = 5;
    protected static final ExplosionDamageCalculator EXPLOSION_DAMAGE_CALCULATOR = new SimpleExplosionDamageCalculator(false,false, Optional.of(0f),Optional.empty());

    public SlimeChargeProjectile(EntityType<? extends AbstractHurtingProjectile> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public void tick() {
        if (!this.level().isClientSide && this.getBlockY() > this.level().getMaxBuildHeight() + 30) {
            this.explode();
            this.discard();
        } else {
            super.tick();
            this.applyGravity();
            if (this.noDeflectTicks > 0) {
                --this.noDeflectTicks;
            }
        }
    }

    @Override
    public boolean deflect(ProjectileDeflection projectileDeflection, @Nullable Entity entity, @Nullable Entity entity2, boolean bl) {
        return this.noDeflectTicks <= 0 && super.deflect(projectileDeflection, entity, entity2, bl);
    }

    @Override
    protected void onHitBlock(BlockHitResult blockHitResult) {
        super.onHitBlock(blockHitResult);
        this.explode();
        this.discard();
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        if(!this.level().isClientSide){
            Entity entity = entityHitResult.getEntity();
            LivingEntity attacker = null;
            if(this.getOwner() instanceof LivingEntity livingEntity){
                attacker = livingEntity;
                attacker.setLastHurtMob(entity);
            }

            DamageSource damageSource = new DamageSource(this.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(MuffinsSlimeGolemMod.SLIME_CHARGE),this,attacker);
            if(entity.hurt(damageSource,1.0f) && entity instanceof LivingEntity hitEntity){
                EnchantmentHelper.doPostAttackEffects((ServerLevel) this.level(),hitEntity,damageSource);
            }
            this.explode();
        }

    }

    @Override
    protected boolean canHitEntity(Entity entity) {
        if (entity instanceof SlimeChargeProjectile) {
            return false;
        } else {
            return entity.getType() != EntityType.END_CRYSTAL && super.canHitEntity(entity);
        }
    }

    @Override
    public boolean canCollideWith(Entity entity) {
        return !(entity instanceof SlimeChargeProjectile) && super.canCollideWith(entity);
    }

    @Override
    protected void onHit(HitResult hitResult) {
        super.onHit(hitResult);
        if(!this.level().isClientSide){
            this.discard();
        }
    }

    @Override
    protected boolean shouldBurn() {
        return false;
    }

    @Override
    public boolean isPickable() {
        return false;
    }

    @Override
    public ItemStack getItem() {
        return ItemStack.EMPTY;
    }

    @Override
    protected @Nullable ParticleOptions getTrailParticle() {
        return ParticleTypes.ITEM_SLIME;
    }

    @Override
    protected double getDefaultGravity() {
        return 0.045;
    }

    private void explode(){
        this.level().explode(this,null,EXPLOSION_DAMAGE_CALCULATOR,this.position().x(),this.position().y(),this.position().z(),2.0f,false, Level.ExplosionInteraction.NONE, ModParticleTypes.SLIME_SPLASH.get(),ModParticleTypes.SLIME_SPLASH.get(), Holder.direct(SoundEvents.SLIME_ATTACK));

    }

    public static void onLivingEntityHit(LivingEntity livingEntity){
        livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN,100,1));
        livingEntity.addEffect(new MobEffectInstance(ModMobEffects.BOUNCE.get(),20*30,0));
        livingEntity.resetFallDistance();
    }
}

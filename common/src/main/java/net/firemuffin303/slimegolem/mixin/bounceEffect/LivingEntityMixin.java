package net.firemuffin303.slimegolem.mixin.bounceEffect;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.firemuffin303.slimegolem.common.registry.ModMobEffects;
import net.firemuffin303.slimegolem.common.registry.ModParticleTypes;
import net.minecraft.core.Holder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {

    @Shadow public abstract boolean hasEffect(Holder<MobEffect> holder);

    @Shadow public abstract void remove(Entity.RemovalReason removalReason);

    @WrapOperation(method = "causeFallDamage",at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;causeFallDamage(FFLnet/minecraft/world/damagesource/DamageSource;)Z"))
    public boolean muffins_slimeGolem$causeFallDamage(LivingEntity instance, float f, float g, DamageSource damageSource, Operation<Boolean> original){
        if(instance.hasEffect(ModMobEffects.BOUNCE.get())){
            return false;
        }
        return original.call(instance, f, g, damageSource);
    }

    @WrapOperation(method = "calculateFallDamage",at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/EntityType;is(Lnet/minecraft/tags/TagKey;)Z"))
    public boolean muffins_slimeGolem$calculateFallDamage(EntityType<?> instance, TagKey<EntityType<?>> tagKey, Operation<Boolean> original){
        if(this.hasEffect(ModMobEffects.BOUNCE.get())){
            ((LivingEntity)(Object)this).level().addParticle(ModParticleTypes.SLIME_TRAIL.get(),false,((LivingEntity)(Object)this).position().x,((LivingEntity)(Object)this).position().y()+0.01,((LivingEntity)(Object)this).position().z(),0,0,0);

            return true;
        }
        return original.call(instance,tagKey);
    }

}

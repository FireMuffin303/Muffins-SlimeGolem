package net.firemuffin303.slimegolem.mixin.slimeChargeBehavior;

import net.firemuffin303.slimegolem.common.entity.SlimeChargeProjectile;
import net.firemuffin303.slimegolem.common.registry.ModEntityTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends EntityMixin {

    @Override
    public void onExplosionHit(Entity entity, CallbackInfo ci) {
        super.onExplosionHit(entity, ci);
        if(entity.getType() == ModEntityTypes.SLIME_CHARGE.get()){
            SlimeChargeProjectile.onLivingEntityHit((LivingEntity) (Object)this);
        }
    }
}

package net.firemuffin303.slimegolem.mixin.slimeChargeBehavior;

import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Entity.class)
public abstract class EntityMixin {
    @Inject(method = "onExplosionHit",at = @At("TAIL"))
    public void onExplosionHit(Entity entity, CallbackInfo ci){

    }
}

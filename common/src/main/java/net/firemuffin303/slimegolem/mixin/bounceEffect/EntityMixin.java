package net.firemuffin303.slimegolem.mixin.bounceEffect;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.firemuffin303.slimegolem.common.registry.ModMobEffects;
import net.firemuffin303.slimegolem.common.registry.ModParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Debug(export = true)
@Mixin(Entity.class)
public abstract class EntityMixin {

    @Shadow public abstract Level level();

    @Shadow public abstract InteractionResult interact(Player player, InteractionHand interactionHand);

    @Shadow public abstract Vec3 position();

    @Shadow public abstract boolean isSuppressingBounce();

    @WrapOperation(method = "move",at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/Block;updateEntityAfterFallOn(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/world/entity/Entity;)V"))
    public void muffins_slimeGolem$move(Block instance, BlockGetter blockGetter, Entity entity, Operation<Void> original){
        if(((Entity)(Object)this) instanceof LivingEntity livingEntity && livingEntity.hasEffect(ModMobEffects.BOUNCE.get()) && !livingEntity.isSuppressingBounce()){
            Vec3 vec3d = livingEntity.getDeltaMovement();
            if (vec3d.y < 0.0D) {
                double d = 1D * (livingEntity.getEffect(ModMobEffects.BOUNCE.get()).getAmplifier() + 1);
                livingEntity.setDeltaMovement(vec3d.x, -vec3d.y * d, vec3d.z);
            }
        }else{
            original.call(instance,blockGetter,entity);
        }

    }
}

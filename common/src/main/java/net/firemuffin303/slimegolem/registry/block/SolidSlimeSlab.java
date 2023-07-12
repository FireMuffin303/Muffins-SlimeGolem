package net.firemuffin303.slimegolem.registry.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

public class SolidSlimeSlab extends SlabBlock {
    public SolidSlimeSlab(Properties properties) {
        super(properties);
    }

    public void fallOn(Level level, BlockState blockState, BlockPos blockPos, Entity entity, float fallDistance) {
        if (entity.isSuppressingBounce()) {
            super.fallOn(level, blockState, blockPos, entity, fallDistance);
        } else {
            entity.causeFallDamage(fallDistance, 0.0F, level.damageSources().fall());
        }

    }

    public void updateEntityAfterFallOn(BlockGetter blockGetter, Entity entity) {
        if (entity.isSuppressingBounce()) {
            super.updateEntityAfterFallOn(blockGetter, entity);
        } else {
            this.bounce(entity);
        }

    }

    private void bounce(Entity entity) {
        Vec3 vec3d = entity.getDeltaMovement();
        if (vec3d.y < 0.0D) {
            double d = entity instanceof LivingEntity ? 0.5D : 0.4D;
            entity.setDeltaMovement(vec3d.x, -vec3d.y * d, vec3d.z);
        }

    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        double d = Math.abs(entity.getDeltaMovement().y);
        if (d < 0.1D && !entity.isSteppingCarefully()) {
            double e = 0.4D + d * 0.2D;
            entity.setDeltaMovement(entity.getDeltaMovement().multiply(e, 1.0D, e));
        }
        super.stepOn(level, pos, state, entity);
    }
}

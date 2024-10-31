package net.firemuffin303.slimegolem.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import net.firemuffin303.slimegolem.common.registry.ModBlockTags;
import net.firemuffin303.slimegolem.common.registry.ModParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.Property;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.Arrays;
import java.util.List;

@Mixin(CampfireBlock.class)
public abstract class CampfireBlockMixin {

/*
    @ModifyReturnValue(method = "getStateForPlacement",at = @At("RETURN"))
    public BlockState muffins_slimegolem$getStateForPlacement(BlockState original, @Local(argsOnly = true)BlockPlaceContext blockPlaceContext){
        LevelAccessor levelAccessor = blockPlaceContext.getLevel();
        BlockPos blockPos = blockPlaceContext.getClickedPos();
        return original.setValue(CURSED_SLIME_FIRE,this.muffins_slimegolem$isSlimeBlockBelow(levelAccessor.getBlockState(blockPos.below())));
    }

 */

    /*
    @ModifyReturnValue(method = "updateShape",at = @At("RETURN"))
    public BlockState muffins_slimegolem$updateShape(BlockState original, @Local(argsOnly = true, ordinal = 0) BlockState blockStateLocalRef
            , @Local(argsOnly = true,ordinal = 1) BlockState blockStateLocalRef1, @Local(argsOnly = true) Direction directionLocalRef){
        return directionLocalRef == Direction.DOWN && blockStateLocalRef.is(Blocks.SOUL_CAMPFIRE) ?
                blockStateLocalRef.setValue(CURSED_SLIME_FIRE,this.muffins_slimegolem$isSlimeBlockBelow(blockStateLocalRef1)) : original;
    }

     */

    @ModifyVariable(method = "makeParticles", at = @At(value = "LOAD"))
    private static SimpleParticleType muffins_slimegolem$makeParticles(SimpleParticleType value, @Local(argsOnly = true) Level level, @Local(argsOnly = true)BlockPos blockPos){
        BlockState blockState = level.getBlockState(blockPos);
        BlockState blockBelow = level.getBlockState(blockPos.below());
        value = blockState.is(Blocks.SOUL_CAMPFIRE) && blockBelow.is(ModBlockTags.PACKED_SLIME_BLOCK) ? ModParticleTypes.CURSED_SLIME_SOUL.get() : value;

        return value;
    }


    @Unique
    public boolean muffins_slimegolem$isSlimeBlockBelow(BlockState blockState){
        return blockState.is(ModBlockTags.PACKED_SLIME_BLOCK);
    }
}

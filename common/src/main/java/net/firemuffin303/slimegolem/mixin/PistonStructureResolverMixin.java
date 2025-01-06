package net.firemuffin303.slimegolem.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.firemuffin303.slimegolem.common.registry.ModTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.piston.PistonStructureResolver;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(PistonStructureResolver.class)
public abstract class PistonStructureResolverMixin {
    @ModifyReturnValue(method = "isSticky",at = @At("RETURN"))
    private static boolean muffins_slimegolem$isSticky(boolean original, @Local(argsOnly = true)BlockState blockState){
        return blockState.is(ModTags.PACKED_SLIME_BLOCK) || original;
    }

    @ModifyReturnValue(method = "canStickToEachOther",at = @At(value = "RETURN",ordinal = 2))
    private static boolean muffins_slimegolem$canStickToEachOther(boolean original, @Local(argsOnly = true,ordinal = 0) BlockState blockState,@Local(argsOnly = true,ordinal = 1) BlockState blockState1){
        if((blockState.is(Blocks.HONEY_BLOCK) && blockState1.is(ModTags.PACKED_SLIME_BLOCK)) || (blockState.is(ModTags.PACKED_SLIME_BLOCK) && blockState1.is(Blocks.HONEY_BLOCK))){
            return false;
        }else if(blockState.is(ModTags.PACKED_SLIME_BLOCK) && blockState1.is(Blocks.SLIME_BLOCK) || (blockState.is(Blocks.SLIME_BLOCK) && blockState1.is(ModTags.PACKED_SLIME_BLOCK))){
            return true;
        }else{
            return original;
        }

    }
}

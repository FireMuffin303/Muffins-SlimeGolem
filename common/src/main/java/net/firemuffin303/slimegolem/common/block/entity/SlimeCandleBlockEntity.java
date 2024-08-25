package net.firemuffin303.slimegolem.common.block.entity;

import net.firemuffin303.slimegolem.common.registry.ModBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class SlimeCandleBlockEntity extends BlockEntity {
    public SlimeCandleBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(BlockEntityType.BARREL, blockPos, blockState);
    }

    public static void tick(Level arg, BlockPos arg2, BlockState arg3, SlimeCandleBlockEntity arg4){

    }
}

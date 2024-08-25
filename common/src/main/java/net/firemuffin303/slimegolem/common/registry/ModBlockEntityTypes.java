package net.firemuffin303.slimegolem.common.registry;

import net.firemuffin303.slimegolem.ModPlatform;
import net.firemuffin303.slimegolem.common.block.entity.SlimeCandleBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public class ModBlockEntityTypes {
    //public static final Supplier<BlockEntityType<SlimeCandleBlockEntity>> SLIME_CANDLE =  registerBlockEntity("",SlimeCandleBlockEntity::new,ModBlock.SLIME_CANDLE.get());

    private static <T extends BlockEntity> Supplier<BlockEntityType<T>> registerBlockEntity(String id, BlockEntitySupplier<T> blockEntityType, Block block){
        return () -> ModPlatform.registerBlockEntity(id,blockEntityType,block);
    }

    @FunctionalInterface
    public interface BlockEntitySupplier<T extends BlockEntity> {
        T create(BlockPos blockPos, BlockState blockState);
    }
}

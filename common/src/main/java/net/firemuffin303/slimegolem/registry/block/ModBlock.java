package net.firemuffin303.slimegolem.registry.block;

import net.firemuffin303.slimegolem.ModPlatform;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class ModBlock {

    public static final Supplier<Block> PACKED_SLIME_BLOCK = ModPlatform.registerBlock("packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).friction(0.8F).sound(SoundType.SLIME_BLOCK).noOcclusion()));
    public static final Supplier<Block> SLIME_ALGAE = ModPlatform.registerBlock("slime_algae",() -> new SlimeAlgaeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).friction(0.8F).sound(SoundType.SLIME_BLOCK).noOcclusion().strength(0.2F).noCollission()));

    public static void init(){
    }
}

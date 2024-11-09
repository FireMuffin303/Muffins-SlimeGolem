package net.firemuffin303.slimegolem.common.registry;

import net.firemuffin303.slimegolem.ModPlatform;
import net.firemuffin303.slimegolem.common.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.ArrayList;
import java.util.function.Supplier;

public class ModBlock {
    public static final ArrayList<Supplier<Block>> BLOCKS = new ArrayList<>();

    public static final Supplier<Block> SLIME_ALGAE = registerBlock("slime_algae",() -> new SlimeAlgaeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SLIME_BLOCK).friction(0.8F).sound(SoundType.SLIME_BLOCK).noOcclusion().strength(0.2F).noCollission()));

    public static final Supplier<Block> PACKED_SLIME_BLOCK = registerBlock("packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SLIME_BLOCK).friction(0.8F).sound(SoundType.SLIME_BLOCK).noOcclusion().strength(0.8F)));
    public static final Supplier<Block> PACKED_SLIME_BRICKS = registerSlimeBlock("packed_slime_bricks");
    public static final Supplier<Block> CHISELED_PACKED_SLIME_BLOCK = registerSlimeBlock("chiseled_packed_slime_block");
    public static final Supplier<Block> PACKED_SLIME_STAIR = registerSlimeStair("packed_slime_stair");
    public static final Supplier<Block> PACKED_SLIME_SLAB = registerSlimeSlab("packed_slime_slab");
    public static final Supplier<Block> PACKED_SLIME_WALL = registerSlimeWall("packed_slime_wall");
    public static final Supplier<Block> PACKED_SLIME_BRICK_STAIR = registerSlimeStair("packed_slime_brick_stair");
    public static final Supplier<Block> PACKED_SLIME_BRICK_SLAB = registerSlimeSlab("packed_slime_brick_slab");
    public static final Supplier<Block> PACKED_SLIME_BRICK_WALL = registerSlimeWall("packed_slime_brick_wall");

    private static <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> blockSupplier) {
        return ModPlatform.registerBlock(id, blockSupplier);
    }

    private static Supplier<Block> registerSlimeBlock(String id){
        return registerBlock(id,() -> new SolidSlimeBlock(BlockBehaviour.Properties.ofFullCopy(ModBlock.PACKED_SLIME_BLOCK.get())));
    }

    private static Supplier<Block> registerSlimeSlab(String id){
        return registerBlock(id,() -> new SolidSlimeSlab(BlockBehaviour.Properties.ofFullCopy(PACKED_SLIME_BLOCK.get())));
    }

    private static Supplier<Block> registerSlimeStair(String id){
        return registerBlock(id,() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(PACKED_SLIME_BLOCK.get())));
    }

    private static Supplier<Block> registerSlimeWall(String id){
        return registerBlock(id,() -> new SolidSlimeWall(BlockBehaviour.Properties.ofFullCopy(PACKED_SLIME_BLOCK.get())));
    }

    public static void init(){
    }
}

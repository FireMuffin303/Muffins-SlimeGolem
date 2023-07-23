package net.firemuffin303.slimegolem.common.registry;

import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.firemuffin303.slimegolem.common.block.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class ModBlock {
    public static final ResourcefulRegistry<Block> BLOCKS = ResourcefulRegistries.create(BuiltInRegistries.BLOCK, MuffinsSlimeGolemMod.MOD_ID);
    public static final ResourcefulRegistry<Block> SLIME_BLOCKS = ResourcefulRegistries.create(BLOCKS);
    public static final ResourcefulRegistry<Block> SLIME_STAIR = ResourcefulRegistries.create(BLOCKS);
    public static final ResourcefulRegistry<Block> SLIME_SLAB = ResourcefulRegistries.create(BLOCKS);
    public static final ResourcefulRegistry<Block> SLIME_WALL = ResourcefulRegistries.create(BLOCKS);

    public static final RegistryEntry<Block> SLIME_ALGAE = registerBlock("slime_algae",() -> new SlimeAlgaeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).friction(0.8F).sound(SoundType.SLIME_BLOCK).noOcclusion().strength(0.2F).noCollission()));

    public static final  RegistryEntry<Block> PACKED_SLIME_BLOCK = registerBlock("packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).friction(0.8F).sound(SoundType.SLIME_BLOCK).noOcclusion().strength(0.8F)));
    public static final  RegistryEntry<Block> PACKED_SLIME_BRICKS = registerSlimeBlock("packed_slime_bricks");
    public static final  RegistryEntry<Block> CHISELED_PACKED_SLIME_BLOCK = registerSlimeBlock("chiseled_packed_slime_block");
    public static final  RegistryEntry<Block> PACKED_SLIME_STAIR = registerSlimeStair("packed_slime_stair");
    public static final  RegistryEntry<Block> PACKED_SLIME_SLAB = registerSlimeSlab("packed_slime_slab");
    public static final  RegistryEntry<Block> PACKED_SLIME_WALL = registerSlimeWall("packed_slime_wall");
    public static final  RegistryEntry<Block> PACKED_SLIME_BRICK_STAIR = registerSlimeStair("packed_slime_brick_stair");
    public static final  RegistryEntry<Block> PACKED_SLIME_BRICK_SLAB = registerSlimeSlab("packed_slime_brick_slab");
    public static final  RegistryEntry<Block> PACKED_SLIME_BRICK_WALL = registerSlimeWall("packed_slime_brick_wall");

    public static final RegistryEntry<Block> WHITE_PACKED_SLIME_BLOCK = registerSlimeBlock("white_packed_slime_block");
    public static final RegistryEntry<Block> WHITE_PACKED_SLIME_BRICKS = registerSlimeBlock("white_packed_slime_bricks");
    public static final RegistryEntry<Block> WHITE_CHISELED_PACKED_SLIME_BLOCK = registerSlimeBlock("white_chiseled_packed_slime_block");
    public static final RegistryEntry<Block> WHITE_PACKED_SLIME_SLAB = registerSlimeSlab("white_packed_slime_slab");
    public static final RegistryEntry<Block> WHITE_PACKED_SLIME_STAIR = registerSlimeStair("white_packed_slime_stair");
    public static final RegistryEntry<Block> WHITE_PACKED_SLIME_WALL = registerSlimeWall("white_packed_slime_wall");
    public static final RegistryEntry<Block> WHITE_PACKED_SLIME_BRICK_STAIR = registerSlimeStair("white_packed_slime_brick_stair");
    public static final RegistryEntry<Block> WHITE_PACKED_SLIME_BRICK_SLAB = registerSlimeSlab("white_packed_slime_brick_slab");
    public static final RegistryEntry<Block> WHITE_PACKED_SLIME_BRICK_WALL = registerSlimeWall("white_packed_slime_brick_wall");

    public static final RegistryEntry<Block> LIGHT_GRAY_PACKED_SLIME_BLOCK = registerSlimeBlock("light_gray_packed_slime_block");
    public static final RegistryEntry<Block> LIGHT_GRAY_PACKED_SLIME_BRICKS = registerSlimeBlock("light_gray_packed_slime_bricks");
    public static final RegistryEntry<Block> LIGHT_GRAY_CHISELED_PACKED_SLIME_BLOCK = registerSlimeBlock("light_gray_chiseled_packed_slime_block");
    public static final RegistryEntry<Block> LIGHT_GRAY_PACKED_SLIME_STAIR = registerSlimeStair("light_gray_packed_slime_stair");
    public static final RegistryEntry<Block> LIGHT_GRAY_PACKED_SLIME_SLAB = registerSlimeSlab("light_gray_packed_slime_slab");
    public static final RegistryEntry<Block> LIGHT_GRAY_PACKED_SLIME_WALL = registerSlimeWall("light_gray_packed_slime_wall");
    public static final RegistryEntry<Block> LIGHT_GRAY_PACKED_SLIME_BRICK_SLAB = registerSlimeSlab("light_gray_packed_slime_brick_slab");
    public static final RegistryEntry<Block> LIGHT_GRAY_PACKED_SLIME_BRICK_STAIR = registerSlimeStair("light_gray_packed_slime_brick_stair");
    public static final RegistryEntry<Block> LIGHT_GRAY_PACKED_SLIME_BRICK_WALL = registerSlimeWall("light_gray_packed_slime_brick_wall");

    public static final RegistryEntry<Block> GRAY_PACKED_SLIME_BLOCK = registerSlimeBlock("gray_packed_slime_block");
    public static final RegistryEntry<Block> GRAY_PACKED_SLIME_BRICKS = registerSlimeBlock("gray_packed_slime_bricks");
    public static final RegistryEntry<Block> GRAY_CHISELED_PACKED_SLIME_BLOCK = registerSlimeBlock("gray_chiseled_packed_slime_block");
    public static final RegistryEntry<Block> GRAY_PACKED_SLIME_STAIR = registerSlimeStair("gray_packed_slime_stair");
    public static final RegistryEntry<Block> GRAY_PACKED_SLIME_SLAB = registerSlimeSlab("gray_packed_slime_slab");
    public static final RegistryEntry<Block> GRAY_PACKED_SLIME_WALL = registerSlimeWall("gray_packed_slime_wall");
    public static final RegistryEntry<Block> GRAY_PACKED_SLIME_BRICK_SLAB = registerSlimeSlab("gray_packed_slime_brick_slab");
    public static final RegistryEntry<Block> GRAY_PACKED_SLIME_BRICK_STAIR = registerSlimeStair("gray_packed_slime_brick_stair");
    public static final RegistryEntry<Block> GRAY_PACKED_SLIME_BRICK_WALL = registerSlimeWall("gray_packed_slime_brick_wall");

    public static final RegistryEntry<Block> BLACK_PACKED_SLIME_BLOCK = registerSlimeBlock("black_packed_slime_block");
    public static final RegistryEntry<Block> BLACK_PACKED_SLIME_BRICKS = registerSlimeBlock("black_packed_slime_bricks");
    public static final RegistryEntry<Block> BLACK_CHISELED_PACKED_SLIME_BLOCK = registerSlimeBlock("black_chiseled_packed_slime_block");
    public static final RegistryEntry<Block> BLACK_PACKED_SLIME_STAIR = registerSlimeStair("black_packed_slime_stair");
    public static final RegistryEntry<Block> BLACK_PACKED_SLIME_SLAB = registerSlimeSlab("black_packed_slime_slab");
    public static final RegistryEntry<Block> BLACK_PACKED_SLIME_WALL = registerSlimeWall("black_packed_slime_wall");
    public static final RegistryEntry<Block> BLACK_PACKED_SLIME_BRICK_SLAB = registerSlimeSlab("black_packed_slime_brick_slab");
    public static final RegistryEntry<Block> BLACK_PACKED_SLIME_BRICK_STAIR = registerSlimeStair("black_packed_slime_brick_stair");
    public static final RegistryEntry<Block> BLACK_PACKED_SLIME_BRICK_WALL = registerSlimeWall("black_packed_slime_brick_wall");

    public static final RegistryEntry<Block> BROWN_PACKED_SLIME_BLOCK = registerSlimeBlock("brown_packed_slime_block");
    public static final RegistryEntry<Block> BROWN_PACKED_SLIME_BRICKS = registerSlimeBlock("brown_packed_slime_bricks");
    public static final RegistryEntry<Block> BROWN_CHISELED_PACKED_SLIME_BLOCK = registerSlimeBlock("brown_chiseled_packed_slime_block");
    public static final RegistryEntry<Block> BROWN_PACKED_SLIME_STAIR = registerSlimeStair("brown_packed_slime_stair");
    public static final RegistryEntry<Block> BROWN_PACKED_SLIME_SLAB = registerSlimeSlab("brown_packed_slime_slab");
    public static final RegistryEntry<Block> BROWN_PACKED_SLIME_WALL = registerSlimeWall("brown_packed_slime_wall");
    public static final RegistryEntry<Block> BROWN_PACKED_SLIME_BRICK_SLAB = registerSlimeSlab("brown_packed_slime_brick_slab");
    public static final RegistryEntry<Block> BROWN_PACKED_SLIME_BRICK_STAIR = registerSlimeStair("brown_packed_slime_brick_stair");
    public static final RegistryEntry<Block> BROWN_PACKED_SLIME_BRICK_WALL = registerSlimeWall("brown_packed_slime_brick_wall");

    public static final RegistryEntry<Block> RED_PACKED_SLIME_BLOCK = registerSlimeBlock("red_packed_slime_block");
    public static final RegistryEntry<Block> RED_PACKED_SLIME_BRICKS = registerSlimeBlock("red_packed_slime_bricks");
    public static final RegistryEntry<Block> RED_CHISELED_PACKED_SLIME_BLOCK = registerSlimeBlock("red_chiseled_packed_slime_block");
    public static final RegistryEntry<Block> RED_PACKED_SLIME_STAIR = registerSlimeStair("red_packed_slime_stair");
    public static final RegistryEntry<Block> RED_PACKED_SLIME_SLAB = registerSlimeSlab("red_packed_slime_slab");
    public static final RegistryEntry<Block> RED_PACKED_SLIME_WALL = registerSlimeWall("red_packed_slime_wall");
    public static final RegistryEntry<Block> RED_PACKED_SLIME_BRICK_SLAB = registerSlimeSlab("red_packed_slime_brick_slab");
    public static final RegistryEntry<Block> RED_PACKED_SLIME_BRICK_STAIR = registerSlimeStair("red_packed_slime_brick_stair");
    public static final RegistryEntry<Block> RED_PACKED_SLIME_BRICK_WALL = registerSlimeWall("red_packed_slime_brick_wall");

    public static final RegistryEntry<Block> ORANGE_PACKED_SLIME_BLOCK = registerSlimeBlock("orange_packed_slime_block");
    public static final RegistryEntry<Block> ORANGE_PACKED_SLIME_BRICKS = registerSlimeBlock("orange_packed_slime_bricks");
    public static final RegistryEntry<Block> ORANGE_CHISELED_PACKED_SLIME_BLOCK = registerSlimeBlock("orange_chiseled_packed_slime_block");
    public static final RegistryEntry<Block> ORANGE_PACKED_SLIME_STAIR = registerSlimeStair("orange_packed_slime_stair");
    public static final RegistryEntry<Block> ORANGE_PACKED_SLIME_SLAB =  registerSlimeSlab("orange_packed_slime_slab");
    public static final RegistryEntry<Block> ORANGE_PACKED_SLIME_WALL =  registerSlimeWall("orange_packed_slime_wall");
    public static final RegistryEntry<Block> ORANGE_PACKED_SLIME_BRICK_SLAB =   registerSlimeSlab("orange_packed_slime_brick_slab");
    public static final RegistryEntry<Block> ORANGE_PACKED_SLIME_BRICK_STAIR =  registerSlimeStair("orange_packed_slime_brick_stair");
    public static final RegistryEntry<Block> ORANGE_PACKED_SLIME_BRICK_WALL =   registerSlimeWall("orange_packed_slime_brick_wall");

    public static final RegistryEntry<Block> YELLOW_PACKED_SLIME_BLOCK = registerSlimeBlock("yellow_packed_slime_block");
    public static final RegistryEntry<Block> YELLOW_PACKED_SLIME_BRICKS = registerSlimeBlock("yellow_packed_slime_bricks");
    public static final RegistryEntry<Block> YELLOW_CHISELED_PACKED_SLIME_BLOCK = registerSlimeBlock("yellow_chiseled_packed_slime_block");
    public static final RegistryEntry<Block> YELLOW_PACKED_SLIME_STAIR = registerSlimeStair("yellow_packed_slime_stair");
    public static final RegistryEntry<Block> YELLOW_PACKED_SLIME_SLAB = registerSlimeSlab("yellow_packed_slime_slab");
    public static final RegistryEntry<Block> YELLOW_PACKED_SLIME_WALL = registerSlimeWall("yellow_packed_slime_wall");
    public static final RegistryEntry<Block> YELLOW_PACKED_SLIME_BRICK_SLAB = registerSlimeSlab("yellow_packed_slime_brick_slab");
    public static final RegistryEntry<Block> YELLOW_PACKED_SLIME_BRICK_STAIR = registerSlimeStair("yellow_packed_slime_brick_stair");
    public static final RegistryEntry<Block> YELLOW_PACKED_SLIME_BRICK_WALL = registerSlimeWall("yellow_packed_slime_brick_wall");

    public static final RegistryEntry<Block> LIME_PACKED_SLIME_BLOCK = registerSlimeBlock("lime_packed_slime_block");
    public static final RegistryEntry<Block> LIME_PACKED_SLIME_BRICKS = registerSlimeBlock("lime_packed_slime_bricks");
    public static final RegistryEntry<Block> LIME_CHISELED_PACKED_SLIME_BLOCK = registerSlimeBlock("lime_chiseled_packed_slime_block");
    public static final RegistryEntry<Block> LIME_PACKED_SLIME_STAIR = registerSlimeStair("lime_packed_slime_stair");
    public static final RegistryEntry<Block> LIME_PACKED_SLIME_SLAB = registerSlimeSlab("lime_packed_slime_slab");
    public static final RegistryEntry<Block> LIME_PACKED_SLIME_WALL = registerSlimeWall("lime_packed_slime_wall");
    public static final RegistryEntry<Block> LIME_PACKED_SLIME_BRICK_SLAB = registerSlimeSlab("lime_packed_slime_brick_slab");
    public static final RegistryEntry<Block> LIME_PACKED_SLIME_BRICK_STAIR = registerSlimeStair("lime_packed_slime_brick_stair");
    public static final RegistryEntry<Block> LIME_PACKED_SLIME_BRICK_WALL = registerSlimeWall("lime_packed_slime_brick_wall");

    public static final RegistryEntry<Block> GREEN_PACKED_SLIME_BLOCK = registerSlimeBlock("green_packed_slime_block");
    public static final RegistryEntry<Block> GREEN_PACKED_SLIME_BRICKS = registerSlimeBlock("green_packed_slime_bricks");
    public static final RegistryEntry<Block> GREEN_CHISELED_PACKED_SLIME_BLOCK = registerSlimeBlock("green_chiseled_packed_slime_block");
    public static final RegistryEntry<Block> GREEN_PACKED_SLIME_STAIR = registerSlimeStair("green_packed_slime_stair");
    public static final RegistryEntry<Block> GREEN_PACKED_SLIME_SLAB = registerSlimeSlab("green_packed_slime_slab");
    public static final RegistryEntry<Block> GREEN_PACKED_SLIME_WALL = registerSlimeWall("green_packed_slime_wall");
    public static final RegistryEntry<Block> GREEN_PACKED_SLIME_BRICK_SLAB = registerSlimeSlab("green_packed_slime_brick_slab");
    public static final RegistryEntry<Block> GREEN_PACKED_SLIME_BRICK_STAIR = registerSlimeStair("green_packed_slime_brick_stair");
    public static final RegistryEntry<Block> GREEN_PACKED_SLIME_BRICK_WALL = registerSlimeWall("green_packed_slime_brick_wall");

    public static final RegistryEntry<Block> CYAN_PACKED_SLIME_BLOCK = registerSlimeBlock("cyan_packed_slime_block");
    public static final RegistryEntry<Block> CYAN_PACKED_SLIME_BRICKS = registerSlimeBlock("cyan_packed_slime_bricks");
    public static final RegistryEntry<Block> CYAN_CHISELED_PACKED_SLIME_BLOCK = registerSlimeBlock("cyan_chiseled_packed_slime_block");
    public static final RegistryEntry<Block> CYAN_PACKED_SLIME_STAIR = registerSlimeStair("cyan_packed_slime_stair");
    public static final RegistryEntry<Block> CYAN_PACKED_SLIME_SLAB = registerSlimeSlab("cyan_packed_slime_slab");
    public static final RegistryEntry<Block> CYAN_PACKED_SLIME_WALL = registerSlimeWall("cyan_packed_slime_wall");
    public static final RegistryEntry<Block> CYAN_PACKED_SLIME_BRICK_SLAB = registerSlimeSlab("cyan_packed_slime_brick_slab");
    public static final RegistryEntry<Block> CYAN_PACKED_SLIME_BRICK_STAIR = registerSlimeStair("cyan_packed_slime_brick_stair");
    public static final RegistryEntry<Block> CYAN_PACKED_SLIME_BRICK_WALL = registerSlimeWall("cyan_packed_slime_brick_wall");

    public static final RegistryEntry<Block> LIGHT_BLUE_PACKED_SLIME_BLOCK = registerSlimeBlock("light_blue_packed_slime_block");
    public static final RegistryEntry<Block> LIGHT_BLUE_PACKED_SLIME_BRICKS = registerSlimeBlock("light_blue_packed_slime_bricks");
    public static final RegistryEntry<Block> LIGHT_BLUE_CHISELED_PACKED_SLIME_BLOCK = registerSlimeBlock("light_blue_chiseled_packed_slime_block");
    public static final RegistryEntry<Block> LIGHT_BLUE_PACKED_SLIME_STAIR = registerSlimeStair("light_blue_packed_slime_stair");
    public static final RegistryEntry<Block> LIGHT_BLUE_PACKED_SLIME_SLAB = registerSlimeSlab("light_blue_packed_slime_slab");
    public static final RegistryEntry<Block> LIGHT_BLUE_PACKED_SLIME_WALL = registerSlimeWall("light_blue_packed_slime_wall");
    public static final RegistryEntry<Block> LIGHT_BLUE_PACKED_SLIME_BRICK_SLAB = registerSlimeSlab("light_blue_packed_slime_brick_slab");
    public static final RegistryEntry<Block> LIGHT_BLUE_PACKED_SLIME_BRICK_STAIR = registerSlimeStair("light_blue_packed_slime_brick_stair");
    public static final RegistryEntry<Block> LIGHT_BLUE_PACKED_SLIME_BRICK_WALL = registerSlimeWall("light_blue_packed_slime_brick_wall");

    public static final RegistryEntry<Block> BLUE_PACKED_SLIME_BLOCK = registerSlimeBlock("blue_packed_slime_block");
    public static final RegistryEntry<Block> BLUE_PACKED_SLIME_BRICKS = registerSlimeBlock("blue_packed_slime_bricks");
    public static final RegistryEntry<Block> BLUE_CHISELED_PACKED_SLIME_BLOCK = registerSlimeBlock("blue_chiseled_packed_slime_block");
    public static final RegistryEntry<Block> BLUE_PACKED_SLIME_STAIR = registerSlimeStair("blue_packed_slime_stair");
    public static final RegistryEntry<Block> BLUE_PACKED_SLIME_SLAB = registerSlimeSlab("blue_packed_slime_slab");
    public static final RegistryEntry<Block> BLUE_PACKED_SLIME_WALL = registerSlimeWall("blue_packed_slime_wall");
    public static final RegistryEntry<Block> BLUE_PACKED_SLIME_BRICK_SLAB = registerSlimeSlab("blue_packed_slime_brick_slab");
    public static final RegistryEntry<Block> BLUE_PACKED_SLIME_BRICK_STAIR = registerSlimeStair("blue_packed_slime_brick_stair");
    public static final RegistryEntry<Block> BLUE_PACKED_SLIME_BRICK_WALL = registerSlimeWall("blue_packed_slime_brick_wall");

    public static final RegistryEntry<Block> PURPLE_PACKED_SLIME_BLOCK = registerSlimeBlock("purple_packed_slime_block");
    public static final RegistryEntry<Block> PURPLE_PACKED_SLIME_BRICKS = registerSlimeBlock("purple_packed_slime_bricks");
    public static final RegistryEntry<Block> PURPLE_CHISELED_PACKED_SLIME_BLOCK = registerSlimeBlock("purple_chiseled_packed_slime_block");
    public static final RegistryEntry<Block> PURPLE_PACKED_SLIME_STAIR = registerSlimeStair("purple_packed_slime_stair");
    public static final RegistryEntry<Block> PURPLE_PACKED_SLIME_SLAB = registerSlimeSlab("purple_packed_slime_slab");
    public static final RegistryEntry<Block> PURPLE_PACKED_SLIME_WALL = registerSlimeWall("purple_packed_slime_wall");
    public static final RegistryEntry<Block> PURPLE_PACKED_SLIME_BRICK_SLAB = registerSlimeSlab("purple_packed_slime_brick_slab");
    public static final RegistryEntry<Block> PURPLE_PACKED_SLIME_BRICK_STAIR = registerSlimeStair("purple_packed_slime_brick_stair");
    public static final RegistryEntry<Block> PURPLE_PACKED_SLIME_BRICK_WALL = registerSlimeWall("purple_packed_slime_brick_wall");

    public static final RegistryEntry<Block> MAGENTA_PACKED_SLIME_BLOCK = registerSlimeBlock("magenta_packed_slime_block");
    public static final RegistryEntry<Block> MAGENTA_PACKED_SLIME_BRICKS = registerSlimeBlock("magenta_packed_slime_bricks");
    public static final RegistryEntry<Block> MAGENTA_CHISELED_PACKED_SLIME_BLOCK = registerSlimeBlock("magenta_chiseled_packed_slime_block");
    public static final RegistryEntry<Block> MAGENTA_PACKED_SLIME_STAIR = registerSlimeStair("magenta_packed_slime_stair");
    public static final RegistryEntry<Block> MAGENTA_PACKED_SLIME_SLAB = registerSlimeSlab("magenta_packed_slime_slab");
    public static final RegistryEntry<Block> MAGENTA_PACKED_SLIME_WALL = registerSlimeWall("magenta_packed_slime_wall");
    public static final RegistryEntry<Block> MAGENTA_PACKED_SLIME_BRICK_SLAB = registerSlimeSlab("magenta_packed_slime_brick_slab");
    public static final RegistryEntry<Block> MAGENTA_PACKED_SLIME_BRICK_STAIR = registerSlimeStair("magenta_packed_slime_brick_stair");
    public static final RegistryEntry<Block> MAGENTA_PACKED_SLIME_BRICK_WALL = registerSlimeWall("magenta_packed_slime_brick_wall");

    public static final RegistryEntry<Block> PINK_PACKED_SLIME_BLOCK = registerSlimeBlock("pink_packed_slime_block");
    public static final RegistryEntry<Block> PINK_PACKED_SLIME_BRICKS = registerSlimeBlock("pink_packed_slime_bricks");
    public static final RegistryEntry<Block> PINK_CHISELED_PACKED_SLIME_BLOCK = registerSlimeBlock("pink_chiseled_packed_slime_block");
    public static final RegistryEntry<Block> PINK_PACKED_SLIME_STAIR = registerSlimeStair("pink_packed_slime_stair");
    public static final RegistryEntry<Block> PINK_PACKED_SLIME_SLAB = registerSlimeSlab("pink_packed_slime_slab");
    public static final RegistryEntry<Block> PINK_PACKED_SLIME_WALL = registerSlimeWall("pink_packed_slime_wall");
    public static final RegistryEntry<Block> PINK_PACKED_SLIME_BRICK_SLAB = registerSlimeSlab("pink_packed_slime_brick_slab");
    public static final RegistryEntry<Block> PINK_PACKED_SLIME_BRICK_STAIR = registerSlimeStair("pink_packed_slime_brick_stair");
    public static final RegistryEntry<Block> PINK_PACKED_SLIME_BRICK_WALL = registerSlimeWall("pink_packed_slime_brick_wall");


    private static RegistryEntry<Block> registerBlock(String id, Supplier<Block> blockSupplier){
        return BLOCKS.register(id,blockSupplier);
    }

    private static RegistryEntry<Block> registerSlimeBlock(String id){
        return SLIME_BLOCKS.register(id,() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(ModBlock.PACKED_SLIME_BLOCK.get())));
    }

    private static RegistryEntry<Block> registerSlimeSlab(String id){
        return  SLIME_SLAB.register(id,() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    }

    private static RegistryEntry<Block> registerSlimeStair(String id){
        return SLIME_STAIR.register(id,() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    }

    private static RegistryEntry<Block> registerSlimeWall(String id){
        return SLIME_WALL.register(id,() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    }

    public static void init(){
    }
}

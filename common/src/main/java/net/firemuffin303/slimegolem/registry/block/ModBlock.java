package net.firemuffin303.slimegolem.registry.block;

import net.firemuffin303.slimegolem.ModPlatform;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class ModBlock {

    public static final Supplier<Block> SLIME_ALGAE = ModPlatform.registerBlock("slime_algae",() -> new SlimeAlgaeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).friction(0.8F).sound(SoundType.SLIME_BLOCK).noOcclusion().strength(0.2F).noCollission()));

    public static final Supplier<Block> PACKED_SLIME_BLOCK = ModPlatform.registerBlock("packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).friction(0.8F).sound(SoundType.SLIME_BLOCK).noOcclusion().strength(0.8F)));
    public static final Supplier<Block> PACKED_SLIME_BRICKS = ModPlatform.registerBlock("packed_slime_bricks",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(ModBlock.PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("chiseled_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> PACKED_SLIME_SLAB = ModPlatform.registerBlock("packed_slime_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> PACKED_SLIME_STAIR = ModPlatform.registerBlock("packed_slime_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> PACKED_SLIME_WALL = ModPlatform.registerBlock("packed_slime_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> PACKED_SLIME_BRICK_SLAB = ModPlatform.registerBlock("packed_slime_brick_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> PACKED_SLIME_BRICK_STAIR = ModPlatform.registerBlock("packed_slime_brick_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> PACKED_SLIME_BRICK_WALL = ModPlatform.registerBlock("packed_slime_brick_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));


    public static final Supplier<Block> WHITE_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("white_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> WHITE_PACKED_SLIME_BRICKS = ModPlatform.registerBlock("white_packed_slime_bricks",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> WHITE_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("white_chiseled_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> WHITE_PACKED_SLIME_SLAB = ModPlatform.registerBlock("white_packed_slime_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> WHITE_PACKED_SLIME_STAIR = ModPlatform.registerBlock("white_packed_slime_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> WHITE_PACKED_SLIME_WALL = ModPlatform.registerBlock("white_packed_slime_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> WHITE_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerBlock("white_packed_slime_brick_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> WHITE_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerBlock("white_packed_slime_brick_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> WHITE_PACKED_SLIME_BRICK_WALL = ModPlatform.registerBlock("white_packed_slime_brick_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));

    public static final Supplier<Block> ORANGE_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("orange_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> ORANGE_PACKED_SLIME_BRICKS = ModPlatform.registerBlock("orange_packed_slime_bricks",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> ORANGE_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("orange_chiseled_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> ORANGE_PACKED_SLIME_SLAB = ModPlatform.registerBlock("orange_packed_slime_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> ORANGE_PACKED_SLIME_STAIR = ModPlatform.registerBlock("orange_packed_slime_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> ORANGE_PACKED_SLIME_WALL = ModPlatform.registerBlock("orange_packed_slime_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> ORANGE_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerBlock("orange_packed_slime_brick_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> ORANGE_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerBlock("orange_packed_slime_brick_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> ORANGE_PACKED_SLIME_BRICK_WALL = ModPlatform.registerBlock("orange_packed_slime_brick_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));

    public static final Supplier<Block> MAGENTA_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("magenta_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> MAGENTA_PACKED_SLIME_BRICKS = ModPlatform.registerBlock("magenta_packed_slime_bricks",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> MAGENTA_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("magenta_chiseled_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> MAGENTA_PACKED_SLIME_SLAB = ModPlatform.registerBlock("magenta_packed_slime_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> MAGENTA_PACKED_SLIME_STAIR = ModPlatform.registerBlock("magenta_packed_slime_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> MAGENTA_PACKED_SLIME_WALL = ModPlatform.registerBlock("magenta_packed_slime_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> MAGENTA_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerBlock("magenta_packed_slime_brick_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> MAGENTA_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerBlock("magenta_packed_slime_brick_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> MAGENTA_PACKED_SLIME_BRICK_WALL = ModPlatform.registerBlock("magenta_packed_slime_brick_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));


    public static final Supplier<Block> LIGHT_BLUE_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("light_blue_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> LIGHT_BLUE_PACKED_SLIME_BRICKS = ModPlatform.registerBlock("light_blue_packed_slime_bricks",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> LIGHT_BLUE_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("light_blue_chiseled_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> LIGHT_BLUE_PACKED_SLIME_SLAB = ModPlatform.registerBlock("light_blue_packed_slime_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> LIGHT_BLUE_PACKED_SLIME_STAIR = ModPlatform.registerBlock("light_blue_packed_slime_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> LIGHT_BLUE_PACKED_SLIME_WALL = ModPlatform.registerBlock("light_blue_packed_slime_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> LIGHT_BLUE_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerBlock("light_blue_packed_slime_brick_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> LIGHT_BLUE_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerBlock("light_blue_packed_slime_brick_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> LIGHT_BLUE_PACKED_SLIME_BRICK_WALL = ModPlatform.registerBlock("light_blue_packed_slime_brick_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));


    public static final Supplier<Block> YELLOW_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("yellow_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> YELLOW_PACKED_SLIME_BRICKS = ModPlatform.registerBlock("yellow_packed_slime_bricks",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> YELLOW_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("yellow_chiseled_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> YELLOW_PACKED_SLIME_SLAB = ModPlatform.registerBlock("yellow_packed_slime_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> YELLOW_PACKED_SLIME_STAIR = ModPlatform.registerBlock("yellow_packed_slime_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> YELLOW_PACKED_SLIME_WALL = ModPlatform.registerBlock("yellow_packed_slime_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> YELLOW_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerBlock("yellow_packed_slime_brick_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> YELLOW_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerBlock("yellow_packed_slime_brick_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> YELLOW_PACKED_SLIME_BRICK_WALL = ModPlatform.registerBlock("yellow_packed_slime_brick_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));

    public static final Supplier<Block> LIME_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("lime_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> LIME_PACKED_SLIME_BRICKS = ModPlatform.registerBlock("lime_packed_slime_bricks",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> LIME_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("lime_chiseled_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> LIME_PACKED_SLIME_SLAB = ModPlatform.registerBlock("lime_packed_slime_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> LIME_PACKED_SLIME_STAIR = ModPlatform.registerBlock("lime_packed_slime_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> LIME_PACKED_SLIME_WALL = ModPlatform.registerBlock("lime_packed_slime_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> LIME_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerBlock("lime_packed_slime_brick_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> LIME_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerBlock("lime_packed_slime_brick_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> LIME_PACKED_SLIME_BRICK_WALL = ModPlatform.registerBlock("lime_packed_slime_brick_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));

    public static final Supplier<Block> PINK_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("pink_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> PINK_PACKED_SLIME_BRICKS = ModPlatform.registerBlock("pink_packed_slime_bricks",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> PINK_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("pink_chiseled_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> PINK_PACKED_SLIME_SLAB = ModPlatform.registerBlock("pink_packed_slime_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> PINK_PACKED_SLIME_STAIR = ModPlatform.registerBlock("pink_packed_slime_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> PINK_PACKED_SLIME_WALL = ModPlatform.registerBlock("pink_packed_slime_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> PINK_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerBlock("pink_packed_slime_brick_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> PINK_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerBlock("pink_packed_slime_brick_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> PINK_PACKED_SLIME_BRICK_WALL = ModPlatform.registerBlock("pink_packed_slime_brick_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));

    public static final Supplier<Block> GRAY_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("gray_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> GRAY_PACKED_SLIME_BRICKS = ModPlatform.registerBlock("gray_packed_slime_bricks",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> GRAY_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("gray_chiseled_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> GRAY_PACKED_SLIME_SLAB = ModPlatform.registerBlock("gray_packed_slime_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> GRAY_PACKED_SLIME_STAIR = ModPlatform.registerBlock("gray_packed_slime_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> GRAY_PACKED_SLIME_WALL = ModPlatform.registerBlock("gray_packed_slime_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> GRAY_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerBlock("gray_packed_slime_brick_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> GRAY_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerBlock("gray_packed_slime_brick_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> GRAY_PACKED_SLIME_BRICK_WALL = ModPlatform.registerBlock("gray_packed_slime_brick_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));

    public static final Supplier<Block> LIGHT_GRAY_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("light_gray_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> LIGHT_GRAY_PACKED_SLIME_BRICKS = ModPlatform.registerBlock("light_gray_packed_slime_bricks",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> LIGHT_GRAY_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("light_gray_chiseled_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> LIGHT_GRAY_PACKED_SLIME_SLAB = ModPlatform.registerBlock("light_gray_packed_slime_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> LIGHT_GRAY_PACKED_SLIME_STAIR = ModPlatform.registerBlock("light_gray_packed_slime_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> LIGHT_GRAY_PACKED_SLIME_WALL = ModPlatform.registerBlock("light_gray_packed_slime_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> LIGHT_GRAY_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerBlock("light_gray_packed_slime_brick_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> LIGHT_GRAY_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerBlock("light_gray_packed_slime_brick_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> LIGHT_GRAY_PACKED_SLIME_BRICK_WALL = ModPlatform.registerBlock("light_gray_packed_slime_brick_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));


    public static final Supplier<Block> CYAN_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("cyan_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> CYAN_PACKED_SLIME_BRICKS = ModPlatform.registerBlock("cyan_packed_slime_bricks",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> CYAN_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("cyan_chiseled_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> CYAN_PACKED_SLIME_SLAB = ModPlatform.registerBlock("cyan_packed_slime_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> CYAN_PACKED_SLIME_STAIR = ModPlatform.registerBlock("cyan_packed_slime_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> CYAN_PACKED_SLIME_WALL = ModPlatform.registerBlock("cyan_packed_slime_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> CYAN_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerBlock("cyan_packed_slime_brick_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> CYAN_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerBlock("cyan_packed_slime_brick_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> CYAN_PACKED_SLIME_BRICK_WALL = ModPlatform.registerBlock("cyan_packed_slime_brick_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));


    public static final Supplier<Block> PURPLE_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("purple_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> PURPLE_PACKED_SLIME_BRICKS = ModPlatform.registerBlock("purple_packed_slime_bricks",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> PURPLE_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("purple_chiseled_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> PURPLE_PACKED_SLIME_SLAB = ModPlatform.registerBlock("purple_packed_slime_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> PURPLE_PACKED_SLIME_STAIR = ModPlatform.registerBlock("purple_packed_slime_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> PURPLE_PACKED_SLIME_WALL = ModPlatform.registerBlock("purple_packed_slime_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> PURPLE_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerBlock("purple_packed_slime_brick_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> PURPLE_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerBlock("purple_packed_slime_brick_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> PURPLE_PACKED_SLIME_BRICK_WALL = ModPlatform.registerBlock("purple_packed_slime_brick_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));

    public static final Supplier<Block> BLUE_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("blue_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> BLUE_PACKED_SLIME_BRICKS = ModPlatform.registerBlock("blue_packed_slime_bricks",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> BLUE_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("blue_chiseled_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> BLUE_PACKED_SLIME_SLAB = ModPlatform.registerBlock("blue_packed_slime_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> BLUE_PACKED_SLIME_STAIR = ModPlatform.registerBlock("blue_packed_slime_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> BLUE_PACKED_SLIME_WALL = ModPlatform.registerBlock("blue_packed_slime_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> BLUE_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerBlock("blue_packed_slime_brick_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> BLUE_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerBlock("blue_packed_slime_brick_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> BLUE_PACKED_SLIME_BRICK_WALL = ModPlatform.registerBlock("blue_packed_slime_brick_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));

    public static final Supplier<Block> BROWN_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("brown_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> BROWN_PACKED_SLIME_BRICKS = ModPlatform.registerBlock("brown_packed_slime_bricks",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> BROWN_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("brown_chiseled_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> BROWN_PACKED_SLIME_SLAB = ModPlatform.registerBlock("brown_packed_slime_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> BROWN_PACKED_SLIME_STAIR = ModPlatform.registerBlock("brown_packed_slime_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> BROWN_PACKED_SLIME_WALL = ModPlatform.registerBlock("brown_packed_slime_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> BROWN_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerBlock("brown_packed_slime_brick_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> BROWN_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerBlock("brown_packed_slime_brick_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> BROWN_PACKED_SLIME_BRICK_WALL = ModPlatform.registerBlock("brown_packed_slime_brick_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));


    public static final Supplier<Block> GREEN_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("green_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> GREEN_PACKED_SLIME_BRICKS = ModPlatform.registerBlock("green_packed_slime_bricks",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> GREEN_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("green_chiseled_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> GREEN_PACKED_SLIME_SLAB = ModPlatform.registerBlock("green_packed_slime_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> GREEN_PACKED_SLIME_STAIR = ModPlatform.registerBlock("green_packed_slime_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> GREEN_PACKED_SLIME_WALL = ModPlatform.registerBlock("green_packed_slime_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> GREEN_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerBlock("green_packed_slime_brick_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> GREEN_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerBlock("green_packed_slime_brick_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> GREEN_PACKED_SLIME_BRICK_WALL = ModPlatform.registerBlock("green_packed_slime_brick_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));


    public static final Supplier<Block> RED_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("red_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> RED_PACKED_SLIME_BRICKS = ModPlatform.registerBlock("red_packed_slime_bricks",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> RED_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("red_chiseled_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> RED_PACKED_SLIME_SLAB = ModPlatform.registerBlock("red_packed_slime_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> RED_PACKED_SLIME_STAIR = ModPlatform.registerBlock("red_packed_slime_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> RED_PACKED_SLIME_WALL = ModPlatform.registerBlock("red_packed_slime_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> RED_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerBlock("red_packed_slime_brick_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> RED_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerBlock("red_packed_slime_brick_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> RED_PACKED_SLIME_BRICK_WALL = ModPlatform.registerBlock("red_packed_slime_brick_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));


    public static final Supplier<Block> BLACK_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("black_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> BLACK_PACKED_SLIME_BRICKS = ModPlatform.registerBlock("black_packed_slime_bricks",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> BLACK_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerBlock("black_chiseled_packed_slime_block",() -> new SolidSlimeBlock(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> BLACK_PACKED_SLIME_SLAB = ModPlatform.registerBlock("black_packed_slime_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> BLACK_PACKED_SLIME_STAIR = ModPlatform.registerBlock("black_packed_slime_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> BLACK_PACKED_SLIME_WALL = ModPlatform.registerBlock("black_packed_slime_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> BLACK_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerBlock("black_packed_slime_brick_slab",() -> new SolidSlimeSlab(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> BLACK_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerBlock("black_packed_slime_brick_stair",() -> new SolidSlimeStair(PACKED_SLIME_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));
    public static final Supplier<Block> BLACK_PACKED_SLIME_BRICK_WALL = ModPlatform.registerBlock("black_packed_slime_brick_wall",() -> new SolidSlimeWall(BlockBehaviour.Properties.copy(PACKED_SLIME_BLOCK.get())));



    public static void init(){
    }
}

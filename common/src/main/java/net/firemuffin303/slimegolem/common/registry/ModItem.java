package net.firemuffin303.slimegolem.common.registry;

import net.firemuffin303.slimegolem.ModPlatform;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;

import java.util.ArrayList;
import java.util.function.Supplier;

import static net.firemuffin303.slimegolem.ModPlatform.registerSpawnEgg;

public class ModItem {
    public static final  ArrayList<Supplier<Item>> ITEMS = new ArrayList<>();

    public static final Supplier<Item> SLIME_PIE = registerItem("slime_pie",() -> new Item(new Item.Properties().food(ModFoods.SLIME_PIE)));
    public static final Supplier<Item> SLIME_GOLEM_SPAWN_EGG = registerItem("slime_golem_spawn_egg", () -> new SpawnEggItem(ModEntityTypes.SLIME_GOLEM.get(),1619264,7665522,new Item.Properties()));
    public static final Supplier<Item> MUSIC_DISC_BOUNCYSLIME = registerItem("music_disc_bouncyslime",() -> new Item(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> MUSIC_DISC_BOUNCE_TIL_THE_END = registerItem("music_disc_bounce_til_the_end",() -> new Item(new Item.Properties().stacksTo(1)));
    public static final Supplier<Item> SLIME_ALGAE = registerItem("slime_algae",() -> new BlockItem(ModBlock.SLIME_ALGAE.get(),new Item.Properties()));

    public static final Supplier<Item> PACKED_SLIME_BLOCK = registerItem("packed_slime_block",() -> new BlockItem(ModBlock.PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> PACKED_SLIME_STAIR = registerItem("packed_slime_stair",() -> new BlockItem(ModBlock.PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> PACKED_SLIME_SLAB = registerItem("packed_slime_slab",() -> new BlockItem(ModBlock.PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> PACKED_SLIME_WALL = registerItem("packed_slime_wall",() -> new BlockItem(ModBlock.PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final Supplier<Item> PACKED_SLIME_BRICKS = registerItem("packed_slime_bricks",() -> new BlockItem(ModBlock.PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final Supplier<Item> CHISELED_PACKED_SLIME_BLOCK = registerItem("chiseled_packed_slime_block",() -> new BlockItem(ModBlock.CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> PACKED_SLIME_BRICK_SLAB = registerItem("packed_slime_brick_slab",() -> new BlockItem(ModBlock.PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> PACKED_SLIME_BRICK_STAIR = registerItem("packed_slime_brick_stair",() -> new BlockItem(ModBlock.PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> PACKED_SLIME_BRICK_WALL = registerItem("packed_slime_brick_wall",() -> new BlockItem(ModBlock.PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));


    //public static final Supplier<Item> WHITE_PACKED_SLIME_STAIR = ModPlatform.registerItem("white_packed_slime_stair",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> WHITE_PACKED_SLIME_SLAB = ModPlatform.registerItem("white_packed_slime_slab",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> WHITE_PACKED_SLIME_WALL = ModPlatform.registerItem("white_packed_slime_wall",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_WALL.get(),new Item.Properties()));
    //public static final Supplier<Item> WHITE_PACKED_SLIME_BRICKS = ModPlatform.registerItem("white_packed_slime_bricks",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    //public static final Supplier<Item> WHITE_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerItem("white_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.WHITE_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> WHITE_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerItem("white_packed_slime_brick_slab",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> WHITE_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerItem("white_packed_slime_brick_stair",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> WHITE_PACKED_SLIME_BRICK_WALL = ModPlatform.registerItem("white_packed_slime_brick_wall",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));
//
    //public static final Supplier<Item> LIGHT_GRAY_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("light_gray_packed_slime_block",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> LIGHT_GRAY_PACKED_SLIME_STAIR = SLIME_BLOCK.register("light_gray_packed_slime_stair",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> LIGHT_GRAY_PACKED_SLIME_SLAB = SLIME_BLOCK.register("light_gray_packed_slime_slab",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> LIGHT_GRAY_PACKED_SLIME_WALL = SLIME_BLOCK.register("light_gray_packed_slime_wall",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_WALL.get(),new Item.Properties()));
    //public static final Supplier<Item> LIGHT_GRAY_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("light_gray_packed_slime_bricks",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    //public static final Supplier<Item> LIGHT_GRAY_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("light_gray_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.LIGHT_GRAY_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> LIGHT_GRAY_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("light_gray_packed_slime_brick_slab",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> LIGHT_GRAY_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("light_gray_packed_slime_brick_stair",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> LIGHT_GRAY_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("light_gray_packed_slime_brick_wall",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));
//
    //public static final Supplier<Item> GRAY_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("gray_packed_slime_block",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> GRAY_PACKED_SLIME_STAIR = SLIME_BLOCK.register("gray_packed_slime_stair",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> GRAY_PACKED_SLIME_SLAB = SLIME_BLOCK.register("gray_packed_slime_slab",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> GRAY_PACKED_SLIME_WALL = SLIME_BLOCK.register("gray_packed_slime_wall",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_WALL.get(),new Item.Properties()));
    //public static final Supplier<Item> GRAY_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("gray_packed_slime_bricks",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    //public static final Supplier<Item> GRAY_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("gray_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.GRAY_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> GRAY_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("gray_packed_slime_brick_slab",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> GRAY_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("gray_packed_slime_brick_stair",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> GRAY_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("gray_packed_slime_brick_wall",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));
//
    //public static final Supplier<Item> BLACK_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("black_packed_slime_block",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> BLACK_PACKED_SLIME_STAIR = SLIME_BLOCK.register("black_packed_slime_stair",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> BLACK_PACKED_SLIME_SLAB = SLIME_BLOCK.register("black_packed_slime_slab",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> BLACK_PACKED_SLIME_WALL = SLIME_BLOCK.register("black_packed_slime_wall",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_WALL.get(),new Item.Properties()));
    //public static final Supplier<Item> BLACK_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("black_packed_slime_bricks",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    //public static final Supplier<Item> BLACK_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("black_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.BLACK_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> BLACK_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("black_packed_slime_brick_slab",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> BLACK_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("black_packed_slime_brick_stair",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> BLACK_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("black_packed_slime_brick_wall",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));
//
    //public static final Supplier<Item> BROWN_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("brown_packed_slime_block",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> BROWN_PACKED_SLIME_STAIR = SLIME_BLOCK.register("brown_packed_slime_stair",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> BROWN_PACKED_SLIME_SLAB = SLIME_BLOCK.register("brown_packed_slime_slab",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> BROWN_PACKED_SLIME_WALL = SLIME_BLOCK.register("brown_packed_slime_wall",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_WALL.get(),new Item.Properties()));
    //public static final Supplier<Item> BROWN_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("brown_packed_slime_bricks",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    //public static final Supplier<Item> BROWN_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("brown_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.BROWN_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> BROWN_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("brown_packed_slime_brick_slab",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> BROWN_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("brown_packed_slime_brick_stair",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> BROWN_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("brown_packed_slime_brick_wall",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));
//
    //public static final Supplier<Item> RED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("red_packed_slime_block",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> RED_PACKED_SLIME_STAIR = SLIME_BLOCK.register("red_packed_slime_stair",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> RED_PACKED_SLIME_SLAB = SLIME_BLOCK.register("red_packed_slime_slab",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> RED_PACKED_SLIME_WALL = SLIME_BLOCK.register("red_packed_slime_wall",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_WALL.get(),new Item.Properties()));
    //public static final Supplier<Item> RED_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("red_packed_slime_bricks",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    //public static final Supplier<Item> RED_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("red_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.RED_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> RED_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("red_packed_slime_brick_slab",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> RED_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("red_packed_slime_brick_stair",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> RED_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("red_packed_slime_brick_wall",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));
//
    //public static final Supplier<Item> ORANGE_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("orange_packed_slime_block",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> ORANGE_PACKED_SLIME_STAIR = SLIME_BLOCK.register("orange_packed_slime_stair",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> ORANGE_PACKED_SLIME_SLAB = SLIME_BLOCK.register("orange_packed_slime_slab",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> ORANGE_PACKED_SLIME_WALL = SLIME_BLOCK.register("orange_packed_slime_wall",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_WALL.get(),new Item.Properties()));
    //public static final Supplier<Item> ORANGE_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("orange_packed_slime_bricks",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    //public static final Supplier<Item> ORANGE_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("orange_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.ORANGE_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> ORANGE_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("orange_packed_slime_brick_slab",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> ORANGE_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("orange_packed_slime_brick_stair",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> ORANGE_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("orange_packed_slime_brick_wall",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));
//
    //public static final Supplier<Item> YELLOW_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("yellow_packed_slime_block",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> YELLOW_PACKED_SLIME_STAIR = SLIME_BLOCK.register("yellow_packed_slime_stair",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> YELLOW_PACKED_SLIME_SLAB = SLIME_BLOCK.register("yellow_packed_slime_slab",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> YELLOW_PACKED_SLIME_WALL = SLIME_BLOCK.register("yellow_packed_slime_wall",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_WALL.get(),new Item.Properties()));
    //public static final Supplier<Item> YELLOW_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("yellow_packed_slime_bricks",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    //public static final Supplier<Item> YELLOW_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("yellow_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.YELLOW_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> YELLOW_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("yellow_packed_slime_brick_slab",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> YELLOW_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("yellow_packed_slime_brick_stair",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> YELLOW_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("yellow_packed_slime_brick_wall",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));
//
    //public static final Supplier<Item> LIME_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("lime_packed_slime_block",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> LIME_PACKED_SLIME_STAIR = SLIME_BLOCK.register("lime_packed_slime_stair",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> LIME_PACKED_SLIME_SLAB = SLIME_BLOCK.register("lime_packed_slime_slab",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> LIME_PACKED_SLIME_WALL = SLIME_BLOCK.register("lime_packed_slime_wall",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_WALL.get(),new Item.Properties()));
    //public static final Supplier<Item> LIME_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("lime_packed_slime_bricks",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    //public static final Supplier<Item> LIME_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("lime_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.LIME_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> LIME_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("lime_packed_slime_brick_slab",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> LIME_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("lime_packed_slime_brick_stair",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> LIME_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("lime_packed_slime_brick_wall",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));
//
    //public static final Supplier<Item> GREEN_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("green_packed_slime_block",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> GREEN_PACKED_SLIME_STAIR = SLIME_BLOCK.register("green_packed_slime_stair",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> GREEN_PACKED_SLIME_SLAB = SLIME_BLOCK.register("green_packed_slime_slab",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> GREEN_PACKED_SLIME_WALL = SLIME_BLOCK.register("green_packed_slime_wall",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_WALL.get(),new Item.Properties()));
    //public static final Supplier<Item> GREEN_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("green_packed_slime_bricks",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    //public static final Supplier<Item> GREEN_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("green_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.GREEN_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> GREEN_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("green_packed_slime_brick_slab",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> GREEN_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("green_packed_slime_brick_stair",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> GREEN_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("green_packed_slime_brick_wall",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));
//
    //public static final Supplier<Item> CYAN_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("cyan_packed_slime_block",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> CYAN_PACKED_SLIME_STAIR = SLIME_BLOCK.register("cyan_packed_slime_stair",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> CYAN_PACKED_SLIME_SLAB = SLIME_BLOCK.register("cyan_packed_slime_slab",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> CYAN_PACKED_SLIME_WALL = SLIME_BLOCK.register("cyan_packed_slime_wall",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_WALL.get(),new Item.Properties()));
    //public static final Supplier<Item> CYAN_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("cyan_packed_slime_bricks",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    //public static final Supplier<Item> CYAN_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("cyan_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.CYAN_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> CYAN_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("cyan_packed_slime_brick_slab",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> CYAN_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("cyan_packed_slime_brick_stair",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> CYAN_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("cyan_packed_slime_brick_wall",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));
//
    //public static final Supplier<Item> LIGHT_BLUE_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("light_blue_packed_slime_block",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> LIGHT_BLUE_PACKED_SLIME_STAIR = SLIME_BLOCK.register("light_blue_packed_slime_stair",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> LIGHT_BLUE_PACKED_SLIME_SLAB = SLIME_BLOCK.register("light_blue_packed_slime_slab",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> LIGHT_BLUE_PACKED_SLIME_WALL = SLIME_BLOCK.register("light_blue_packed_slime_wall",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_WALL.get(),new Item.Properties()));
    //public static final Supplier<Item> LIGHT_BLUE_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("light_blue_packed_slime_bricks",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    //public static final Supplier<Item> LIGHT_BLUE_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("light_blue_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.LIGHT_BLUE_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> LIGHT_BLUE_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("light_blue_packed_slime_brick_slab",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> LIGHT_BLUE_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("light_blue_packed_slime_brick_stair",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> LIGHT_BLUE_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("light_blue_packed_slime_brick_wall",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));
//
    //public static final Supplier<Item> BLUE_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("blue_packed_slime_block",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> BLUE_PACKED_SLIME_STAIR = SLIME_BLOCK.register("blue_packed_slime_stair",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> BLUE_PACKED_SLIME_SLAB = SLIME_BLOCK.register("blue_packed_slime_slab",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> BLUE_PACKED_SLIME_WALL = SLIME_BLOCK.register("blue_packed_slime_wall",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_WALL.get(),new Item.Properties()));
    //public static final Supplier<Item> BLUE_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("blue_packed_slime_bricks",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    //public static final Supplier<Item> BLUE_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("blue_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.BLUE_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> BLUE_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("blue_packed_slime_brick_slab",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> BLUE_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("blue_packed_slime_brick_stair",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> BLUE_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("blue_packed_slime_brick_wall",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));
//
    //public static final Supplier<Item> PURPLE_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("purple_packed_slime_block",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> PURPLE_PACKED_SLIME_STAIR = SLIME_BLOCK.register("purple_packed_slime_stair",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> PURPLE_PACKED_SLIME_SLAB = SLIME_BLOCK.register("purple_packed_slime_slab",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> PURPLE_PACKED_SLIME_WALL = SLIME_BLOCK.register("purple_packed_slime_wall",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_WALL.get(),new Item.Properties()));
    //public static final Supplier<Item> PURPLE_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("purple_packed_slime_bricks",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    //public static final Supplier<Item> PURPLE_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("purple_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.PURPLE_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> PURPLE_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("purple_packed_slime_brick_slab",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> PURPLE_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("purple_packed_slime_brick_stair",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> PURPLE_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("purple_packed_slime_brick_wall",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));
//
    //public static final Supplier<Item> MAGENTA_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("magenta_packed_slime_block",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> MAGENTA_PACKED_SLIME_STAIR = SLIME_BLOCK.register("magenta_packed_slime_stair",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> MAGENTA_PACKED_SLIME_SLAB = SLIME_BLOCK.register("magenta_packed_slime_slab",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> MAGENTA_PACKED_SLIME_WALL = SLIME_BLOCK.register("magenta_packed_slime_wall",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_WALL.get(),new Item.Properties()));
    //public static final Supplier<Item> MAGENTA_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("magenta_packed_slime_bricks",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    //public static final Supplier<Item> MAGENTA_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("magenta_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.MAGENTA_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> MAGENTA_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("magenta_packed_slime_brick_slab",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> MAGENTA_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("magenta_packed_slime_brick_stair",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> MAGENTA_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("magenta_packed_slime_brick_wall",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));
//
    //public static final Supplier<Item> PINK_PACKED_SLIME_BLOCK = registerItem("pink_packed_slime_block",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> PINK_PACKED_SLIME_STAIR = registerItem("pink_packed_slime_stair",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> PINK_PACKED_SLIME_SLAB = registerItem("pink_packed_slime_slab",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> PINK_PACKED_SLIME_WALL = registerItem("pink_packed_slime_wall",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_WALL.get(),new Item.Properties()));
    //public static final Supplier<Item> PINK_PACKED_SLIME_BRICKS = registerItem("pink_packed_slime_bricks",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    //public static final Supplier<Item> PINK_CHISELED_PACKED_SLIME_BLOCK = registerItem("pink_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.PINK_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    //public static final Supplier<Item> PINK_PACKED_SLIME_BRICK_SLAB = registerItem("pink_packed_slime_brick_slab",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    //public static final Supplier<Item> PINK_PACKED_SLIME_BRICK_STAIR = registerItem("pink_packed_slime_brick_stair",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    //public static final Supplier<Item> PINK_PACKED_SLIME_BRICK_WALL = registerItem("pink_packed_slime_brick_wall",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static void init(){}

    public static Supplier<Item> registerItem(String id, Supplier<Item> item){
        ITEMS.add(item);
        return ModPlatform.registerItem(id,item);
    }
}

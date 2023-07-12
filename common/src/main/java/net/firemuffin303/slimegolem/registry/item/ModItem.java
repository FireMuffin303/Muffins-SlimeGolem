package net.firemuffin303.slimegolem.registry.item;


import net.firemuffin303.slimegolem.ModPlatform;
import net.firemuffin303.slimegolem.ModSoundEvents;
import net.firemuffin303.slimegolem.registry.block.ModBlock;
import net.firemuffin303.slimegolem.registry.entity.ModEntity;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.*;

import java.util.function.Supplier;

import static net.firemuffin303.slimegolem.SlimeGolemMod.TAB;

public class ModItem {

    public static final Supplier<Item> SLIME_PIE = ModPlatform.registerItem("slime_pie",() -> new Item(new Item.Properties().food(ModFoods.SLIME_PIE)));
    public static final Supplier<Item> SLIME_GOLEM_SPAWN_EGG = ModPlatform.registerItem("slime_golem_spawn_egg",() -> new SpawnEggItem(ModEntity.SLIME_GOLEM.get(),1619264,7665522,new Item.Properties()));
    public static final Supplier<Item> MUSIC_DISC_BOUNCYSLIME = ModPlatform.registerItem("music_disc_bouncyslime",() -> new ModRecordItem(7, ModSoundEvents.MUSIC_DISC_BOUNCYSLIME.get(),new Item.Properties().stacksTo(1).rarity(Rarity.RARE),134));
    public static final Supplier<Item> SLIME_ALGAE = ModPlatform.registerItem("slime_algae",() -> new BlockItem(ModBlock.SLIME_ALGAE.get(),new Item.Properties()));

    public static final Supplier<Item> PACKED_SLIME_BLOCK = register("packed_slime_block",() -> new BlockItem(ModBlock.PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> PACKED_SLIME_STAIR = register("packed_slime_stair",() -> new BlockItem(ModBlock.PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> PACKED_SLIME_SLAB = register("packed_slime_slab",() -> new BlockItem(ModBlock.PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> PACKED_SLIME_WALL = register("packed_slime_wall",() -> new BlockItem(ModBlock.PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final Supplier<Item> PACKED_SLIME_BRICKS = register("packed_slime_bricks",() -> new BlockItem(ModBlock.PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final Supplier<Item> CHISELED_PACKED_SLIME_BLOCK = register("chiseled_packed_slime_block",() -> new BlockItem(ModBlock.CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> PACKED_SLIME_BRICK_SLAB = register("packed_slime_brick_slab",() -> new BlockItem(ModBlock.PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> PACKED_SLIME_BRICK_STAIR = register("packed_slime_brick_stair",() -> new BlockItem(ModBlock.PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> PACKED_SLIME_BRICK_WALL = register("packed_slime_brick_wall",() -> new BlockItem(ModBlock.PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final Supplier<Item> WHITE_PACKED_SLIME_BLOCK = register("white_packed_slime_block",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> WHITE_PACKED_SLIME_STAIR = register("white_packed_slime_stair",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> WHITE_PACKED_SLIME_SLAB = register("white_packed_slime_slab",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> WHITE_PACKED_SLIME_WALL = register("white_packed_slime_wall",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final Supplier<Item> WHITE_PACKED_SLIME_BRICKS = register("white_packed_slime_bricks",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final Supplier<Item> WHITE_CHISELED_PACKED_SLIME_BLOCK = register("white_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.WHITE_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> WHITE_PACKED_SLIME_BRICK_SLAB = register("white_packed_slime_brick_slab",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> WHITE_PACKED_SLIME_BRICK_STAIR = register("white_packed_slime_brick_stair",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> WHITE_PACKED_SLIME_BRICK_WALL = register("white_packed_slime_brick_wall",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final Supplier<Item> ORANGE_PACKED_SLIME_BLOCK = register("orange_packed_slime_block",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> ORANGE_PACKED_SLIME_STAIR = register("orange_packed_slime_stair",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> ORANGE_PACKED_SLIME_SLAB = register("orange_packed_slime_slab",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> ORANGE_PACKED_SLIME_WALL = register("orange_packed_slime_wall",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final Supplier<Item> ORANGE_PACKED_SLIME_BRICKS = register("orange_packed_slime_bricks",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final Supplier<Item> ORANGE_CHISELED_PACKED_SLIME_BLOCK = register("orange_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.ORANGE_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> ORANGE_PACKED_SLIME_BRICK_SLAB = register("orange_packed_slime_brick_slab",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> ORANGE_PACKED_SLIME_BRICK_STAIR = register("orange_packed_slime_brick_stair",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> ORANGE_PACKED_SLIME_BRICK_WALL = register("orange_packed_slime_brick_wall",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final Supplier<Item> MAGENTA_PACKED_SLIME_BLOCK = register("magenta_packed_slime_block",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> MAGENTA_PACKED_SLIME_STAIR = register("magenta_packed_slime_stair",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> MAGENTA_PACKED_SLIME_SLAB = register("magenta_packed_slime_slab",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> MAGENTA_PACKED_SLIME_WALL = register("magenta_packed_slime_wall",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final Supplier<Item> MAGENTA_PACKED_SLIME_BRICKS = register("magenta_packed_slime_bricks",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final Supplier<Item> MAGENTA_CHISELED_PACKED_SLIME_BLOCK = register("magenta_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.MAGENTA_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> MAGENTA_PACKED_SLIME_BRICK_SLAB = register("magenta_packed_slime_brick_slab",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> MAGENTA_PACKED_SLIME_BRICK_STAIR = register("magenta_packed_slime_brick_stair",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> MAGENTA_PACKED_SLIME_BRICK_WALL = register("magenta_packed_slime_brick_wall",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final Supplier<Item> LIGHT_BLUE_PACKED_SLIME_BLOCK = register("light_blue_packed_slime_block",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> LIGHT_BLUE_PACKED_SLIME_STAIR = register("light_blue_packed_slime_stair",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> LIGHT_BLUE_PACKED_SLIME_SLAB = register("light_blue_packed_slime_slab",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> LIGHT_BLUE_PACKED_SLIME_WALL = register("light_blue_packed_slime_wall",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final Supplier<Item> LIGHT_BLUE_PACKED_SLIME_BRICKS = register("light_blue_packed_slime_bricks",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final Supplier<Item> LIGHT_BLUE_CHISELED_PACKED_SLIME_BLOCK = register("light_blue_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.LIGHT_BLUE_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> LIGHT_BLUE_PACKED_SLIME_BRICK_SLAB = register("light_blue_packed_slime_brick_slab",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> LIGHT_BLUE_PACKED_SLIME_BRICK_STAIR = register("light_blue_packed_slime_brick_stair",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> LIGHT_BLUE_PACKED_SLIME_BRICK_WALL = register("light_blue_packed_slime_brick_wall",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final Supplier<Item> YELLOW_PACKED_SLIME_BLOCK = register("yellow_packed_slime_block",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> YELLOW_PACKED_SLIME_STAIR = register("yellow_packed_slime_stair",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> YELLOW_PACKED_SLIME_SLAB = register("yellow_packed_slime_slab",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> YELLOW_PACKED_SLIME_WALL = register("yellow_packed_slime_wall",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final Supplier<Item> YELLOW_PACKED_SLIME_BRICKS = register("yellow_packed_slime_bricks",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final Supplier<Item> YELLOW_CHISELED_PACKED_SLIME_BLOCK = register("yellow_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.YELLOW_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> YELLOW_PACKED_SLIME_BRICK_SLAB = register("yellow_packed_slime_brick_slab",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> YELLOW_PACKED_SLIME_BRICK_STAIR = register("yellow_packed_slime_brick_stair",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> YELLOW_PACKED_SLIME_BRICK_WALL = register("yellow_packed_slime_brick_wall",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final Supplier<Item> LIME_PACKED_SLIME_BLOCK = register("lime_packed_slime_block",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> LIME_PACKED_SLIME_STAIR = register("lime_packed_slime_stair",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> LIME_PACKED_SLIME_SLAB = register("lime_packed_slime_slab",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> LIME_PACKED_SLIME_WALL = register("lime_packed_slime_wall",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final Supplier<Item> LIME_PACKED_SLIME_BRICKS = register("lime_packed_slime_bricks",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final Supplier<Item> LIME_CHISELED_PACKED_SLIME_BLOCK = register("lime_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.LIME_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> LIME_PACKED_SLIME_BRICK_SLAB = register("lime_packed_slime_brick_slab",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> LIME_PACKED_SLIME_BRICK_STAIR = register("lime_packed_slime_brick_stair",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> LIME_PACKED_SLIME_BRICK_WALL = register("lime_packed_slime_brick_wall",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final Supplier<Item> PINK_PACKED_SLIME_BLOCK = register("pink_packed_slime_block",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> PINK_PACKED_SLIME_STAIR = register("pink_packed_slime_stair",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> PINK_PACKED_SLIME_SLAB = register("pink_packed_slime_slab",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> PINK_PACKED_SLIME_WALL = register("pink_packed_slime_wall",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final Supplier<Item> PINK_PACKED_SLIME_BRICKS = register("pink_packed_slime_bricks",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final Supplier<Item> PINK_CHISELED_PACKED_SLIME_BLOCK = register("pink_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.PINK_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> PINK_PACKED_SLIME_BRICK_SLAB = register("pink_packed_slime_brick_slab",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> PINK_PACKED_SLIME_BRICK_STAIR = register("pink_packed_slime_brick_stair",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> PINK_PACKED_SLIME_BRICK_WALL = register("pink_packed_slime_brick_wall",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final Supplier<Item> GRAY_PACKED_SLIME_BLOCK = register("gray_packed_slime_block",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> GRAY_PACKED_SLIME_STAIR = register("gray_packed_slime_stair",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> GRAY_PACKED_SLIME_SLAB = register("gray_packed_slime_slab",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> GRAY_PACKED_SLIME_WALL = register("gray_packed_slime_wall",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final Supplier<Item> GRAY_PACKED_SLIME_BRICKS = register("gray_packed_slime_bricks",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final Supplier<Item> GRAY_CHISELED_PACKED_SLIME_BLOCK = register("gray_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.GRAY_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> GRAY_PACKED_SLIME_BRICK_SLAB = register("gray_packed_slime_brick_slab",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> GRAY_PACKED_SLIME_BRICK_STAIR = register("gray_packed_slime_brick_stair",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> GRAY_PACKED_SLIME_BRICK_WALL = register("gray_packed_slime_brick_wall",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final Supplier<Item> LIGHT_GRAY_PACKED_SLIME_BLOCK = register("light_gray_packed_slime_block",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> LIGHT_GRAY_PACKED_SLIME_STAIR = register("light_gray_packed_slime_stair",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> LIGHT_GRAY_PACKED_SLIME_SLAB = register("light_gray_packed_slime_slab",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> LIGHT_GRAY_PACKED_SLIME_WALL = register("light_gray_packed_slime_wall",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final Supplier<Item> LIGHT_GRAY_PACKED_SLIME_BRICKS = register("light_gray_packed_slime_bricks",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final Supplier<Item> LIGHT_GRAY_CHISELED_PACKED_SLIME_BLOCK = register("light_gray_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.LIGHT_GRAY_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> LIGHT_GRAY_PACKED_SLIME_BRICK_SLAB = register("light_gray_packed_slime_brick_slab",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> LIGHT_GRAY_PACKED_SLIME_BRICK_STAIR = register("light_gray_packed_slime_brick_stair",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> LIGHT_GRAY_PACKED_SLIME_BRICK_WALL = register("light_gray_packed_slime_brick_wall",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final Supplier<Item> CYAN_PACKED_SLIME_BLOCK = register("cyan_packed_slime_block",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> CYAN_PACKED_SLIME_STAIR = register("cyan_packed_slime_stair",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> CYAN_PACKED_SLIME_SLAB = register("cyan_packed_slime_slab",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> CYAN_PACKED_SLIME_WALL = register("cyan_packed_slime_wall",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final Supplier<Item> CYAN_PACKED_SLIME_BRICKS = register("cyan_packed_slime_bricks",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final Supplier<Item> CYAN_CHISELED_PACKED_SLIME_BLOCK = register("cyan_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.CYAN_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> CYAN_PACKED_SLIME_BRICK_SLAB = register("cyan_packed_slime_brick_slab",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> CYAN_PACKED_SLIME_BRICK_STAIR = register("cyan_packed_slime_brick_stair",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> CYAN_PACKED_SLIME_BRICK_WALL = register("cyan_packed_slime_brick_wall",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final Supplier<Item> PURPLE_PACKED_SLIME_BLOCK = register("purple_packed_slime_block",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> PURPLE_PACKED_SLIME_STAIR = register("purple_packed_slime_stair",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> PURPLE_PACKED_SLIME_SLAB = register("purple_packed_slime_slab",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> PURPLE_PACKED_SLIME_WALL = register("purple_packed_slime_wall",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final Supplier<Item> PURPLE_PACKED_SLIME_BRICKS = register("purple_packed_slime_bricks",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final Supplier<Item> PURPLE_CHISELED_PACKED_SLIME_BLOCK = register("purple_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.PURPLE_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> PURPLE_PACKED_SLIME_BRICK_SLAB = register("purple_packed_slime_brick_slab",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> PURPLE_PACKED_SLIME_BRICK_STAIR = register("purple_packed_slime_brick_stair",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> PURPLE_PACKED_SLIME_BRICK_WALL = register("purple_packed_slime_brick_wall",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final Supplier<Item> BLUE_PACKED_SLIME_BLOCK = register("blue_packed_slime_block",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> BLUE_PACKED_SLIME_STAIR = register("blue_packed_slime_stair",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> BLUE_PACKED_SLIME_SLAB = register("blue_packed_slime_slab",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> BLUE_PACKED_SLIME_WALL = register("blue_packed_slime_wall",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final Supplier<Item> BLUE_PACKED_SLIME_BRICKS = register("blue_packed_slime_bricks",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final Supplier<Item> BLUE_CHISELED_PACKED_SLIME_BLOCK = register("blue_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.BLUE_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> BLUE_PACKED_SLIME_BRICK_SLAB = register("blue_packed_slime_brick_slab",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> BLUE_PACKED_SLIME_BRICK_STAIR = register("blue_packed_slime_brick_stair",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> BLUE_PACKED_SLIME_BRICK_WALL = register("blue_packed_slime_brick_wall",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final Supplier<Item> BROWN_PACKED_SLIME_BLOCK = register("brown_packed_slime_block",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> BROWN_PACKED_SLIME_STAIR = register("brown_packed_slime_stair",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> BROWN_PACKED_SLIME_SLAB = register("brown_packed_slime_slab",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> BROWN_PACKED_SLIME_WALL = register("brown_packed_slime_wall",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final Supplier<Item> BROWN_PACKED_SLIME_BRICKS = register("brown_packed_slime_bricks",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final Supplier<Item> BROWN_CHISELED_PACKED_SLIME_BLOCK = register("brown_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.BROWN_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> BROWN_PACKED_SLIME_BRICK_SLAB = register("brown_packed_slime_brick_slab",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> BROWN_PACKED_SLIME_BRICK_STAIR = register("brown_packed_slime_brick_stair",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> BROWN_PACKED_SLIME_BRICK_WALL = register("brown_packed_slime_brick_wall",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final Supplier<Item> GREEN_PACKED_SLIME_BLOCK = register("green_packed_slime_block",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> GREEN_PACKED_SLIME_STAIR = register("green_packed_slime_stair",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> GREEN_PACKED_SLIME_SLAB = register("green_packed_slime_slab",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> GREEN_PACKED_SLIME_WALL = register("green_packed_slime_wall",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final Supplier<Item> GREEN_PACKED_SLIME_BRICKS = register("green_packed_slime_bricks",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final Supplier<Item> GREEN_CHISELED_PACKED_SLIME_BLOCK = register("green_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.GREEN_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> GREEN_PACKED_SLIME_BRICK_SLAB = register("green_packed_slime_brick_slab",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> GREEN_PACKED_SLIME_BRICK_STAIR = register("green_packed_slime_brick_stair",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> GREEN_PACKED_SLIME_BRICK_WALL = register("green_packed_slime_brick_wall",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final Supplier<Item> RED_PACKED_SLIME_BLOCK = register("red_packed_slime_block",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> RED_PACKED_SLIME_STAIR = register("red_packed_slime_stair",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> RED_PACKED_SLIME_SLAB = register("red_packed_slime_slab",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> RED_PACKED_SLIME_WALL = register("red_packed_slime_wall",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final Supplier<Item> RED_PACKED_SLIME_BRICKS = register("red_packed_slime_bricks",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final Supplier<Item> RED_CHISELED_PACKED_SLIME_BLOCK = register("red_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.RED_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> RED_PACKED_SLIME_BRICK_SLAB = register("red_packed_slime_brick_slab",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> RED_PACKED_SLIME_BRICK_STAIR = register("red_packed_slime_brick_stair",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> RED_PACKED_SLIME_BRICK_WALL = register("red_packed_slime_brick_wall",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final Supplier<Item> BLACK_PACKED_SLIME_BLOCK = register("black_packed_slime_block",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> BLACK_PACKED_SLIME_STAIR = register("black_packed_slime_stair",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> BLACK_PACKED_SLIME_SLAB = register("black_packed_slime_slab",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> BLACK_PACKED_SLIME_WALL = register("black_packed_slime_wall",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final Supplier<Item> BLACK_PACKED_SLIME_BRICKS = register("black_packed_slime_bricks",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final Supplier<Item> BLACK_CHISELED_PACKED_SLIME_BLOCK = register("black_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.BLACK_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final Supplier<Item> BLACK_PACKED_SLIME_BRICK_SLAB = register("black_packed_slime_brick_slab",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final Supplier<Item> BLACK_PACKED_SLIME_BRICK_STAIR = register("black_packed_slime_brick_stair",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final Supplier<Item> BLACK_PACKED_SLIME_BRICK_WALL = register("black_packed_slime_brick_wall",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static void init(){}

    private static Supplier<Item> register(String id, Supplier<Item> supplier){
        Supplier<Item> SUPPLIER =  ModPlatform.registerItem(id,supplier);
        TAB.buildContents(new CreativeModeTab.ItemDisplayParameters(FeatureFlagSet.of(FeatureFlags.VANILLA),false,));
        return SUPPLIER;
    }
}

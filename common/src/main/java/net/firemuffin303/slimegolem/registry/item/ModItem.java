package net.firemuffin303.slimegolem.registry.item;


import com.google.errorprone.annotations.SuppressPackageLocation;
import net.firemuffin303.slimegolem.ModPlatform;
import net.firemuffin303.slimegolem.ModSoundEvents;
import net.firemuffin303.slimegolem.SlimeGolemMod;
import net.firemuffin303.slimegolem.registry.block.ModBlock;
import net.firemuffin303.slimegolem.registry.entity.ModEntity;
import net.minecraft.world.item.*;

import java.util.function.Supplier;

public class ModItem {

    public static final Supplier<Item> SLIME_PIE = ModPlatform.registerItem("slime_pie",() -> new Item(new Item.Properties().food(ModFoods.SLIME_PIE).tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> SLIME_GOLEM_SPAWN_EGG = ModPlatform.registerItem("slime_golem_spawn_egg",() -> new SpawnEggItem(ModEntity.SLIME_GOLEM.get(),1619264,7665522,new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> MUSIC_DISC_BOUNCYSLIME = ModPlatform.registerItem("music_disc_bouncyslime",() -> new ModRecordItem(7, ModSoundEvents.MUSIC_DISC_BOUNCYSLIME.get(),new Item.Properties().tab(SlimeGolemMod.TAB).stacksTo(1).rarity(Rarity.RARE),134));

    public static final Supplier<Item> PACKED_SLIME_BLOCK = ModPlatform.registerItem("packed_slime_block",() -> new BlockItem(ModBlock.PACKED_SLIME_BLOCK.get(),new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> SLIME_ALGAE = ModPlatform.registerItem("slime_algae",() -> new BlockItem(ModBlock.SLIME_ALGAE.get(),new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> PACKED_SLIME_BRICKS = ModPlatform.registerItem("packed_slime_bricks",() -> new BlockItem(ModBlock.PACKED_SLIME_BRICK.get(),new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerItem("chiseled_packed_slime_block",() -> new BlockItem(ModBlock.CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> PACKED_SLIME_SLAB = ModPlatform.registerItem("packed_slime_slab",() -> new BlockItem(ModBlock.PACKED_SLIME_SLAB.get(),new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> PACKED_SLIME_STAIR = ModPlatform.registerItem("packed_slime_stair",() -> new BlockItem(ModBlock.PACKED_SLIME_STAIR.get(),new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> PACKED_SLIME_WALL = ModPlatform.registerItem("packed_slime_wall",() ->new BlockItem(ModBlock.PACKED_SLIME_WALL.get(),new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> PACKED_SLIME_BRICK_SLAB = ModPlatform.registerItem("packed_slime_brick_slab",() -> new BlockItem(ModBlock.PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> PACKED_SLIME_BRICK_STAIR = ModPlatform.registerItem("packed_slime_brick_stair",() -> new BlockItem(ModBlock.PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> PACKED_SLIME_BRICK_WALL = ModPlatform.registerItem("packed_slime_brick_wall",() ->new BlockItem(ModBlock.PACKED_SLIME_BRICK_WALL.get(),new Item.Properties().tab(SlimeGolemMod.TAB)));

    public static final Supplier<Item> WHITE_PACKED_SLIME_BLOCK = ModPlatform.registerItem("white_packed_slime_block", () -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> WHITE_PACKED_SLIME_BRICKS = ModPlatform.registerItem("white_packed_slime_bricks", () -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_BRICK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> WHITE_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerItem("white_chiseled_packed_slime_block", () -> new BlockItem(ModBlock.WHITE_CHISELED_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> WHITE_PACKED_SLIME_SLAB = ModPlatform.registerItem("white_packed_slime_slab", () -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> WHITE_PACKED_SLIME_STAIR = ModPlatform.registerItem("white_packed_slime_stair", () -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> WHITE_PACKED_SLIME_WALL = ModPlatform.registerItem("white_packed_slime_wall", () -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> WHITE_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerItem("white_packed_slime_brick_slab",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_BRICK_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> WHITE_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerItem("white_packed_slime_brick_stair",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_BRICK_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> WHITE_PACKED_SLIME_BRICK_WALL = ModPlatform.registerItem("white_packed_slime_brick_wall",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_BRICK_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));

    public static final Supplier<Item> ORANGE_PACKED_SLIME_BLOCK = ModPlatform.registerItem("orange_packed_slime_block", () -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> ORANGE_PACKED_SLIME_BRICKS = ModPlatform.registerItem("orange_packed_slime_bricks", () -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_BRICK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> ORANGE_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerItem("orange_chiseled_packed_slime_block", () -> new BlockItem(ModBlock.ORANGE_CHISELED_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> ORANGE_PACKED_SLIME_SLAB = ModPlatform.registerItem("orange_packed_slime_slab", () -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> ORANGE_PACKED_SLIME_STAIR = ModPlatform.registerItem("orange_packed_slime_stair", () -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> ORANGE_PACKED_SLIME_WALL = ModPlatform.registerItem("orange_packed_slime_wall", () -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> ORANGE_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerItem("orange_packed_slime_brick_slab",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_BRICK_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> ORANGE_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerItem("orange_packed_slime_brick_stair",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_BRICK_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> ORANGE_PACKED_SLIME_BRICK_WALL = ModPlatform.registerItem("orange_packed_slime_brick_wall",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_BRICK_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));

    public static final Supplier<Item> MAGENTA_PACKED_SLIME_BLOCK = ModPlatform.registerItem("magenta_packed_slime_block", () -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> MAGENTA_PACKED_SLIME_BRICKS = ModPlatform.registerItem("magenta_packed_slime_bricks", () -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_BRICK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> MAGENTA_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerItem("magenta_chiseled_packed_slime_block", () -> new BlockItem(ModBlock.MAGENTA_CHISELED_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> MAGENTA_PACKED_SLIME_SLAB = ModPlatform.registerItem("magenta_packed_slime_slab", () -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> MAGENTA_PACKED_SLIME_STAIR = ModPlatform.registerItem("magenta_packed_slime_stair", () -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> MAGENTA_PACKED_SLIME_WALL = ModPlatform.registerItem("magenta_packed_slime_wall", () -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> MAGENTA_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerItem("magenta_packed_slime_brick_slab",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_BRICK_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> MAGENTA_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerItem("magenta_packed_slime_brick_stair",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_BRICK_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> MAGENTA_PACKED_SLIME_BRICK_WALL = ModPlatform.registerItem("magenta_packed_slime_brick_wall",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_BRICK_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));

    public static final Supplier<Item> LIGHT_BLUE_PACKED_SLIME_BLOCK = ModPlatform.registerItem("light_blue_packed_slime_block", () -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> LIGHT_BLUE_PACKED_SLIME_BRICKS = ModPlatform.registerItem("light_blue_packed_slime_bricks", () -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_BRICK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> LIGHT_BLUE_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerItem("light_blue_chiseled_packed_slime_block", () -> new BlockItem(ModBlock.LIGHT_BLUE_CHISELED_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> LIGHT_BLUE_PACKED_SLIME_SLAB = ModPlatform.registerItem("light_blue_packed_slime_slab", () -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> LIGHT_BLUE_PACKED_SLIME_STAIR = ModPlatform.registerItem("light_blue_packed_slime_stair", () -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> LIGHT_BLUE_PACKED_SLIME_WALL = ModPlatform.registerItem("light_blue_packed_slime_wall", () -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> LIGHT_BLUE_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerItem("light_blue_packed_slime_brick_slab",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_BRICK_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> LIGHT_BLUE_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerItem("light_blue_packed_slime_brick_stair",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_BRICK_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> LIGHT_BLUE_PACKED_SLIME_BRICK_WALL = ModPlatform.registerItem("light_blue_packed_slime_brick_wall",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_BRICK_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));


    public static final Supplier<Item> YELLOW_PACKED_SLIME_BLOCK = ModPlatform.registerItem("yellow_packed_slime_block", () -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> YELLOW_PACKED_SLIME_BRICKS = ModPlatform.registerItem("yellow_packed_slime_bricks", () -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_BRICK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> YELLOW_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerItem("yellow_chiseled_packed_slime_block", () -> new BlockItem(ModBlock.YELLOW_CHISELED_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> YELLOW_PACKED_SLIME_SLAB = ModPlatform.registerItem("yellow_packed_slime_slab", () -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> YELLOW_PACKED_SLIME_STAIR = ModPlatform.registerItem("yellow_packed_slime_stair", () -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> YELLOW_PACKED_SLIME_WALL = ModPlatform.registerItem("yellow_packed_slime_wall", () -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> YELLOW_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerItem("yellow_packed_slime_brick_slab",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_BRICK_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> YELLOW_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerItem("yellow_packed_slime_brick_stair",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_BRICK_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> YELLOW_PACKED_SLIME_BRICK_WALL = ModPlatform.registerItem("yellow_packed_slime_brick_wall",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_BRICK_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));

    public static final Supplier<Item> LIME_PACKED_SLIME_BLOCK = ModPlatform.registerItem("lime_packed_slime_block", () -> new BlockItem(ModBlock.LIME_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> LIME_PACKED_SLIME_BRICKS = ModPlatform.registerItem("lime_packed_slime_bricks", () -> new BlockItem(ModBlock.LIME_PACKED_SLIME_BRICK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> LIME_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerItem("lime_chiseled_packed_slime_block", () -> new BlockItem(ModBlock.LIME_CHISELED_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> LIME_PACKED_SLIME_SLAB = ModPlatform.registerItem("lime_packed_slime_slab", () -> new BlockItem(ModBlock.LIME_PACKED_SLIME_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> LIME_PACKED_SLIME_STAIR = ModPlatform.registerItem("lime_packed_slime_stair", () -> new BlockItem(ModBlock.LIME_PACKED_SLIME_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> LIME_PACKED_SLIME_WALL = ModPlatform.registerItem("lime_packed_slime_wall", () -> new BlockItem(ModBlock.LIME_PACKED_SLIME_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> LIME_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerItem("lime_packed_slime_brick_slab",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_BRICK_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> LIME_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerItem("lime_packed_slime_brick_stair",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_BRICK_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> LIME_PACKED_SLIME_BRICK_WALL = ModPlatform.registerItem("lime_packed_slime_brick_wall",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_BRICK_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));

    public static final Supplier<Item> PINK_PACKED_SLIME_BLOCK = ModPlatform.registerItem("pink_packed_slime_block", () -> new BlockItem(ModBlock.PINK_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> PINK_PACKED_SLIME_BRICKS = ModPlatform.registerItem("pink_packed_slime_bricks", () -> new BlockItem(ModBlock.PINK_PACKED_SLIME_BRICK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> PINK_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerItem("pink_chiseled_packed_slime_block", () -> new BlockItem(ModBlock.PINK_CHISELED_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> PINK_PACKED_SLIME_SLAB = ModPlatform.registerItem("pink_packed_slime_slab", () -> new BlockItem(ModBlock.PINK_PACKED_SLIME_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> PINK_PACKED_SLIME_STAIR = ModPlatform.registerItem("pink_packed_slime_stair", () -> new BlockItem(ModBlock.PINK_PACKED_SLIME_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> PINK_PACKED_SLIME_WALL = ModPlatform.registerItem("pink_packed_slime_wall", () -> new BlockItem(ModBlock.PINK_PACKED_SLIME_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> PINK_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerItem("pink_packed_slime_brick_slab",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_BRICK_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> PINK_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerItem("pink_packed_slime_brick_stair",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_BRICK_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> PINK_PACKED_SLIME_BRICK_WALL = ModPlatform.registerItem("pink_packed_slime_brick_wall",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_BRICK_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));

    public static final Supplier<Item> GRAY_PACKED_SLIME_BLOCK = ModPlatform.registerItem("gray_packed_slime_block", () -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> GRAY_PACKED_SLIME_BRICKS = ModPlatform.registerItem("gray_packed_slime_bricks", () -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_BRICK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> GRAY_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerItem("gray_chiseled_packed_slime_block", () -> new BlockItem(ModBlock.GRAY_CHISELED_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> GRAY_PACKED_SLIME_SLAB = ModPlatform.registerItem("gray_packed_slime_slab", () -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> GRAY_PACKED_SLIME_STAIR = ModPlatform.registerItem("gray_packed_slime_stair", () -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> GRAY_PACKED_SLIME_WALL = ModPlatform.registerItem("gray_packed_slime_wall", () -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> GRAY_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerItem("gray_packed_slime_brick_slab",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_BRICK_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> GRAY_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerItem("gray_packed_slime_brick_stair",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_BRICK_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> GRAY_PACKED_SLIME_BRICK_WALL = ModPlatform.registerItem("gray_packed_slime_brick_wall",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_BRICK_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));

    public static final Supplier<Item> LIGHT_GRAY_PACKED_SLIME_BLOCK = ModPlatform.registerItem("light_gray_packed_slime_block", () -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> LIGHT_GRAY_PACKED_SLIME_BRICKS = ModPlatform.registerItem("light_gray_packed_slime_bricks", () -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_BRICK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> LIGHT_GRAY_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerItem("light_gray_chiseled_packed_slime_block", () -> new BlockItem(ModBlock.LIGHT_GRAY_CHISELED_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> LIGHT_GRAY_PACKED_SLIME_SLAB = ModPlatform.registerItem("light_gray_packed_slime_slab", () -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> LIGHT_GRAY_PACKED_SLIME_STAIR = ModPlatform.registerItem("light_gray_packed_slime_stair", () -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> LIGHT_GRAY_PACKED_SLIME_WALL = ModPlatform.registerItem("light_gray_packed_slime_wall", () -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> LIGHT_GRAY_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerItem("light_gray_packed_slime_brick_slab",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_BRICK_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> LIGHT_GRAY_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerItem("light_gray_packed_slime_brick_stair",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_BRICK_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> LIGHT_GRAY_PACKED_SLIME_BRICK_WALL = ModPlatform.registerItem("light_gray_packed_slime_brick_wall",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_BRICK_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));

    public static final Supplier<Item> CYAN_PACKED_SLIME_BLOCK = ModPlatform.registerItem("cyan_packed_slime_block", () -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> CYAN_PACKED_SLIME_BRICKS = ModPlatform.registerItem("cyan_packed_slime_bricks", () -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_BRICK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> CYAN_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerItem("cyan_chiseled_packed_slime_block", () -> new BlockItem(ModBlock.CYAN_CHISELED_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> CYAN_PACKED_SLIME_SLAB = ModPlatform.registerItem("cyan_packed_slime_slab", () -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> CYAN_PACKED_SLIME_STAIR = ModPlatform.registerItem("cyan_packed_slime_stair", () -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> CYAN_PACKED_SLIME_WALL = ModPlatform.registerItem("cyan_packed_slime_wall", () -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> CYAN_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerItem("cyan_packed_slime_brick_slab",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_BRICK_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> CYAN_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerItem("cyan_packed_slime_brick_stair",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_BRICK_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> CYAN_PACKED_SLIME_BRICK_WALL = ModPlatform.registerItem("cyan_packed_slime_brick_wall",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_BRICK_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));

    public static final Supplier<Item> PURPLE_PACKED_SLIME_BLOCK = ModPlatform.registerItem("purple_packed_slime_block", () -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> PURPLE_PACKED_SLIME_BRICKS = ModPlatform.registerItem("purple_packed_slime_bricks", () -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_BRICK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> PURPLE_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerItem("purple_chiseled_packed_slime_block", () -> new BlockItem(ModBlock.PURPLE_CHISELED_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> PURPLE_PACKED_SLIME_SLAB = ModPlatform.registerItem("purple_packed_slime_slab", () -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> PURPLE_PACKED_SLIME_STAIR = ModPlatform.registerItem("purple_packed_slime_stair", () -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> PURPLE_PACKED_SLIME_WALL = ModPlatform.registerItem("purple_packed_slime_wall", () -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> PURPLE_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerItem("purple_packed_slime_brick_slab",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_BRICK_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> PURPLE_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerItem("purple_packed_slime_brick_stair",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_BRICK_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> PURPLE_PACKED_SLIME_BRICK_WALL = ModPlatform.registerItem("purple_packed_slime_brick_wall",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_BRICK_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));

    public static final Supplier<Item> BLUE_PACKED_SLIME_BLOCK = ModPlatform.registerItem("blue_packed_slime_block", () -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> BLUE_PACKED_SLIME_BRICKS = ModPlatform.registerItem("blue_packed_slime_bricks", () -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_BRICK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> BLUE_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerItem("blue_chiseled_packed_slime_block", () -> new BlockItem(ModBlock.BLUE_CHISELED_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> BLUE_PACKED_SLIME_SLAB = ModPlatform.registerItem("blue_packed_slime_slab", () -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> BLUE_PACKED_SLIME_STAIR = ModPlatform.registerItem("blue_packed_slime_stair", () -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> BLUE_PACKED_SLIME_WALL = ModPlatform.registerItem("blue_packed_slime_wall", () -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> BLUE_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerItem("blue_packed_slime_brick_slab",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_BRICK_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> BLUE_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerItem("blue_packed_slime_brick_stair",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_BRICK_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> BLUE_PACKED_SLIME_BRICK_WALL = ModPlatform.registerItem("blue_packed_slime_brick_wall",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_BRICK_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));

    public static final Supplier<Item> BROWN_PACKED_SLIME_BLOCK = ModPlatform.registerItem("brown_packed_slime_block", () -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> BROWN_PACKED_SLIME_BRICKS = ModPlatform.registerItem("brown_packed_slime_bricks", () -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_BRICK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> BROWN_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerItem("brown_chiseled_packed_slime_block", () -> new BlockItem(ModBlock.BROWN_CHISELED_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> BROWN_PACKED_SLIME_SLAB = ModPlatform.registerItem("brown_packed_slime_slab", () -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> BROWN_PACKED_SLIME_STAIR = ModPlatform.registerItem("brown_packed_slime_stair", () -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> BROWN_PACKED_SLIME_WALL = ModPlatform.registerItem("brown_packed_slime_wall", () -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> BROWN_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerItem("brown_packed_slime_brick_slab",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_BRICK_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> BROWN_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerItem("brown_packed_slime_brick_stair",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_BRICK_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> BROWN_PACKED_SLIME_BRICK_WALL = ModPlatform.registerItem("brown_packed_slime_brick_wall",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_BRICK_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));

    public static final Supplier<Item> GREEN_PACKED_SLIME_BLOCK = ModPlatform.registerItem("green_packed_slime_block", () -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> GREEN_PACKED_SLIME_BRICKS = ModPlatform.registerItem("green_packed_slime_bricks", () -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_BRICK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> GREEN_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerItem("green_chiseled_packed_slime_block", () -> new BlockItem(ModBlock.GREEN_CHISELED_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> GREEN_PACKED_SLIME_SLAB = ModPlatform.registerItem("green_packed_slime_slab", () -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> GREEN_PACKED_SLIME_STAIR = ModPlatform.registerItem("green_packed_slime_stair", () -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> GREEN_PACKED_SLIME_WALL = ModPlatform.registerItem("green_packed_slime_wall", () -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> GREEN_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerItem("green_packed_slime_brick_slab",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_BRICK_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> GREEN_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerItem("green_packed_slime_brick_stair",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_BRICK_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> GREEN_PACKED_SLIME_BRICK_WALL = ModPlatform.registerItem("green_packed_slime_brick_wall",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_BRICK_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));

    public static final Supplier<Item> RED_PACKED_SLIME_BLOCK = ModPlatform.registerItem("red_packed_slime_block", () -> new BlockItem(ModBlock.RED_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> RED_PACKED_SLIME_BRICKS = ModPlatform.registerItem("red_packed_slime_bricks", () -> new BlockItem(ModBlock.RED_PACKED_SLIME_BRICK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> RED_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerItem("red_chiseled_packed_slime_block", () -> new BlockItem(ModBlock.RED_CHISELED_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> RED_PACKED_SLIME_SLAB = ModPlatform.registerItem("red_packed_slime_slab", () -> new BlockItem(ModBlock.RED_PACKED_SLIME_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> RED_PACKED_SLIME_STAIR = ModPlatform.registerItem("red_packed_slime_stair", () -> new BlockItem(ModBlock.RED_PACKED_SLIME_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> RED_PACKED_SLIME_WALL = ModPlatform.registerItem("red_packed_slime_wall", () -> new BlockItem(ModBlock.RED_PACKED_SLIME_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> RED_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerItem("red_packed_slime_brick_slab",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_BRICK_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> RED_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerItem("red_packed_slime_brick_stair",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_BRICK_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> RED_PACKED_SLIME_BRICK_WALL = ModPlatform.registerItem("red_packed_slime_brick_wall",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_BRICK_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));

    public static final Supplier<Item> BLACK_PACKED_SLIME_BLOCK = ModPlatform.registerItem("black_packed_slime_block", () -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> BLACK_PACKED_SLIME_BRICKS = ModPlatform.registerItem("black_packed_slime_bricks", () -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_BRICK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> BLACK_CHISELED_PACKED_SLIME_BLOCK = ModPlatform.registerItem("black_chiseled_packed_slime_block", () -> new BlockItem(ModBlock.BLACK_CHISELED_PACKED_SLIME_BLOCK.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> BLACK_PACKED_SLIME_SLAB = ModPlatform.registerItem("black_packed_slime_slab", () -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> BLACK_PACKED_SLIME_STAIR = ModPlatform.registerItem("black_packed_slime_stair", () -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> BLACK_PACKED_SLIME_WALL = ModPlatform.registerItem("black_packed_slime_wall", () -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> BLACK_PACKED_SLIME_BRICK_SLAB = ModPlatform.registerItem("black_packed_slime_brick_slab",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_BRICK_SLAB.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> BLACK_PACKED_SLIME_BRICK_STAIR = ModPlatform.registerItem("black_packed_slime_brick_stair",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_BRICK_STAIR.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> BLACK_PACKED_SLIME_BRICK_WALL = ModPlatform.registerItem("black_packed_slime_brick_wall",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_BRICK_WALL.get(), new Item.Properties().tab(SlimeGolemMod.TAB)));


    public static void init(){}
}

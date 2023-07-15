package net.firemuffin303.slimegolem.common.registry;


import com.teamresourceful.resourcefullib.common.item.tabs.ResourcefulCreativeTab;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import net.firemuffin303.slimegolem.ModSoundEvents;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.firemuffin303.slimegolem.common.item.ModRecordItem;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;

import java.util.function.Supplier;

public class ModItem {
    public static final ResourcefulRegistry<Item> ITEMS = ResourcefulRegistries.create(BuiltInRegistries.ITEM, MuffinsSlimeGolemMod.MOD_ID);
    public static final Supplier<CreativeModeTab> TAB = new ResourcefulCreativeTab(new ResourceLocation(MuffinsSlimeGolemMod.MOD_ID,"main"))
            .setItemIcon(() ->ModItem.SLIME_PIE.get()).addRegistry(ITEMS).build();

    public static final RegistryEntry<Item> SLIME_PIE = ITEMS.register("slime_pie",() -> new Item(new Item.Properties().food(ModFoods.SLIME_PIE)));
    public static final RegistryEntry<Item>  SLIME_GOLEM_SPAWN_EGG = ITEMS.register("slime_golem_spawn_egg",() -> new SpawnEggItem(ModEntity.SLIME_GOLEM.get(),1619264,7665522,new Item.Properties()));
    public static final RegistryEntry<Item> MUSIC_DISC_BOUNCYSLIME = ITEMS.register("music_disc_bouncyslime",() -> new ModRecordItem(7, ModSoundEvents.MUSIC_DISC_BOUNCYSLIME.get(),new Item.Properties().stacksTo(1).rarity(Rarity.RARE),134));
    public static final RegistryEntry<Item> SLIME_ALGAE = ITEMS.register("slime_algae",() -> new BlockItem(ModBlock.SLIME_ALGAE.get(),new Item.Properties()));

    public static final RegistryEntry<Item> PACKED_SLIME_BLOCK = ITEMS.register("packed_slime_block",() -> new BlockItem(ModBlock.PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PACKED_SLIME_STAIR = ITEMS.register("packed_slime_stair",() -> new BlockItem(ModBlock.PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PACKED_SLIME_SLAB = ITEMS.register("packed_slime_slab",() -> new BlockItem(ModBlock.PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PACKED_SLIME_WALL = ITEMS.register("packed_slime_wall",() -> new BlockItem(ModBlock.PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PACKED_SLIME_BRICKS = ITEMS.register("packed_slime_bricks",() -> new BlockItem(ModBlock.PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> CHISELED_PACKED_SLIME_BLOCK = ITEMS.register("chiseled_packed_slime_block",() -> new BlockItem(ModBlock.CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PACKED_SLIME_BRICK_SLAB = ITEMS.register("packed_slime_brick_slab",() -> new BlockItem(ModBlock.PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PACKED_SLIME_BRICK_STAIR = ITEMS.register("packed_slime_brick_stair",() -> new BlockItem(ModBlock.PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PACKED_SLIME_BRICK_WALL = ITEMS.register("packed_slime_brick_wall",() -> new BlockItem(ModBlock.PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> WHITE_PACKED_SLIME_BLOCK = ITEMS.register("white_packed_slime_block",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> WHITE_PACKED_SLIME_STAIR = ITEMS.register("white_packed_slime_stair",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> WHITE_PACKED_SLIME_SLAB = ITEMS.register("white_packed_slime_slab",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> WHITE_PACKED_SLIME_WALL = ITEMS.register("white_packed_slime_wall",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> WHITE_PACKED_SLIME_BRICKS = ITEMS.register("white_packed_slime_bricks",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> WHITE_CHISELED_PACKED_SLIME_BLOCK = ITEMS.register("white_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.WHITE_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> WHITE_PACKED_SLIME_BRICK_SLAB = ITEMS.register("white_packed_slime_brick_slab",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> WHITE_PACKED_SLIME_BRICK_STAIR = ITEMS.register("white_packed_slime_brick_stair",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> WHITE_PACKED_SLIME_BRICK_WALL = ITEMS.register("white_packed_slime_brick_wall",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> ORANGE_PACKED_SLIME_BLOCK = ITEMS.register("orange_packed_slime_block",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> ORANGE_PACKED_SLIME_STAIR = ITEMS.register("orange_packed_slime_stair",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> ORANGE_PACKED_SLIME_SLAB = ITEMS.register("orange_packed_slime_slab",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> ORANGE_PACKED_SLIME_WALL = ITEMS.register("orange_packed_slime_wall",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> ORANGE_PACKED_SLIME_BRICKS = ITEMS.register("orange_packed_slime_bricks",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> ORANGE_CHISELED_PACKED_SLIME_BLOCK = ITEMS.register("orange_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.ORANGE_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> ORANGE_PACKED_SLIME_BRICK_SLAB = ITEMS.register("orange_packed_slime_brick_slab",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> ORANGE_PACKED_SLIME_BRICK_STAIR = ITEMS.register("orange_packed_slime_brick_stair",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> ORANGE_PACKED_SLIME_BRICK_WALL = ITEMS.register("orange_packed_slime_brick_wall",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> MAGENTA_PACKED_SLIME_BLOCK = ITEMS.register("magenta_packed_slime_block",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> MAGENTA_PACKED_SLIME_STAIR = ITEMS.register("magenta_packed_slime_stair",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> MAGENTA_PACKED_SLIME_SLAB = ITEMS.register("magenta_packed_slime_slab",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> MAGENTA_PACKED_SLIME_WALL = ITEMS.register("magenta_packed_slime_wall",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> MAGENTA_PACKED_SLIME_BRICKS = ITEMS.register("magenta_packed_slime_bricks",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> MAGENTA_CHISELED_PACKED_SLIME_BLOCK = ITEMS.register("magenta_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.MAGENTA_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> MAGENTA_PACKED_SLIME_BRICK_SLAB = ITEMS.register("magenta_packed_slime_brick_slab",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> MAGENTA_PACKED_SLIME_BRICK_STAIR = ITEMS.register("magenta_packed_slime_brick_stair",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> MAGENTA_PACKED_SLIME_BRICK_WALL = ITEMS.register("magenta_packed_slime_brick_wall",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> LIGHT_BLUE_PACKED_SLIME_BLOCK = ITEMS.register("light_blue_packed_slime_block",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_BLUE_PACKED_SLIME_STAIR = ITEMS.register("light_blue_packed_slime_stair",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_BLUE_PACKED_SLIME_SLAB = ITEMS.register("light_blue_packed_slime_slab",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_BLUE_PACKED_SLIME_WALL = ITEMS.register("light_blue_packed_slime_wall",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_BLUE_PACKED_SLIME_BRICKS = ITEMS.register("light_blue_packed_slime_bricks",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_BLUE_CHISELED_PACKED_SLIME_BLOCK = ITEMS.register("light_blue_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.LIGHT_BLUE_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_BLUE_PACKED_SLIME_BRICK_SLAB = ITEMS.register("light_blue_packed_slime_brick_slab",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_BLUE_PACKED_SLIME_BRICK_STAIR = ITEMS.register("light_blue_packed_slime_brick_stair",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_BLUE_PACKED_SLIME_BRICK_WALL = ITEMS.register("light_blue_packed_slime_brick_wall",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> YELLOW_PACKED_SLIME_BLOCK = ITEMS.register("yellow_packed_slime_block",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> YELLOW_PACKED_SLIME_STAIR = ITEMS.register("yellow_packed_slime_stair",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> YELLOW_PACKED_SLIME_SLAB = ITEMS.register("yellow_packed_slime_slab",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> YELLOW_PACKED_SLIME_WALL = ITEMS.register("yellow_packed_slime_wall",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> YELLOW_PACKED_SLIME_BRICKS = ITEMS.register("yellow_packed_slime_bricks",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> YELLOW_CHISELED_PACKED_SLIME_BLOCK = ITEMS.register("yellow_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.YELLOW_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> YELLOW_PACKED_SLIME_BRICK_SLAB = ITEMS.register("yellow_packed_slime_brick_slab",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> YELLOW_PACKED_SLIME_BRICK_STAIR = ITEMS.register("yellow_packed_slime_brick_stair",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> YELLOW_PACKED_SLIME_BRICK_WALL = ITEMS.register("yellow_packed_slime_brick_wall",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> LIME_PACKED_SLIME_BLOCK = ITEMS.register("lime_packed_slime_block",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIME_PACKED_SLIME_STAIR = ITEMS.register("lime_packed_slime_stair",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIME_PACKED_SLIME_SLAB = ITEMS.register("lime_packed_slime_slab",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIME_PACKED_SLIME_WALL = ITEMS.register("lime_packed_slime_wall",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIME_PACKED_SLIME_BRICKS = ITEMS.register("lime_packed_slime_bricks",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIME_CHISELED_PACKED_SLIME_BLOCK = ITEMS.register("lime_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.LIME_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIME_PACKED_SLIME_BRICK_SLAB = ITEMS.register("lime_packed_slime_brick_slab",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIME_PACKED_SLIME_BRICK_STAIR = ITEMS.register("lime_packed_slime_brick_stair",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIME_PACKED_SLIME_BRICK_WALL = ITEMS.register("lime_packed_slime_brick_wall",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> PINK_PACKED_SLIME_BLOCK = ITEMS.register("pink_packed_slime_block",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PINK_PACKED_SLIME_STAIR = ITEMS.register("pink_packed_slime_stair",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PINK_PACKED_SLIME_SLAB = ITEMS.register("pink_packed_slime_slab",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PINK_PACKED_SLIME_WALL = ITEMS.register("pink_packed_slime_wall",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PINK_PACKED_SLIME_BRICKS = ITEMS.register("pink_packed_slime_bricks",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PINK_CHISELED_PACKED_SLIME_BLOCK = ITEMS.register("pink_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.PINK_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PINK_PACKED_SLIME_BRICK_SLAB = ITEMS.register("pink_packed_slime_brick_slab",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PINK_PACKED_SLIME_BRICK_STAIR = ITEMS.register("pink_packed_slime_brick_stair",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PINK_PACKED_SLIME_BRICK_WALL = ITEMS.register("pink_packed_slime_brick_wall",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> GRAY_PACKED_SLIME_BLOCK = ITEMS.register("gray_packed_slime_block",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GRAY_PACKED_SLIME_STAIR = ITEMS.register("gray_packed_slime_stair",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GRAY_PACKED_SLIME_SLAB = ITEMS.register("gray_packed_slime_slab",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GRAY_PACKED_SLIME_WALL = ITEMS.register("gray_packed_slime_wall",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GRAY_PACKED_SLIME_BRICKS = ITEMS.register("gray_packed_slime_bricks",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GRAY_CHISELED_PACKED_SLIME_BLOCK = ITEMS.register("gray_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.GRAY_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GRAY_PACKED_SLIME_BRICK_SLAB = ITEMS.register("gray_packed_slime_brick_slab",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GRAY_PACKED_SLIME_BRICK_STAIR = ITEMS.register("gray_packed_slime_brick_stair",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GRAY_PACKED_SLIME_BRICK_WALL = ITEMS.register("gray_packed_slime_brick_wall",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> LIGHT_GRAY_PACKED_SLIME_BLOCK = ITEMS.register("light_gray_packed_slime_block",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_GRAY_PACKED_SLIME_STAIR = ITEMS.register("light_gray_packed_slime_stair",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_GRAY_PACKED_SLIME_SLAB = ITEMS.register("light_gray_packed_slime_slab",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_GRAY_PACKED_SLIME_WALL = ITEMS.register("light_gray_packed_slime_wall",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_GRAY_PACKED_SLIME_BRICKS = ITEMS.register("light_gray_packed_slime_bricks",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_GRAY_CHISELED_PACKED_SLIME_BLOCK = ITEMS.register("light_gray_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.LIGHT_GRAY_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_GRAY_PACKED_SLIME_BRICK_SLAB = ITEMS.register("light_gray_packed_slime_brick_slab",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_GRAY_PACKED_SLIME_BRICK_STAIR = ITEMS.register("light_gray_packed_slime_brick_stair",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_GRAY_PACKED_SLIME_BRICK_WALL = ITEMS.register("light_gray_packed_slime_brick_wall",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> CYAN_PACKED_SLIME_BLOCK = ITEMS.register("cyan_packed_slime_block",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> CYAN_PACKED_SLIME_STAIR = ITEMS.register("cyan_packed_slime_stair",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> CYAN_PACKED_SLIME_SLAB = ITEMS.register("cyan_packed_slime_slab",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> CYAN_PACKED_SLIME_WALL = ITEMS.register("cyan_packed_slime_wall",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> CYAN_PACKED_SLIME_BRICKS = ITEMS.register("cyan_packed_slime_bricks",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> CYAN_CHISELED_PACKED_SLIME_BLOCK = ITEMS.register("cyan_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.CYAN_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> CYAN_PACKED_SLIME_BRICK_SLAB = ITEMS.register("cyan_packed_slime_brick_slab",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> CYAN_PACKED_SLIME_BRICK_STAIR = ITEMS.register("cyan_packed_slime_brick_stair",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> CYAN_PACKED_SLIME_BRICK_WALL = ITEMS.register("cyan_packed_slime_brick_wall",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> PURPLE_PACKED_SLIME_BLOCK = ITEMS.register("purple_packed_slime_block",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PURPLE_PACKED_SLIME_STAIR = ITEMS.register("purple_packed_slime_stair",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PURPLE_PACKED_SLIME_SLAB = ITEMS.register("purple_packed_slime_slab",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PURPLE_PACKED_SLIME_WALL = ITEMS.register("purple_packed_slime_wall",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PURPLE_PACKED_SLIME_BRICKS = ITEMS.register("purple_packed_slime_bricks",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PURPLE_CHISELED_PACKED_SLIME_BLOCK = ITEMS.register("purple_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.PURPLE_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PURPLE_PACKED_SLIME_BRICK_SLAB = ITEMS.register("purple_packed_slime_brick_slab",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PURPLE_PACKED_SLIME_BRICK_STAIR = ITEMS.register("purple_packed_slime_brick_stair",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PURPLE_PACKED_SLIME_BRICK_WALL = ITEMS.register("purple_packed_slime_brick_wall",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> BLUE_PACKED_SLIME_BLOCK = ITEMS.register("blue_packed_slime_block",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLUE_PACKED_SLIME_STAIR = ITEMS.register("blue_packed_slime_stair",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLUE_PACKED_SLIME_SLAB = ITEMS.register("blue_packed_slime_slab",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLUE_PACKED_SLIME_WALL = ITEMS.register("blue_packed_slime_wall",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLUE_PACKED_SLIME_BRICKS = ITEMS.register("blue_packed_slime_bricks",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLUE_CHISELED_PACKED_SLIME_BLOCK = ITEMS.register("blue_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.BLUE_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLUE_PACKED_SLIME_BRICK_SLAB = ITEMS.register("blue_packed_slime_brick_slab",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLUE_PACKED_SLIME_BRICK_STAIR = ITEMS.register("blue_packed_slime_brick_stair",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLUE_PACKED_SLIME_BRICK_WALL = ITEMS.register("blue_packed_slime_brick_wall",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> BROWN_PACKED_SLIME_BLOCK = ITEMS.register("brown_packed_slime_block",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BROWN_PACKED_SLIME_STAIR = ITEMS.register("brown_packed_slime_stair",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BROWN_PACKED_SLIME_SLAB = ITEMS.register("brown_packed_slime_slab",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BROWN_PACKED_SLIME_WALL = ITEMS.register("brown_packed_slime_wall",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BROWN_PACKED_SLIME_BRICKS = ITEMS.register("brown_packed_slime_bricks",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BROWN_CHISELED_PACKED_SLIME_BLOCK = ITEMS.register("brown_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.BROWN_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BROWN_PACKED_SLIME_BRICK_SLAB = ITEMS.register("brown_packed_slime_brick_slab",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BROWN_PACKED_SLIME_BRICK_STAIR = ITEMS.register("brown_packed_slime_brick_stair",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BROWN_PACKED_SLIME_BRICK_WALL = ITEMS.register("brown_packed_slime_brick_wall",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> GREEN_PACKED_SLIME_BLOCK = ITEMS.register("green_packed_slime_block",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GREEN_PACKED_SLIME_STAIR = ITEMS.register("green_packed_slime_stair",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GREEN_PACKED_SLIME_SLAB = ITEMS.register("green_packed_slime_slab",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GREEN_PACKED_SLIME_WALL = ITEMS.register("green_packed_slime_wall",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GREEN_PACKED_SLIME_BRICKS = ITEMS.register("green_packed_slime_bricks",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GREEN_CHISELED_PACKED_SLIME_BLOCK = ITEMS.register("green_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.GREEN_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GREEN_PACKED_SLIME_BRICK_SLAB = ITEMS.register("green_packed_slime_brick_slab",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GREEN_PACKED_SLIME_BRICK_STAIR = ITEMS.register("green_packed_slime_brick_stair",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GREEN_PACKED_SLIME_BRICK_WALL = ITEMS.register("green_packed_slime_brick_wall",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> RED_PACKED_SLIME_BLOCK = ITEMS.register("red_packed_slime_block",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> RED_PACKED_SLIME_STAIR = ITEMS.register("red_packed_slime_stair",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> RED_PACKED_SLIME_SLAB = ITEMS.register("red_packed_slime_slab",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> RED_PACKED_SLIME_WALL = ITEMS.register("red_packed_slime_wall",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> RED_PACKED_SLIME_BRICKS = ITEMS.register("red_packed_slime_bricks",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> RED_CHISELED_PACKED_SLIME_BLOCK = ITEMS.register("red_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.RED_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> RED_PACKED_SLIME_BRICK_SLAB = ITEMS.register("red_packed_slime_brick_slab",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> RED_PACKED_SLIME_BRICK_STAIR = ITEMS.register("red_packed_slime_brick_stair",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> RED_PACKED_SLIME_BRICK_WALL = ITEMS.register("red_packed_slime_brick_wall",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> BLACK_PACKED_SLIME_BLOCK = ITEMS.register("black_packed_slime_block",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLACK_PACKED_SLIME_STAIR = ITEMS.register("black_packed_slime_stair",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLACK_PACKED_SLIME_SLAB = ITEMS.register("black_packed_slime_slab",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLACK_PACKED_SLIME_WALL = ITEMS.register("black_packed_slime_wall",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLACK_PACKED_SLIME_BRICKS = ITEMS.register("black_packed_slime_bricks",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLACK_CHISELED_PACKED_SLIME_BLOCK = ITEMS.register("black_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.BLACK_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLACK_PACKED_SLIME_BRICK_SLAB = ITEMS.register("black_packed_slime_brick_slab",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLACK_PACKED_SLIME_BRICK_STAIR = ITEMS.register("black_packed_slime_brick_stair",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLACK_PACKED_SLIME_BRICK_WALL = ITEMS.register("black_packed_slime_brick_wall",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static void init(){}


}

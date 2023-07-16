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

import static net.firemuffin303.slimegolem.ModPlatform.registerSpawnEgg;

public class ModItem {
    public static final ResourcefulRegistry<Item> ITEMS = ResourcefulRegistries.create(BuiltInRegistries.ITEM, MuffinsSlimeGolemMod.MOD_ID);
    public static final ResourcefulRegistry<Item> SLIME_BLOCK = ResourcefulRegistries.create(ITEMS);

    public static final Supplier<CreativeModeTab> TAB = new ResourcefulCreativeTab(new ResourceLocation(MuffinsSlimeGolemMod.MOD_ID,"main"))
            .setItemIcon(() ->ModItem.SLIME_PIE.get()).addRegistry(SLIME_BLOCK).build();

    public static final RegistryEntry<Item> SLIME_PIE = ITEMS.register("slime_pie",() -> new Item(new Item.Properties().food(ModFoods.SLIME_PIE)));
    public static final RegistryEntry<Item> SLIME_GOLEM_SPAWN_EGG = ITEMS.register("slime_golem_spawn_egg", registerSpawnEgg(ModEntityTypes.SLIME_GOLEM,1619264,7665522,new Item.Properties()));
    public static final RegistryEntry<Item> MUSIC_DISC_BOUNCYSLIME = ITEMS.register("music_disc_bouncyslime",() -> new ModRecordItem(7, ModSoundEvents.MUSIC_DISC_BOUNCYSLIME.get(),new Item.Properties().stacksTo(1).rarity(Rarity.RARE),134));
    public static final RegistryEntry<Item> SLIME_ALGAE = ITEMS.register("slime_algae",() -> new BlockItem(ModBlock.SLIME_ALGAE.get(),new Item.Properties()));

    public static final RegistryEntry<Item> PACKED_SLIME_BLOCK = SLIME_BLOCK.register("packed_slime_block",() -> new BlockItem(ModBlock.PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PACKED_SLIME_STAIR = SLIME_BLOCK.register("packed_slime_stair",() -> new BlockItem(ModBlock.PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PACKED_SLIME_SLAB = SLIME_BLOCK.register("packed_slime_slab",() -> new BlockItem(ModBlock.PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PACKED_SLIME_WALL = SLIME_BLOCK.register("packed_slime_wall",() -> new BlockItem(ModBlock.PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PACKED_SLIME_BRICKS = SLIME_BLOCK.register("packed_slime_bricks",() -> new BlockItem(ModBlock.PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("chiseled_packed_slime_block",() -> new BlockItem(ModBlock.CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("packed_slime_brick_slab",() -> new BlockItem(ModBlock.PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("packed_slime_brick_stair",() -> new BlockItem(ModBlock.PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("packed_slime_brick_wall",() -> new BlockItem(ModBlock.PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> WHITE_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("white_packed_slime_block",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> WHITE_PACKED_SLIME_STAIR = SLIME_BLOCK.register("white_packed_slime_stair",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> WHITE_PACKED_SLIME_SLAB = SLIME_BLOCK.register("white_packed_slime_slab",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> WHITE_PACKED_SLIME_WALL = SLIME_BLOCK.register("white_packed_slime_wall",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> WHITE_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("white_packed_slime_bricks",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> WHITE_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("white_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.WHITE_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> WHITE_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("white_packed_slime_brick_slab",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> WHITE_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("white_packed_slime_brick_stair",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> WHITE_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("white_packed_slime_brick_wall",() -> new BlockItem(ModBlock.WHITE_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> ORANGE_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("orange_packed_slime_block",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> ORANGE_PACKED_SLIME_STAIR = SLIME_BLOCK.register("orange_packed_slime_stair",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> ORANGE_PACKED_SLIME_SLAB = SLIME_BLOCK.register("orange_packed_slime_slab",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> ORANGE_PACKED_SLIME_WALL = SLIME_BLOCK.register("orange_packed_slime_wall",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> ORANGE_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("orange_packed_slime_bricks",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> ORANGE_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("orange_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.ORANGE_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> ORANGE_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("orange_packed_slime_brick_slab",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> ORANGE_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("orange_packed_slime_brick_stair",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> ORANGE_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("orange_packed_slime_brick_wall",() -> new BlockItem(ModBlock.ORANGE_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> MAGENTA_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("magenta_packed_slime_block",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> MAGENTA_PACKED_SLIME_STAIR = SLIME_BLOCK.register("magenta_packed_slime_stair",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> MAGENTA_PACKED_SLIME_SLAB = SLIME_BLOCK.register("magenta_packed_slime_slab",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> MAGENTA_PACKED_SLIME_WALL = SLIME_BLOCK.register("magenta_packed_slime_wall",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> MAGENTA_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("magenta_packed_slime_bricks",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> MAGENTA_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("magenta_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.MAGENTA_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> MAGENTA_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("magenta_packed_slime_brick_slab",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> MAGENTA_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("magenta_packed_slime_brick_stair",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> MAGENTA_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("magenta_packed_slime_brick_wall",() -> new BlockItem(ModBlock.MAGENTA_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> LIGHT_BLUE_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("light_blue_packed_slime_block",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_BLUE_PACKED_SLIME_STAIR = SLIME_BLOCK.register("light_blue_packed_slime_stair",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_BLUE_PACKED_SLIME_SLAB = SLIME_BLOCK.register("light_blue_packed_slime_slab",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_BLUE_PACKED_SLIME_WALL = SLIME_BLOCK.register("light_blue_packed_slime_wall",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_BLUE_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("light_blue_packed_slime_bricks",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_BLUE_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("light_blue_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.LIGHT_BLUE_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_BLUE_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("light_blue_packed_slime_brick_slab",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_BLUE_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("light_blue_packed_slime_brick_stair",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_BLUE_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("light_blue_packed_slime_brick_wall",() -> new BlockItem(ModBlock.LIGHT_BLUE_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> YELLOW_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("yellow_packed_slime_block",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> YELLOW_PACKED_SLIME_STAIR = SLIME_BLOCK.register("yellow_packed_slime_stair",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> YELLOW_PACKED_SLIME_SLAB = SLIME_BLOCK.register("yellow_packed_slime_slab",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> YELLOW_PACKED_SLIME_WALL = SLIME_BLOCK.register("yellow_packed_slime_wall",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> YELLOW_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("yellow_packed_slime_bricks",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> YELLOW_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("yellow_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.YELLOW_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> YELLOW_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("yellow_packed_slime_brick_slab",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> YELLOW_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("yellow_packed_slime_brick_stair",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> YELLOW_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("yellow_packed_slime_brick_wall",() -> new BlockItem(ModBlock.YELLOW_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> LIME_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("lime_packed_slime_block",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIME_PACKED_SLIME_STAIR = SLIME_BLOCK.register("lime_packed_slime_stair",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIME_PACKED_SLIME_SLAB = SLIME_BLOCK.register("lime_packed_slime_slab",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIME_PACKED_SLIME_WALL = SLIME_BLOCK.register("lime_packed_slime_wall",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIME_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("lime_packed_slime_bricks",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIME_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("lime_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.LIME_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIME_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("lime_packed_slime_brick_slab",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIME_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("lime_packed_slime_brick_stair",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIME_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("lime_packed_slime_brick_wall",() -> new BlockItem(ModBlock.LIME_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> PINK_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("pink_packed_slime_block",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PINK_PACKED_SLIME_STAIR = SLIME_BLOCK.register("pink_packed_slime_stair",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PINK_PACKED_SLIME_SLAB = SLIME_BLOCK.register("pink_packed_slime_slab",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PINK_PACKED_SLIME_WALL = SLIME_BLOCK.register("pink_packed_slime_wall",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PINK_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("pink_packed_slime_bricks",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PINK_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("pink_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.PINK_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PINK_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("pink_packed_slime_brick_slab",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PINK_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("pink_packed_slime_brick_stair",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PINK_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("pink_packed_slime_brick_wall",() -> new BlockItem(ModBlock.PINK_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> GRAY_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("gray_packed_slime_block",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GRAY_PACKED_SLIME_STAIR = SLIME_BLOCK.register("gray_packed_slime_stair",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GRAY_PACKED_SLIME_SLAB = SLIME_BLOCK.register("gray_packed_slime_slab",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GRAY_PACKED_SLIME_WALL = SLIME_BLOCK.register("gray_packed_slime_wall",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GRAY_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("gray_packed_slime_bricks",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GRAY_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("gray_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.GRAY_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GRAY_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("gray_packed_slime_brick_slab",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GRAY_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("gray_packed_slime_brick_stair",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GRAY_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("gray_packed_slime_brick_wall",() -> new BlockItem(ModBlock.GRAY_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> LIGHT_GRAY_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("light_gray_packed_slime_block",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_GRAY_PACKED_SLIME_STAIR = SLIME_BLOCK.register("light_gray_packed_slime_stair",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_GRAY_PACKED_SLIME_SLAB = SLIME_BLOCK.register("light_gray_packed_slime_slab",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_GRAY_PACKED_SLIME_WALL = SLIME_BLOCK.register("light_gray_packed_slime_wall",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_GRAY_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("light_gray_packed_slime_bricks",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_GRAY_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("light_gray_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.LIGHT_GRAY_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_GRAY_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("light_gray_packed_slime_brick_slab",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_GRAY_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("light_gray_packed_slime_brick_stair",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> LIGHT_GRAY_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("light_gray_packed_slime_brick_wall",() -> new BlockItem(ModBlock.LIGHT_GRAY_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> CYAN_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("cyan_packed_slime_block",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> CYAN_PACKED_SLIME_STAIR = SLIME_BLOCK.register("cyan_packed_slime_stair",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> CYAN_PACKED_SLIME_SLAB = SLIME_BLOCK.register("cyan_packed_slime_slab",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> CYAN_PACKED_SLIME_WALL = SLIME_BLOCK.register("cyan_packed_slime_wall",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> CYAN_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("cyan_packed_slime_bricks",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> CYAN_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("cyan_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.CYAN_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> CYAN_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("cyan_packed_slime_brick_slab",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> CYAN_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("cyan_packed_slime_brick_stair",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> CYAN_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("cyan_packed_slime_brick_wall",() -> new BlockItem(ModBlock.CYAN_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> PURPLE_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("purple_packed_slime_block",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PURPLE_PACKED_SLIME_STAIR = SLIME_BLOCK.register("purple_packed_slime_stair",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PURPLE_PACKED_SLIME_SLAB = SLIME_BLOCK.register("purple_packed_slime_slab",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PURPLE_PACKED_SLIME_WALL = SLIME_BLOCK.register("purple_packed_slime_wall",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PURPLE_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("purple_packed_slime_bricks",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PURPLE_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("purple_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.PURPLE_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PURPLE_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("purple_packed_slime_brick_slab",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PURPLE_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("purple_packed_slime_brick_stair",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> PURPLE_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("purple_packed_slime_brick_wall",() -> new BlockItem(ModBlock.PURPLE_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> BLUE_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("blue_packed_slime_block",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLUE_PACKED_SLIME_STAIR = SLIME_BLOCK.register("blue_packed_slime_stair",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLUE_PACKED_SLIME_SLAB = SLIME_BLOCK.register("blue_packed_slime_slab",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLUE_PACKED_SLIME_WALL = SLIME_BLOCK.register("blue_packed_slime_wall",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLUE_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("blue_packed_slime_bricks",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLUE_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("blue_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.BLUE_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLUE_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("blue_packed_slime_brick_slab",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLUE_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("blue_packed_slime_brick_stair",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLUE_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("blue_packed_slime_brick_wall",() -> new BlockItem(ModBlock.BLUE_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> BROWN_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("brown_packed_slime_block",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BROWN_PACKED_SLIME_STAIR = SLIME_BLOCK.register("brown_packed_slime_stair",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BROWN_PACKED_SLIME_SLAB = SLIME_BLOCK.register("brown_packed_slime_slab",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BROWN_PACKED_SLIME_WALL = SLIME_BLOCK.register("brown_packed_slime_wall",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BROWN_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("brown_packed_slime_bricks",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BROWN_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("brown_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.BROWN_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BROWN_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("brown_packed_slime_brick_slab",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BROWN_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("brown_packed_slime_brick_stair",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BROWN_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("brown_packed_slime_brick_wall",() -> new BlockItem(ModBlock.BROWN_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> GREEN_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("green_packed_slime_block",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GREEN_PACKED_SLIME_STAIR = SLIME_BLOCK.register("green_packed_slime_stair",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GREEN_PACKED_SLIME_SLAB = SLIME_BLOCK.register("green_packed_slime_slab",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GREEN_PACKED_SLIME_WALL = SLIME_BLOCK.register("green_packed_slime_wall",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GREEN_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("green_packed_slime_bricks",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GREEN_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("green_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.GREEN_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GREEN_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("green_packed_slime_brick_slab",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GREEN_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("green_packed_slime_brick_stair",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> GREEN_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("green_packed_slime_brick_wall",() -> new BlockItem(ModBlock.GREEN_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> RED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("red_packed_slime_block",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> RED_PACKED_SLIME_STAIR = SLIME_BLOCK.register("red_packed_slime_stair",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> RED_PACKED_SLIME_SLAB = SLIME_BLOCK.register("red_packed_slime_slab",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> RED_PACKED_SLIME_WALL = SLIME_BLOCK.register("red_packed_slime_wall",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> RED_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("red_packed_slime_bricks",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> RED_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("red_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.RED_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> RED_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("red_packed_slime_brick_slab",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> RED_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("red_packed_slime_brick_stair",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> RED_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("red_packed_slime_brick_wall",() -> new BlockItem(ModBlock.RED_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static final RegistryEntry<Item> BLACK_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("black_packed_slime_block",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLACK_PACKED_SLIME_STAIR = SLIME_BLOCK.register("black_packed_slime_stair",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLACK_PACKED_SLIME_SLAB = SLIME_BLOCK.register("black_packed_slime_slab",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLACK_PACKED_SLIME_WALL = SLIME_BLOCK.register("black_packed_slime_wall",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_WALL.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLACK_PACKED_SLIME_BRICKS = SLIME_BLOCK.register("black_packed_slime_bricks",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_BRICKS.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLACK_CHISELED_PACKED_SLIME_BLOCK = SLIME_BLOCK.register("black_chiseled_packed_slime_block",() -> new BlockItem(ModBlock.BLACK_CHISELED_PACKED_SLIME_BLOCK.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLACK_PACKED_SLIME_BRICK_SLAB = SLIME_BLOCK.register("black_packed_slime_brick_slab",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_BRICK_SLAB.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLACK_PACKED_SLIME_BRICK_STAIR = SLIME_BLOCK.register("black_packed_slime_brick_stair",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_BRICK_STAIR.get(),new Item.Properties()));
    public static final RegistryEntry<Item> BLACK_PACKED_SLIME_BRICK_WALL = SLIME_BLOCK.register("black_packed_slime_brick_wall",() -> new BlockItem(ModBlock.BLACK_PACKED_SLIME_BRICK_WALL.get(),new Item.Properties()));

    public static void init(){}


}

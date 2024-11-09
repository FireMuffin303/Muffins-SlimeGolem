package net.firemuffin303.slimegolem.common.registry;

import net.firemuffin303.slimegolem.ModPlatform;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SpawnEggItem;

import java.util.ArrayList;
import java.util.function.Supplier;

import static net.firemuffin303.slimegolem.ModPlatform.registerSpawnEgg;

public class ModItem {
    public static final  ArrayList<Supplier<Item>> ITEMS = new ArrayList<>();

    public static final Supplier<Item> SLIME_PIE = registerItem("slime_pie",() -> new Item(new Item.Properties().food(ModFoods.SLIME_PIE)));
    public static final Supplier<Item> SLIME_GOLEM_SPAWN_EGG = registerItem("slime_golem_spawn_egg", () -> new SpawnEggItem(ModEntityTypes.SLIME_GOLEM.get(),1619264,7665522,new Item.Properties()));
    public static final Supplier<Item> MUSIC_DISC_BOUNCYSLIME = registerItem("music_disc_bouncyslime",() -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(MuffinsSlimeGolemMod.BOUNCY_SLIME)));
    //public static final Supplier<Item> MUSIC_DISC_BOUNCE_TIL_THE_END = registerItem("music_disc_bounce_til_the_end",() -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(MuffinsSlimeGolemMod.BOUNCY_SLIME)));
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

    public static void init(){}

    public static Supplier<Item> registerItem(String id, Supplier<Item> item){
        ITEMS.add(item);
        return ModPlatform.registerItem(id,item);
    }
}

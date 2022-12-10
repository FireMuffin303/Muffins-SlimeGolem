package net.firemuffin303.slimegolem.registry.item;


import net.firemuffin303.slimegolem.ModPlatform;
import net.firemuffin303.slimegolem.SlimeGolemMod;
import net.firemuffin303.slimegolem.registry.block.ModBlock;
import net.firemuffin303.slimegolem.registry.entity.ModEntity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;

import java.util.function.Supplier;

public class ModItem {

    public static final Supplier<Item> SLIME_PIE = ModPlatform.registerItem("slime_pie",() -> new Item(new Item.Properties().food(ModFoods.SLIME_PIE).tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> SLIME_GOLEM_SPAWN_EGG = ModPlatform.registerItem("slime_golem_spawn_egg",() -> new SpawnEggItem(ModEntity.SLIME_GOLEM.get(),1619264,7665522,new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> PACKED_SLIME_BLOCK = ModPlatform.registerItem("packed_slime_block",() -> new BlockItem(ModBlock.PACKED_SLIME_BLOCK.get(),new Item.Properties().tab(SlimeGolemMod.TAB)));
    public static final Supplier<Item> SLIME_ALGAE = ModPlatform.registerItem("slime_algae",() -> new BlockItem(ModBlock.SLIME_ALGAE.get(),new Item.Properties().tab(SlimeGolemMod.TAB)));

    public static void init(){}
}

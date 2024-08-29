package net.firemuffin303.slimegolem.common.registry;

import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;

public class ModLootTables {

    public static ResourceKey<LootTable> SLIME_GOLEM_DANCE_DROP =
            ResourceKey.create(Registries.LOOT_TABLE,ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,"gameplay/slime_golem_dance_gift"));

    public static void init(){
    }
}

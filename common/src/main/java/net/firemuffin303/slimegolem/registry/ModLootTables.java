package net.firemuffin303.slimegolem.registry;

import net.firemuffin303.slimegolem.ModPlatform;
import net.firemuffin303.slimegolem.SlimeGolemMod;
import net.minecraft.resources.ResourceLocation;

public class ModLootTables {
    public static ResourceLocation SLIME_GOLEM_DANCE_DROP = ModPlatform.registerLootTable(new ResourceLocation(SlimeGolemMod.MOD_ID,"gameplay/slime_golem_dance_gift"));

    public static void init(){}
}

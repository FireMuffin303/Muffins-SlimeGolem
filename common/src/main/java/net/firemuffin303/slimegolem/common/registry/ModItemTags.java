package net.firemuffin303.slimegolem.common.registry;

import net.firemuffin303.slimegolem.ModPlatform;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {

    public static final TagKey<Item> PACKED_SLIME_BLOCK = TagKey.create(Registries.ITEM,new ResourceLocation(MuffinsSlimeGolemMod.MOD_ID,"packed_slime_golem"));

    public static void init(){}
}

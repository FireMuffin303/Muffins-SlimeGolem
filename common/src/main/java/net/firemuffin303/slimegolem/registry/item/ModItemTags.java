package net.firemuffin303.slimegolem.registry.item;

import net.firemuffin303.slimegolem.ModPlatform;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

import static net.firemuffin303.slimegolem.SlimeGolemMod.MOD_ID;

public class ModItemTags {
    public static final TagKey<Item> PACKED_SLIME_BLOCK = ModPlatform.registerItemTag(Registries.ITEM,"packed_slime_golem");

    public static void init(){}
}

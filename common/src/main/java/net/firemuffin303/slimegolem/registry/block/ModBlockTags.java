package net.firemuffin303.slimegolem.registry.block;

import net.firemuffin303.slimegolem.ModPlatform;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static net.firemuffin303.slimegolem.SlimeGolemMod.MOD_ID;

public class ModBlockTags {
    public static final TagKey<Block> PACKED_SLIME_BLOCK = ModPlatform.registerBlockTag(Registries.BLOCK,"packed_slime_golem");

    public static void init(){}
}

package net.firemuffin303.slimegolem.common.registry;

import net.firemuffin303.slimegolem.ModPlatform;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModBlockTags {
    public static final TagKey<Block> PACKED_SLIME_BLOCK = TagKey.create(Registries.BLOCK,new ResourceLocation(MuffinsSlimeGolemMod.MOD_ID,"packed_slime_golem"));

    public static void init(){}
}

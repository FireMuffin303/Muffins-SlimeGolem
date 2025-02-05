package net.firemuffin303.slimegolem.common.registry;

import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static final TagKey<Block> PACKED_SLIME_BLOCK = TagKey.create(Registries.BLOCK,ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,"packed_slime_block"));
    public static final TagKey<Block> SLIME_GOLEM_BLOCKS = TagKey.create(Registries.BLOCK,ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,"slime_golem_blocks"));

    public static final TagKey<Item> PACKED_SLIME_BLOCK_ITEM = TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,"packed_slime_golem"));

    public static final TagKey<EntityType<?>> IMMUNE_TO_BOUNCE = TagKey.create(Registries.ENTITY_TYPE,ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,"immune_to_bounce"));
    public static final TagKey<EntityType<?>> NOT_TARGETED_BY_SLIME_GOLEM = TagKey.create(Registries.ENTITY_TYPE,ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,"not_targeted_by_slime_golem"));
    public static void init(){}
}

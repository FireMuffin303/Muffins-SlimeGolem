package net.firemuffin303.slimegolem.common.registry;

import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static final TagKey<Block> PACKED_SLIME_BLOCK = TagKey.create(Registries.BLOCK,ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,"packed_slime_block"));
    public static final TagKey<Block> SLIME_GOLEM_BLOCKS = TagKey.create(Registries.BLOCK,ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,"slime_golem_blocks"));

    public static final TagKey<Item> PACKED_SLIME_BLOCK_ITEM = TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,"packed_slime_golem"));

    public static final TagKey<EntityType<?>> CAN_GO_PASS_SLIME_CHARGE = TagKey.create(Registries.ENTITY_TYPE,ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,"can_go_pass_slime_charge"));
    public static void init(){}
}

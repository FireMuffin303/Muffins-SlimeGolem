package net.firemuffin303.slimegolem.common.registry;


import com.teamresourceful.resourcefullib.common.registry.RegistryEntries;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import net.firemuffin303.slimegolem.ModPlatform;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.firemuffin303.slimegolem.common.entity.SlimeGolemEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ModEntity {
    public static final ResourcefulRegistry<EntityType<?>> ENTITY_TYPE = ResourcefulRegistries.create(BuiltInRegistries.ENTITY_TYPE, MuffinsSlimeGolemMod.MOD_ID);

    public static final RegistryEntry<EntityType<SlimeGolemEntity>> SLIME_GOLEM = ENTITY_TYPE.register("slime_golem",() -> EntityType.Builder.of(SlimeGolemEntity::new, MobCategory.MISC).sized(0.7f,1.2f).clientTrackingRange(8).build(MuffinsSlimeGolemMod.MOD_ID));

    public static void init(){}

    public static void registerAttrbutes(BiConsumer<Supplier<? extends EntityType<? extends LivingEntity>>, Supplier<AttributeSupplier.Builder>> attributes){
        attributes.accept(SLIME_GOLEM,SlimeGolemEntity::createAttributes);
    }
}

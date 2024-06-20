package net.firemuffin303.slimegolem.common.registry;


import net.firemuffin303.slimegolem.ModPlatform;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.firemuffin303.slimegolem.common.entity.SlimeGolemEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ModEntityTypes {
    public static final ArrayList<Supplier<EntityType<?>>> ENTITY_TYPE = new ArrayList<>();

    public static final Supplier<EntityType<SlimeGolemEntity>> SLIME_GOLEM = ModPlatform.registerEntityType("slime_golem",() -> EntityType.Builder.of(SlimeGolemEntity::new, MobCategory.MISC).sized(0.7f,1.2f).clientTrackingRange(8).build(MuffinsSlimeGolemMod.MOD_ID));

    public static void init(){}

    public static void registerAttrbutes(BiConsumer<Supplier<? extends EntityType<? extends LivingEntity>>, Supplier<AttributeSupplier.Builder>> attributes){
        attributes.accept(SLIME_GOLEM,SlimeGolemEntity::createAttributes);
    }
}

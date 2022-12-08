package net.firemuffin303.slimegolem.registry.entity;

import dev.architectury.registry.registries.DeferredRegister;
import net.firemuffin303.slimegolem.ModPlatform;
import net.firemuffin303.slimegolem.SlimeGolemMod;
import net.minecraft.core.Registry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import javax.swing.text.html.parser.Entity;
import java.util.function.Supplier;

public class ModEntity {
    public static final Supplier<EntityType<SlimeGolemEntity>> SLIME_GOLEM = ModPlatform.registerEntityType("slime_golem",() -> EntityType.Builder.of(SlimeGolemEntity::new, MobCategory.MISC).sized(0.7f,1.2f).clientTrackingRange(8).build("slime_golem"));

    public static void init(){}
}

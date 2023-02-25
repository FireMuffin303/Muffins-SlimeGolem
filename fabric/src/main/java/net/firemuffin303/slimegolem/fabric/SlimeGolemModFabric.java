package net.firemuffin303.slimegolem.fabric;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.firemuffin303.slimegolem.SlimeGolemMod;
import net.fabricmc.api.ModInitializer;
import net.firemuffin303.slimegolem.fabric.utils.ModFabricConfig;
import net.firemuffin303.slimegolem.registry.entity.ModEntity;
import net.firemuffin303.slimegolem.registry.entity.SlimeGolemEntity;

public class SlimeGolemModFabric implements ModInitializer {
    public static ModFabricConfig CONFIG;

    @Override
    public void onInitialize() {
        SlimeGolemMod.init();
        AutoConfig.register(ModFabricConfig.class, GsonConfigSerializer::new);
        FabricDefaultAttributeRegistry.register(ModEntity.SLIME_GOLEM.get(), SlimeGolemEntity.createAttributes());
        CONFIG = AutoConfig.getConfigHolder(ModFabricConfig.class).getConfig();
    }
}

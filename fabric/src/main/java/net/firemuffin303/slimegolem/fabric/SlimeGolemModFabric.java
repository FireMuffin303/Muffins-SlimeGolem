package net.firemuffin303.slimegolem.fabric;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.firemuffin303.slimegolem.SlimeGolemMod;
import net.fabricmc.api.ModInitializer;
import net.firemuffin303.slimegolem.registry.entity.ModEntity;
import net.firemuffin303.slimegolem.registry.entity.SlimeGolemEntity;

public class SlimeGolemModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        SlimeGolemMod.init();
        FabricDefaultAttributeRegistry.register(ModEntity.SLIME_GOLEM.get(), SlimeGolemEntity.createAttributes());
    }
}

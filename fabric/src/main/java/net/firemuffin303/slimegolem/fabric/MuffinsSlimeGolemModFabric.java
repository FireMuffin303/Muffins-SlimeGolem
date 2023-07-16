package net.firemuffin303.slimegolem.fabric;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.fabricmc.api.ModInitializer;
import net.firemuffin303.slimegolem.common.registry.ModEntityTypes;
import net.firemuffin303.slimegolem.common.entity.SlimeGolemEntity;

public class MuffinsSlimeGolemModFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        MuffinsSlimeGolemMod.init();

        FabricDefaultAttributeRegistry.register(ModEntityTypes.SLIME_GOLEM.get(), SlimeGolemEntity.createAttributes());
    }
}

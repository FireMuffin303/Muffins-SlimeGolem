package net.firemuffin303.slimegolem.fabric.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.firemuffin303.slimegolem.client.SlimeGolemClientMod;
import net.firemuffin303.slimegolem.client.model.SlimeGolemModel;

@Environment(EnvType.CLIENT)
public class SlimeGolemClientModFabric implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        SlimeGolemClientMod.init();
        EntityModelLayerRegistry.registerModelLayer(SlimeGolemModel.LAYER, SlimeGolemModel::createInnerLayer);
        EntityModelLayerRegistry.registerModelLayer(SlimeGolemModel.OUT_LAYER, SlimeGolemModel::createOuterLayer);
    }
}

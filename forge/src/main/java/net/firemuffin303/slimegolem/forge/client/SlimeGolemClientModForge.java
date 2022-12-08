package net.firemuffin303.slimegolem.forge.client;

import net.firemuffin303.slimegolem.SlimeGolemMod;
import net.firemuffin303.slimegolem.client.SlimeGolemClientMod;
import net.firemuffin303.slimegolem.client.model.SlimeGolemModel;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = SlimeGolemMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SlimeGolemClientModForge {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event){
        SlimeGolemClientMod.init();
    }

    @SubscribeEvent
    public static void registryLayer(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(SlimeGolemModel.LAYER,SlimeGolemModel::createInnerLayer);
        event.registerLayerDefinition(SlimeGolemModel.OUT_LAYER,SlimeGolemModel::createOuterLayer);
    }
}

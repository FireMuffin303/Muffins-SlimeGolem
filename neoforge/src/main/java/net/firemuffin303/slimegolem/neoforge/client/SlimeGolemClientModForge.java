package net.firemuffin303.slimegolem.neoforge.client;

import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.firemuffin303.slimegolem.client.CursedSlimeSoulParticle;
import net.firemuffin303.slimegolem.client.SlimeGolemClientMod;
import net.firemuffin303.slimegolem.client.model.SlimeGolemModel;
import net.firemuffin303.slimegolem.common.registry.ModParticleTypes;
import net.firemuffin303.slimegolem.neoforge.config.ModForgeConfig;
import net.minecraft.client.particle.AttackSweepParticle;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;

@EventBusSubscriber(modid = MuffinsSlimeGolemMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class SlimeGolemClientModForge {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event){
        SlimeGolemClientMod.init();
    }

    public static void init(){
        ModForgeConfig.register();
    }

    @SubscribeEvent
    public static void registryLayer(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(SlimeGolemModel.LAYER,SlimeGolemModel::createInnerLayer);
        event.registerLayerDefinition(SlimeGolemModel.OUT_LAYER,SlimeGolemModel::createOuterLayer);
    }

    @SubscribeEvent
    public static void registerParticleProvider(RegisterParticleProvidersEvent event){
        event.registerSpriteSet(ModParticleTypes.CURSED_SLIME_SOUL.get(), CursedSlimeSoulParticle.Provider::new);
    }
}

package net.firemuffin303.slimegolem.neoforge.client;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.firemuffin303.slimegolem.ModConfig;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.firemuffin303.slimegolem.client.CursedSlimeSoulParticle;
import net.firemuffin303.slimegolem.client.SlimeGolemClientMod;
import net.firemuffin303.slimegolem.client.model.SlimeGolemModel;
import net.firemuffin303.slimegolem.common.registry.ModParticleTypes;
import net.firemuffin303.slimegolem.neoforge.config.ModForgeConfig;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.particle.AttackSweepParticle;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

import java.util.Optional;

@EventBusSubscriber(modid = MuffinsSlimeGolemMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class SlimeGolemClientModForge {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event){
        SlimeGolemClientMod.init();

    }

    @SubscribeEvent
    public static void onClientCompleteSetup(FMLLoadCompleteEvent event){
        var container = ModList.get().getModContainerById(MuffinsSlimeGolemMod.MOD_ID);
        container.ifPresent(SlimeGolemClientModForge::registerConfig);
    }

    public static void init(){

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

    public static void registerConfig(ModContainer container){
        if(ModList.get().isLoaded("cloth_config")){
            container.registerExtensionPoint(IConfigScreenFactory.class, (modContainer, arg) -> AutoConfig.getConfigScreen(ModConfig.class,arg).get());
        }
    }
}

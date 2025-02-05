package net.firemuffin303.slimegolem.fabric.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.firemuffin303.slimegolem.client.CursedSlimeSoulParticle;
import net.firemuffin303.slimegolem.client.SlimeGolemClientMod;
import net.firemuffin303.slimegolem.client.SlimeSplashParticle;
import net.firemuffin303.slimegolem.client.SlimeTrailParticle;
import net.firemuffin303.slimegolem.client.model.SlimeChargeGroundModel;
import net.firemuffin303.slimegolem.client.model.SlimeChargeProjectileModel;
import net.firemuffin303.slimegolem.client.model.SlimeGolemModel;
import net.firemuffin303.slimegolem.common.registry.ModParticleTypes;
import net.minecraft.client.particle.SpellParticle;

@Environment(EnvType.CLIENT)
public class SlimeGolemClientModFabric implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        SlimeGolemClientMod.init();
        EntityModelLayerRegistry.registerModelLayer(SlimeGolemModel.LAYER, SlimeGolemModel::createInnerLayer);
        EntityModelLayerRegistry.registerModelLayer(SlimeGolemModel.OUT_LAYER, SlimeGolemModel::createOuterLayer);
        EntityModelLayerRegistry.registerModelLayer(SlimeChargeProjectileModel.LAYER, SlimeChargeProjectileModel::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(SlimeChargeGroundModel.LAYER, SlimeChargeGroundModel::createBodyLayer);

        ParticleFactoryRegistry.getInstance().register(ModParticleTypes.CURSED_SLIME_SOUL.get(), CursedSlimeSoulParticle.Provider::new);
        ParticleFactoryRegistry.getInstance().register(ModParticleTypes.SLIME_SPLASH.get(), SlimeSplashParticle.Provider::new);
        ParticleFactoryRegistry.getInstance().register(ModParticleTypes.BOUNCE_EFFECT.get(), SpellParticle.Provider::new);
    }
}

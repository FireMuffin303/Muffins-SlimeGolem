package net.firemuffin303.slimegolem.client;


import net.firemuffin303.slimegolem.ModPlatform;
import net.firemuffin303.slimegolem.client.renderer.entity.SlimeGolemRenderer;
import net.firemuffin303.slimegolem.common.registry.ModBlock;
import net.firemuffin303.slimegolem.common.registry.ModEntityTypes;
import net.minecraft.client.renderer.RenderType;

public class SlimeGolemClientMod {
    public static void init(){
        ModPlatform.registerRenderLayer(ModBlock.SLIME_ALGAE, RenderType.translucent());
        ModPlatform.registerEntityRenderer(ModEntityTypes.SLIME_GOLEM, SlimeGolemRenderer::new);
    }
}

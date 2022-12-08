package net.firemuffin303.slimegolem.client;


import net.firemuffin303.slimegolem.ModPlatform;
import net.firemuffin303.slimegolem.client.renderer.entity.SlimeGolemRenderer;
import net.firemuffin303.slimegolem.registry.block.ModBlock;
import net.firemuffin303.slimegolem.registry.entity.ModEntity;
import net.minecraft.client.renderer.RenderType;

public class SlimeGolemClientMod {
    public static void init(){
        ModPlatform.registerRenderLayer(ModBlock.SLIME_ALGAE, RenderType.translucent());
        ModPlatform.registerEntityRenderer(ModEntity.SLIME_GOLEM, SlimeGolemRenderer::new);
    }
}

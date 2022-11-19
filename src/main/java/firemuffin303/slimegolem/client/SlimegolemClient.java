package firemuffin303.slimegolem.client;

import firemuffin303.slimegolem.block.ModBlocks;
import firemuffin303.slimegolem.client.render.SlimeGolemRenderer;
import firemuffin303.slimegolem.client.render.model.SlimeGolemEntityModel;
import firemuffin303.slimegolem.entity.ModEntity;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class SlimegolemClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntity.SLIME_GOLEM, SlimeGolemRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(SlimeGolemRenderer.SLIMEGOLEM, SlimeGolemEntityModel::getInnerTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(SlimeGolemRenderer.SLIMEGOLEM_OUTER,SlimeGolemEntityModel::getOuterTexturedModelData);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SLIME_ALGAE, RenderLayer.getTranslucent());

    }
}

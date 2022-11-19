package firemuffin303.slimegolem.client.render.model.layer;

import firemuffin303.slimegolem.client.render.SlimeGolemRenderer;
import firemuffin303.slimegolem.client.render.model.SlimeGolemEntityModel;
import firemuffin303.slimegolem.entity.SlimeGolemEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.client.render.entity.model.SalmonEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;

@Environment(EnvType.CLIENT)
public class SlimeGolemOverlayFeatureRenderer extends FeatureRenderer<SlimeGolemEntity, SlimeGolemEntityModel<SlimeGolemEntity>> {
    private final SlimeGolemEntityModel<SlimeGolemEntity> model;

    public SlimeGolemOverlayFeatureRenderer(FeatureRendererContext<SlimeGolemEntity, SlimeGolemEntityModel<SlimeGolemEntity>> context, EntityModelLoader loader) {
        super(context);
        this.model = new SlimeGolemEntityModel<>(loader.getModelPart(SlimeGolemRenderer.SLIMEGOLEM_OUTER));
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, SlimeGolemEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        boolean bl = minecraftClient.hasOutline(entity) && entity.isInvisible();
        if(!entity.isInvisible() || bl){
            VertexConsumer vertexConsumer;
            if (bl) {
                vertexConsumer = vertexConsumers.getBuffer(RenderLayer.getOutline(this.getTexture(entity)));
            } else {
                vertexConsumer = vertexConsumers.getBuffer(RenderLayer.getEntityTranslucent(this.getTexture(entity)));
            }
            this.getContextModel().copyStateTo(this.model);
            this.model.animateModel(entity, limbAngle, limbDistance, tickDelta);
            this.model.setAngles(entity, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
            this.model.render(matrices,vertexConsumer,light, LivingEntityRenderer.getOverlay(entity,0.0F),1.0F,1.0F,1.0F,1.0F);
        }
    }
}

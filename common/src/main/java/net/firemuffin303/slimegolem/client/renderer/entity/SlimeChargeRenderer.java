package net.firemuffin303.slimegolem.client.renderer.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.firemuffin303.slimegolem.client.model.SlimeChargeModel;
import net.firemuffin303.slimegolem.common.entity.SlimeChargeProjectile;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;

public class SlimeChargeRenderer extends EntityRenderer<SlimeChargeProjectile> {
    private static final ResourceLocation TEXTURE_LOCATION = ResourceLocation.withDefaultNamespace("textures/entity/projectiles/wind_charge.png");
    private final SlimeChargeModel model;
    public SlimeChargeRenderer(EntityRendererProvider.Context context) {
        super(context);
        this.model = new SlimeChargeModel(context.bakeLayer(SlimeChargeModel.LAYER));
    }

    @Override
    public void render(SlimeChargeProjectile entity, float f, float g, PoseStack poseStack, MultiBufferSource multiBufferSource, int i) {
        VertexConsumer vertexConsumer = multiBufferSource.getBuffer(RenderType.entityCutout(TEXTURE_LOCATION));
        float widthSize = (entity.getSize() +1) * 0.5f;
        float heightSize = (entity.getSize() +1) * 0.5f;
        poseStack.pushPose();
        poseStack.scale(widthSize,heightSize,widthSize);
        this.model.renderToBuffer(poseStack,vertexConsumer,i, OverlayTexture.NO_OVERLAY);
        poseStack.popPose();

        super.render(entity, f, g, poseStack, multiBufferSource, i);

    }

    @Override
    public ResourceLocation getTextureLocation(SlimeChargeProjectile entity) {
        return TEXTURE_LOCATION;
    }
}

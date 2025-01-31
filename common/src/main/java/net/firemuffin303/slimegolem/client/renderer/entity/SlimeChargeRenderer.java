package net.firemuffin303.slimegolem.client.renderer.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.firemuffin303.slimegolem.client.model.SlimeChargeGroundModel;
import net.firemuffin303.slimegolem.client.model.SlimeChargeProjectileModel;
import net.firemuffin303.slimegolem.common.entity.SlimeChargeProjectile;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;

public class SlimeChargeRenderer extends EntityRenderer<SlimeChargeProjectile> {
    private static final ResourceLocation TEXTURE_LOCATION = ResourceLocation.withDefaultNamespace("textures/entity/projectiles/wind_charge.png");
    private static final ResourceLocation GROUND_TEXTURE_LOCATION = ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,"textures/entity/projectiles/slime_charge_ground.png");
    private final SlimeChargeProjectileModel model;
    private final SlimeChargeGroundModel groundModel;
    public SlimeChargeRenderer(EntityRendererProvider.Context context) {
        super(context);
        this.model = new SlimeChargeProjectileModel(context.bakeLayer(SlimeChargeProjectileModel.LAYER));
        this.groundModel = new SlimeChargeGroundModel(context.bakeLayer(SlimeChargeGroundModel.LAYER));
    }

    @Override
    public void render(SlimeChargeProjectile entity, float f, float g, PoseStack poseStack, MultiBufferSource multiBufferSource, int i) {
        VertexConsumer vertexConsumer = multiBufferSource.getBuffer(RenderType.entityTranslucent(entity.isGrounded() ? GROUND_TEXTURE_LOCATION : TEXTURE_LOCATION));
        if(entity.isGrounded()){
            this.groundModel.renderToBuffer(poseStack,vertexConsumer,i, OverlayTexture.NO_OVERLAY);
        }else{
            this.model.renderToBuffer(poseStack,vertexConsumer,i,OverlayTexture.NO_OVERLAY);
        }


        super.render(entity, f, g, poseStack, multiBufferSource, i);

    }

    @Override
    public ResourceLocation getTextureLocation(SlimeChargeProjectile entity) {
        return entity.isGrounded() ? GROUND_TEXTURE_LOCATION : TEXTURE_LOCATION;
    }
}

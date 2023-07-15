package net.firemuffin303.slimegolem.client.renderer.entity.layers;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.firemuffin303.slimegolem.client.model.SlimeGolemModel;
import net.firemuffin303.slimegolem.common.entity.SlimeGolemEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.world.item.DyeColor;

public class SlimeGolemOverlayLayer extends RenderLayer<SlimeGolemEntity, SlimeGolemModel<SlimeGolemEntity>> {
    private final SlimeGolemModel<SlimeGolemEntity> model;
    public SlimeGolemOverlayLayer(RenderLayerParent<SlimeGolemEntity, SlimeGolemModel<SlimeGolemEntity>> renderLayerParent, EntityModelSet entityModelSet) {
        super(renderLayerParent);
        this.model = new SlimeGolemModel<>(entityModelSet.bakeLayer(SlimeGolemModel.OUT_LAYER));

    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource multiBufferSource, int i, SlimeGolemEntity entity, float f, float g, float h, float j, float k, float l) {
        Minecraft minecraft = Minecraft.getInstance();

        if (entity.isInvisible()) {
            VertexConsumer vertexConsumer;
            boolean bl = minecraft.shouldEntityAppearGlowing(entity);
            if (bl) {
                vertexConsumer = multiBufferSource.getBuffer(RenderType.outline(this.getTextureLocation(entity)));
                (this.getParentModel()).copyPropertiesTo(this.model);
                this.model.prepareMobModel(entity, f, g, h);
                this.model.setupAnim(entity, f, g, j, k, l);
                this.model.renderToBuffer(poseStack, vertexConsumer, i, LivingEntityRenderer.getOverlayCoords(entity, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
            }
        }else{
            float s;
            float t;
            float u;
            if (entity.hasCustomName() && "jeb_".equals(entity.getName().getString())) {
                int n = entity.tickCount / 25 + entity.getId();
                int o = DyeColor.values().length;
                int p = n % o;
                int q = (n + 1) % o;
                float r = ((float)(entity.tickCount % 25) + h) / 25.0F;
                float[] fs = SlimeGolemEntity.getColorArray(DyeColor.byId(p));
                float[] gs = SlimeGolemEntity.getColorArray(DyeColor.byId(q));
                s = fs[0] * (1.0F - r) + gs[0] * r;
                t = fs[1] * (1.0F - r) + gs[1] * r;
                u = fs[2] * (1.0F - r) + gs[2] * r;
            } else {
                float[] hs = SlimeGolemEntity.getColorArray(entity.getColor());
                s = hs[0];
                t = hs[1];
                u = hs[2];
            }

            this.model.prepareMobModel(entity, f, g, h);
            this.model.setupAnim(entity, f, g, j, k, l);
            this.model.renderToBuffer(poseStack, multiBufferSource.getBuffer(RenderType.entityTranslucent(this.getTextureLocation(entity))),i,LivingEntityRenderer.getOverlayCoords(entity,0.0F),s,t,u,1.0f);
        }
    }
}

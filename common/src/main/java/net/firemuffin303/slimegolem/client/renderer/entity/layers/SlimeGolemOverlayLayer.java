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
import net.minecraft.util.FastColor;
import net.minecraft.world.entity.monster.Slime;
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
        VertexConsumer vertexConsumer;

        if (entity.isInvisible()) {
            boolean bl = minecraft.shouldEntityAppearGlowing(entity);
            if (bl) {
                vertexConsumer = multiBufferSource.getBuffer(RenderType.outline(this.getTextureLocation(entity)));
                (this.getParentModel()).copyPropertiesTo(this.model);
                this.model.prepareMobModel(entity, f, g, h);
                this.model.setupAnim(entity, f, g, j, k, l);
                this.model.renderToBuffer(poseStack, vertexConsumer, i, LivingEntityRenderer.getOverlayCoords(entity, 0.0F));
            }
        }else{
            int u;
            if (entity.hasCustomName() && "jeb_".equals(entity.getName().getString())) {
                int n = entity.tickCount / 25 + entity.getId();
                int o = DyeColor.values().length;
                int p = n % o;
                int q = (n + 1) % o;
                float r = ((float)(entity.tickCount % 25) + h) / 25.0F;
                int fs = SlimeGolemEntity.getColorInt(DyeColor.byId(p));
                int gs = SlimeGolemEntity.getColorInt(DyeColor.byId(q));
                u = FastColor.ARGB32.lerp(r,fs,gs);
            } else {
                u = SlimeGolemEntity.getColorInt(entity.getColor());
            }

            vertexConsumer = multiBufferSource.getBuffer(RenderType.entityTranslucent(this.getTextureLocation(entity)));


            this.model.prepareMobModel(entity, f, g, h);
            this.model.setupAnim(entity, f, g, j, k, l);
            this.model.renderToBuffer(poseStack, vertexConsumer, i, LivingEntityRenderer.getOverlayCoords(entity, 0.0F), u);
            //coloredCutoutModelCopyLayerRender(this.getParentModel(), this.model, this.getTextureLocation(entity), poseStack, multiBufferSource, i, entity, f, g, j, k, l, h, u);

        }
    }
}

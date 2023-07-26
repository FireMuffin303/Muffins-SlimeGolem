package net.firemuffin303.slimegolem.client.renderer.entity.layers;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.firemuffin303.slimegolem.ModPlatform;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.firemuffin303.slimegolem.client.model.SlimeGolemModel;
import net.firemuffin303.slimegolem.common.config.ModConfig;
import net.firemuffin303.slimegolem.common.entity.SlimeGolemEntity;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.resources.ResourceLocation;

public class SlimeGolemHoneyLayer extends RenderLayer<SlimeGolemEntity, SlimeGolemModel<SlimeGolemEntity>> {
    public static final ResourceLocation WAX_LOCATION = new ResourceLocation(MuffinsSlimeGolemMod.MOD_ID,"textures/entity/slime_golem/slime_golem_waxed.png");
    private final SlimeGolemModel<SlimeGolemEntity> model;

    public SlimeGolemHoneyLayer(RenderLayerParent<SlimeGolemEntity, SlimeGolemModel<SlimeGolemEntity>> renderLayerParent, EntityModelSet entityModelSet) {
        super(renderLayerParent);
        this.model = new SlimeGolemModel<>(entityModelSet.bakeLayer(SlimeGolemModel.OUT_LAYER));
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource multiBufferSource, int i, SlimeGolemEntity entity, float f, float g, float h, float j, float k, float l) {
        if(ModConfig.showHoneyOnSlimeGolem){
            if(!entity.isInvisible()){
                if(entity.isWaxed()){
                    VertexConsumer vertexConsumer = multiBufferSource.getBuffer(RenderType.entityTranslucent(WAX_LOCATION));
                    this.model.setupAnim(entity, f, g, j, k, l);
                    this.model.renderToBuffer(poseStack,vertexConsumer,i,LivingEntityRenderer.getOverlayCoords(entity,0.0f),1.0F, 1.0F, 1.0F, 1.0F);
                    //renderColoredCutoutModel(this.getParentModel(),WAX_LOCATION,poseStack,multiBufferSource,i,entity,1.0f,1.0f,1.0f);
                }
            }
        }
    }
}

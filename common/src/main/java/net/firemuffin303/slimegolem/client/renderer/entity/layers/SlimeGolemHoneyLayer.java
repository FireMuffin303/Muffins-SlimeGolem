package net.firemuffin303.slimegolem.client.renderer.entity.layers;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import me.shedaniel.autoconfig.AutoConfig;
import net.firemuffin303.slimegolem.ModConfig;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.firemuffin303.slimegolem.client.model.SlimeGolemModel;
import net.firemuffin303.slimegolem.common.entity.SlimeGolemEntity;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.resources.ResourceLocation;

public class SlimeGolemHoneyLayer extends RenderLayer<SlimeGolemEntity, SlimeGolemModel<SlimeGolemEntity>> {
    public static final ResourceLocation WAX_LOCATION = ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,"textures/entity/slime_golem/slime_golem_waxed.png");
    private final SlimeGolemModel<SlimeGolemEntity> model;

    public SlimeGolemHoneyLayer(RenderLayerParent<SlimeGolemEntity, SlimeGolemModel<SlimeGolemEntity>> renderLayerParent, EntityModelSet entityModelSet) {
        super(renderLayerParent);
        this.model = new SlimeGolemModel<>(entityModelSet.bakeLayer(SlimeGolemModel.OUT_LAYER));
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource multiBufferSource, int i, SlimeGolemEntity entity, float f, float g, float h, float j, float k, float l) {

        ModConfig config = AutoConfig.getConfigHolder(ModConfig.class).getConfig();
        if(config.showHoneyLayer){
            if(!entity.isInvisible()){
                if(entity.isWaxed()){
                    VertexConsumer vertexConsumer = multiBufferSource.getBuffer(RenderType.entityTranslucent(WAX_LOCATION));
                    this.model.setupAnim(entity, f, g, j, k, l);
                    this.model.renderToBuffer(poseStack,vertexConsumer,i,LivingEntityRenderer.getOverlayCoords(entity,0.0f));
                    //renderColoredCutoutModel(this.getParentModel(),WAX_LOCATION,poseStack,multiBufferSource,i,entity,1.0f,1.0f,1.0f);
                }
            }
        }
    }
}

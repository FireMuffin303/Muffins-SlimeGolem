package net.firemuffin303.slimegolem.client.renderer.entity;

import net.firemuffin303.slimegolem.SlimeGolemMod;
import net.firemuffin303.slimegolem.client.model.SlimeGolemModel;
import net.firemuffin303.slimegolem.client.renderer.entity.layers.SlimeGolemHeadLayer;
import net.firemuffin303.slimegolem.client.renderer.entity.layers.SlimeGolemOverlayLayer;
import net.firemuffin303.slimegolem.registry.entity.SlimeGolemEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;


public class SlimeGolemRenderer extends MobRenderer<SlimeGolemEntity, SlimeGolemModel<SlimeGolemEntity>> {
    public static final ResourceLocation SLIME_GOLEM_LOCATION = new ResourceLocation(SlimeGolemMod.MOD_ID,"textures/entity/slime_golem/slime_golem.png");
    public static final ResourceLocation SLIME_GOLEM_WAXED_LOCATION = new ResourceLocation(SlimeGolemMod.MOD_ID,"textures/entity/slime_golem/slime_golem_waxed.png");


    public SlimeGolemRenderer(EntityRendererProvider.Context context) {
        super(context, new SlimeGolemModel<>(context.getModelSet().bakeLayer(SlimeGolemModel.LAYER)), 0.8F);
        this.addLayer(new SlimeGolemOverlayLayer(this,context.getModelSet()));
        this.addLayer(new SlimeGolemHeadLayer(this,context.getBlockRenderDispatcher(),context.getItemRenderer()));
    }


    @Override
    public ResourceLocation getTextureLocation(SlimeGolemEntity entity) {
        return entity.isAllowedPlaceAlgae() ? SLIME_GOLEM_LOCATION : SLIME_GOLEM_WAXED_LOCATION;
    }
}

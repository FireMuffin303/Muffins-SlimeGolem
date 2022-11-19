package firemuffin303.slimegolem.client.render;

import firemuffin303.slimegolem.Slimegolem;
import firemuffin303.slimegolem.client.render.model.SlimeGolemEntityModel;
import firemuffin303.slimegolem.client.render.model.layer.SlimeGolemOverlayFeatureRenderer;
import firemuffin303.slimegolem.client.render.model.layer.SlimeGolemPumpkinFeatureRenderer;
import firemuffin303.slimegolem.entity.SlimeGolemEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class SlimeGolemRenderer extends MobEntityRenderer<SlimeGolemEntity, SlimeGolemEntityModel<SlimeGolemEntity>> {
    public static final EntityModelLayer SLIMEGOLEM = new EntityModelLayer(new Identifier(Slimegolem.MODID,"slime_golem"),"main");
    public static final EntityModelLayer SLIMEGOLEM_OUTER = new EntityModelLayer(new Identifier(Slimegolem.MODID,"slime_golem"),"outer");

    private static final Identifier TEXTURE = new Identifier(Slimegolem.MODID,"textures/entity/slime_golem/slime_golem.png");
    private static final Identifier TEXTURE_WAXED = new Identifier(Slimegolem.MODID,"textures/entity/slime_golem/slime_golem_waxed.png");

    public SlimeGolemRenderer(EntityRendererFactory.Context context) {
        super(context, new SlimeGolemEntityModel<>(context.getPart(SLIMEGOLEM)), 0.6F);
        this.addFeature(new SlimeGolemOverlayFeatureRenderer(this,context.getModelLoader()));
        this.addFeature(new SlimeGolemPumpkinFeatureRenderer(this, context.getBlockRenderManager(), context.getItemRenderer()));
    }

    @Override
    public Identifier getTexture(SlimeGolemEntity entity) {
        return entity.isAllowPlaceAlgae() ? TEXTURE : TEXTURE_WAXED;
    }
}

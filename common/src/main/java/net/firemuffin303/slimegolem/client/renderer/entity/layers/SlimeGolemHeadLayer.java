package net.firemuffin303.slimegolem.client.renderer.entity.layers;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.firemuffin303.slimegolem.client.model.SlimeGolemModel;
import net.firemuffin303.slimegolem.common.entity.SlimeGolemEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class SlimeGolemHeadLayer extends RenderLayer<SlimeGolemEntity, SlimeGolemModel<SlimeGolemEntity>> {
    private final BlockRenderDispatcher blockRenderer;
    private final ItemRenderer itemRenderer;
    public SlimeGolemHeadLayer(RenderLayerParent<SlimeGolemEntity, SlimeGolemModel<SlimeGolemEntity>> renderLayerParent, BlockRenderDispatcher blockRenderer, ItemRenderer itemRenderer) {
        super(renderLayerParent);
        this.blockRenderer = blockRenderer;
        this.itemRenderer = itemRenderer;
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource multiBufferSource, int i, SlimeGolemEntity entity, float f, float g, float h, float j, float k, float l) {
        if(entity.hasPumpkin()){
            boolean bl = Minecraft.getInstance().shouldEntityAppearGlowing(entity) && entity.isInvisible();
            if(!entity.isInvisible() || bl){
                poseStack.pushPose();
                this.getParentModel().getHead().translateAndRotate(poseStack);
                poseStack.translate(0.0D, -0.28575D, 0.0D);
                poseStack.mulPose(Axis.YP.rotationDegrees(180.0F));
                poseStack.scale(0.6575F, -0.6575F, -0.6575F);
                ItemStack itemStack = new ItemStack(Blocks.CARVED_PUMPKIN);
                if(bl){
                    BlockState blockState = Blocks.CARVED_PUMPKIN.defaultBlockState();
                    BakedModel bakedModel = this.blockRenderer.getBlockModel(blockState);
                    int n = LivingEntityRenderer.getOverlayCoords(entity, 0.0F);
                    poseStack.translate(-0.5D, -0.5D, -0.5D);
                    this.blockRenderer.getModelRenderer().renderModel(poseStack.last(), multiBufferSource.getBuffer(RenderType.outline(TextureAtlas.LOCATION_BLOCKS)), blockState, bakedModel, 0.0F, 0.0F, 0.0F, i, n);
                }else{
                    this.itemRenderer.renderStatic(entity,itemStack, ItemDisplayContext.HEAD,false,poseStack,multiBufferSource,entity.level(),i,LivingEntityRenderer.getOverlayCoords(entity,0.0F),entity.getId());
                }
                poseStack.popPose();
            }
        }
    }
}

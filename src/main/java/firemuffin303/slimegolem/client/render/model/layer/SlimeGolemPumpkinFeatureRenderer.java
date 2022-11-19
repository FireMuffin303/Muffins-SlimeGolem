package firemuffin303.slimegolem.client.render.model.layer;

import firemuffin303.slimegolem.client.render.model.SlimeGolemEntityModel;
import firemuffin303.slimegolem.entity.SlimeGolemEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.BlockRenderManager;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3f;

@Environment(EnvType.CLIENT)
public class SlimeGolemPumpkinFeatureRenderer extends FeatureRenderer<SlimeGolemEntity, SlimeGolemEntityModel<SlimeGolemEntity>> {
    private final BlockRenderManager blockRenderManager;
    private final ItemRenderer itemRenderer;
    public SlimeGolemPumpkinFeatureRenderer(FeatureRendererContext<SlimeGolemEntity, SlimeGolemEntityModel<SlimeGolemEntity>> context, BlockRenderManager blockRenderManager, ItemRenderer itemRenderer) {
        super(context);
        this.blockRenderManager = blockRenderManager;
        this.itemRenderer = itemRenderer;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, SlimeGolemEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        if (entity.hasPumpkin()) {
            boolean bl = MinecraftClient.getInstance().hasOutline(entity) && entity.isInvisible();
            if (!entity.isInvisible() || bl) {
                matrices.push();
                this.getContextModel().getHead().rotate(matrices);
                matrices.translate(0.0D, -0.28575D, 0.0D);
                matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(180.0F));
                matrices.scale(0.6575F, -0.6575F, -0.6575F);
                ItemStack itemStack = new ItemStack(Blocks.CARVED_PUMPKIN);
                if (bl) {
                    BlockState blockState = Blocks.CARVED_PUMPKIN.getDefaultState();
                    BakedModel bakedModel = this.blockRenderManager.getModel(blockState);
                    int n = LivingEntityRenderer.getOverlay(entity, 0.0F);
                    matrices.translate(-0.5D, -0.5D, -0.5D);
                    this.blockRenderManager.getModelRenderer().render(matrices.peek(), vertexConsumers.getBuffer(RenderLayer.getOutline(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE)), blockState, bakedModel, 0.0F, 0.0F, 0.0F, light, n);
                } else {
                    this.itemRenderer.renderItem(entity, itemStack, ModelTransformation.Mode.HEAD, false, matrices, vertexConsumers, entity.world, light, LivingEntityRenderer.getOverlay(entity, 0.0F), entity.getId());
                }

                matrices.pop();
            }
        }
    }
}

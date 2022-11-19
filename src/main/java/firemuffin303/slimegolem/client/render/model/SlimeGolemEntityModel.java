package firemuffin303.slimegolem.client.render.model;

import firemuffin303.slimegolem.entity.SlimeGolemEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.entity.Entity;

public class SlimeGolemEntityModel<T extends Entity> extends SinglePartEntityModel<SlimeGolemEntity> {
    private final ModelPart root;
    private final ModelPart head;
    private final ModelPart body;

    public SlimeGolemEntityModel(ModelPart modelPart){
        this.root = modelPart;
        this.body = root.getChild("body");
        this.head = root.getChild("head");
    }

    public static TexturedModelData getOuterTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        modelPartData.addChild("body", ModelPartBuilder.create()
                .uv(0,0).cuboid(-6.0F, -5.0F, -6.0F, 12.0F, 10.0F, 12.0F, new Dilation(0.0F)),
                ModelTransform.pivot(0.0F, 19.0F, 0.0F));
        modelPartData.addChild("head",ModelPartBuilder.create()
                .uv(30, 30).cuboid(-5.0F, -8.0F, -5.0F, 10.0F, 8.0F, 10.0F, new Dilation(0.0F)),
                ModelTransform.pivot(0.0F, 14.0F, 0.0F));
        return TexturedModelData.of(modelData,128,128);
    }

    public static TexturedModelData getInnerTexturedModelData(){
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        modelPartData.addChild("body",ModelPartBuilder.create()
                .uv(0,22).cuboid(-5.0F, -4.0F, -5.0F, 10.0F, 8.0F, 10.0F, new Dilation(0.0F)),
                ModelTransform.pivot(0.0F,19.0F,0.0F));
        modelPartData.addChild("head",ModelPartBuilder.create()
                .uv(36,0).cuboid(-3.0F, -7.0F, -3.0F, 6.0F, 6.0F, 6.0F, new Dilation(0.0F))
                .uv(0,4).cuboid(-3.0F, -6.0F, -3.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.25F))
                .uv(0,0).cuboid(1.0F, -6.0F, -3.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.25F))
                .uv(6,0).cuboid(0.0F, -3.0F, -3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.25F)),
                ModelTransform.pivot(0.0F,14.0F,0.0F));
        return TexturedModelData.of(modelData,128,128);
    }

    @Override
    public ModelPart getPart() {
        return this.root;
    }

    public ModelPart getBody(){
        return this.body;
    }

    @Override
    public void setAngles(SlimeGolemEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        this.head.yaw = headYaw * 0.017453292F;
        this.head.pitch = headPitch * 0.017453292F;
    }

    public ModelPart getHead() {
        return this.head;
    }
}

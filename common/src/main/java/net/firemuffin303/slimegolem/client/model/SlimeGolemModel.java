package net.firemuffin303.slimegolem.client.model;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.firemuffin303.slimegolem.SlimeGolemMod;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

@Environment(EnvType.CLIENT)
public class SlimeGolemModel<T extends Entity> extends HierarchicalModel<T> {
    public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(SlimeGolemMod.MOD_ID,"slime_golem"),"main");
    public static final ModelLayerLocation OUT_LAYER = new ModelLayerLocation(new ResourceLocation(SlimeGolemMod.MOD_ID,"slime_golem"),"outer");

    private final ModelPart root;
    private final ModelPart head;
    private final ModelPart body;

    public SlimeGolemModel(ModelPart modelPart){
        this.root = modelPart;
        this.head = root.getChild("head");
        this.body = root.getChild("body");
    }

    public static LayerDefinition createOuterLayer(){
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();
        partDefinition.addOrReplaceChild("body",CubeListBuilder.create().texOffs(0,0).addBox(-6.0F, -5.0F, -6.0F, 12.0F, 10.0F, 12.0F, new CubeDeformation(0.0F)),PartPose.offset(0.0F, 19.0F, 0.0F));
        partDefinition.addOrReplaceChild("head",CubeListBuilder.create().texOffs(30,30).addBox(-5.0F, -8.0F, -5.0F, 10.0F, 8.0F, 10.0F, new CubeDeformation(0.05F)),PartPose.offset(0.0F, 14.0F, 0.0F));
        return LayerDefinition.create(meshDefinition,128,128);
    }

    public static LayerDefinition createInnerLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 22).addBox(-5.0F, -4.0F, -5.0F, 10.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F,19.0F,0.0F));
        partdefinition.addOrReplaceChild("head", CubeListBuilder.create()
                        .texOffs(36, 0).addBox(-3.0F, -7.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(0,4).addBox(-3.0F, -6.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.25F))
                        .texOffs(0,0).addBox(1.0F, -6.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.25F))
                        .texOffs(6,0).addBox(0.0F, -3.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.25F))
                , PartPose.offset(0.0F,14.0F,0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }


    @Override
    public ModelPart root() {
        return this.root;
    }

    public ModelPart getBody(){
        return this.body;
    }

    @Override
    public void setupAnim(T entity, float f, float g, float h, float i, float j) {
        this.head.yRot = i * 0.017453292F;
        this.head.xRot = j * 0.017453292F;
    }

    public ModelPart getHead() {
        return head;
    }
}

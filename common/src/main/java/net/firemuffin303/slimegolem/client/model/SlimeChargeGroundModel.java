package net.firemuffin303.slimegolem.client.model;

import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.firemuffin303.slimegolem.common.entity.SlimeChargeProjectile;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;

public class SlimeChargeGroundModel extends HierarchicalModel<SlimeChargeProjectile> {
    private final ModelPart bone;
    public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,"slime_charge"),"ground");


    public SlimeChargeGroundModel(ModelPart modelPart){
        super(RenderType::entityTranslucent);
        this.bone = modelPart.getChild("bone");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create()
                .texOffs(0, 0).addBox(-16.375F, -10.0F, -15.875F, 32.0F, 12.0F, 32.0F, new CubeDeformation(0.0F))
                .texOffs(0, 76).addBox(-13.375F, 2.0F, 2.125F, 12.0F, 4.0F, 12.0F, new CubeDeformation(0.1F))
                .texOffs(48, 76).addBox(3.625F, 2.0F, -12.875F, 9.0F, 4.0F, 9.0F, new CubeDeformation(0.1F))
                .texOffs(0, 44).addBox(-12.375F, -8.0F, -11.875F, 24.0F, 8.0F, 24.0F, new CubeDeformation(0.0F))
                .texOffs(84, 76).addBox(7.0F, -10.0F, -23.0F, 0.0F, 12.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(48, 89).addBox(-10.0F, -10.0F, -23.0F, 0.0F, 12.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(62, 89).addBox(-13.0F, -10.0F, 16.0F, 0.0F, 12.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(0, 92).addBox(5.0F, -10.0F, 16.0F, 0.0F, 12.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(14, 92).addBox(15.625F, -10.0F, 12.125F, 7.0F, 12.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(28, 92).addBox(-23.375F, -10.0F, -8.875F, 7.0F, 12.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(90, 95).addBox(-23.375F, -10.0F, 9.125F, 7.0F, 12.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(76, 95).addBox(15.625F, -10.0F, -5.875F, 7.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.375F, 10.0F, -0.125F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public ModelPart root() {
        return this.bone;
    }

    @Override
    public void setupAnim(SlimeChargeProjectile entity, float f, float g, float h, float i, float j) {

    }
}

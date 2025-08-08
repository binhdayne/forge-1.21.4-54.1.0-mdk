package net.tblight.tutorialmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.tblight.tutorialmod.TutorialMod;
import net.tblight.tutorialmod.entity.custom.RuinsGolemEntity;

public class RuinsGolemModel<T extends RuinsGolemEntity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID, "ruinsgolem"),"main");
    private final ModelPart hand4;
    private final ModelPart head;
    private final ModelPart body;
    private final ModelPart Leg;
    private final ModelPart arm;
    private final ModelPart eyes;
    private final ModelPart hand2;

    public RuinsGolemModel(ModelPart root) {
        this.Leg = root.getChild("Leg");
        this.head = root.getChild("head");
        this.arm = root.getChild("arm");
        this.eyes = root.getChild("eyes");
        this.body = root.getChild("body");
        this.hand2 = root.getChild("hand2");
        this.hand4 = root.getChild("hand4");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Leg = partdefinition.addOrReplaceChild("Leg", CubeListBuilder.create().texOffs(0, 243).addBox(-22.0F, -28.0F, -3.0F, 13.0F, 20.0F, 13.0F, new CubeDeformation(0.0F))
                .texOffs(196, 119).addBox(-25.0F, -39.0F, -7.0F, 20.0F, 17.0F, 21.0F, new CubeDeformation(0.0F))
                .texOffs(187, 113).addBox(-28.0F, -47.0F, -10.0F, 26.0F, 8.0F, 27.0F, new CubeDeformation(0.0F))
                .texOffs(196, 119).addBox(-25.0F, -47.0F, -7.0F, 0.0F, 25.0F, 21.0F, new CubeDeformation(0.0F))
                .texOffs(0, 215).addBox(-24.0F, -8.0F, -9.0F, 18.0F, 8.0F, 20.0F, new CubeDeformation(0.0F))
                .texOffs(0, 243).mirror().addBox(9.0F, -28.0F, -3.0F, 13.0F, 20.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(196, 119).mirror().addBox(5.0F, -39.0F, -7.0F, 20.0F, 17.0F, 21.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(0, 215).mirror().addBox(6.0F, -8.0F, -9.0F, 18.0F, 8.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(196, 119).mirror().addBox(25.0F, -47.0F, -7.0F, 0.0F, 25.0F, 21.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(196, 119).mirror().addBox(2.0F, -47.0F, -10.0F, 26.0F, 8.0F, 27.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 119).addBox(-26.0F, -120.0F, -21.0F, 52.0F, 5.0F, 46.0F, new CubeDeformation(0.0F))
                .texOffs(0, 170).addBox(-21.0F, -125.0F, -18.0F, 42.0F, 5.0F, 40.0F, new CubeDeformation(0.0F))
                .texOffs(164, 170).addBox(-15.0F, -130.0F, -12.0F, 30.0F, 5.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition arm = partdefinition.addOrReplaceChild("arm", CubeListBuilder.create().texOffs(220, 45).addBox(-36.0F, -101.0F, -8.0F, 6.0F, 19.0F, 23.0F, new CubeDeformation(0.0F))
                .texOffs(164, 203).addBox(-55.0F, -99.0F, -4.0F, 20.0F, 23.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(236, 203).addBox(-52.0F, -76.0F, -3.0F, 14.0F, 23.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(220, 45).mirror().addBox(24.0F, -101.0F, -8.0F, 6.0F, 19.0F, 23.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(164, 203).mirror().addBox(29.0F, -99.0F, -4.0F, 20.0F, 23.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(236, 203).mirror().addBox(32.0F, -76.0F, -3.0F, 14.0F, 23.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(3.0F, 24.0F, 0.0F));

        PartDefinition cube_r1 = arm.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(220, 0).mirror().addBox(-1.0F, -40.0F, -23.0F, 6.0F, 23.0F, 22.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(26.0F, -64.0F, 16.0F, 0.0F, 0.0F, 0.2182F));

        PartDefinition cube_r2 = arm.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(220, 0).addBox(-5.0F, -40.0F, -23.0F, 6.0F, 23.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-32.0F, -64.0F, 16.0F, 0.0F, 0.0F, -0.2182F));

        PartDefinition eyes = partdefinition.addOrReplaceChild("eyes", CubeListBuilder.create().texOffs(220, 110).addBox(-17.0F, -121.0F, -22.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(-3, -2).mirror().addBox(13.0F, -121.0F, -22.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(-15, -12).addBox(-33.0F, -63.0F, -29.0F, 66.0F, 17.0F, 62.0F, new CubeDeformation(0.0F))
                .texOffs(-6, -6).addBox(-30.0F, -79.0F, -26.0F, 60.0F, 16.0F, 56.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-30.0F, -100.0F, -23.0F, 60.0F, 21.0F, 50.0F, new CubeDeformation(0.0F))
                .texOffs(6, 4).addBox(-28.0F, -115.0F, -21.0F, 56.0F, 15.0F, 46.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition hand2 = partdefinition.addOrReplaceChild("hand2", CubeListBuilder.create().texOffs(220, 87).mirror().addBox(37.0F, -53.0F, -4.0F, 16.0F, 7.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(98, 243).mirror().addBox(43.0F, -46.0F, -4.0F, 10.0F, 7.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(236, 240).mirror().addBox(38.0F, -46.0F, -4.0F, 17.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(-14, -14).mirror().addBox(38.0F, -42.0F, -4.0F, 7.0F, 7.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, 24.0F, 0.0F));

        PartDefinition cube_r3 = hand2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(152, 242).mirror().addBox(-5.0F, -12.0F, -4.0F, 13.0F, 12.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(50.0F, -30.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

        PartDefinition cube_r4 = hand2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(236, 110).mirror().addBox(5.0F, -6.0F, -4.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(152, 231).mirror().addBox(5.0F, -6.0F, -7.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(152, 223).mirror().addBox(5.0F, -6.0F, -13.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(152, 215).mirror().addBox(5.0F, -6.0F, -18.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(38.0F, -26.0F, 14.0F, 0.0F, 0.0F, -0.4363F));

        PartDefinition hand4 = partdefinition.addOrReplaceChild("hand4", CubeListBuilder.create().texOffs(220, 87).addBox(-53.0F, -53.0F, -4.0F, 16.0F, 7.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(98, 243).addBox(-53.0F, -46.0F, -4.0F, 10.0F, 7.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(236, 240).addBox(-55.0F, -46.0F, -4.0F, 17.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(-14, -14).addBox(-45.0F, -42.0F, -4.0F, 7.0F, 7.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 24.0F, 0.0F));

        PartDefinition cube_r5 = hand4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(152, 242).addBox(-8.0F, -12.0F, -4.0F, 13.0F, 12.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-50.0F, -30.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

        PartDefinition cube_r6 = hand4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(236, 110).addBox(-8.0F, -6.0F, -4.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(152, 231).addBox(-8.0F, -6.0F, -7.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(152, 223).addBox(-8.0F, -6.0F, -13.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(152, 215).addBox(-8.0F, -6.0F, -18.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-38.0F, -26.0F, 14.0F, 0.0F, 0.0F, 0.4363F));

        return LayerDefinition.create(meshdefinition, 512, 512);
    }

    @Override
//    public void setupAnim(T entity, float limbSwing, float limbSwingAmount,
//                          float ageInTicks, float netHeadYaw, float headPitch) {
//
//        this.head.yRot = netHeadYaw * ((float)Math.PI / 180F);
//        this.head.xRot = headPitch * ((float)Math.PI / 180F);
//
//        this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
//        this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
//        this.right_leg.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
//        this.left_leg.xRot = Mth.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
//    }


    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        Leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        head.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        eyes.render(poseStack, vertexConsumer, packedLight, packedOverlay,color);
        body.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        hand2.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        hand4.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }
    public ModelPart root() {
        return body;
    }

    @Override
    public void setupAnim(T t, float v, float v1, float v2, float v3, float v4) {

    }
}

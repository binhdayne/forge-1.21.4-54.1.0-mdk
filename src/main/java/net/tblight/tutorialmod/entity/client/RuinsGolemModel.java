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
    private final ModelPart root;
    private final ModelPart head;
    private final ModelPart body;
    private final ModelPart left_arm;
    private final ModelPart right_arm;
    private final ModelPart left_leg;
    private final ModelPart right_leg;

    public RuinsGolemModel(ModelPart root) {
        this.root = root;
        this.head = root.getChild("head");
        this.body = root.getChild("body");
        this.left_arm = root.getChild("left_arm");
        this.right_arm = root.getChild("right_arm");
        this.left_leg = root.getChild("left_leg");
        this.right_leg = root.getChild("right_leg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        // Head
        root.addOrReplaceChild("head", CubeListBuilder.create()
                        .texOffs(0, 0).addBox(-4, -8, -4, 8, 8, 8),
                PartPose.offset(0, 4, 0));

        // Body
        root.addOrReplaceChild("body", CubeListBuilder.create()
                        .texOffs(0, 16).addBox(-6, 0, -3, 12, 18, 6),
                PartPose.offset(0, 4, 0));

        // Left Arm
        root.addOrReplaceChild("left_arm", CubeListBuilder.create()
                        .texOffs(48, 0).addBox(-1, 0, -2, 4, 18, 4),
                PartPose.offset(7, 4, 0));

        // Right Arm
        root.addOrReplaceChild("right_arm", CubeListBuilder.create()
                        .texOffs(48, 22).addBox(-3, 0, -2, 4, 18, 4),
                PartPose.offset(-7, 4, 0));

        // Left Leg
        root.addOrReplaceChild("left_leg", CubeListBuilder.create()
                        .texOffs(0, 40).addBox(-2, 0, -2, 4, 12, 4),
                PartPose.offset(3, 22, 0));

        // Right Leg
        root.addOrReplaceChild("right_leg", CubeListBuilder.create()
                        .texOffs(16, 40).addBox(-2, 0, -2, 4, 12, 4),
                PartPose.offset(-3, 22, 0));

        return LayerDefinition.create(mesh, 512, 512); // Texture size
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount,
                          float ageInTicks, float netHeadYaw, float headPitch) {

        this.head.yRot = netHeadYaw * ((float)Math.PI / 180F);
        this.head.xRot = headPitch * ((float)Math.PI / 180F);

        this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.right_leg.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.left_leg.xRot = Mth.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer,
                               int packedLight, int packedOverlay,
                               float red, float green, float blue, float alpha) {
        root.render(poseStack, buffer, packedLight, packedOverlay);
    }

    // Optional: expose parts for animation
    public ModelPart getLeftArm() {
        return this.left_arm;
    }

    public ModelPart getRightArm() {
        return this.right_arm;
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int i, int i1, int i2) {

    }
}

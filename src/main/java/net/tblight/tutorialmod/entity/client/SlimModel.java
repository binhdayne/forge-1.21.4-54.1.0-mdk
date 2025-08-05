//package net.tblight.tutorialmod.entity.client;
//
//import com.mojang.blaze3d.vertex.PoseStack;
//import com.mojang.blaze3d.vertex.VertexConsumer;
//import net.minecraft.client.model.EntityModel;
//import net.minecraft.client.model.HierarchicalModel;
//import net.minecraft.client.model.geom.ModelLayerLocation;
//import net.minecraft.client.model.geom.ModelPart;
//import net.minecraft.client.model.geom.PartPose;
//import net.minecraft.client.model.geom.builders.CubeListBuilder;
//import net.minecraft.client.model.geom.builders.LayerDefinition;
//import net.minecraft.client.model.geom.builders.MeshDefinition;
//import net.minecraft.client.model.geom.builders.PartDefinition;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.util.Mth;
//import net.tblight.tutorialmod.TutorialMod;
//import net.tblight.tutorialmod.entity.custom.SlimEntity;
//import net.minecraft.world.entity.Entity;
//
//public class SlimModel<T extends SlimEntity> extends EntityModel<SlimEntity> {
//    private final ModelPart root;
//    private final ModelPart bone;
//    public static final ModelLayerLocation LAYER_LOCATION =
//            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID, "slim"), "main");
//    public static final String BONE = "bone";
//
//    public SlimModel(ModelPart root) {
//        this.root = root;
//        this.bone = root.getChild(BONE);
//    }
//
//    public static LayerDefinition createBodyLayer() {
//        MeshDefinition meshdefinition = new MeshDefinition();
//        PartDefinition partdefinition = meshdefinition.getRoot();
//
//        partdefinition.addOrReplaceChild(BONE,
//                CubeListBuilder.create()
//                        .texOffs(0, 0)
//                        .addBox(-0.0625F, 0.0F, -0.0625F, 0.125F, 0.125F, 0.125F),
//                PartPose.offset(0.0F, 0.0F, 0.0F));
//
//        return LayerDefinition.create(meshdefinition, 64, 64);
//    }
//
//    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
//                          float netHeadYaw, float headPitch) {
//        this.root().getAllParts().forEach(ModelPart::resetPose);
//        this.Move(SlimAnimations.MOVE, limbSwing, limbSwingAmount, 2f, 2.5f);
//    }
//
//    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight,
//                               int packedOverlay, float red, float green, float blue, float alpha) {
//        root.render(poseStack, vertexConsumer, packedLight, packedOverlay);
//    }
//
//    @Override
//    public ModelPart root() {
//        return root;
//    }
//}
//

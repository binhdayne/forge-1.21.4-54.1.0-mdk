//package net.tblight.tutorialmod.entity.client;
//
//import com.mojang.blaze3d.vertex.PoseStack;
//import net.minecraft.client.model.geom.ModelLayerLocation;
//import net.minecraft.client.renderer.MultiBufferSource;
//import net.minecraft.client.renderer.entity.MobRenderer;
//import net.minecraft.client.renderer.entity.EntityRendererProvider;
//import net.minecraft.resources.ResourceLocation;
//import net.tblight.tutorialmod.TutorialMod;
//import net.tblight.tutorialmod.entity.custom.SlimEntity;
//
//public class SlimRenderer extends MobRenderer<SlimEntity, SlimModel> {
//
//    public SlimRenderer(EntityRendererProvider.Context context) {
//        super(context, new SlimModel<>(context.bakeLayer(ModelLayerLocation.LAYER_LOCATION)), 0.85f);
//    }
//
//    @Override
//    public ResourceLocation getTextureLocation(SlimEntity entity) {
//        return ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID, "textures/entity/slim.png");
//    }
//
//    @Override
//    public void render(SlimEntity entity, float entityYaw, float partialTicks, PoseStack poseStack,
//                       MultiBufferSource bufferSource, int packedLight) {
//        if (entity.isBaby()) {
//            poseStack.scale(0.5f, 0.5f, 0.5f);
//        } else {
//            poseStack.scale(1.0f, 1.0f, 1.0f);
//        }
//
//        super.render(entity, entityYaw, partialTicks, poseStack, bufferSource, packedLight);
//    }
//}

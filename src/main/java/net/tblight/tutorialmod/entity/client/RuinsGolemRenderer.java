package net.tblight.tutorialmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.tblight.tutorialmod.TutorialMod;
import net.tblight.tutorialmod.entity.custom.RuinsGolemEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RuinsGolemRenderer extends MobRenderer<RuinsGolemEntity, RuinsGolemModel<RuinsGolemEntity>> {

    public RuinsGolemRenderer(EntityRendererProvider.Context context) {
        super(context, new RuinsGolemModel<>(context.bakeLayer(RuinsGolemModel.LAYER_LOCATION)), 0.8f); // shadow radius
    }

    @Override
    public ResourceLocation getTextureLocation(RuinsGolemEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID, "textures/entity/ruinsgolem/ruinsgolem.png");
    }

    @Override
    public void render(RuinsGolemEntity entity, float entityYaw, float partialTicks, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if (entity.isBaby()) {
            poseStack.scale(0.5f, 0.5f, 0.5f); // nhỏ đi nếu là baby
        } else {
            poseStack.scale(1.0f, 1.0f, 1.0f); // không thay đổi
        }

        super.render(entity, entityYaw, partialTicks, poseStack, bufferSource, packedLight);
    }
}

package net.tblight.tutorialmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.tblight.tutorialmod.TutorialMod;
import net.tblight.tutorialmod.entity.custom.RuinsGolemEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.tblight.tutorialmod.entity.custom.TriceratopsEntity;

public class RuinsGolemRenderer extends MobRenderer<RuinsGolemEntity, RuinsGolemModel<RuinsGolemEntity>> {

    public RuinsGolemRenderer(EntityRendererProvider.Context context) {
        super(context, new RuinsGolemModel<>(context.bakeLayer(RuinsGolemModel.LAYER_LOCATION)), 0.8f); // shadow radius
    }

    @Override
    public ResourceLocation getTextureLocation(RuinsGolemEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID, "textures/entity/ruinsgolem/ruinsgolem.png");
    }

    @Override
    public void render(RuinsGolemEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pPoseStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            pPoseStack.scale(1f, 1f, 1f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}

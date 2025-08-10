package net.tblight.tutorialmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.tblight.tutorialmod.TutorialMod;
import net.tblight.tutorialmod.entity.custom.GreatHungerEntity;

public class GreatHungerRenderer extends MobRenderer<GreatHungerEntity, GreatHungerModel<GreatHungerEntity>> {
    public GreatHungerRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new GreatHungerModel(pContext.bakeLayer(GreatHungerModel.LAYER_LOCATION)), 0.85f);
    }

    @Override
    public ResourceLocation getTextureLocation(GreatHungerEntity pEntity) {
        return ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID, "textures/entity/greathunger/greathunger.png");
    }

    @Override
    public void render(GreatHungerEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pPoseStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            pPoseStack.scale(1f, 1f, 1f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}

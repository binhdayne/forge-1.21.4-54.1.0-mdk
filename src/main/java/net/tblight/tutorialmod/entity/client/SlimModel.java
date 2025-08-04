package net.tblight.tutorialmod.entity.client;

import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.tblight.tutorialmod.entity.custom.SlimEntity;

import javax.swing.text.html.parser.Entity;

public class SlimModel<T extends SlimEntity> {
    private final ModelPart root;

    public SlimModel(ModelPart root) {
        this.root = root;
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        partdefinition.addOrReplaceChild("cube",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-0.062F, 0.000F, -0.062F, 0.125F, 0.125F, 0.125F),
                PartPose.offset(0.0F, 0.0F, 0.0F)
        );

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        // No animation
    }

    public ModelPart root() {
        return root;
    }
}

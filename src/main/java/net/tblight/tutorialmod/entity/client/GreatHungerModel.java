package net.tblight.tutorialmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.tblight.tutorialmod.TutorialMod;
import net.tblight.tutorialmod.entity.custom.GreatHungerEntity;
import net.tblight.tutorialmod.entity.custom.TriceratopsEntity;

import javax.swing.text.html.parser.Entity;

public class GreatHungerModel <G extends GreatHungerEntity> extends HierarchicalModel<G> {
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID, "greathunger"), "main");

    private final ModelPart bone;

    public GreatHungerModel(ModelPart root) {
        this.bone = root.getChild("bone");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 56).addBox(-8.0F, -13.0F, -6.0F, 16.0F, 7.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-10.0F, -19.0F, -16.0F, 20.0F, 6.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(0, 28).addBox(-10.0F, -25.0F, -16.0F, 20.0F, 6.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(60, 56).addBox(-10.0F, -25.0F, 6.0F, 20.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(1, 78).addBox(-9.0F, -8.0F, 4.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(1, 78).addBox(-9.0F, -8.0F, -6.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(1, 78).mirror().addBox(5.0F, -8.0F, -6.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(1, 78).mirror().addBox(5.0F, -8.0F, 4.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(-1, 68).addBox(-11.0F, -26.0F, -17.0F, 0.0F, 3.0F, 28.0F, new CubeDeformation(0.0F))
                .texOffs(20, 100).addBox(9.0F, -23.0F, 11.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(20, 100).addBox(3.0F, -23.0F, 11.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 100).addBox(-11.0F, -26.0F, 11.0F, 22.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 104).addBox(-11.0F, -26.0F, -17.0F, 22.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 104).addBox(-7.0F, -23.0F, -17.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 104).addBox(1.0F, -23.0F, -17.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 104).addBox(7.0F, -23.0F, -17.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 104).addBox(7.0F, -21.0F, -17.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 104).addBox(-5.0F, -23.0F, -17.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 104).addBox(3.0F, -23.0F, -17.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 104).addBox(3.0F, -23.0F, -17.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 104).addBox(9.0F, -23.0F, -17.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 104).addBox(-11.0F, -23.0F, -17.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(31, 92).addBox(-11.0F, -26.0F, -17.0F, 22.0F, 0.0F, 28.0F, new CubeDeformation(0.0F))
                .texOffs(-1, 68).mirror().addBox(11.0F, -26.0F, -17.0F, 0.0F, 3.0F, 28.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(0, 0).addBox(11.0F, -23.0F, -17.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(11.0F, -23.0F, -8.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(11.0F, -21.0F, -8.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(11.0F, -23.0F, -6.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(11.0F, -23.0F, 9.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(11.0F, -23.0F, 7.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(20, 100).addBox(3.0F, -21.0F, 11.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(20, 100).addBox(1.0F, -23.0F, 11.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(20, 100).addBox(-5.0F, -23.0F, 11.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(20, 100).addBox(7.0F, -23.0F, 11.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(20, 100).addBox(-11.0F, -23.0F, 11.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(25, 94).addBox(-11.0F, -23.0F, 9.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(11.0F, -21.0F, 9.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(25, 94).addBox(-11.0F, -23.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(25, 94).addBox(-11.0F, -23.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(25, 94).addBox(-11.0F, -23.0F, -8.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(25, 94).addBox(-11.0F, -23.0F, -17.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(25, 94).addBox(-11.0F, -21.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }


    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }

    public ModelPart root() {
        return bone;
    }

    @Override
    public void setupAnim(G g, float v, float v1, float v2, float v3, float v4) {

    }
}

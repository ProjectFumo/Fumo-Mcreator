package io.github.projectfumo.fumo.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelMarisaHat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("fumo", "model_marisa_hat"), "main");
	public final ModelPart Fumo;
	public final ModelPart BackBow;

	public ModelMarisaHat(ModelPart root) {
		this.Fumo = root.getChild("Fumo");
		this.BackBow = root.getChild("BackBow");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Fumo = partdefinition.addOrReplaceChild("Fumo", CubeListBuilder.create(), PartPose.offset(-5.0F, 23.0F, 2.0F));
		PartDefinition Head = Fumo.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(25, 22).addBox(-4.0F, -16.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 13).addBox(-4.0F, -16.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.1F)),
				PartPose.offset(5.0F, 1.0F, -2.0F));
		PartDefinition LeftLeg = Fumo.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition LeftLegOver_r1 = LeftLeg.addOrReplaceChild("LeftLegOver_r1",
				CubeListBuilder.create().texOffs(44, 0).addBox(-1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(50, 18).addBox(-1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(8.0F, 0.0F, -8.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition RightLeg = Fumo.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-6.0F, 0.0F, 0.0F));
		PartDefinition RightLegOver_r1 = RightLeg.addOrReplaceChild("RightLegOver_r1",
				CubeListBuilder.create().texOffs(25, 14).addBox(-1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(31, 0).addBox(-1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(8.0F, 0.0F, -8.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition Skirt = Fumo.addOrReplaceChild("Skirt",
				CubeListBuilder.create().texOffs(0, 41).addBox(-3.5F, -4.0F, -2.5F, 7.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(26, 39).addBox(-3.5F, -4.0F, -2.5F, 7.0F, 4.0F, 5.0F, new CubeDeformation(0.1F)),
				PartPose.offset(5.0F, 1.0F, -2.0F));
		PartDefinition Torso = Fumo.addOrReplaceChild("Torso",
				CubeListBuilder.create().texOffs(21, 49).addBox(-3.0F, -8.0F, -2.0F, 6.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(47, 45).addBox(-3.0F, -8.0F, -2.0F, 6.0F, 8.0F, 4.0F, new CubeDeformation(0.1F)),
				PartPose.offset(5.0F, 1.0F, -2.0F));
		PartDefinition LeftArm = Fumo.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0F, 6.0F));
		PartDefinition LeftArmOver_r1 = LeftArm.addOrReplaceChild("LeftArmOver_r1",
				CubeListBuilder.create().texOffs(55, 5).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(56, 37).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 0.0F, -8.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition RightArm = Fumo.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-6.0F, -7.0F, 6.0F));
		PartDefinition RightArmOver_r1 = RightArm.addOrReplaceChild("RightArmOver_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(11, 51).addBox(0.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition Hat = Fumo.addOrReplaceChild("Hat",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 31).addBox(-3.5F, -2.0F, -3.5F, 7.0F, 1.0F, 7.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -14.6F, -2.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition HatThree_r1 = Hat.addOrReplaceChild("HatThree_r1", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition HatTwo_r1 = Hat.addOrReplaceChild("HatTwo_r1", CubeListBuilder.create().texOffs(35, 7).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition Bow = Fumo.addOrReplaceChild("Bow", CubeListBuilder.create(), PartPose.offsetAndRotation(8.5F, -17.4F, -5.3F, -0.5086F, -0.6614F, 0.0324F));
		PartDefinition BowRight_r1 = Bow.addOrReplaceChild("BowRight_r1", CubeListBuilder.create().texOffs(0, 13).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6109F));
		PartDefinition BowLeft_r1 = Bow.addOrReplaceChild("BowLeft_r1", CubeListBuilder.create().texOffs(0, 13).addBox(-2.1F, -2.1F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 2.4435F));
		PartDefinition BackBow = partdefinition.addOrReplaceChild("BackBow", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 20.5F, 2.8F, 0.1571F, 0.0F, 0.0698F));
		PartDefinition BBowKnot_r1 = BackBow.addOrReplaceChild("BBowKnot_r1", CubeListBuilder.create().texOffs(0, 17).addBox(-0.3F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2793F));
		PartDefinition BBowRight_r1 = BackBow.addOrReplaceChild("BBowRight_r1", CubeListBuilder.create().texOffs(46, 39).addBox(0.3F, -1.3F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1038F, 1.5348F, 0.0F, 0.0F, 0.0F, -2.33F));
		PartDefinition BBowLeft_r1 = BackBow.addOrReplaceChild("BBowLeft_r1", CubeListBuilder.create().texOffs(46, 39).addBox(-1.5F, -3.6F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1038F, 1.5348F, 0.0F, 0.0F, 0.0F, 0.6807F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		Fumo.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		BackBow.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelEiki<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "eiki"), "main");
	private final ModelPart Fumo;

	public ModelEiki(ModelPart root) {
		this.Fumo = root.getChild("Fumo");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Fumo = partdefinition.addOrReplaceChild("Fumo", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 23.0F, 2.0F));

		PartDefinition Head = Fumo.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 17)
						.addBox(-4.0F, -16.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -16.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.1F)),
				PartPose.offset(5.0F, 1.0F, -2.0F));

		PartDefinition LeftLeg = Fumo.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LeftLegOver_r1 = LeftLeg.addOrReplaceChild("LeftLegOver_r1",
				CubeListBuilder.create().texOffs(34, 3)
						.addBox(-1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(42, 39)
						.addBox(-1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(8.0F, 0.0F, -8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition BowLeftLeg = LeftLeg.addOrReplaceChild("BowLeftLeg", CubeListBuilder.create().texOffs(0, 55)
				.addBox(-0.1464F, -0.6319F, -0.8184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
				.addBox(-0.6464F, -0.6319F, -0.3184F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.8964F, -0.6463F, -5.6248F, 0.0F, -1.1781F, 0.0F));

		PartDefinition RightLeg = Fumo.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offset(-6.0F, 0.0F, 0.0F));

		PartDefinition RightLegOver_r1 = RightLeg.addOrReplaceChild("RightLegOver_r1",
				CubeListBuilder.create().texOffs(25, 0)
						.addBox(-1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(33, 22)
						.addBox(-1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(8.0F, 0.0F, -8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition BowRightLeg = RightLeg.addOrReplaceChild("BowRightLeg",
				CubeListBuilder.create().texOffs(0, 55)
						.addBox(-0.25F, -0.5F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(-0.75F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -0.7782F, -5.5931F, 0.0F, -0.3927F, 0.0F));

		PartDefinition Skirt = Fumo.addOrReplaceChild("Skirt",
				CubeListBuilder.create().texOffs(28, 29)
						.addBox(-3.5F, -4.0F, -2.5F, 7.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(28, 12)
						.addBox(-3.5F, -4.0F, -2.5F, 7.0F, 4.0F, 5.0F, new CubeDeformation(0.1F)),
				PartPose.offset(5.0F, 1.0F, -2.0F));

		PartDefinition Torso = Fumo.addOrReplaceChild("Torso",
				CubeListBuilder.create().texOffs(21, 39)
						.addBox(-3.0F, -8.0F, -2.0F, 6.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
						.addBox(-3.0F, -8.0F, -2.0F, 6.0F, 8.0F, 4.0F, new CubeDeformation(0.1F)),
				PartPose.offset(5.0F, 1.0F, -2.0F));

		PartDefinition LeftArm = Fumo.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(0.0F, -7.0F, 6.0F));

		PartDefinition LeftArmOver_r1 = LeftArm.addOrReplaceChild("LeftArmOver_r1",
				CubeListBuilder.create().texOffs(47, 0)
						.addBox(-2.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(9, 47)
						.addBox(-2.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 0.0F, -8.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition bow = LeftArm.addOrReplaceChild("bow", CubeListBuilder.create(),
				PartPose.offsetAndRotation(15.8F, 2.9F, -8.0F, 0.0F, -1.5708F, 0.7854F));

		PartDefinition bowleft_r1 = bow.addOrReplaceChild("bowleft_r1",
				CubeListBuilder.create().texOffs(5, 55).addBox(-1.0F, -0.9503F, 0.0F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.35F, 4.0503F, 6.364F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bowright_r1 = bow.addOrReplaceChild("bowright_r1",
				CubeListBuilder.create().texOffs(5, 55).addBox(-0.5F, -0.9503F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.35F, 4.0503F, 6.364F, 0.0F, 0.7854F, 0.0F));

		PartDefinition RightArm = Fumo.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-6.0F, -7.0F, 6.0F));

		PartDefinition RightArmOver_r1 = RightArm.addOrReplaceChild("RightArmOver_r1",
				CubeListBuilder.create().texOffs(42, 46)
						.addBox(0.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(0, 47)
						.addBox(0.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition LeftArmBow = RightArm.addOrReplaceChild("LeftArmBow", CubeListBuilder.create(),
				PartPose.offsetAndRotation(7.6F, 1.3F, -8.0F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition bowleft_r2 = LeftArmBow.addOrReplaceChild("bowleft_r2",
				CubeListBuilder.create().texOffs(0, 55).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.35F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bowright_r2 = LeftArmBow
				.addOrReplaceChild("bowright_r2",
						CubeListBuilder.create().texOffs(0, 55).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.35F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Fumo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}
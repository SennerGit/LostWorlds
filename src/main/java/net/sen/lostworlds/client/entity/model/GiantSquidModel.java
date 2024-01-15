package net.sen.lostworlds.client.entity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.client.entity.animations.ModGiantSquidAnimationDefinitions;
import net.sen.lostworlds.entity.mob.GiantSquidEntity;

public class GiantSquidModel<T extends GiantSquidEntity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(LostWorldsApi.modLoc("giant_squid_model"), "main");
	private final ModelPart giant_squid;

	public GiantSquidModel(ModelPart root) {
		this.giant_squid = root.getChild("giant_squid");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition giant_squid = partdefinition.addOrReplaceChild("giant_squid", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = giant_squid.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -6.0F, -6.0F, 12.0F, 24.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(57, 0).addBox(-12.0F, -13.0F, 0.0F, 24.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -35.0F, 0.0F));

		PartDefinition tentacles = head.addOrReplaceChild("tentacles", CubeListBuilder.create(), PartPose.offset(0.0F, 35.0F, 0.0F));

		PartDefinition tentacle1 = tentacles.addOrReplaceChild("tentacle1", CubeListBuilder.create().texOffs(9, 37).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 64.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -17.0F, 0.0F));

		PartDefinition tentacle2 = tentacles.addOrReplaceChild("tentacle2", CubeListBuilder.create().texOffs(54, 52).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -17.0F, -5.0F));

		PartDefinition tentacle3 = tentacles.addOrReplaceChild("tentacle3", CubeListBuilder.create().texOffs(45, 52).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -17.0F, -5.0F));

		PartDefinition tentacle4 = tentacles.addOrReplaceChild("tentacle4", CubeListBuilder.create().texOffs(36, 52).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -17.0F, -5.0F));

		PartDefinition tentacle5 = tentacles.addOrReplaceChild("tentacle5", CubeListBuilder.create().texOffs(0, 37).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 64.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -17.0F, 0.0F));

		PartDefinition tentacle6 = tentacles.addOrReplaceChild("tentacle6", CubeListBuilder.create().texOffs(27, 52).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -17.0F, 5.0F));

		PartDefinition tentacle7 = tentacles.addOrReplaceChild("tentacle7", CubeListBuilder.create().texOffs(18, 52).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -17.0F, 5.0F));

		PartDefinition tentacle8 = tentacles.addOrReplaceChild("tentacle8", CubeListBuilder.create().texOffs(49, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 32.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -17.0F, 5.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(GiantSquidEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

//		this.applyHeadRotation(entity, netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModGiantSquidAnimationDefinitions.MODEL_SWIM, limbSwing, limbSwingAmount, 2f, 2.5f);
//		this.animate(entity.animation, ModGiantSquidAnimationDefinitions.MODEL_SWIM, ageInTicks, 1f);
//		this.animate(entity.attackAnimationState, ModRhinoAnimationDefinitions.RHINO_ATTACK, ageInTicks, 1f);
//		this.animate(entity.sitAnimationState, ModRhinoAnimationDefinitions.RHINO_SIT, ageInTicks, 1f);
	}

//	private void applyHeadRotation(GiantSquidEntity entity, float netHeadYaw, float headPitch, float ageInTicks) {
//		netHeadYaw = Mth.clamp(netHeadYaw, -30.0f, 30.0f);
//		headPitch = Mth.clamp(headPitch, -25.0f, 45.0f);
//	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		giant_squid.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return giant_squid;
	}
}
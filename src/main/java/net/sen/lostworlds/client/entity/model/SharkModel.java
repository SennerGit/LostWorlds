package net.sen.lostworlds.client.entity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.client.entity.animations.ModSharkAnimationDefinitions;
import net.sen.lostworlds.entity.mob.SharkEntity;

public class SharkModel<T extends SharkEntity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(LostWorldsApi.modLoc("shark_model"), "main");
	private final ModelPart body;
	private final ModelPart head;

	public SharkModel(ModelPart root) {
		this.body = root.getChild("body");
		this.head = body.getChild("Spine").getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, -2.5F));

		PartDefinition Spine = body.addOrReplaceChild("Spine", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, 0.0F, -22.5F, 16.0F, 14.0F, 48.0F, new CubeDeformation(0.0F))
				.texOffs(55, 81).addBox(0.0F, -14.0F, -8.5F, 0.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition head = Spine.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 63).addBox(-8.0F, -5.5F, -18.0F, 16.0F, 11.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.5F, -22.5F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(51, 63).addBox(-8.0F, -1.5F, -14.0F, 16.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition left_pectoral_fin = Spine.addOrReplaceChild("left_pectoral_fin", CubeListBuilder.create().texOffs(81, 15).mirror().addBox(0.0F, 0.0F, -11.0F, 16.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(8.0F, 10.0F, -3.5F));

		PartDefinition right_pectoral_fin = Spine.addOrReplaceChild("right_pectoral_fin", CubeListBuilder.create().texOffs(81, 0).addBox(-16.0F, 0.0F, -11.0F, 16.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, 10.0F, -3.5F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -4.0F, 0.0F, 6.0F, 8.0F, 17.0F, new CubeDeformation(0.0F))
				.texOffs(0, 93).addBox(0.0F, 4.0F, 12.0F, 0.0F, 12.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(84, 81).addBox(0.0F, -16.0F, 12.0F, 0.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 26.5F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(SharkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

		this.applyHeadRotation(entity, netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModSharkAnimationDefinitions.SHARK_SWIM, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(entity.idleAnimationState, ModSharkAnimationDefinitions.SHARK_IDLE, ageInTicks, 1f);
		this.animate(entity.attackAnimationState, ModSharkAnimationDefinitions.SHARK_BITE, ageInTicks, 1f);
	}

	private void applyHeadRotation(SharkEntity entity, float netHeadYaw, float headPitch, float ageInTicks) {
		netHeadYaw = Mth.clamp(netHeadYaw, -30.0f, 30.0f);
		headPitch = Mth.clamp(headPitch, -25.0f, 45.0f);

		this.head.yRot = netHeadYaw * ((float) Math.PI / 180F);
		this.head.xRot = headPitch * ((float) Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int colour) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, colour);
	}

	@Override
	public ModelPart root() {
		return body;
	}
}
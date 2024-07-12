package net.sen.lostworlds.client.entity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.client.entity.animations.ModAnglerfishAnimationDefinitions;
import net.sen.lostworlds.entity.mob.AnglerFishEntity;

public class AnglerfishModel<T extends AnglerFishEntity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(LostWorldsApi.modLoc("anglerfish"), "main");
	private final ModelPart anglerfish;

	public AnglerfishModel(ModelPart root) {
		this.anglerfish = root.getChild("anglerfish");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition anglerfish = partdefinition.addOrReplaceChild("anglerfish", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, 0.0F));

		PartDefinition rod = anglerfish.addOrReplaceChild("rod", CubeListBuilder.create().texOffs(13, 17).addBox(0.0F, -3.0F, -3.0F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, -5.0F));

		PartDefinition bait = rod.addOrReplaceChild("bait", CubeListBuilder.create().texOffs(7, 17).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, -2.0F));

		PartDefinition tail = anglerfish.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 17).addBox(0.0F, -3.0F, 0.0F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 4.0F));

		PartDefinition fin = anglerfish.addOrReplaceChild("fin", CubeListBuilder.create().texOffs(22, 26).addBox(0.0F, -8.0F, -4.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(26, 17).addBox(0.0F, 4.0F, -4.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 4.0F));

		PartDefinition l_fin = fin.addOrReplaceChild("l_fin", CubeListBuilder.create().texOffs(25, 0).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.5F, -6.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition r_fin = fin.addOrReplaceChild("r_fin", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.5F, -6.0F, 0.0F, -0.4363F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(AnglerFishEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

//		this.applyHeadRotation(entity, netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnglerfishAnimationDefinitions.ANGLERFISH_SWIMING, limbSwing, limbSwingAmount, 2f, 2.5f);
//		this.animate(entity.idleAnimationState, ModRhinoAnimationDefinitions.RHINO_IDLE, ageInTicks, 1f);
//		this.animate(entity.attackAnimationState, ModRhinoAnimationDefinitions.RHINO_ATTACK, ageInTicks, 1f);
//		this.animate(entity.sitAnimationState, ModRhinoAnimationDefinitions.RHINO_SIT, ageInTicks, 1f);
	}

//	private void applyHeadRotation(AnglerFishEntity entity, float netHeadYaw, float headPitch, float ageInTicks) {
//		netHeadYaw = Mth.clamp(netHeadYaw, -30.0f, 30.0f);
//		headPitch = Mth.clamp(headPitch, -25.0f, 45.0f);
//
//		this.head.yRot = netHeadYaw * ((float) Math.PI / 180F);
//		this.head.xRot = headPitch * ((float) Math.PI / 180F);
//	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int colour) {
		anglerfish.render(poseStack, vertexConsumer, packedLight, packedOverlay, colour);
	}

	@Override
	public ModelPart root() {
		return anglerfish;
	}
}
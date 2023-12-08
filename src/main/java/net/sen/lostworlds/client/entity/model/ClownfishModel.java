package net.sen.lostworlds.client.entity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.client.entity.animations.ModRhinoAnimationDefinitions;
import net.sen.lostworlds.entity.mob.ClownfishEntity;

public class ClownfishModel<T extends ClownfishEntity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(LostWorldsConstants.modLoc("clownfish"), "main");
	private final ModelPart clownfish;

	public ClownfishModel(ModelPart root) {
		this.clownfish = root.getChild("clownfish");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition clownfish = partdefinition.addOrReplaceChild("clownfish", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.5F, -5.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.5F, -1.0F));

		PartDefinition tail = clownfish.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 5.0F));

		PartDefinition fins = clownfish.addOrReplaceChild("fins", CubeListBuilder.create().texOffs(0, 14).addBox(0.0F, -1.6667F, -5.0F, 0.0F, 1.0F, 4.5F, new CubeDeformation(0.0F))
				.texOffs(13, 14).addBox(0.0F, -1.6667F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(6, 14).addBox(0.0F, 2.3333F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.8333F, 2.0F));

		PartDefinition l_fin = fins.addOrReplaceChild("l_fin", CubeListBuilder.create().texOffs(0, 14).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8333F, -5.0F, 0.0F, 0.5672F, 0.0F));

		PartDefinition r_fin = fins.addOrReplaceChild("r_fin", CubeListBuilder.create().texOffs(5, 5).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.8333F, -5.0F, 0.0F, -0.5672F, 0.0F));

		PartDefinition l_pelvic_fin = fins.addOrReplaceChild("l_pelvic_fin", CubeListBuilder.create().texOffs(15, 4).addBox(0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, 2.3333F, -4.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition r_pelvic_fin = fins.addOrReplaceChild("r_pelvic_fin", CubeListBuilder.create().texOffs(15, 0).addBox(0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 2.3333F, -4.0F, 0.0F, 0.0F, 0.1745F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(ClownfishEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

//		this.applyHeadRotation(entity, netHeadYaw, headPitch, ageInTicks);
//
//		this.animateWalk(ModRhinoAnimationDefinitions.RHINO_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
//		this.animate(entity.idleAnimationState, ModRhinoAnimationDefinitions.RHINO_IDLE, ageInTicks, 1f);
//		this.animate(entity.attackAnimationState, ModRhinoAnimationDefinitions.RHINO_ATTACK, ageInTicks, 1f);
//		this.animate(entity.sitAnimationState, ModRhinoAnimationDefinitions.RHINO_SIT, ageInTicks, 1f);
	}

//	private void applyHeadRotation(ClownfishEntity entity, float netHeadYaw, float headPitch, float ageInTicks) {
//		netHeadYaw = Mth.clamp(netHeadYaw, -30.0f, 30.0f);
//		headPitch = Mth.clamp(headPitch, -25.0f, 45.0f);
//
//		this.head.yRot = netHeadYaw * ((float) Math.PI / 180F);
//		this.head.xRot = headPitch * ((float) Math.PI / 180F);
//	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		clownfish.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return clownfish;
	}
}
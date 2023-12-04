package net.sen.lostworlds.client.entity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.entity.mob.JellyfishEntity;

public class JellyfishModel<T extends JellyfishEntity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LostWorlds.MODID, "rhino_model"), "main");
	private final ModelPart jellyfish;

	public JellyfishModel(ModelPart root) {
		this.jellyfish = root.getChild("jellyfish");
//		this.head = jellyfish.getChild("body").getChild("torso").getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition jellyfish = partdefinition.addOrReplaceChild("jellyfish", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -24.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).addBox(-4.0F, -12.0F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition tentacle1 = jellyfish.addOrReplaceChild("tentacle1", CubeListBuilder.create(), PartPose.offset(-6.0F, 0.0F, 0.0F));

		PartDefinition tentacle1_3_r1 = tentacle1.addOrReplaceChild("tentacle1_3_r1", CubeListBuilder.create().texOffs(25, 36).addBox(0.0F, 0.5F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.575F, -0.775F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition tentacle1_2_r1 = tentacle1.addOrReplaceChild("tentacle1_2_r1", CubeListBuilder.create().texOffs(0, 36).addBox(-3.0F, 5.5F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.575F, -11.15F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition tentacle1_1_r1 = tentacle1.addOrReplaceChild("tentacle1_1_r1", CubeListBuilder.create().texOffs(5, 36).addBox(0.0F, 0.5F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -10.5F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition tentacle2 = jellyfish.addOrReplaceChild("tentacle2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0106F, -2.7433F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition tentacle1_3_r2 = tentacle2.addOrReplaceChild("tentacle1_3_r2", CubeListBuilder.create().texOffs(20, 36).addBox(0.0F, 0.5F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5644F, 1.9683F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition tentacle1_2_r2 = tentacle2.addOrReplaceChild("tentacle1_2_r2", CubeListBuilder.create().texOffs(30, 25).addBox(-3.0F, 5.5F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5644F, -8.4067F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition tentacle1_1_r2 = tentacle2.addOrReplaceChild("tentacle1_1_r2", CubeListBuilder.create().texOffs(33, 31).addBox(0.0F, 0.5F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9894F, -7.7567F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition tentacle3 = jellyfish.addOrReplaceChild("tentacle3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0106F, -2.7433F, -4.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition tentacle1_3_r3 = tentacle3.addOrReplaceChild("tentacle1_3_r3", CubeListBuilder.create().texOffs(15, 36).addBox(0.0F, 0.5F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5644F, 1.9683F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition tentacle1_2_r3 = tentacle3.addOrReplaceChild("tentacle1_2_r3", CubeListBuilder.create().texOffs(0, 25).addBox(-3.0F, 5.5F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5644F, -8.4067F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition tentacle1_1_r3 = tentacle3.addOrReplaceChild("tentacle1_1_r3", CubeListBuilder.create().texOffs(25, 25).addBox(0.0F, 0.5F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9894F, -7.7567F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition tentacle4 = jellyfish.addOrReplaceChild("tentacle4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0106F, -2.7433F, 4.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition tentacle1_3_r4 = tentacle4.addOrReplaceChild("tentacle1_3_r4", CubeListBuilder.create().texOffs(10, 36).addBox(0.0F, 0.5F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5644F, 1.9683F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition tentacle1_2_r4 = tentacle4.addOrReplaceChild("tentacle1_2_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, 5.5F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5644F, -8.4067F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition tentacle1_1_r4 = tentacle4.addOrReplaceChild("tentacle1_1_r4", CubeListBuilder.create().texOffs(5, 0).addBox(0.0F, 0.5F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9894F, -7.7567F, 0.0F, 0.0F, 0.0F, 0.2618F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(JellyfishEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
//
//		this.applyHeadRotation(entity, netHeadYaw, headPitch, ageInTicks);
//
//		this.animateWalk(ModRhinoAnimationDefinitions.RHINO_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
//		this.animate(entity.idleAnimationState, ModRhinoAnimationDefinitions.RHINO_IDLE, ageInTicks, 1f);
//		this.animate(entity.attackAnimationState, ModRhinoAnimationDefinitions.RHINO_ATTACK, ageInTicks, 1f);
//		this.animate(entity.sitAnimationState, ModRhinoAnimationDefinitions.RHINO_SIT, ageInTicks, 1f);
	}

//	private void applyHeadRotation(JellyfishEntity entity, float netHeadYaw, float headPitch, float ageInTicks) {
//		netHeadYaw = Mth.clamp(netHeadYaw, -30.0f, 30.0f);
//		headPitch = Mth.clamp(headPitch, -25.0f, 45.0f);
//
//		this.head.yRot = netHeadYaw * ((float) Math.PI / 180F);
//		this.head.xRot = headPitch * ((float) Math.PI / 180F);
//	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		jellyfish.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return jellyfish;
	}
}
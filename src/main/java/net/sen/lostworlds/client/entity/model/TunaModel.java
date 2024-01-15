package net.sen.lostworlds.client.entity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.client.entity.animations.ModTunaAnimationDefinitions;
import net.sen.lostworlds.entity.mob.TunaEntity;

public class TunaModel<T extends TunaEntity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(LostWorldsApi.modLoc("tuna"), "main");
	private final ModelPart tuna;
	private final ModelPart head;

	public TunaModel(ModelPart root) {
		this.tuna = root.getChild("tuna");
		this.head = tuna.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tuna = partdefinition.addOrReplaceChild("tuna", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -4.0F, -8.0F, 4.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, 0.0F));

		PartDefinition tail_1 = tuna.addOrReplaceChild("tail_1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.0F, 0.5F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 7.5F));

		PartDefinition tail_2 = tail_1.addOrReplaceChild("tail_2", CubeListBuilder.create().texOffs(17, 34).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 5.5F));

		PartDefinition tail_end = tail_2.addOrReplaceChild("tail_end", CubeListBuilder.create().texOffs(0, 25).addBox(0.0F, -6.0F, 0.0F, 0.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 4.0F));

		PartDefinition fin = tuna.addOrReplaceChild("fin", CubeListBuilder.create().texOffs(19, 23).addBox(0.0F, -8.8333F, 1.3333F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(8, 23).addBox(0.0F, 2.1667F, 1.3333F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 23).addBox(0.0F, 2.1667F, -8.6667F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.8333F, 2.6667F));

		PartDefinition l_fin = fin.addOrReplaceChild("l_fin", CubeListBuilder.create().texOffs(21, 26).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -3.8333F, -6.6667F, 0.4363F, 0.0F, 1.5708F));

		PartDefinition r_fin = fin.addOrReplaceChild("r_fin", CubeListBuilder.create().texOffs(9, 25).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -3.8333F, -6.6667F, 0.4363F, 0.0F, -1.5708F));

		PartDefinition head = tuna.addOrReplaceChild("head", CubeListBuilder.create().texOffs(25, 0).addBox(-2.0F, -4.0F, -5.0F, 4.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -8.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(TunaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

		this.applyHeadRotation(entity, netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModTunaAnimationDefinitions.TUNA_SWIM, limbSwing, limbSwingAmount, 2f, 2.5f);
	}

	private void applyHeadRotation(TunaEntity entity, float netHeadYaw, float headPitch, float ageInTicks) {
		netHeadYaw = Mth.clamp(netHeadYaw, -30.0f, 30.0f);
		headPitch = Mth.clamp(headPitch, -25.0f, 45.0f);

		this.head.yRot = netHeadYaw * ((float) Math.PI / 180F);
		this.head.xRot = headPitch * ((float) Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		tuna.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return tuna;
	}
}
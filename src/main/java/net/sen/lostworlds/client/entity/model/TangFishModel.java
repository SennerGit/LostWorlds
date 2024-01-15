package net.sen.lostworlds.client.entity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.client.entity.animations.ModTangFishAnimationDefinitions;
import net.sen.lostworlds.entity.mob.TangFishEntity;

public class TangFishModel<T extends TangFishEntity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(LostWorldsApi.modLoc("tuna_model"), "main");
	private final ModelPart tang_fish;

	public TangFishModel(ModelPart root) {
		this.tang_fish = root.getChild("tang_fish");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tang_fish = partdefinition.addOrReplaceChild("tang_fish", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.9375F, -4.125F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 12).addBox(0.0F, -2.9375F, -3.125F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(8, 12).addBox(0.0F, 1.0625F, -3.125F, 0.0F, 0.5F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(11, 0).addBox(0.0F, 1.0625F, -0.125F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.9375F, 0.125F));

		PartDefinition fin = tang_fish.addOrReplaceChild("fin", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0625F, -0.125F));

		PartDefinition l_fin = fin.addOrReplaceChild("l_fin", CubeListBuilder.create().texOffs(3, 3).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.616F, -1.5F, 0.0F, 0.0F, -2.618F));

		PartDefinition r_fin = fin.addOrReplaceChild("r_fin", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.616F, -1.5F, 0.0F, 0.0F, 2.618F));

		PartDefinition tail = tang_fish.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(1, 11).addBox(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.4375F, 3.875F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(TangFishEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

		this.animateWalk(ModTangFishAnimationDefinitions.TANG_FISH_SWIM, limbSwing, limbSwingAmount, 2f, 2.5f);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		tang_fish.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return tang_fish;
	}
}
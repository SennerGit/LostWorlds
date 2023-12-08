package net.sen.lostworlds.client.entity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.client.entity.layers.ModModelLayers;
import net.sen.lostworlds.client.entity.model.MagicGorganProjectileModel;
import net.sen.lostworlds.entity.projectile.MagicGorganProjectileEntity;

public class MagicGorganProjectileRenderer extends EntityRenderer<MagicGorganProjectileEntity> {
    public static final ResourceLocation TEXTURE = LostWorldsConstants.modLoc("textures/entity/magic_projectile.png");
    protected MagicGorganProjectileModel model;

    public MagicGorganProjectileRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
        model = new MagicGorganProjectileModel(pContext.bakeLayer(ModModelLayers.MAGICAL_GORGAN_PROJECTILE_LAYER));
        this.shadowRadius = 0.5f;
    }

    public void render(MagicGorganProjectileEntity entity, float pEntityYaw, float pPartialTick, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        pPoseStack.pushPose();
        pPoseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(pPartialTick, entity.yRotO, entity.getYRot()) - 90.0F));
        pPoseStack.mulPose(Axis.ZP.rotationDegrees(Mth.lerp(pPartialTick, entity.xRotO, entity.getXRot()) + 90.0F));
        VertexConsumer vertexconsumer = ItemRenderer.getFoilBufferDirect(pBuffer, this.model.renderType(this.getTextureLocation(entity)), false, false);

        this.model.renderToBuffer(pPoseStack, vertexconsumer, pPackedLight, OverlayTexture.NO_OVERLAY, 1f, 0f, 0f, 1f);
        pPoseStack.popPose();
        super.render(entity, pEntityYaw, pPartialTick, pPoseStack, pBuffer, pPackedLight);
    }


    @Override
    public ResourceLocation getTextureLocation(MagicGorganProjectileEntity pEntity) {
        return TEXTURE;
    }
}

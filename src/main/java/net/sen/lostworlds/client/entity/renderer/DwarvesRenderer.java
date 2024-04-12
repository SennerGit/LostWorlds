package net.sen.lostworlds.client.entity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.client.entity.layers.ModModelLayers;
import net.sen.lostworlds.client.entity.model.DwarvesModel;
import net.sen.lostworlds.entity.NidavellirEntities;
import net.sen.lostworlds.entity.mob.DwarvesEntity;

public class DwarvesRenderer extends MobRenderer<DwarvesEntity, DwarvesModel<DwarvesEntity>> {
    private static final ResourceLocation TEXTURE = LostWorldsApi.entityRendererLoc(NidavellirEntities.DWARVES_ID);

    public DwarvesRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new DwarvesModel<>(pContext.bakeLayer(ModModelLayers.DWARVES_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(DwarvesEntity pEntity) {
        return TEXTURE;
    }

    @Override
    public void render(DwarvesEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        if (pEntity.isBaby()) {

//            if (pEntity.getVariant().getId() == 1) {
//                pPoseStack.scale(0.80f, 0.80f, 0.80f);
//            }

            pPoseStack.scale(0.45f, 0.45f, 0.45f);
        }

//        if (pEntity.getVariant().getId() == 1) {
//            pPoseStack.scale(1.25f, 1.25f, 1.25f);
//        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}

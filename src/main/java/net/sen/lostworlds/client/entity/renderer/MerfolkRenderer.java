package net.sen.lostworlds.client.entity.renderer;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.client.entity.layers.ModModelLayers;
import net.sen.lostworlds.client.entity.model.MerfolkModel;
import net.sen.lostworlds.entity.AtlantisEntities;
import net.sen.lostworlds.entity.mob.MerfolkEntity;
import net.sen.lostworlds.entity.variant.MerfolkVariant;

import java.util.Map;

public class MerfolkRenderer extends MobRenderer<MerfolkEntity, MerfolkModel<MerfolkEntity>> {
    private static final Map<MerfolkVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(MerfolkVariant.class), map -> {
                map.put(MerfolkVariant.DEFAULT,
                        LostWorldsApi.entityRendererLoc(AtlantisEntities.MERFOLK_ID));
                map.put(MerfolkVariant.WHITE,
                        LostWorldsApi.entityRendererLoc(AtlantisEntities.MERFOLK_ID, "white_" + AtlantisEntities.MERFOLK_ID));
            });

    public MerfolkRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new MerfolkModel<>(pContext.bakeLayer(ModModelLayers.MERFOLK_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(MerfolkEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(MerfolkEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        if (pEntity.isBaby()) {

            if (pEntity.getVariant().getId() == 1) {
                pPoseStack.scale(0.80f, 0.80f, 0.80f);
            }

            pPoseStack.scale(0.45f, 0.45f, 0.45f);
        }

        if (pEntity.getVariant().getId() == 1) {
            pPoseStack.scale(1.25f, 1.25f, 1.25f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}

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
import net.sen.lostworlds.client.entity.model.ElectricEelsModel;
import net.sen.lostworlds.entity.AtlantisEntities;
import net.sen.lostworlds.entity.mob.ElectricEelsEntity;
import net.sen.lostworlds.entity.variant.ElectricEelsVariant;

import java.util.Map;

public class ElectricEelsRenderer extends MobRenderer<ElectricEelsEntity, ElectricEelsModel<ElectricEelsEntity>> {
    private static final Map<ElectricEelsVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(ElectricEelsVariant.class), map -> {
                map.put(ElectricEelsVariant.DEFAULT,
                        LostWorldsApi.entityRendererLoc(AtlantisEntities.ELECTRIC_EELS_ID));
                map.put(ElectricEelsVariant.WHITE,
                        LostWorldsApi.entityRendererLoc(AtlantisEntities.ELECTRIC_EELS_ID, "white_" + AtlantisEntities.ELECTRIC_EELS_ID));
            });

    public ElectricEelsRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new ElectricEelsModel<>(pContext.bakeLayer(ModModelLayers.ELECTRIC_EELS_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(ElectricEelsEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(ElectricEelsEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
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

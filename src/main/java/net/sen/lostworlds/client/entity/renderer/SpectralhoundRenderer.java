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
import net.sen.lostworlds.client.entity.model.SpectralhoundModel;
import net.sen.lostworlds.entity.UnderworldEntities;
import net.sen.lostworlds.entity.mob.SpectralhoundEntity;
import net.sen.lostworlds.entity.variant.SpectralhoundVariant;

import java.util.Map;

public class SpectralhoundRenderer extends MobRenderer<SpectralhoundEntity, SpectralhoundModel<SpectralhoundEntity>> {
    private static final Map<SpectralhoundVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(SpectralhoundVariant.class), map -> {
                map.put(SpectralhoundVariant.DEFAULT,
                        LostWorldsApi.entityRendererLoc(UnderworldEntities.SPECTRALHOUND_ID));
                map.put(SpectralhoundVariant.WHITE,
                        LostWorldsApi.entityRendererLoc(UnderworldEntities.SPECTRALHOUND_ID, "white_" + UnderworldEntities.SPECTRALHOUND_ID));
            });

    public SpectralhoundRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new SpectralhoundModel<>(pContext.bakeLayer(ModModelLayers.SPECTRALHOUND_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(SpectralhoundEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(SpectralhoundEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
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

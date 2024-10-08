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
import net.sen.lostworlds.client.entity.model.HellhoundModel;
import net.sen.lostworlds.entity.UnderworldEntities;
import net.sen.lostworlds.entity.mob.HellhoundEntity;
import net.sen.lostworlds.entity.variant.HellhoundVariant;

import java.util.Map;

public class HellhoundRenderer extends MobRenderer<HellhoundEntity, HellhoundModel<HellhoundEntity>> {
    private static final Map<HellhoundVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(HellhoundVariant.class), map -> {
                map.put(HellhoundVariant.DEFAULT,
                        LostWorldsApi.entityRendererLoc(UnderworldEntities.HELLHOUND_ID));
                map.put(HellhoundVariant.WHITE,
                        LostWorldsApi.entityRendererLoc(UnderworldEntities.HELLHOUND_ID, "white_" + UnderworldEntities.HELLHOUND_ID));
            });

    public HellhoundRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new HellhoundModel<>(pContext.bakeLayer(ModModelLayers.HELLHOUND_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(HellhoundEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(HellhoundEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
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

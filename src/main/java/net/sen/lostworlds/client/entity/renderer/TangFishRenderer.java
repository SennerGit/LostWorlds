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
import net.sen.lostworlds.client.entity.model.TangFishModel;
import net.sen.lostworlds.entity.AtlantisEntities;
import net.sen.lostworlds.entity.mob.TangFishEntity;
import net.sen.lostworlds.entity.variant.TangFishVariant;

import java.util.Map;

public class TangFishRenderer extends MobRenderer<TangFishEntity, TangFishModel<TangFishEntity>> {
    private static final Map<TangFishVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(TangFishVariant.class), map -> {
                map.put(TangFishVariant.BLUE,
                        LostWorldsApi.entityRendererLoc(AtlantisEntities.TANG_FISH_ID, "blue_" + AtlantisEntities.TANG_FISH_ID));
                map.put(TangFishVariant.BLACK,
                        LostWorldsApi.entityRendererLoc(AtlantisEntities.TANG_FISH_ID, "black_" + AtlantisEntities.TANG_FISH_ID));
                map.put(TangFishVariant.BROWN,
                        LostWorldsApi.entityRendererLoc(AtlantisEntities.TANG_FISH_ID, "brown_" + AtlantisEntities.TANG_FISH_ID));
                map.put(TangFishVariant.ACHILLES,
                        LostWorldsApi.entityRendererLoc(AtlantisEntities.TANG_FISH_ID, "achilles_" + AtlantisEntities.TANG_FISH_ID));
            });

    public TangFishRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new TangFishModel<>(pContext.bakeLayer(ModModelLayers.TANG_FISH_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(TangFishEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(TangFishEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
//        if (pEntity.isBaby()) {
//
//            if (pEntity.getVariant().getId() == 1) {
//                pPoseStack.scale(0.80f, 0.80f, 0.80f);
//            }
//
//            pPoseStack.scale(0.45f, 0.45f, 0.45f);
//        }
//
//        if (pEntity.getVariant().getId() == 1) {
//            pPoseStack.scale(1.25f, 1.25f, 1.25f);
//        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
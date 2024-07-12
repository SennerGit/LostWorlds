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
import net.sen.lostworlds.client.entity.model.ClownfishModel;
import net.sen.lostworlds.entity.AtlantisEntities;
import net.sen.lostworlds.entity.mob.ClownfishEntity;
import net.sen.lostworlds.entity.variant.ClownfishVariant;

import java.util.Map;

public class ClownfishRenderer extends MobRenderer<ClownfishEntity, ClownfishModel<ClownfishEntity>> {
    private static final Map<ClownfishVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(ClownfishVariant.class), map -> {
                map.put(ClownfishVariant.DEFAULT,
                        LostWorldsApi.entityRendererLoc(AtlantisEntities.CLOWNFISH_ID));
                map.put(ClownfishVariant.BLUE,
                        LostWorldsApi.entityRendererLoc(AtlantisEntities.CLOWNFISH_ID, "blue_" + AtlantisEntities.CLOWNFISH_ID));
                map.put(ClownfishVariant.BLACK_AND_WHITE,
                        LostWorldsApi.entityRendererLoc(AtlantisEntities.CLOWNFISH_ID, "back_n_white_" + AtlantisEntities.CLOWNFISH_ID));
                map.put(ClownfishVariant.NAKED,
                        LostWorldsApi.entityRendererLoc(AtlantisEntities.CLOWNFISH_ID, "naked_" + AtlantisEntities.CLOWNFISH_ID));
                map.put(ClownfishVariant.PLATINUM,
                        LostWorldsApi.entityRendererLoc(AtlantisEntities.CLOWNFISH_ID, "platinum_" + AtlantisEntities.CLOWNFISH_ID));
            });

    public ClownfishRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new ClownfishModel<>(pContext.bakeLayer(ModModelLayers.CLOWNFISH_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(ClownfishEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(ClownfishEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
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

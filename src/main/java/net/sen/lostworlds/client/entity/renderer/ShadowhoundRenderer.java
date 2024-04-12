package net.sen.lostworlds.client.entity.renderer;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.client.entity.layers.ModModelLayers;
import net.sen.lostworlds.client.entity.model.ShadowhoundModel;
import net.sen.lostworlds.entity.UnderworldEntities;
import net.sen.lostworlds.entity.mob.ShadowhoundEntity;
import net.sen.lostworlds.entity.variant.ShadowhoundVariant;

import java.util.Map;

public class ShadowhoundRenderer extends MobRenderer<ShadowhoundEntity, ShadowhoundModel<ShadowhoundEntity>> {
    private static final Map<ShadowhoundVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(ShadowhoundVariant.class), map -> {
                map.put(ShadowhoundVariant.DEFAULT,
                        LostWorldsApi.entityRendererLoc(UnderworldEntities.SHADOWHOUND_ID));
                map.put(ShadowhoundVariant.WHITE,
                        LostWorldsApi.entityRendererLoc(UnderworldEntities.SHADOWHOUND_ID, "white_" + UnderworldEntities.SHADOWHOUND_ID));
            });

    public ShadowhoundRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new ShadowhoundModel<>(pContext.bakeLayer(ModModelLayers.SHADOWHOUND_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(ShadowhoundEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(ShadowhoundEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
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

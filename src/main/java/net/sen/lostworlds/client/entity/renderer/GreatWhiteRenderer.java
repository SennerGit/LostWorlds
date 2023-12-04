package net.sen.lostworlds.client.entity.renderer;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.client.entity.layers.ModModelLayers;
import net.sen.lostworlds.client.entity.model.GreatWhiteModel;
import net.sen.lostworlds.entity.mob.GreatWhiteEntity;
import net.sen.lostworlds.entity.variant.GreatWhiteVariant;

import java.util.Map;

public class GreatWhiteRenderer extends MobRenderer<GreatWhiteEntity, GreatWhiteModel<GreatWhiteEntity>> {
    private static final Map<GreatWhiteVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(GreatWhiteVariant.class), map -> {
                map.put(GreatWhiteVariant.DEFAULT,
                        new ResourceLocation(LostWorlds.MODID, "textures/entity/great_white/great_white.png"));
                map.put(GreatWhiteVariant.WHITE,
                        new ResourceLocation(LostWorlds.MODID, "textures/entity/great_white/white_great_white.png"));
            });

    public GreatWhiteRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new GreatWhiteModel<>(pContext.bakeLayer(ModModelLayers.GREAT_WHITE_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(GreatWhiteEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(GreatWhiteEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
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

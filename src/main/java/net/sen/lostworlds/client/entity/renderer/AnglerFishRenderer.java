package net.sen.lostworlds.client.entity.renderer;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.client.entity.layers.ModModelLayers;
import net.sen.lostworlds.client.entity.model.AnglerfishModel;
import net.sen.lostworlds.entity.AtlantisEntities;
import net.sen.lostworlds.entity.mob.AnglerFishEntity;
import net.sen.lostworlds.entity.variant.AnglerFishVariant;

import java.util.Map;

public class AnglerFishRenderer extends MobRenderer<AnglerFishEntity, AnglerfishModel<AnglerFishEntity>> {
    private static final Map<AnglerFishVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(AnglerFishVariant.class), map -> {
                map.put(AnglerFishVariant.DEFAULT,
                        LostWorldsApi.entityRendererLoc(AtlantisEntities.ANGLER_FISH_ID));
            });

    public AnglerFishRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new AnglerfishModel<>(pContext.bakeLayer(ModModelLayers.ANGLER_FISH_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(AnglerFishEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    protected int getBlockLightLevel(AnglerFishEntity pEntity, BlockPos pPos) {
        return 15;
    }

    @Override
    public void render(AnglerFishEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
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

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
import net.sen.lostworlds.client.entity.model.SirenModel;
import net.sen.lostworlds.entity.AtlantisEntities;
import net.sen.lostworlds.entity.mob.SirenEntity;
import net.sen.lostworlds.entity.variant.SirenVariant;

import java.util.Map;

public class SirenRenderer extends MobRenderer<SirenEntity, SirenModel<SirenEntity>> {
    private static final Map<SirenVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(SirenVariant.class), map -> {
                map.put(SirenVariant.DEFAULT,
                        LostWorldsApi.entityRendererLoc(AtlantisEntities.SIREN_ID));
            });

    public SirenRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new SirenModel<>(pContext.bakeLayer(ModModelLayers.SIREN_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(SirenEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(SirenEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}

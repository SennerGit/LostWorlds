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
import net.sen.lostworlds.client.entity.model.GiantSquidModel;
import net.sen.lostworlds.entity.AtlantisEntities;
import net.sen.lostworlds.entity.mob.GiantSquidEntity;
import net.sen.lostworlds.entity.variant.GiantSquidVariant;

import java.util.Map;

public class GiantSquidRenderer extends MobRenderer<GiantSquidEntity, GiantSquidModel<GiantSquidEntity>> {
    private static final float GIANT_SQUID_SCALE = 4f;

    private static final Map<GiantSquidVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(GiantSquidVariant.class), map -> {
                map.put(GiantSquidVariant.DEFAULT,
                        LostWorldsApi.entityRendererLoc(AtlantisEntities.GIANT_SQUID_ID));
            });

    public GiantSquidRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new GiantSquidModel<>(pContext.bakeLayer(ModModelLayers.GIANT_SQUID_LAYER)), 4f);
    }

    @Override
    public ResourceLocation getTextureLocation(GiantSquidEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(GiantSquidEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        pPoseStack.scale(GIANT_SQUID_SCALE, GIANT_SQUID_SCALE, GIANT_SQUID_SCALE);

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}

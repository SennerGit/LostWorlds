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
import net.sen.lostworlds.client.entity.model.RayModel;
import net.sen.lostworlds.entity.AtlantisEntities;
import net.sen.lostworlds.entity.mob.RayEntity;
import net.sen.lostworlds.entity.variant.RayVariant;

import java.util.Map;

public class RayRenderer extends MobRenderer<RayEntity, RayModel<RayEntity>> {
    private static final float RAY_SCALE = 2f;

    private static final Map<RayVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(RayVariant.class), map -> {
                map.put(RayVariant.DEFAULT,
                        LostWorldsApi.entityRendererLoc(AtlantisEntities.RAY_ID));
            });

    public RayRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new RayModel<>(pContext.bakeLayer(ModModelLayers.RAY_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(RayEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(RayEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        pPoseStack.scale(RAY_SCALE, RAY_SCALE, RAY_SCALE);

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}

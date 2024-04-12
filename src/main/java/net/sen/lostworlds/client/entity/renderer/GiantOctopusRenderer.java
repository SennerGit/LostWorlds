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
import net.sen.lostworlds.client.entity.model.GiantOctopusModel;
import net.sen.lostworlds.entity.AtlantisEntities;
import net.sen.lostworlds.entity.mob.GiantOctopusEntity;
import net.sen.lostworlds.entity.variant.GiantOctopusVariant;

import java.util.Map;

public class GiantOctopusRenderer extends MobRenderer<GiantOctopusEntity, GiantOctopusModel<GiantOctopusEntity>> {
    private static final Map<GiantOctopusVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(GiantOctopusVariant.class), map -> {
                map.put(GiantOctopusVariant.DEFAULT,
                        LostWorldsApi.entityRendererLoc(AtlantisEntities.GIANT_OCTOPUS_ID));
                map.put(GiantOctopusVariant.WHITE,
                        LostWorldsApi.entityRendererLoc(AtlantisEntities.GIANT_OCTOPUS_ID, "white_" + AtlantisEntities.GIANT_OCTOPUS_ID));
            });

    public GiantOctopusRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new GiantOctopusModel<>(pContext.bakeLayer(ModModelLayers.GIANT_OCTOPUS_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(GiantOctopusEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(GiantOctopusEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
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

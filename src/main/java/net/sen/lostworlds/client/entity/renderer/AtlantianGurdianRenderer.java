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
import net.sen.lostworlds.client.entity.model.AtlantianGurdianModel;
import net.sen.lostworlds.entity.AtlantisEntities;
import net.sen.lostworlds.entity.mob.AtlantianGurdianEntity;
import net.sen.lostworlds.entity.variant.AtlantianGurdianVariant;

import java.util.Map;

public class AtlantianGurdianRenderer extends MobRenderer<AtlantianGurdianEntity, AtlantianGurdianModel<AtlantianGurdianEntity>> {
    private static final Map<AtlantianGurdianVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(AtlantianGurdianVariant.class), map -> {
                map.put(AtlantianGurdianVariant.DEFAULT,
                        LostWorldsApi.entityRendererLoc(AtlantisEntities.ATLANTIAN_GURDIAN_ID));
                map.put(AtlantianGurdianVariant.WHITE,
                        LostWorldsApi.entityRendererLoc( AtlantisEntities.ATLANTIAN_GURDIAN_ID, "white_" + AtlantisEntities.ATLANTIAN_GURDIAN_ID));
            });

    public AtlantianGurdianRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new AtlantianGurdianModel<>(pContext.bakeLayer(ModModelLayers.ATLANTIAN_GURDIAN_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(AtlantianGurdianEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(AtlantianGurdianEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
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

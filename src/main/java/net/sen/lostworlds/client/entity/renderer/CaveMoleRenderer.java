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
import net.sen.lostworlds.client.entity.model.CaveMoleModel;
import net.sen.lostworlds.entity.NidavellirEntities;
import net.sen.lostworlds.entity.mob.CaveMoleEntity;
import net.sen.lostworlds.entity.variant.CaveMoleVariant;

import java.util.Map;

public class CaveMoleRenderer extends MobRenderer<CaveMoleEntity, CaveMoleModel<CaveMoleEntity>> {
    private static final Map<CaveMoleVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(CaveMoleVariant.class), map -> {
                map.put(CaveMoleVariant.DEFAULT,
                        LostWorldsApi.entityRendererLoc(NidavellirEntities.CAVE_MOLE_ID));
                map.put(CaveMoleVariant.WHITE,
                        LostWorldsApi.entityRendererLoc(NidavellirEntities.CAVE_MOLE_ID, "white_" + NidavellirEntities.CAVE_MOLE_ID));
            });

    public CaveMoleRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new CaveMoleModel<>(pContext.bakeLayer(ModModelLayers.CAVE_MOLE_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(CaveMoleEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(CaveMoleEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
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
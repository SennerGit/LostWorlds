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
import net.sen.lostworlds.client.entity.model.VampireBatModel;
import net.sen.lostworlds.entity.NidavellirEntities;
import net.sen.lostworlds.entity.mob.VampireBatEntity;
import net.sen.lostworlds.entity.variant.VampireBatVariant;

import java.util.Map;

public class VampireBatRenderer extends MobRenderer<VampireBatEntity, VampireBatModel<VampireBatEntity>> {
    private static final Map<VampireBatVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(VampireBatVariant.class), map -> {
                map.put(VampireBatVariant.DEFAULT,
                        LostWorldsApi.entityRendererLoc(NidavellirEntities.VAMPIRE_BAT_ID));
                map.put(VampireBatVariant.WHITE,
                        LostWorldsApi.entityRendererLoc(NidavellirEntities.VAMPIRE_BAT_ID, "white_" + NidavellirEntities.VAMPIRE_BAT_ID));
            });

    public VampireBatRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new VampireBatModel<>(pContext.bakeLayer(ModModelLayers.VAMPIRE_BAT_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(VampireBatEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(VampireBatEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
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

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
import net.sen.lostworlds.client.entity.model.MorayEelsModel;
import net.sen.lostworlds.entity.mob.MorayEelsEntity;
import net.sen.lostworlds.entity.variant.MorayEelsVariant;

import java.util.Map;

public class MorayEelsRenderer extends MobRenderer<MorayEelsEntity, MorayEelsModel<MorayEelsEntity>> {
    private static final Map<MorayEelsVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(MorayEelsVariant.class), map -> {
                map.put(MorayEelsVariant.DEFAULT,
                        LostWorldsApi.modLoc("textures/entity/moray_eels/moray_eels.png"));
                map.put(MorayEelsVariant.WHITE,
                        LostWorldsApi.modLoc("textures/entity/moray_eels/white_moray_eels.png"));
            });

    public MorayEelsRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new MorayEelsModel<>(pContext.bakeLayer(ModModelLayers.MORAY_EELS_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(MorayEelsEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(MorayEelsEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
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

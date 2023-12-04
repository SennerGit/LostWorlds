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
import net.sen.lostworlds.client.entity.model.AtlantianModel;
import net.sen.lostworlds.entity.mob.AtlantianEntity;
import net.sen.lostworlds.entity.variant.AtlantianVariant;

import java.util.Map;

public class AtlantianRenderer extends MobRenderer<AtlantianEntity, AtlantianModel<AtlantianEntity>> {
    private static final Map<AtlantianVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(AtlantianVariant.class), map -> {
                map.put(AtlantianVariant.DEFAULT,
                        new ResourceLocation(LostWorlds.MODID, "textures/entity/atlantian/atlantian.png"));
                map.put(AtlantianVariant.WHITE,
                        new ResourceLocation(LostWorlds.MODID, "textures/entity/atlantian/white_atlantian.png"));
            });

    public AtlantianRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new AtlantianModel<>(pContext.bakeLayer(ModModelLayers.ATLANTIAN_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(AtlantianEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(AtlantianEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
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

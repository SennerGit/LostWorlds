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
import net.sen.lostworlds.client.entity.model.SeahorseModel;
import net.sen.lostworlds.entity.mob.SeahorseEntity;
import net.sen.lostworlds.entity.variant.SeahorseVariant;

import java.util.Map;

public class SeahorseRenderer extends MobRenderer<SeahorseEntity, SeahorseModel<SeahorseEntity>> {
    private static final Map<SeahorseVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(SeahorseVariant.class), map -> {
                map.put(SeahorseVariant.DEFAULT,
                        new ResourceLocation(LostWorlds.MODID, "textures/entity/seahorse/seahorse.png"));
                map.put(SeahorseVariant.WHITE,
                        new ResourceLocation(LostWorlds.MODID, "textures/entity/seahorse/white_seahorse.png"));
            });

    public SeahorseRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new SeahorseModel<>(pContext.bakeLayer(ModModelLayers.SEAHORSE_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(SeahorseEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(SeahorseEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
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

package net.sen.lostworlds.client.entity.renderer;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.client.entity.layers.ModModelLayers;
import net.sen.lostworlds.client.entity.model.SharkModel;
import net.sen.lostworlds.entity.mob.SharkEntity;
import net.sen.lostworlds.entity.variant.SharkVariant;

import java.util.Map;

public class SharkRenderer extends MobRenderer<SharkEntity, SharkModel<SharkEntity>> {
    private static final Map<SharkVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(SharkVariant.class), map -> {
                map.put(SharkVariant.DEFAULT,
                        LostWorldsConstants.modLoc("textures/entity/shark/shark.png"));
            });

    public SharkRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new SharkModel<>(pContext.bakeLayer(ModModelLayers.SHARK_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(SharkEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(SharkEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}

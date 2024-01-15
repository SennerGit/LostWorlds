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
import net.sen.lostworlds.client.entity.model.NudibranchSlugModel;
import net.sen.lostworlds.entity.mob.NudibranchSlugEntity;
import net.sen.lostworlds.entity.variant.NudibranchSlugVariant;

import java.util.Map;

public class NudibranchSlugRenderer extends MobRenderer<NudibranchSlugEntity, NudibranchSlugModel<NudibranchSlugEntity>> {
    private static final Map<NudibranchSlugVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(NudibranchSlugVariant.class), map -> {
                map.put(NudibranchSlugVariant.DEFAULT,
                        LostWorldsApi.modLoc("textures/entity/nudibranch_slug/nudibranch_slug.png"));
                map.put(NudibranchSlugVariant.WHITE,
                        LostWorldsApi.modLoc("textures/entity/nudibranch_slug/white_nudibranch_slug.png"));
            });

    public NudibranchSlugRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new NudibranchSlugModel<>(pContext.bakeLayer(ModModelLayers.NUDIBRANCH_SLUG_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(NudibranchSlugEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(NudibranchSlugEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
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

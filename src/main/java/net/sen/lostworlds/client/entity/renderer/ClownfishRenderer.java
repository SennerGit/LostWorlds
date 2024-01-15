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
import net.sen.lostworlds.client.entity.model.ClownfishModel;
import net.sen.lostworlds.entity.mob.ClownfishEntity;
import net.sen.lostworlds.entity.variant.ClownfishVariant;

import java.util.Map;

public class ClownfishRenderer extends MobRenderer<ClownfishEntity, ClownfishModel<ClownfishEntity>> {
    private static final Map<ClownfishVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(ClownfishVariant.class), map -> {
                map.put(ClownfishVariant.DEFAULT,
                        LostWorldsApi.modLoc("textures/entity/clownfish/clownfish.png"));
                map.put(ClownfishVariant.BLUE,
                        LostWorldsApi.modLoc("textures/entity/clownfish/blue_clownfish.png"));
                map.put(ClownfishVariant.BLACK_AND_WHITE,
                        LostWorldsApi.modLoc("textures/entity/clownfish/back_n_white_clownfish.png"));
                map.put(ClownfishVariant.NAKED,
                        LostWorldsApi.modLoc("textures/entity/clownfish/naked_clownfish.png"));
                map.put(ClownfishVariant.PLATINUM,
                        LostWorldsApi.modLoc("textures/entity/clownfish/platinum_clownfish.png"));
            });

    public ClownfishRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new ClownfishModel<>(pContext.bakeLayer(ModModelLayers.CLOWNFISH_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(ClownfishEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(ClownfishEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
//        if (pEntity.isBaby()) {
//
//            if (pEntity.getVariant().getId() == 1) {
//                pPoseStack.scale(0.80f, 0.80f, 0.80f);
//            }
//
//            pPoseStack.scale(0.45f, 0.45f, 0.45f);
//        }
//
//        if (pEntity.getVariant().getId() == 1) {
//            pPoseStack.scale(1.25f, 1.25f, 1.25f);
//        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}

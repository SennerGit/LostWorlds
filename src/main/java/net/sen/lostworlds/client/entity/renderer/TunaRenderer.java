package net.sen.lostworlds.client.entity.renderer;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.client.entity.layers.ModModelLayers;
import net.sen.lostworlds.client.entity.model.TunaModel;
import net.sen.lostworlds.entity.mob.TunaEntity;
import net.sen.lostworlds.entity.variant.TunaSizeVariant;
import net.sen.lostworlds.entity.variant.TunaTextureVariant;
import net.sen.lostworlds.util.tools.MinecraftMaths;
import net.sen.lostworlds.util.tools.Vector2;

import java.util.Map;

public class TunaRenderer extends MobRenderer<TunaEntity, TunaModel<TunaEntity>> {

    private static final Map<TunaTextureVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(TunaTextureVariant.class), map -> {
                map.put(TunaTextureVariant.DEFAULT,
                        new ResourceLocation(LostWorlds.MODID, "textures/entity/tuna/tuna.png"));
            });
    private static final Map<TunaSizeVariant, Float> SIZE_BY_VARIANT =
            Util.make(Maps.newEnumMap(TunaSizeVariant.class), map -> {
                map.put(TunaSizeVariant.TINY,
                        0.4f);
                map.put(TunaSizeVariant.SMALL,
                        0.7f);
                map.put(TunaSizeVariant.MID,
                        1.2f);
                map.put(TunaSizeVariant.LARGE,
                        1.8f);
                map.put(TunaSizeVariant.GIANT,
                        3f);
            });

    public TunaRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new TunaModel<>(pContext.bakeLayer(ModModelLayers.TUNA_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(TunaEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getTunaTextureVariant());
    }

    private float getTunaSizeVariant(TunaEntity pEntity) {
        return SIZE_BY_VARIANT.get(pEntity.getTunaSizeVariant());
    }

    @Override
    public void render(TunaEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
//        float newSize = MinecraftMaths.randomFloat(getTunaSizeVariant(pEntity).getX(), getTunaSizeVariant(pEntity).getY());
        pPoseStack.scale(getTunaSizeVariant(pEntity), getTunaSizeVariant(pEntity), getTunaSizeVariant(pEntity));

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
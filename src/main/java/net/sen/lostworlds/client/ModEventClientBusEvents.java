package net.sen.lostworlds.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.*;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.block.entity.ModBlockEntities;
import net.sen.lostworlds.client.gui.MagicTooltip;
import net.sen.lostworlds.client.gui.TooltipOverlayHandler;
import net.sen.lostworlds.particle.MagicDowsingRodParticles;
import net.sen.lostworlds.particle.ModParticles;

@Mod.EventBusSubscriber(modid = LostWorldsConstants.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {
    @SubscribeEvent
    public static void registerParticleFactories(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet(ModParticles.MAGICAL_DOWSING_ROD_PARTICLES.get(),
                MagicDowsingRodParticles.Provider::new);
    }

    @SubscribeEvent
    public static void regusterBER(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.MOD_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MOD_HANGING_SIGN.get(), HangingSignRenderer::new);
    }

    @SubscribeEvent
    public static void registerColouredBlocks(RegisterColorHandlersEvent.Block event) {
        LostWorlds.LOGGER.info("register block colours");
//        event.register((pState, pLevel, pPos, pTintIndex) -> pLevel != null &&
//                pPos != null ? BiomeColors.getAverageGrassColor(pLevel, pPos) : FoliageColor.
//        event.register((pState, pLevel, pPos, pTintIndex) -> pLevel != null &&
//                pPos != null ? BiomeColors.getAverageGrassColor(pLevel, pPos) : FoliageColor.getDefaultColor(), ModBlocks.UNDERWORLD_DIRT.get());
    }

    @SubscribeEvent
    public static void registerColouredItems(RegisterColorHandlersEvent.Item event) {
//        event.register((pStack, pTintIndex) -> {
//            BlockState state = ((BlockItem) pStack.getItem()).getBlock().defaultBlockState();
//            return event.getBlockColors().getColor(state, null, null, pTintIndex);
//        }, ModBlocks.
//        event.register((pStack, pTintIndex) -> {
//            BlockState state = ((BlockItem) pStack.getItem()).getBlock().defaultBlockState();
//            return event.getBlockColors().getColor(state, null, null, pTintIndex);
//        }, ModBlocks.UNDERWORLD_DIRT.get());
    }

    @SubscribeEvent
    public static void registerTooltips(final RegisterClientTooltipComponentFactoriesEvent event) {
        event.register(MagicTooltip.class, TooltipOverlayHandler.MagicTooltipRenderer::new);
    }



    /*
    DRAWING SHAPES
     */
//    @SubscribeEvent
//    public static void onRenderOutline(RenderHighlightEvent.Block event) {
//
//    }
//
//    private static void drawShape(PoseStack poseStack, VertexConsumer consumer, VoxelShape voxelShape, double xIn, double yIn, double zIn, float red, float green, float blue, float alpha) {
//
//    }
}

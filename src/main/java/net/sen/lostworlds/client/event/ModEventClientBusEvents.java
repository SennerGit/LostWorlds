package net.sen.lostworlds.client.event;

import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.block.entity.ModBlockEntities;
import net.sen.lostworlds.client.entity.layers.ModModelLayers;
import net.sen.lostworlds.client.entity.model.RhinoModel;
import net.sen.lostworlds.entity.ModEntities;
import net.sen.lostworlds.entity.custom.RhinoEntity;
import net.sen.lostworlds.particle.MagicDowsingRodParticles;
import net.sen.lostworlds.particle.ModParticles;

@Mod.EventBusSubscriber(modid = LostWorlds.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
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
}

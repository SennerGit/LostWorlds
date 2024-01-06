package net.sen.lostworlds.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.client.event.CreativeScreenEvents;

public class ClientHandler {
    public static void init(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MinecraftForge.EVENT_BUS.register(new CreativeScreenEvents());
        });
    }

//    @SubscribeEvent
//    public static void onClientSetup(FMLClientSetupEvent event) {
//        event.enqueueWork(() -> {
//            Sheets.addWoodType(ModWoodTypes.ELDER_WOOD);
//
//            ModItemProperties.addCustomItemProperties();
//
//            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_STYX_WATER.get(), RenderType.translucent());
//            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_STYX_WATER.get(), RenderType.translucent());
//
//            MenuScreens.register(ModMenuTypes.ALLOY_SMELTER_MENU.get(), AlloySmelterScreen::new);
//
//            EntityRenderers.register(ModEntities.RHINO.get(), RhinoRenderer::new);
//            EntityRenderers.register(ModEntities.DICE_PROJECTILE.get(), ThrownItemRenderer::new);
//            EntityRenderers.register(ModEntities.MAGIC_GORGAN_PROJECTILE.get(), MagicGorganProjectileRenderer::new);
//        });
//    }

}

package net.sen.lostworlds;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.sen.lostworlds.block.*;
import net.sen.lostworlds.block.entity.*;
import net.sen.lostworlds.client.ClientHandler;
import net.sen.lostworlds.client.util.registry.*;
import net.sen.lostworlds.effect.*;
import net.sen.lostworlds.enchantment.*;
import net.sen.lostworlds.entity.*;
import net.sen.lostworlds.fluid.*;
import net.sen.lostworlds.item.*;
import net.sen.lostworlds.loot.*;
//import net.sen.lostworlds.multiblocks.druid_ritual.ModDruidRituals;
import net.sen.lostworlds.painting.*;
import net.sen.lostworlds.particle.*;
import net.sen.lostworlds.potion.*;
import net.sen.lostworlds.recipe.*;
import net.sen.lostworlds.screen.*;
import net.sen.lostworlds.sound.*;
import net.sen.lostworlds.util.registry.ModCompostables;
import net.sen.lostworlds.util.registry.ModFlowerPots;
import net.sen.lostworlds.villager.*;
import net.sen.lostworlds.villager.custom.dwarven.ModDwarvenVillagers;
import net.sen.lostworlds.worldgen.biome.carver.*;
import net.sen.lostworlds.worldgen.portal.*;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(LostWorldsConstants.MODID)
public class LostWorlds {
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public LostWorlds() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModEnchantments.register(modEventBus);
        ModSounds.register(modEventBus);
        ModLootModifier.register(modEventBus);
        ModPaintings.register(modEventBus);
        ModEffects.register(modEventBus);
        ModPotions.register(modEventBus);
        ModParticles.register(modEventBus);
        ModCarvers.register(modEventBus);
        ModVillagers.register(modEventBus);
        ModPortals.register(modEventBus);
        ModFluidTypes.register(modEventBus);
        ModFluids.register(modEventBus);
        ModMenuTypes.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModRecipes.register(modEventBus);
        ModEntities.register(modEventBus);

        //Custom
//        ModDruidRituals.register(modEventBus);
        ModDwarvenVillagers.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::enqueueIMC);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
//        SyncHandler.init();

        ModPotions.recipe(event);
        ModCompostables.setup(event);
        ModFlowerPots.setup(event);
    }

    private void enqueueIMC(InterModEnqueueEvent event) {
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    //You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = LostWorldsConstants.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
//            DebugInfoHandler.init();
//            HUDOverlayHandler.init();
//            TooltipOverlayHandler.init();

//            event.enqueueWork(ClientHandler::init);

            event.enqueueWork(() -> {
                ModWoodTypesReg.setup(event);
                ModItemProperties.addCustomItemProperties();
                ModItemBlockRendReg.setup(event);
                ModMenuScreenReg.setup(event);
                ModEntityRendReg.setup(event);
                ModEntityRendProjReg.setup(event);
                ClientHandler.init(event);
            });
        }
    }
}

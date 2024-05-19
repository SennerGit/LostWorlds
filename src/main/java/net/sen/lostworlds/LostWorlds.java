package net.sen.lostworlds;

import com.google.common.reflect.Reflection;
import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.NonNullLazy;
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
import net.sen.lostworlds.compat.Compat;
import net.sen.lostworlds.effect.*;
import net.sen.lostworlds.enchantment.*;
import net.sen.lostworlds.entity.*;
import net.sen.lostworlds.fluid.*;
import net.sen.lostworlds.item.*;
import net.sen.lostworlds.loot.*;
import net.sen.lostworlds.multiblocks.ModMultiblocks;
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
import net.sen.lostworlds.worldgen.biome.util.layer.carver.ModCarvers;
import net.sen.lostworlds.worldgen.dimension.biomebuilder.AlfheimrBiomeBuilder;
import net.sen.lostworlds.worldgen.portal.*;
import net.sen.lostworlds.worldgen.tree.custom.foliageplacer.ModFoliagePlacerTypes;
import net.sen.lostworlds.worldgen.tree.custom.trunkplacer.ModTrunkPlacerTypes;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(LostWorldsApi.MODID)
public class LostWorlds {
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public LostWorlds() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        UnderworldItems.register(modEventBus);
        NidavellirItems.register(modEventBus);
        AlfheimrItems.register(modEventBus);
        AtlantisItems.register(modEventBus);
        SkyopiaItems.register(modEventBus);
        ModSpawnEggs.register(modEventBus);
        ModBlocks.register(modEventBus);
        UnderworldBlocks.register(modEventBus);
        AlfheimrBlocks.register(modEventBus);
        NidavellirBlocks.register(modEventBus);
        AtlantisBlocks.register(modEventBus);
        SkyopiaBlocks.register(modEventBus);
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
        UnderworldEntities.register(modEventBus);
        NidavellirEntities.register(modEventBus);
        AlfheimrEntities.register(modEventBus);
        AtlantisEntities.register(modEventBus);
        SkyopiaEntities.register(modEventBus);
        ModTrunkPlacerTypes.register(modEventBus);
        ModFoliagePlacerTypes.register(modEventBus);

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

    private void commonSetup(FMLCommonSetupEvent event) {
//        SyncHandler.init();
        preInit(event);
        init(event);
        postInit(event);
    }

    private void preInit(FMLCommonSetupEvent event) {
        Compat.setup(event);
        new ModMultiblocks();

        Reflection.initialize(
                AlfheimrBiomeBuilder.class
        );
    }

    private void init(FMLCommonSetupEvent event) {
        ModPotions.recipe(event);
        ModCompostables.setup(event);
        ModFlowerPots.setup(event);
    }

    private void postInit(FMLCommonSetupEvent event) {
    }

    private void enqueueIMC(InterModEnqueueEvent event) {
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    //You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = LostWorldsApi.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
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

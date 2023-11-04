package net.sen.lostworlds;

import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.block.ModTileEntityTypes;
import net.sen.lostworlds.block.ModWoodTypes;
import net.sen.lostworlds.block.entity.ModBlockEntities;
import net.sen.lostworlds.client.entity.renderer.MagicGorganProjectileRenderer;
import net.sen.lostworlds.client.entity.renderer.RhinoRenderer;
import net.sen.lostworlds.effect.ModEffects;
import net.sen.lostworlds.enchantment.ModEnchantments;
import net.sen.lostworlds.entity.ModEntities;
import net.sen.lostworlds.fluid.ModFluidTypes;
import net.sen.lostworlds.fluid.ModFluids;
import net.sen.lostworlds.item.ModItemProperties;
import net.sen.lostworlds.item.ModItems;
import net.sen.lostworlds.item.ModCreativeModeTabs;
import net.sen.lostworlds.loot.ModLootModifier;
import net.sen.lostworlds.painting.ModPaintings;
import net.sen.lostworlds.particle.ModParticles;
import net.sen.lostworlds.potion.ModPotions;
import net.sen.lostworlds.recipe.ModRecipes;
import net.sen.lostworlds.screen.alloysmelter.AlloySmelterScreen;
import net.sen.lostworlds.screen.ModMenuTypes;
import net.sen.lostworlds.sound.ModSounds;
import net.sen.lostworlds.villager.ModVillagers;
import net.sen.lostworlds.worldgen.biome.carver.ModCarvers;
import net.sen.lostworlds.worldgen.portal.ModPortals;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(LostWorlds.MODID)
public class LostWorlds {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "lostworlds";
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

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ComposterBlock.COMPOSTABLES.put(ModItems.CRIMSON_APPLE.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(ModItems.POMEGRANATE.get(), 0.35f);
            ComposterBlock.COMPOSTABLES.put(ModItems.POMEGRANATE_SEEDS.get(), 0.20f);

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.IRIS_FLOWER.getId(), ModBlocks.POTTED_IRIS_FLOWER);

        });

        ModPotions.recipe(event);
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    //You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() -> {
                Sheets.addWoodType(ModWoodTypes.ELDER_WOOD);

                ModItemProperties.addCustomItemProperties();

                ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_STYX_WATER.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_STYX_WATER.get(), RenderType.translucent());

                MenuScreens.register(ModMenuTypes.ALLOY_SMELTER_MENU.get(), AlloySmelterScreen::new);

                EntityRenderers.register(ModEntities.RHINO.get(), RhinoRenderer::new);
                EntityRenderers.register(ModEntities.DICE_PROJECTILE.get(), ThrownItemRenderer::new);
                EntityRenderers.register(ModEntities.MAGIC_GORGAN_PROJECTILE.get(), MagicGorganProjectileRenderer::new);
            });
        }
    }
}

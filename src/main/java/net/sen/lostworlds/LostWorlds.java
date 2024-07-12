package net.sen.lostworlds;

import com.google.common.reflect.Reflection;
import com.mojang.logging.LogUtils;
import net.minecraft.DetectedVersion;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.metadata.PackMetadataGenerator;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.metadata.pack.PackMetadataSection;
import net.minecraft.util.InclusiveRange;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;
import net.sen.lostworlds.block.entity.*;
import net.sen.lostworlds.client.LostWorldsClient;
import net.sen.lostworlds.compat.Compat;
import net.sen.lostworlds.datagen.*;
import net.sen.lostworlds.datagen.language.ModLanguageEnUsProvider;
import net.sen.lostworlds.datagen.loottable.ModGlobalLootModifierProvider;
import net.sen.lostworlds.datagen.loottable.ModLootTableProvider;
import net.sen.lostworlds.datagen.recipes.ModRecipeProvider;
import net.sen.lostworlds.datagen.tag.*;
import net.sen.lostworlds.effect.*;
import net.sen.lostworlds.enchantment.*;
import net.sen.lostworlds.entity.*;
import net.sen.lostworlds.fluid.*;
import net.sen.lostworlds.loot.*;
import net.sen.lostworlds.multiblocks.ModMultiblocks;
import net.sen.lostworlds.recipe.*;
import net.sen.lostworlds.registry.*;
import net.sen.lostworlds.registry.blocks.*;
import net.sen.lostworlds.registry.items.*;
import net.sen.lostworlds.screen.*;
import net.sen.lostworlds.sound.*;
import net.sen.lostworlds.util.registry.ModCompostables;
import net.sen.lostworlds.util.registry.ModFlowerPots;
import net.sen.lostworlds.villager.*;
import net.sen.lostworlds.worldgen.biome.util.layer.carver.ModCarvers;
import net.sen.lostworlds.worldgen.dimension.biomebuilder.AlfheimrBiomeBuilder;
import net.sen.lostworlds.api.*;
import net.sen.lostworlds.worldgen.tree.custom.foliageplacer.ModFoliagePlacerTypes;
import net.sen.lostworlds.worldgen.tree.custom.trunkplacer.ModTrunkPlacerTypes;
import org.slf4j.Logger;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(LostWorldsApi.MODID)
public class LostWorlds {
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public LostWorlds(IEventBus eventBus, Dist dist, ModContainer container) {
        if (dist.isClient()) {
            LostWorldsClient.initClientEvents(eventBus);
        }

        ModItems.register(eventBus);
        UnderworldItems.register(eventBus);
        NidavellirItems.register(eventBus);
        AlfheimrItems.register(eventBus);
        AtlantisItems.register(eventBus);
        SkyopiaItems.register(eventBus);
        ModSpawnEggs.register(eventBus);
        ModBlocks.register(eventBus);
        UnderworldBlocks.register(eventBus);
        AlfheimrBlocks.register(eventBus);
        NidavellirBlocks.register(eventBus);
        AtlantisBlocks.register(eventBus);
        SkyopiaBlocks.register(eventBus);
//        ModCreativeModeTabs.register(eventBus);
        ModEnchantments.register(eventBus);
        ModSounds.register(eventBus);
//        ModLootModifier.register(eventBus);
        ModPaintings.register(eventBus);
        ModEffects.register(eventBus);
        ModPotions.register(eventBus);
        ModParticles.register(eventBus);
        ModCarvers.register(eventBus);
        ModVillagers.register(eventBus);
        ModFluids.register(eventBus);
        ModMenuTypes.register(eventBus);
        ModBlockEntities.register(eventBus);
        ModRecipes.register(eventBus);
        ModEntities.register(eventBus);
        UnderworldEntities.register(eventBus);
        NidavellirEntities.register(eventBus);
        AlfheimrEntities.register(eventBus);
        AtlantisEntities.register(eventBus);
        SkyopiaEntities.register(eventBus);
        ModTrunkPlacerTypes.register(eventBus);
        ModFoliagePlacerTypes.register(eventBus);

        //Custom
//        ModDruidRituals.register(modEventBus);
//        ModDwarvenVillagers.register(eventBus);

        container.registerConfig(ModConfig.Type.CLIENT, LostWorldsConfig.CLIENT_SPEC);
        container.registerConfig(ModConfig.Type.COMMON, LostWorldsConfig.COMMON_SPEC);
        container.registerConfig(ModConfig.Type.SERVER, LostWorldsConfig.SERVER_SPEC);

        // Register the commonSetup method for modloading
        eventBus.addListener(this::commonSetup);
        eventBus.addListener(this::registerPackets);
        eventBus.addListener(this::gatherData);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
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
//        ModPotions.recipe(event);
        ModCompostables.setup(event);
        ModFlowerPots.setup(event);

//        LostWorldsPackets.init();
    }

    private void postInit(FMLCommonSetupEvent event) {
    }

    public void registerPackets(RegisterPayloadHandlersEvent event) {
        PayloadRegistrar registrar = event.registrar(LostWorldsApi.MODID).versioned("1.0.0").optional();
//        registrar.playToClient(CreateCritParticlePacket.TYPE)
    }

    private void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> provider = event.getLookupProvider();
        ExistingFileHelper helper = event.getExistingFileHelper();

        addArmorTrims(helper);

        //Server
//        generator.addProvider(event.includeServer(), new ModRecipeProvider(output, event.getLookupProvider()));
//        generator.addProvider(event.includeServer(), new ModAdvancementsProvider(generator, provider, helper));

        //Client
        generator.addProvider(event.includeClient(), new ModBlockModelProvider(output, helper));
        generator.addProvider(event.includeClient(), new ModItemModelProvider(output, helper));
        generator.addProvider(event.includeClient(), new ModBlockStateProvider(output, helper));
        generator.addProvider(event.includeClient(), new ModGlobalLootModifierProvider(output, event.getLookupProvider()));
        generator.addProvider(event.includeClient(), new ModSoundProvider(output, helper));

        //Datapack Stuff
        DatapackBuiltinEntriesProvider datapackProvider = new ModRegistriesProvider(output, provider);
        CompletableFuture<HolderLookup.Provider> lookupProvider = datapackProvider.getRegistryProvider();
        generator.addProvider(event.includeServer(), datapackProvider);
        generator.addProvider(event.includeServer(), new ModLootTableProvider(output, lookupProvider));

        BlockTagsProvider blockTagsProvider = new ModBlockTagGenerator(output, provider, helper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new ModItemTagGenerator(output, lookupProvider, blockTagsProvider.contentsGetter(), helper));
        generator.addProvider(event.includeServer(), new ModCreativeTabsTagProvider(output, lookupProvider, blockTagsProvider.contentsGetter(), helper));
        generator.addProvider(event.includeServer(), new ModPaintingVariantTagProvider(output, lookupProvider, helper));
        generator.addProvider(event.includeServer(), new ModPoiTypeTagProvider(output, lookupProvider, helper));
        generator.addProvider(event.includeServer(), new ModFluidTagsProvider(output, lookupProvider, helper));
        generator.addProvider(event.includeServer(), new ModBiomeTagProvider(output, lookupProvider, helper));

        //Language
        generator.addProvider(event.includeClient(), new ModLanguageEnUsProvider(output, "en_us"));

        generator.addProvider(true, new PackMetadataGenerator(output).add(PackMetadataSection.TYPE, new PackMetadataSection(
                Component.literal("Lost Worlds Resources"),
                DetectedVersion.BUILT_IN.getPackVersion(PackType.SERVER_DATA),
                Optional.of(new InclusiveRange<>(0, Integer.MAX_VALUE))
        )));
    }

    private static void addArmorTrims(ExistingFileHelper helper) {
        addTrimToArmor(helper, "boots_trim_");
        addTrimToArmor(helper, "chestplate_trim_");
        addTrimToArmor(helper, "helmet_trim_");
        addTrimToArmor(helper, "leggings_trim_");
    }

    private static void addTrimToArmor(ExistingFileHelper helper, String armorPiece) {
        helper.trackGenerated(LostWorldsApi.mcLoc(armorPiece + TrimMaterials.QUARTZ.location().getPath()), PackType.CLIENT_RESOURCES, ".png", "textures/trims/items");
        helper.trackGenerated(LostWorldsApi.mcLoc(armorPiece + TrimMaterials.IRON.location().getPath()), PackType.CLIENT_RESOURCES, ".png", "textures/trims/items");
        helper.trackGenerated(LostWorldsApi.mcLoc(armorPiece + TrimMaterials.NETHERITE.location().getPath()), PackType.CLIENT_RESOURCES, ".png", "textures/trims/items");
        helper.trackGenerated(LostWorldsApi.mcLoc(armorPiece + TrimMaterials.REDSTONE.location().getPath()), PackType.CLIENT_RESOURCES, ".png", "textures/trims/items");
        helper.trackGenerated(LostWorldsApi.mcLoc(armorPiece + TrimMaterials.COPPER.location().getPath()), PackType.CLIENT_RESOURCES, ".png", "textures/trims/items");
        helper.trackGenerated(LostWorldsApi.mcLoc(armorPiece + TrimMaterials.GOLD.location().getPath()), PackType.CLIENT_RESOURCES, ".png", "textures/trims/items");
        helper.trackGenerated(LostWorldsApi.mcLoc(armorPiece + TrimMaterials.EMERALD.location().getPath()), PackType.CLIENT_RESOURCES, ".png", "textures/trims/items");
        helper.trackGenerated(LostWorldsApi.mcLoc(armorPiece + TrimMaterials.DIAMOND.location().getPath()), PackType.CLIENT_RESOURCES, ".png", "textures/trims/items");
        helper.trackGenerated(LostWorldsApi.mcLoc(armorPiece + TrimMaterials.LAPIS.location().getPath()), PackType.CLIENT_RESOURCES, ".png", "textures/trims/items");
        helper.trackGenerated(LostWorldsApi.mcLoc(armorPiece + TrimMaterials.AMETHYST.location().getPath()), PackType.CLIENT_RESOURCES, ".png", "textures/trims/items");
    }
}

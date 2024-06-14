package net.sen.lostworlds.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.datagen.language.ModLanguageEnUsProvider;
//import net.sen.lostworlds.datagen.modonomicon.ModBookProvider;
import net.sen.lostworlds.datagen.loottable.*;
import net.sen.lostworlds.datagen.recipes.ModRecipeProvider;
import net.sen.lostworlds.datagen.tag.*;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = LostWorldsApi.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> provider = event.getLookupProvider();

        addArmorTrims(existingFileHelper);

        //Server
        generator.addProvider(event.includeServer(), new ModRecipeProvider(packOutput));
        generator.addProvider(event.includeServer(), new ModLootTableProvider(packOutput));
        generator.addProvider(event.includeServer(), new ModAdvancementsProvider(generator, provider, existingFileHelper));

        //Client
        generator.addProvider(event.includeClient(), new ModBlockModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModGlobalLootModifierProvider(packOutput));
        generator.addProvider(event.includeClient(), new ModSoundProvider(packOutput, existingFileHelper));

        //Datapack Stuff
        DatapackBuiltinEntriesProvider datapackProvider = new ModRegistriesProvider(packOutput, provider);
        CompletableFuture<HolderLookup.Provider> lookupProvider = datapackProvider.getRegistryProvider();
        generator.addProvider(event.includeServer(), datapackProvider);

        BlockTagsProvider blockTagsProvider = new ModBlockTagGenerator(packOutput, provider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new ModItemTagGenerator(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new ModCreativeTabsTagProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new ModPaintingVariantTagProvider(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new ModPoiTypeTagProvider(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new ModFluidTagsProvider(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new ModBiomeTagProvider(packOutput, lookupProvider, existingFileHelper));

        //Language
        generator.addProvider(event.includeClient(), new ModLanguageEnUsProvider(packOutput, "en_us"));
    }

    private static void addArmorTrims(ExistingFileHelper existingFileHelper) {
        addTrimToArmor(existingFileHelper, "boots_trim_");
        addTrimToArmor(existingFileHelper, "chestplate_trim_");
        addTrimToArmor(existingFileHelper, "helmet_trim_");
        addTrimToArmor(existingFileHelper, "leggings_trim_");
    }

    private static void addTrimToArmor(ExistingFileHelper existingFileHelper, String armorPiece) {
        existingFileHelper.trackGenerated(new ResourceLocation(armorPiece + TrimMaterials.QUARTZ.location().getPath()), PackType.CLIENT_RESOURCES, ".png", "textures/trims/items");
        existingFileHelper.trackGenerated(new ResourceLocation(armorPiece + TrimMaterials.IRON.location().getPath()), PackType.CLIENT_RESOURCES, ".png", "textures/trims/items");
        existingFileHelper.trackGenerated(new ResourceLocation(armorPiece + TrimMaterials.NETHERITE.location().getPath()), PackType.CLIENT_RESOURCES, ".png", "textures/trims/items");
        existingFileHelper.trackGenerated(new ResourceLocation(armorPiece + TrimMaterials.REDSTONE.location().getPath()), PackType.CLIENT_RESOURCES, ".png", "textures/trims/items");
        existingFileHelper.trackGenerated(new ResourceLocation(armorPiece + TrimMaterials.COPPER.location().getPath()), PackType.CLIENT_RESOURCES, ".png", "textures/trims/items");
        existingFileHelper.trackGenerated(new ResourceLocation(armorPiece + TrimMaterials.GOLD.location().getPath()), PackType.CLIENT_RESOURCES, ".png", "textures/trims/items");
        existingFileHelper.trackGenerated(new ResourceLocation(armorPiece + TrimMaterials.EMERALD.location().getPath()), PackType.CLIENT_RESOURCES, ".png", "textures/trims/items");
        existingFileHelper.trackGenerated(new ResourceLocation(armorPiece + TrimMaterials.DIAMOND.location().getPath()), PackType.CLIENT_RESOURCES, ".png", "textures/trims/items");
        existingFileHelper.trackGenerated(new ResourceLocation(armorPiece + TrimMaterials.LAPIS.location().getPath()), PackType.CLIENT_RESOURCES, ".png", "textures/trims/items");
        existingFileHelper.trackGenerated(new ResourceLocation(armorPiece + TrimMaterials.AMETHYST.location().getPath()), PackType.CLIENT_RESOURCES, ".png", "textures/trims/items");
    }
}

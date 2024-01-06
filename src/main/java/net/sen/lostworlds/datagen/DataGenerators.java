package net.sen.lostworlds.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.datagen.language.ModLanguageEnUsProvider;
import net.sen.lostworlds.datagen.modonomicon.ModBookProvider;
import net.sen.lostworlds.datagen.loottable.ModGlobalLootModifierProvider;
import net.sen.lostworlds.datagen.loottable.ModLootTableProvider;
import net.sen.lostworlds.datagen.multiblocks.DruidRitualProvider;
import net.sen.lostworlds.datagen.tag.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = LostWorldsConstants.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookUpProvider = event.getLookupProvider();
        addArmorTrims(existingFileHelper);

        generator.addProvider(event.includeServer(), new ModRecipeProvider(packOutput));
        generator.addProvider(event.includeServer(), new ModLootTableProvider(packOutput));

        BlockTagsProvider blockTagsProvider = new ModBlockTagGenerator(packOutput, lookUpProvider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new ModItemTagGenerator(packOutput, lookUpProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new ModCreativeTabsTagProvider(packOutput, lookUpProvider, blockTagsProvider.contentsGetter(), existingFileHelper));

        generator.addProvider(event.includeClient(), new ModBlockModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModSoundProvider(packOutput, existingFileHelper));

        generator.addProvider(event.includeClient(), new ModGlobalLootModifierProvider(packOutput));

        generator.addProvider(event.includeClient(), new ModPaintingVariantTagProvider(packOutput, lookUpProvider, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModPoiTypeTagProvider(packOutput, lookUpProvider, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModFluidTagsProvider(packOutput, lookUpProvider, existingFileHelper));

        generator.addProvider(event.includeClient(), new ForgeAdvancementProvider(packOutput, lookUpProvider, existingFileHelper, List.of(new ModAdvancementsProvider())));

        generator.addProvider(event.includeServer(), new ModWorldGenProvider(packOutput, lookUpProvider));

        LanguageProvider enusProvider = new ModLanguageEnUsProvider(packOutput, "en_us");
        generator.addProvider(event.includeClient(), enusProvider);
        generator.addProvider(event.includeServer(), new ModBookProvider(packOutput, enusProvider));

        generator.addProvider(event.includeServer(), new DruidRitualProvider(generator));
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

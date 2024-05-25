package net.sen.lostworlds.datagen.tag;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.tags.BiomeTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.util.ModTags;
import net.sen.lostworlds.worldgen.biome.util.layer.AlfheimrBiomes;
import net.sen.lostworlds.worldgen.biome.util.layer.AtlantisBiomes;
import net.sen.lostworlds.worldgen.biome.util.layer.NidavellirBiomes;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBiomeTagProvider extends BiomeTagsProvider {
    public ModBiomeTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> future, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, future, LostWorldsApi.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
//        super.addTags(pProvider);

        tag(Tags.Biomes.IS_WATER)
                .addTag(ModTags.Biomes.IS_ALFHEIMR_OCEAN)
                .addTag(ModTags.Biomes.IS_ALFHEIMR_DEEP_OCEAN)
                .add(
                    AtlantisBiomes.ATLANTIS_OCEAN
        );

        tag(BiomeTags.PLAYS_UNDERWATER_MUSIC)
                .addTag(ModTags.Biomes.IS_ALFHEIMR_OCEAN)
                .addTag(ModTags.Biomes.IS_ALFHEIMR_DEEP_OCEAN)
                .add(
                    AtlantisBiomes.ATLANTIS_OCEAN
        );

        tag(BiomeTags.WATER_ON_MAP_OUTLINES)
                .addTag(ModTags.Biomes.IS_ALFHEIMR_OCEAN)
                .addTag(ModTags.Biomes.IS_ALFHEIMR_DEEP_OCEAN)
                .add(
                    AtlantisBiomes.ATLANTIS_OCEAN
        );

        tag(ModTags.Biomes.IS_ALFHEIMR).add(
                AlfheimrBiomes.ALFHEIMR_FROZEN_OCEAN,
                AlfheimrBiomes.ALFHEIMR_DEEP_FROZEN_OCEAN,
                AlfheimrBiomes.ALFHEIMR_COLD_OCEAN,
                AlfheimrBiomes.ALFHEIMR_DEEP_COLD_OCEAN,
                AlfheimrBiomes.ALFHEIMR_OCEAN,
                AlfheimrBiomes.ALFHEIMR_DEEP_OCEAN,
                AlfheimrBiomes.ALFHEIMR_LUKEWARM_OCEAN,
                AlfheimrBiomes.ALFHEIMR_DEEP_LUKEWARM_OCEAN,
                AlfheimrBiomes.ALFHEIMR_WARM_OCEAN,
                AlfheimrBiomes.ALFHEIMR_DEEP_WARM_OCEAN,
                AlfheimrBiomes.ALFHEIMR_FROZEN_CORRUPTION_OCEAN,
                AlfheimrBiomes.ALFHEIMR_DEEP_FROZEN_CORRUPTION_OCEAN,
                AlfheimrBiomes.ALFHEIMR_COLD_CORRUPTION_OCEAN,
                AlfheimrBiomes.ALFHEIMR_DEEP_COLD_CORRUPTION_OCEAN,
                AlfheimrBiomes.ALFHEIMR_CORRUPTION_OCEAN,
                AlfheimrBiomes.ALFHEIMR_DEEP_CORRUPTION_OCEAN,
                AlfheimrBiomes.ALFHEIMR_LUKEWARM_CORRUPTION_OCEAN,
                AlfheimrBiomes.ALFHEIMR_DEEP_LUKEWARM_CORRUPTION_OCEAN,
                AlfheimrBiomes.ALFHEIMR_WARM_CORRUPTION_OCEAN,
                AlfheimrBiomes.ALFHEIMR_DEEP_WARM_CORRUPTION_OCEAN,
                AlfheimrBiomes.ALFHEIMR_FROZEN_CURSED_OCEAN,
                AlfheimrBiomes.ALFHEIMR_DEEP_FROZEN_CURSED_OCEAN,
                AlfheimrBiomes.ALFHEIMR_COLD_CURSED_OCEAN,
                AlfheimrBiomes.ALFHEIMR_DEEP_COLD_CURSED_OCEAN,
                AlfheimrBiomes.ALFHEIMR_CURSED_OCEAN,
                AlfheimrBiomes.ALFHEIMR_DEEP_CURSED_OCEAN,
                AlfheimrBiomes.ALFHEIMR_LUKEWARM_CURSED_OCEAN,
                AlfheimrBiomes.ALFHEIMR_DEEP_LUKEWARM_CURSED_OCEAN,
                AlfheimrBiomes.ALFHEIMR_WARM_CURSED_OCEAN,
                AlfheimrBiomes.ALFHEIMR_DEEP_WARM_CURSED_OCEAN,
                AlfheimrBiomes.ALFHEIMR_FROZEN_ENCHANTED_OCEAN,
                AlfheimrBiomes.ALFHEIMR_DEEP_FROZEN_ENCHANTED_OCEAN,
                AlfheimrBiomes.ALFHEIMR_COLD_ENCHANTED_OCEAN,
                AlfheimrBiomes.ALFHEIMR_DEEP_COLD_ENCHANTED_OCEAN,
                AlfheimrBiomes.ALFHEIMR_ENCHANTED_OCEAN,
                AlfheimrBiomes.ALFHEIMR_DEEP_ENCHANTED_OCEAN,
                AlfheimrBiomes.ALFHEIMR_LUKEWARM_ENCHANTED_OCEAN,
                AlfheimrBiomes.ALFHEIMR_DEEP_LUKEWARM_ENCHANTED_OCEAN,
                AlfheimrBiomes.ALFHEIMR_WARM_ENCHANTED_OCEAN,
                AlfheimrBiomes.ALFHEIMR_DEEP_WARM_ENCHANTED_OCEAN,
                AlfheimrBiomes.ALFHEIMR_HOLLOW_HILLS,
                AlfheimrBiomes.ALFHEIMR_SKY_PEAKS,
                AlfheimrBiomes.ALFHEIMR_STONY_HOLLOW,
                AlfheimrBiomes.ALFHEIMR_STONY_PEAKS,
                AlfheimrBiomes.ALFHEIMR_LOST_HILLS,
                AlfheimrBiomes.ALFHEIMR_KINGDOM_HILLS,
                AlfheimrBiomes.ALFHEIMR_DEADMAN_CLIFFS,
                AlfheimrBiomes.ALFHEIMR_SNOW_PEAKS,
                AlfheimrBiomes.ALFHEIMR_FROZEN_PEAKS,
                AlfheimrBiomes.ALFHEIMR_SNOW_GROVE,
                AlfheimrBiomes.ALFHEIMR_FROZEN_GROVE,
                AlfheimrBiomes.ALFHEIMR_CRYSTAL_CLIFFS,
                AlfheimrBiomes.ALFHEIMR_CRYSTAL_PEAKS,
                AlfheimrBiomes.ALFHEIMR_CORRUPTION_MOUNTAIN,
                AlfheimrBiomes.ALFHEIMR_CORRUPTION_GROVE,
                AlfheimrBiomes.ALFHEIMR_CORRUPTION_PEAKS,
                AlfheimrBiomes.ALFHEIMR_CORRUPTION_CLIFFS,
                AlfheimrBiomes.ALFHEIMR_FOREST,
                AlfheimrBiomes.ALFHEIMR_DENSE_FOREST,
                AlfheimrBiomes.ALFHEIMR_ENCHANTED_FOREST,
                AlfheimrBiomes.ALFHEIMR_DENSE_ENCHANTED_FOREST,
                AlfheimrBiomes.ALFHEIMR_DARK_ENCHANTED_FOREST,
                AlfheimrBiomes.ALFHEIMR_CRYSTALLISED_FOREST,
                AlfheimrBiomes.ALFHEIMR_DENSE_CRYSTALLISED_FOREST,
                AlfheimrBiomes.ALFHEIMR_FAIRY_HILLS,
                AlfheimrBiomes.ALFHEIMR_GLISTENING_FORESTS,
                AlfheimrBiomes.ALFHEIMR_HAUNTED_FORESTS,
                AlfheimrBiomes.ALFHEIMR_JUNGLE,
                AlfheimrBiomes.ALFHEIMR_CURSED_JUNGLE,
                AlfheimrBiomes.ALFHEIMR_SNOW_FOREST,
                AlfheimrBiomes.ALFHEIMR_FROZEN_JUNGLE,
                AlfheimrBiomes.ALFHEIMR_MUSHROOM_FOREST,
                AlfheimrBiomes.ALFHEIMR_DENSE_MUSHROOM_FOREST,
                AlfheimrBiomes.ALFHEIMR_FAIRY_RINGS,
                AlfheimrBiomes.ALFHEIMR_CORRUPTION_FOREST,
                AlfheimrBiomes.ALFHEIMR_CORRUPTION_CRYSTAL_FOREST,
                AlfheimrBiomes.ALFHEIMR_MAGIC_VALLEY,
                AlfheimrBiomes.ALFHEIMR_TROPICS,
                AlfheimrBiomes.ALFHEIMR_MAGIC_TROPICS,
                AlfheimrBiomes.ALFHEIMR_CRYSTAL_SPRING,
                AlfheimrBiomes.ALFHEIMR_RIVER,
                AlfheimrBiomes.ALFHEIMR_FROZEN_RIVER,
                AlfheimrBiomes.ALFHEIMR_STREAM,
                AlfheimrBiomes.ALFHEIMR_LAKE,
                AlfheimrBiomes.ALFHEIMR_SWAMP,
                AlfheimrBiomes.ALFHEIMR_MEADOWS,
                AlfheimrBiomes.ALFHEIMR_LOST_SWAMP,
                AlfheimrBiomes.ALFHEIMR_BEACH,
                AlfheimrBiomes.ALFHEIMR_FROZEN_BEACH,
                AlfheimrBiomes.ALFHEIMR_STONY_SHORE,
                AlfheimrBiomes.ALFHEIMR_CRYSTAL_SHORE,
                AlfheimrBiomes.ALFHEIMR_CORRUPTION_SHORE,
                AlfheimrBiomes.ALFHEIMR_PLAINS,
                AlfheimrBiomes.ALFHEIMR_CRYSTAL_PLAINS,
                AlfheimrBiomes.ALFHEIMR_FLOWER_PLAINS,
                AlfheimrBiomes.ALFHEIMR_MYSTICAL_PLAINS,
                AlfheimrBiomes.ALFHEIMR_SNOWY_PLAINS,
                AlfheimrBiomes.ALFHEIMR_CORRUPTION,
                AlfheimrBiomes.ALFHEIMR_CORRUPTION_SNOWY_PLAINS,
                AlfheimrBiomes.ALFHEIMR_DESERT,
                AlfheimrBiomes.ALFHEIMR_CRYSTAL_DESERT,
                AlfheimrBiomes.ALFHEIMR_DRAGOON_DESERT,
                AlfheimrBiomes.ALFHEIMR_SAVANNA,
                AlfheimrBiomes.ALFHEIMR_MYSTICAL_SAVANNA,
                AlfheimrBiomes.ALFHEIMR_DRY_RAVINE,
                AlfheimrBiomes.ALFHEIMR_WASTELAND,
                AlfheimrBiomes.ALFHEIMR_WASTELAND_DRY_RAVINE,
                AlfheimrBiomes.ALFHEIMR_WASTELAND_PEAKS,
                AlfheimrBiomes.ALFHEIMR_WASTELAND_CRYSTAL,
                AlfheimrBiomes.ALFHEIMR_BADLANDS,
                AlfheimrBiomes.ALFHEIMR_CORRUPTED_BADLANDS,
                AlfheimrBiomes.ALFHEIMR_CRYSTAL_CAVERN,
                AlfheimrBiomes.ALFHEIMR_OVERGROWN_CAVERN,
                AlfheimrBiomes.ALFHEIMR_CORRUPTED_CAVERN
        );

        tag(ModTags.Biomes.IS_ALFHEIMR_OCEAN).add(
                AlfheimrBiomes.ALFHEIMR_FROZEN_OCEAN,
                AlfheimrBiomes.ALFHEIMR_COLD_OCEAN,
                AlfheimrBiomes.ALFHEIMR_OCEAN,
                AlfheimrBiomes.ALFHEIMR_LUKEWARM_OCEAN,
                AlfheimrBiomes.ALFHEIMR_WARM_OCEAN
        );

        tag(ModTags.Biomes.IS_ALFHEIMR_BADLANDS).add(
                AlfheimrBiomes.ALFHEIMR_BADLANDS,
                AlfheimrBiomes.ALFHEIMR_CORRUPTED_BADLANDS,
                AlfheimrBiomes.ALFHEIMR_DRY_RAVINE,
                AlfheimrBiomes.ALFHEIMR_WASTELAND,
                AlfheimrBiomes.ALFHEIMR_WASTELAND_DRY_RAVINE,
                AlfheimrBiomes.ALFHEIMR_WASTELAND_PEAKS,
                AlfheimrBiomes.ALFHEIMR_WASTELAND_CRYSTAL
        );

        tag(ModTags.Biomes.IS_ALFHEIMR_BEACH).add(
                AlfheimrBiomes.ALFHEIMR_BEACH,
                AlfheimrBiomes.ALFHEIMR_FROZEN_BEACH,
                AlfheimrBiomes.ALFHEIMR_STONY_SHORE,
                AlfheimrBiomes.ALFHEIMR_CRYSTAL_SHORE,
                AlfheimrBiomes.ALFHEIMR_CORRUPTION_SHORE
        );

        tag(ModTags.Biomes.IS_ALFHEIMR_DEEP_OCEAN).add(
                AlfheimrBiomes.ALFHEIMR_DEEP_FROZEN_OCEAN,
                AlfheimrBiomes.ALFHEIMR_DEEP_COLD_OCEAN,
                AlfheimrBiomes.ALFHEIMR_DEEP_OCEAN,
                AlfheimrBiomes.ALFHEIMR_DEEP_LUKEWARM_OCEAN,
                AlfheimrBiomes.ALFHEIMR_DEEP_WARM_OCEAN
        );

        tag(ModTags.Biomes.IS_ALFHEIMR_FOREST).add(
                AlfheimrBiomes.ALFHEIMR_FOREST,
                AlfheimrBiomes.ALFHEIMR_DENSE_FOREST,
                AlfheimrBiomes.ALFHEIMR_ENCHANTED_FOREST,
                AlfheimrBiomes.ALFHEIMR_DENSE_ENCHANTED_FOREST,
                AlfheimrBiomes.ALFHEIMR_DARK_ENCHANTED_FOREST,
                AlfheimrBiomes.ALFHEIMR_FAIRY_HILLS,
                AlfheimrBiomes.ALFHEIMR_GLISTENING_FORESTS,
                AlfheimrBiomes.ALFHEIMR_SNOW_FOREST,
                AlfheimrBiomes.ALFHEIMR_CORRUPTION_FOREST,
                AlfheimrBiomes.ALFHEIMR_CORRUPTION_CRYSTAL_FOREST,
                AlfheimrBiomes.ALFHEIMR_MAGIC_VALLEY,
                AlfheimrBiomes.ALFHEIMR_HAUNTED_FORESTS
                );

        tag(ModTags.Biomes.IS_ALFHEIMR_CRYSTAL_FOREST).add(
                AlfheimrBiomes.ALFHEIMR_CRYSTALLISED_FOREST,
                AlfheimrBiomes.ALFHEIMR_DENSE_CRYSTALLISED_FOREST
                );

        tag(ModTags.Biomes.IS_ALFHEIMR_MUSHROOM_FOREST).add(
                AlfheimrBiomes.ALFHEIMR_MUSHROOM_FOREST,
                AlfheimrBiomes.ALFHEIMR_DENSE_MUSHROOM_FOREST,
                AlfheimrBiomes.ALFHEIMR_FAIRY_RINGS
                );

        tag(ModTags.Biomes.IS_ALFHEIMR_JUNGLE).add(
                AlfheimrBiomes.ALFHEIMR_JUNGLE,
                AlfheimrBiomes.ALFHEIMR_CURSED_JUNGLE,
                AlfheimrBiomes.ALFHEIMR_TROPICS,
                AlfheimrBiomes.ALFHEIMR_MAGIC_TROPICS,
                AlfheimrBiomes.ALFHEIMR_FROZEN_JUNGLE
                );

        tag(ModTags.Biomes.IS_ALFHEIMR_MOUNTAIN).add(
                AlfheimrBiomes.ALFHEIMR_HOLLOW_HILLS,
                AlfheimrBiomes.ALFHEIMR_SKY_PEAKS,
                AlfheimrBiomes.ALFHEIMR_STONY_HOLLOW,
                AlfheimrBiomes.ALFHEIMR_STONY_PEAKS,
                AlfheimrBiomes.ALFHEIMR_LOST_HILLS,
                AlfheimrBiomes.ALFHEIMR_KINGDOM_HILLS,
                AlfheimrBiomes.ALFHEIMR_DEADMAN_CLIFFS,
                AlfheimrBiomes.ALFHEIMR_SNOW_PEAKS,
                AlfheimrBiomes.ALFHEIMR_FROZEN_PEAKS,
                AlfheimrBiomes.ALFHEIMR_SNOW_GROVE,
                AlfheimrBiomes.ALFHEIMR_FROZEN_GROVE,
                AlfheimrBiomes.ALFHEIMR_CRYSTAL_CLIFFS,
                AlfheimrBiomes.ALFHEIMR_CRYSTAL_PEAKS,
                AlfheimrBiomes.ALFHEIMR_CORRUPTION_MOUNTAIN,
                AlfheimrBiomes.ALFHEIMR_CORRUPTION_GROVE,
                AlfheimrBiomes.ALFHEIMR_CORRUPTION_PEAKS,
                AlfheimrBiomes.ALFHEIMR_CORRUPTION_CLIFFS,
                AlfheimrBiomes.ALFHEIMR_CORRUPTION_CLIFFS
                );

        tag(ModTags.Biomes.IS_ALFHEIMR_RIVER).add(
                AlfheimrBiomes.ALFHEIMR_RIVER,
                AlfheimrBiomes.ALFHEIMR_STREAM,
                AlfheimrBiomes.ALFHEIMR_LAKE,
                AlfheimrBiomes.ALFHEIMR_DRY_RAVINE,
                AlfheimrBiomes.ALFHEIMR_WASTELAND_DRY_RAVINE,
                AlfheimrBiomes.ALFHEIMR_FROZEN_RIVER
        );

        tag(ModTags.Biomes.IS_ALFHEIMR_SAVANNA).add(
                AlfheimrBiomes.ALFHEIMR_SAVANNA,
                AlfheimrBiomes.ALFHEIMR_MYSTICAL_SAVANNA
        );

        tag(ModTags.Biomes.IS_ALFHEIMR_DESERT).add(
                AlfheimrBiomes.ALFHEIMR_DESERT,
                AlfheimrBiomes.ALFHEIMR_CRYSTAL_DESERT,
                AlfheimrBiomes.ALFHEIMR_DRAGOON_DESERT
        );

        tag(ModTags.Biomes.IS_ALFHEIMR_FLAT_LANDS).add(
                AlfheimrBiomes.ALFHEIMR_PLAINS,
                AlfheimrBiomes.ALFHEIMR_FLOWER_PLAINS,
                AlfheimrBiomes.ALFHEIMR_MYSTICAL_PLAINS,
                AlfheimrBiomes.ALFHEIMR_SNOWY_PLAINS,
                AlfheimrBiomes.ALFHEIMR_CORRUPTION,
                AlfheimrBiomes.ALFHEIMR_CORRUPTION_SNOWY_PLAINS
        );

        tag(ModTags.Biomes.IS_ALFHEIMR_SWAMP).add(
                AlfheimrBiomes.ALFHEIMR_SWAMP,
                AlfheimrBiomes.ALFHEIMR_MEADOWS,
                AlfheimrBiomes.ALFHEIMR_LOST_SWAMP
        );

        tag(ModTags.Biomes.HAS_GRAVE).addTags(
                ModTags.Biomes.IS_ALFHEIMR_BEACH,
                ModTags.Biomes.IS_ALFHEIMR_BADLANDS,
                ModTags.Biomes.IS_ALFHEIMR_DESERT,
                ModTags.Biomes.IS_ALFHEIMR_CRYSTAL_FOREST,
                ModTags.Biomes.IS_ALFHEIMR_FLAT_LANDS,
                ModTags.Biomes.IS_ALFHEIMR_FOREST,
//                ModTags.Biomes.IS_ALFHEIMR_HILL,
                ModTags.Biomes.IS_ALFHEIMR_JUNGLE,
                ModTags.Biomes.IS_ALFHEIMR_MOUNTAIN,
                ModTags.Biomes.IS_ALFHEIMR_MUSHROOM_FOREST,
                ModTags.Biomes.IS_ALFHEIMR_SAVANNA,
                ModTags.Biomes.IS_ALFHEIMR_SWAMP
        );

        tag(ModTags.Biomes.HAS_STONEHENGE).addTags(
                ModTags.Biomes.IS_ALFHEIMR_BEACH,
                ModTags.Biomes.IS_ALFHEIMR_BADLANDS,
                ModTags.Biomes.IS_ALFHEIMR_DESERT,
                ModTags.Biomes.IS_ALFHEIMR_CRYSTAL_FOREST,
                ModTags.Biomes.IS_ALFHEIMR_FLAT_LANDS,
                ModTags.Biomes.IS_ALFHEIMR_FOREST,
//                ModTags.Biomes.IS_ALFHEIMR_HILL,
                ModTags.Biomes.IS_ALFHEIMR_JUNGLE,
                ModTags.Biomes.IS_ALFHEIMR_MOUNTAIN,
                ModTags.Biomes.IS_ALFHEIMR_MUSHROOM_FOREST,
                ModTags.Biomes.IS_ALFHEIMR_SAVANNA,
                ModTags.Biomes.IS_ALFHEIMR_SWAMP
        );

        tag(ModTags.Biomes.HAS_ELVEN_VILLAGE_ENCHANTED_FOREST).addTags(
                ModTags.Biomes.IS_ALFHEIMR_FOREST
        );

        tag(ModTags.Biomes.HAS_DWARVEN_FORTRESS).add(
                NidavellirBiomes.NIDAVELLIR_CAVERN
        );
    }

    @Override
    public String getName() {
        return "Lostworlds Biome Tags";
    }
}

package net.sen.lostworlds.datagen.tag;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.tags.BiomeTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.worldgen.biome.util.layer.AlfheimrBiomes;
import net.sen.lostworlds.worldgen.biome.util.layer.AtlantisBiomes;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBiomeTagProvider extends BiomeTagsProvider {
    public ModBiomeTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> future, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, future, LostWorldsApi.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        super.addTags(pProvider);

        this.tag(Tags.Biomes.IS_WATER).add(
                AtlantisBiomes.ATLANTIS_OCEAN,
                AlfheimrBiomes.ALFHEIMR_OCEAN
        );

        this.tag(BiomeTags.PLAYS_UNDERWATER_MUSIC).add(
                AtlantisBiomes.ATLANTIS_OCEAN,
                AlfheimrBiomes.ALFHEIMR_OCEAN
        );

        this.tag(BiomeTags.WATER_ON_MAP_OUTLINES).add(
                AtlantisBiomes.ATLANTIS_OCEAN,
                AlfheimrBiomes.ALFHEIMR_OCEAN
        );
    }

    @Override
    public String getName() {
        return "Lostworlds Biome Tags";
    }
}

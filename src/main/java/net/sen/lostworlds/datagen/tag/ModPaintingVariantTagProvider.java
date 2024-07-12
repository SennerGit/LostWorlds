package net.sen.lostworlds.datagen.tag;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.PaintingVariantTagsProvider;
import net.minecraft.tags.PaintingVariantTags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.registry.ModPaintings;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModPaintingVariantTagProvider extends PaintingVariantTagsProvider {
    public ModPaintingVariantTagProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, LostWorldsApi.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(PaintingVariantTags.PLACEABLE)
                .addOptional(LostWorldsApi.modLoc(ModPaintings.SAW_THEM.getId().getPath()))
                .addOptional(LostWorldsApi.modLoc(ModPaintings.SHRIMP.getId().getPath()))
                .addOptional(LostWorldsApi.modLoc(ModPaintings.WORLD.getId().getPath()))
        ;
    }
}

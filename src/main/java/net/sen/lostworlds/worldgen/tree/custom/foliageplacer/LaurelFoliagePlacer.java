package net.sen.lostworlds.worldgen.tree.custom.foliageplacer;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;

public class LaurelFoliagePlacer extends FoliagePlacer {
    public static final Codec<LaurelFoliagePlacer> CODEC = RecordCodecBuilder.create((instance) -> foliagePlacerParts(instance)
                    .and(IntProvider.codec(0, 16).fieldOf("trunk_height").forGetter((placer) -> placer.trunk_height))
                    .apply(instance, LaurelFoliagePlacer::new));

    private final IntProvider trunk_height;

    public LaurelFoliagePlacer(IntProvider pRadius, IntProvider pOffset, IntProvider height) {
        super(pRadius, pOffset);
        this.trunk_height = height;
    }

    @Override
    protected FoliagePlacerType<?> type() {
        return ModFoliagePlacerTypes.LAUREL_FOLIAGE_PLACER.get();
    }

    @Override
    protected void createFoliage(LevelSimulatedReader pLevel, FoliageSetter foliageSetter, RandomSource pRandom, TreeConfiguration pConfig, int maxFreeTreeHeight, FoliageAttachment attachment, int foliageHeight, int foliageRadius, int offset) {
        // Creating the foliage
        // attachment.pos() is the first position ABOVE the last places log

        // tryPlaceLeaf() // places one leave at given position!
        for(int i = offset; i >= offset - foliageHeight; --i) {
            this.placeLeavesRow(pLevel, foliageSetter, pRandom, pConfig, attachment.pos(), 4, i, attachment.doubleTrunk());
        }
    }

    @Override
    public int foliageHeight(RandomSource pRandom, int pHeight, TreeConfiguration pConfig) {
        return this.trunk_height.getMaxValue();
    }

    @Override
    protected boolean shouldSkipLocation(RandomSource pRandom, int pLocalX, int pLocalY, int pLocalZ, int pRange, boolean pLarge) {
        return Mth.square(pLocalX) + Mth.square(pLocalY + 2) + Mth.square(pLocalZ) > 12 + pRandom.nextInt(5);
    }
}

package net.sen.lostworlds.worldgen.tree;

import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.sen.lostworlds.worldgen.features.ModVegetationFeatures;
import org.jetbrains.annotations.Nullable;

public class WeaverTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
        return ModVegetationFeatures.TREE_WEAVER_KEY;
    }
}

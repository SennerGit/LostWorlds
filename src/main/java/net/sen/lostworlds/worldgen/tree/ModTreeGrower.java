package net.sen.lostworlds.worldgen.tree;

import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.sen.lostworlds.worldgen.features.ModConfiguredFeatures;
import net.sen.lostworlds.worldgen.features.ModVegetationFeatures;

import java.util.Optional;

public class ModTreeGrower {
    public static final TreeGrower CYPRESS_TREE = new TreeGrower(
            "cypress_tree",
            Optional.empty(),
            Optional.of(ModVegetationFeatures.TREE_CYPRESS_KEY),
            Optional.empty()
    );

    public static final TreeGrower LAUREL_TREE = new TreeGrower(
            "laurel_tree",
            Optional.empty(),
            Optional.of(ModVegetationFeatures.TREE_LAUREL_KEY),
            Optional.empty()
    );

    public static final TreeGrower MYRRH_TREE = new TreeGrower(
            "myrrh_tree",
            Optional.empty(),
            Optional.of(ModVegetationFeatures.TREE_MYRRH_KEY),
            Optional.empty()
    );

    public static final TreeGrower OLIVE_TREE = new TreeGrower(
            "olive_tree",
            Optional.empty(),
            Optional.of(ModVegetationFeatures.TREE_OLIVE_KEY),
            Optional.empty()
    );

    public static final TreeGrower ELDER_WOOD_TREE = new TreeGrower(
            "elder_wood_tree",
            Optional.empty(),
            Optional.of(ModVegetationFeatures.TREE_ELDER_WOOD_KEY),
            Optional.empty()
    );

    public static final TreeGrower BLACK_BIRCH_TREE = new TreeGrower(
            "black_birch_tree",
            Optional.empty(),
            Optional.of(ModVegetationFeatures.TREE_BLACK_BIRCH_KEY),
            Optional.empty()
    );

    public static final TreeGrower WHITE_OAK_TREE = new TreeGrower(
            "white_oak_tree",
            Optional.empty(),
            Optional.of(ModVegetationFeatures.TREE_WHITE_OAK_KEY),
            Optional.empty()
    );

    public static final TreeGrower BUR_OAK_TREE = new TreeGrower(
            "bur_oak_tree",
            Optional.empty(),
            Optional.of(ModVegetationFeatures.TREE_BUR_OAK_KEY),
            Optional.empty()
    );

    public static final TreeGrower BLOOD_CHERRY_TREE = new TreeGrower(
            "blood_cherry_tree",
            Optional.empty(),
            Optional.of(ModVegetationFeatures.TREE_BLOOD_CHERRY_KEY),
            Optional.empty()
    );

    public static final TreeGrower SACRED_TREE = new TreeGrower(
            "sacred_tree",
            Optional.empty(),
            Optional.of(ModVegetationFeatures.TREE_SACRED_TREE_KEY),
            Optional.empty()
    );

    public static final TreeGrower WILLOW_TREE = new TreeGrower(
            "willow_tree",
            Optional.empty(),
            Optional.of(ModVegetationFeatures.TREE_WILLOW_KEY),
            Optional.empty()
    );

    public static final TreeGrower DEADWOOD_TREE = new TreeGrower(
            "deadwood_tree",
            Optional.empty(),
            Optional.of(ModVegetationFeatures.TREE_DEADWOOD_KEY),
            Optional.empty()
    );

    public static final TreeGrower EBONY_KINGSWOOD_TREE = new TreeGrower(
            "ebony_kingswood_tree",
            Optional.empty(),
            Optional.of(ModVegetationFeatures.TREE_EBONY_KINGSWOOD_KEY),
            Optional.empty()
    );

    public static final TreeGrower IVORY_KINGSWOOD_TREE = new TreeGrower(
            "ivory_kingswood_tree",
            Optional.empty(),
            Optional.of(ModVegetationFeatures.TREE_IVORY_KINGSWOOD_KEY),
            Optional.empty()
    );

    public static final TreeGrower WEAVER_TREE = new TreeGrower(
            "weaver_tree",
            Optional.empty(),
            Optional.of(ModVegetationFeatures.TREE_WEAVER_KEY),
            Optional.empty()
    );
}

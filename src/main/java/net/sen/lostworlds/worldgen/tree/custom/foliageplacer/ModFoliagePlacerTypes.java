package net.sen.lostworlds.worldgen.tree.custom.foliageplacer;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorldsApi;

public class ModFoliagePlacerTypes {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACERS = DeferredRegister.create(Registries.FOLIAGE_PLACER_TYPE, LostWorldsApi.MODID);

    public static final RegistryObject<FoliagePlacerType<ElderWoodFoliagePlacer>> ELDER_WOOD_FOLIAGE_PLACER = FOLIAGE_PLACERS.register("elder_wood_foliage_placer", () -> new FoliagePlacerType<>(ElderWoodFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<OliveFoliagePlacer>> OLIVE_FOLIAGE_PLACER = FOLIAGE_PLACERS.register("olive_foliage_placer", () -> new FoliagePlacerType<>(OliveFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<MyrrhFoliagePlacer>> MYRRH_FOLIAGE_PLACER = FOLIAGE_PLACERS.register("myrrh_foliage_placer", () -> new FoliagePlacerType<>(MyrrhFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<LaurelFoliagePlacer>> LAUREL_FOLIAGE_PLACER = FOLIAGE_PLACERS.register("laurel_foliage_placer", () -> new FoliagePlacerType<>(LaurelFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<CypressFoliagePlacer>> CYPRESS_FOLIAGE_PLACER = FOLIAGE_PLACERS.register("cypress_foliage_placer", () -> new FoliagePlacerType<>(CypressFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<BlackBirchFoliagePlacer>> BLACK_BIRCH_FOLIAGE_PLACER = FOLIAGE_PLACERS.register("black_birch_foliage_placer", () -> new FoliagePlacerType<>(BlackBirchFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<WhiteOakFoliagePlacer>> WHITE_OAK_FOLIAGE_PLACER = FOLIAGE_PLACERS.register("white_oak_foliage_placer", () -> new FoliagePlacerType<>(WhiteOakFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<BurOakFoliagePlacer>> BUR_OAK_FOLIAGE_PLACER = FOLIAGE_PLACERS.register("bur_oak_foliage_placer", () -> new FoliagePlacerType<>(BurOakFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<BloodCherryFoliagePlacer>> BLOOD_CHERRY_FOLIAGE_PLACER = FOLIAGE_PLACERS.register("blood_cherry_foliage_placer", () -> new FoliagePlacerType<>(BloodCherryFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<SacredTreeFoliagePlacer>> SACRED_TREE_FOLIAGE_PLACER = FOLIAGE_PLACERS.register("sacred_tree_foliage_placer", () -> new FoliagePlacerType<>(SacredTreeFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<WillowFoliagePlacer>> WILLOW_FOLIAGE_PLACER = FOLIAGE_PLACERS.register("willow_foliage_placer", () -> new FoliagePlacerType<>(WillowFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<DeadwoodFoliagePlacer>> DEADWOOD_FOLIAGE_PLACER = FOLIAGE_PLACERS.register("deadwood_foliage_placer", () -> new FoliagePlacerType<>(DeadwoodFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<EbonyKingswoodFoliagePlacer>> EBONY_KINGSWOOD_FOLIAGE_PLACER = FOLIAGE_PLACERS.register("ebony_kingswood_foliage_placer", () -> new FoliagePlacerType<>(EbonyKingswoodFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<IvoryKingswoodFoliagePlacer>> IVORY_KINGSWOOD_FOLIAGE_PLACER = FOLIAGE_PLACERS.register("ivory_kingswood_foliage_placer", () -> new FoliagePlacerType<>(IvoryKingswoodFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<WeaverFoliagePlacer>> WEAVER_FOLIAGE_PLACER = FOLIAGE_PLACERS.register("weaver_foliage_placer", () -> new FoliagePlacerType<>(WeaverFoliagePlacer.CODEC));

    public static void register(IEventBus eventBus) {
        FOLIAGE_PLACERS.register(eventBus);
    }
}

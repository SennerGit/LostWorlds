package net.sen.lostworlds.worldgen.tree.custom.trunkplacer;

import com.mojang.serialization.Codec;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorldsApi;

public class ModTrunkPlacerTypes {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACERS = DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, LostWorldsApi.MODID);

    public static final RegistryObject<TrunkPlacerType<ElderWoodTrunkPlacer>> ELDER_WOOD_TRUNK_PLACER = TRUNK_PLACERS.register("elder_wood_trunk_placer", () -> new TrunkPlacerType<>(ElderWoodTrunkPlacer.CODEC));
    public static final RegistryObject<TrunkPlacerType<OliveTrunkPlacer>> OLIVE_TRUNK_PLACER = TRUNK_PLACERS.register("olive_trunk_placer", () -> new TrunkPlacerType<>(OliveTrunkPlacer.CODEC));
    public static final RegistryObject<TrunkPlacerType<MyrrhTrunkPlacer>> MYRRH_TRUNK_PLACER = TRUNK_PLACERS.register("myrrh_trunk_placer", () -> new TrunkPlacerType<>(MyrrhTrunkPlacer.CODEC));
    public static final RegistryObject<TrunkPlacerType<LaurelTrunkPlacer>> LAUREL_TRUNK_PLACER = TRUNK_PLACERS.register("laurel_trunk_placer", () -> new TrunkPlacerType<>(LaurelTrunkPlacer.CODEC));
    public static final RegistryObject<TrunkPlacerType<CypressTrunkPlacer>> CYPRESS_TRUNK_PLACER = TRUNK_PLACERS.register("cypress_trunk_placer", () -> new TrunkPlacerType<>(CypressTrunkPlacer.CODEC));
    public static final RegistryObject<TrunkPlacerType<BlackBirchTrunkPlacer>> BLACK_BIRCH_TRUNK_PLACER = TRUNK_PLACERS.register("black_birch_trunk_placer", () -> new TrunkPlacerType<>(BlackBirchTrunkPlacer.CODEC));
    public static final RegistryObject<TrunkPlacerType<WhiteOakTrunkPlacer>> WHITE_OAK_TRUNK_PLACER = TRUNK_PLACERS.register("white_oak_trunk_placer", () -> new TrunkPlacerType<>(WhiteOakTrunkPlacer.CODEC));
    public static final RegistryObject<TrunkPlacerType<BurOakTrunkPlacer>> BUR_OAK_TRUNK_PLACER = TRUNK_PLACERS.register("bur_oak_trunk_placer", () -> new TrunkPlacerType<>(BurOakTrunkPlacer.CODEC));
    public static final RegistryObject<TrunkPlacerType<BloodCherryTrunkPlacer>> BLOOD_CHERRY_TRUNK_PLACER = TRUNK_PLACERS.register("blood_cherry_trunk_placer", () -> new TrunkPlacerType<>(BloodCherryTrunkPlacer.CODEC));
    public static final RegistryObject<TrunkPlacerType<SacredTreeTrunkPlacer>> SACRED_TREE_TRUNK_PLACER = TRUNK_PLACERS.register("sacred_tree_trunk_placer", () -> new TrunkPlacerType<>(SacredTreeTrunkPlacer.CODEC));
    public static final RegistryObject<TrunkPlacerType<WillowTrunkPlacer>> WILLOW_TRUNK_PLACER = TRUNK_PLACERS.register("willow_trunk_placer", () -> new TrunkPlacerType<>(WillowTrunkPlacer.CODEC));
    public static final RegistryObject<TrunkPlacerType<DeadwoodTrunkPlacer>> DEADWOOD_TRUNK_PLACER = TRUNK_PLACERS.register("deadwood_trunk_placer", () -> new TrunkPlacerType<>(DeadwoodTrunkPlacer.CODEC));
    public static final RegistryObject<TrunkPlacerType<EbonyKingswoodTrunkPlacer>> EBONY_KINGSWOOD_TRUNK_PLACER = TRUNK_PLACERS.register("ebony_kingswood_trunk_placer", () -> new TrunkPlacerType<>(EbonyKingswoodTrunkPlacer.CODEC));
    public static final RegistryObject<TrunkPlacerType<IvoryKingswoodTrunkPlacer>> IVORY_KINGSWOOD_TRUNK_PLACER = TRUNK_PLACERS.register("ivory_kingswood_trunk_placer", () -> new TrunkPlacerType<>(IvoryKingswoodTrunkPlacer.CODEC));
    public static final RegistryObject<TrunkPlacerType<WeaverTrunkPlacer>> WEAVER_TRUNK_PLACER = TRUNK_PLACERS.register("weaver_trunk_placer", () -> new TrunkPlacerType<>(WeaverTrunkPlacer.CODEC));

    public static void register(IEventBus eventBus) {
        TRUNK_PLACERS.register(eventBus);
    }
}

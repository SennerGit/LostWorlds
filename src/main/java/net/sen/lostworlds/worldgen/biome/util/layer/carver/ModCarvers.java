package net.sen.lostworlds.worldgen.biome.util.layer.carver;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.carver.CaveCarverConfiguration;
import net.minecraft.world.level.levelgen.carver.WorldCarver;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.sen.lostworlds.api.LostWorldsApi;

public class ModCarvers {
    public static final DeferredRegister<WorldCarver<?>> CARVERS =
            DeferredRegister.create(Registries.CARVER, LostWorldsApi.MODID);

    public static final DeferredHolder<WorldCarver<?>, WorldCarver<CaveCarverConfiguration>> NIDAVELLIR_CAVE =
            CARVERS.register("nidavellir_cave", () -> new NidavellirCaveWorldCarver(CaveCarverConfiguration.CODEC));

    public static final DeferredHolder<WorldCarver<?>, WorldCarver<CaveCarverConfiguration>> NIDAVELLIR_SUNKEN_CAVERN_CAVE =
            CARVERS.register("nidavellir_sunken_cavern_cave", () -> new NidavellirSunkenCavernCaveWorldCarver(CaveCarverConfiguration.CODEC));

    public static final DeferredHolder<WorldCarver<?>, WorldCarver<CaveCarverConfiguration>> NIDAVELLIR_LAVA_CAVERN_CAVE =
            CARVERS.register("nidavellir_lava_cavern_cave", () -> new NidavellirLavaCavernCaveWorldCarver(CaveCarverConfiguration.CODEC));

    public static final DeferredHolder<WorldCarver<?>, WorldCarver<CaveCarverConfiguration>> ALFHEIMR_CAVE =
            CARVERS.register("alfheimr_cave", () -> new AlfheimrCaveWorldCarver(CaveCarverConfiguration.CODEC));

    public static final DeferredHolder<WorldCarver<?>, WorldCarver<CaveCarverConfiguration>> UNDERWORLD_CAVE =
            CARVERS.register("underworld_cave", () -> new UnderworldCaveWorldCarver(CaveCarverConfiguration.CODEC));

    public static final DeferredHolder<WorldCarver<?>, WorldCarver<CaveCarverConfiguration>> ATLANTIS_CAVE =
            CARVERS.register("atlantis_cave", () -> new AtlantisCaveWorldCarver(CaveCarverConfiguration.CODEC));

    public static void register(IEventBus eventBus) {
        CARVERS.register(eventBus);
    }
}

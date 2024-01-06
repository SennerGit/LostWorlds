package net.sen.lostworlds.worldgen.biome.carver;

import net.minecraft.world.level.levelgen.carver.CaveCarverConfiguration;
import net.minecraft.world.level.levelgen.carver.WorldCarver;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;

public class ModCarvers {
    public static final DeferredRegister<WorldCarver<?>> CARVERS =
            DeferredRegister.create(ForgeRegistries.WORLD_CARVERS, LostWorldsConstants.MODID);

    public static final RegistryObject<WorldCarver<CaveCarverConfiguration>> NIDAVELLIR_CAVE =
            CARVERS.register("nidavellir_cave", () -> new NidavellirCaveWorldCarver(CaveCarverConfiguration.CODEC));

    public static final RegistryObject<WorldCarver<CaveCarverConfiguration>> NIDAVELLIR_SUNKEN_CAVERN_CAVE =
            CARVERS.register("nidavellir_sunken_cavern_cave", () -> new NidavellirSunkenCavernCaveWorldCarver(CaveCarverConfiguration.CODEC));

    public static final RegistryObject<WorldCarver<CaveCarverConfiguration>> NIDAVELLIR_LAVA_CAVERN_CAVE =
            CARVERS.register("nidavellir_lava_cavern_cave", () -> new NidavellirLavaCavernCaveWorldCarver(CaveCarverConfiguration.CODEC));

    public static final RegistryObject<WorldCarver<CaveCarverConfiguration>> ALFHEIMR_CAVE =
            CARVERS.register("alfheimr_cave", () -> new AlfheimrCaveWorldCarver(CaveCarverConfiguration.CODEC));

    public static final RegistryObject<WorldCarver<CaveCarverConfiguration>> UNDERWORLD_CAVE =
            CARVERS.register("underworld_cave", () -> new UnderworldCaveWorldCarver(CaveCarverConfiguration.CODEC));

    public static final RegistryObject<WorldCarver<CaveCarverConfiguration>> ATLANTIS_CAVE =
            CARVERS.register("atlantis_cave", () -> new AtlantisCaveWorldCarver(CaveCarverConfiguration.CODEC));

    public static void register(IEventBus eventBus) {
        CARVERS.register(eventBus);
    }
}

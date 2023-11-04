package net.sen.lostworlds.worldgen.biome.carver;

import net.minecraft.world.level.levelgen.carver.CaveCarverConfiguration;
import net.minecraft.world.level.levelgen.carver.WorldCarver;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorlds;

public class ModCarvers {
    public static final DeferredRegister<WorldCarver<?>> CARVERS =
            DeferredRegister.create(ForgeRegistries.WORLD_CARVERS, LostWorlds.MODID);

    public static final RegistryObject<WorldCarver<CaveCarverConfiguration>> NIDAVELLIR_CAVE =
            CARVERS.register("nidavellir_cave", () -> new NidavellirCaveWorldCarver(CaveCarverConfiguration.CODEC));

    public static void register(IEventBus eventBus) {
        CARVERS.register(eventBus);
    }
}

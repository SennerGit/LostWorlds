package net.sen.lostworlds.worldgen.biome;

import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.world.level.biome.*;

public class ModBiomes {
    public static void bootstrap(BootstapContext<Biome> context) {
        UnderworldBiomes.bootstrap(context);
        NidavellirBiomes.bootstrap(context);
        AlfheimrBiomes.bootstrap(context);
        AtlantisBiomes.bootstrap(context);
    }
}

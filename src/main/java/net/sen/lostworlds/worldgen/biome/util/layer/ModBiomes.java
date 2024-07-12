package net.sen.lostworlds.worldgen.biome.util.layer;

import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.level.biome.*;

public class ModBiomes {
    public static void bootstrap(BootstrapContext<Biome> context) {
        UnderworldBiomes.bootstrap(context);
        NidavellirBiomes.bootstrap(context);
        AlfheimrBiomes.bootstrap(context);
        AtlantisBiomes.bootstrap(context);
    }
}

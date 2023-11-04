package net.sen.lostworlds.worldgen.biome.carver;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantFloat;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.carver.CaveCarverConfiguration;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.util.ModTags;

@SuppressWarnings("unused")
public class ModConfiguredCarvers {
    public static final ResourceKey<ConfiguredWorldCarver<?>> NIDAVELLIR_CAVE =
            ResourceKey.create(Registries.CONFIGURED_CARVER,
                    new ResourceLocation(LostWorlds.MODID, "nidavellir_carver"));

    public static void bootstrap(BootstapContext<ConfiguredWorldCarver<?>> context) {
        HolderGetter<Block> blocks = context.lookup(Registries.BLOCK);

        context.register(NIDAVELLIR_CAVE, ModCarvers.NIDAVELLIR_CAVE.get().configured(new CaveCarverConfiguration(0.5F, UniformHeight.of(VerticalAnchor.aboveBottom(5), VerticalAnchor.belowTop(1)), ConstantFloat.of(0.5F), VerticalAnchor.aboveBottom(10), BuiltInRegistries.BLOCK.getOrCreateTag(ModTags.Blocks.MOD_CARVER_REPLACEABLES), ConstantFloat.of(1.0F), ConstantFloat.of(1.0F), ConstantFloat.of(-0.7F))));
    }
}

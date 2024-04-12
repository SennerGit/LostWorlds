package net.sen.lostworlds.worldgen.biome.util.layer.carver;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ConstantFloat;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.carver.CaveCarverConfiguration;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.util.ModTags;

@SuppressWarnings("unused")
public class ModConfiguredCarvers {
    public static final ResourceKey<ConfiguredWorldCarver<?>> NIDAVELLIR_CAVE =
            ResourceKey.create(Registries.CONFIGURED_CARVER,
                    LostWorldsApi.modLoc("nidavellir_carver"));

    public static final ResourceKey<ConfiguredWorldCarver<?>> NIDAVELLIR_LAVA_CAVERN_CAVE =
            ResourceKey.create(Registries.CONFIGURED_CARVER,
                    LostWorldsApi.modLoc("nidavellir_lava_cavern_carver"));

    public static final ResourceKey<ConfiguredWorldCarver<?>> NIDAVELLIR_SUNKEN_CAVERN_CAVE =
            ResourceKey.create(Registries.CONFIGURED_CARVER,
                    LostWorldsApi.modLoc("nidavellir_sunken_cavern_carver"));

    public static final ResourceKey<ConfiguredWorldCarver<?>> ALFHEIMR_CAVE =
            ResourceKey.create(Registries.CONFIGURED_CARVER,
                    LostWorldsApi.modLoc("alfheimr_carver"));

    public static final ResourceKey<ConfiguredWorldCarver<?>> UNDERWORLD_CAVE =
            ResourceKey.create(Registries.CONFIGURED_CARVER,
                    LostWorldsApi.modLoc("underworld_carver"));

    public static final ResourceKey<ConfiguredWorldCarver<?>> ATLANTIS_CAVE =
            ResourceKey.create(Registries.CONFIGURED_CARVER,
                    LostWorldsApi.modLoc("atlantis_carver"));

    public static void bootstrap(BootstapContext<ConfiguredWorldCarver<?>> context) {
        HolderGetter<Block> blocks = context.lookup(Registries.BLOCK);

        context.register(NIDAVELLIR_CAVE, ModCarvers.NIDAVELLIR_CAVE.get().configured(new CaveCarverConfiguration(0.5F, UniformHeight.of(VerticalAnchor.aboveBottom(5), VerticalAnchor.belowTop(1)), ConstantFloat.of(0.5F), VerticalAnchor.aboveBottom(10), BuiltInRegistries.BLOCK.getOrCreateTag(ModTags.Blocks.MOD_CARVER_REPLACEABLES), ConstantFloat.of(1.0F), ConstantFloat.of(1.0F), ConstantFloat.of(-0.7F))));
        context.register(NIDAVELLIR_SUNKEN_CAVERN_CAVE, ModCarvers.NIDAVELLIR_SUNKEN_CAVERN_CAVE.get().configured(new CaveCarverConfiguration(0.5F, UniformHeight.of(VerticalAnchor.aboveBottom(5), VerticalAnchor.belowTop(1)), ConstantFloat.of(0.5F), VerticalAnchor.aboveBottom(10), BuiltInRegistries.BLOCK.getOrCreateTag(ModTags.Blocks.MOD_CARVER_REPLACEABLES), ConstantFloat.of(1.0F), ConstantFloat.of(1.0F), ConstantFloat.of(-0.7F))));
        context.register(NIDAVELLIR_LAVA_CAVERN_CAVE, ModCarvers.NIDAVELLIR_LAVA_CAVERN_CAVE.get().configured(new CaveCarverConfiguration(0.5F, UniformHeight.of(VerticalAnchor.aboveBottom(5), VerticalAnchor.belowTop(1)), ConstantFloat.of(0.5F), VerticalAnchor.aboveBottom(10), BuiltInRegistries.BLOCK.getOrCreateTag(ModTags.Blocks.MOD_CARVER_REPLACEABLES), ConstantFloat.of(1.0F), ConstantFloat.of(1.0F), ConstantFloat.of(-0.7F))));
        context.register(ALFHEIMR_CAVE, ModCarvers.ALFHEIMR_CAVE.get().configured(new CaveCarverConfiguration(0.5F, UniformHeight.of(VerticalAnchor.aboveBottom(5), VerticalAnchor.belowTop(1)), ConstantFloat.of(0.5F), VerticalAnchor.aboveBottom(10), BuiltInRegistries.BLOCK.getOrCreateTag(ModTags.Blocks.MOD_CARVER_REPLACEABLES), ConstantFloat.of(1.0F), ConstantFloat.of(1.0F), ConstantFloat.of(-0.7F))));
        context.register(UNDERWORLD_CAVE, ModCarvers.UNDERWORLD_CAVE.get().configured(new CaveCarverConfiguration(0.5F, UniformHeight.of(VerticalAnchor.aboveBottom(5), VerticalAnchor.belowTop(1)), ConstantFloat.of(0.5F), VerticalAnchor.aboveBottom(10), BuiltInRegistries.BLOCK.getOrCreateTag(ModTags.Blocks.MOD_CARVER_REPLACEABLES), ConstantFloat.of(1.0F), ConstantFloat.of(1.0F), ConstantFloat.of(-0.7F))));
        context.register(ATLANTIS_CAVE, ModCarvers.ATLANTIS_CAVE.get().configured(new CaveCarverConfiguration(0.5F, UniformHeight.of(VerticalAnchor.aboveBottom(5), VerticalAnchor.belowTop(1)), ConstantFloat.of(0.5F), VerticalAnchor.aboveBottom(10), BuiltInRegistries.BLOCK.getOrCreateTag(ModTags.Blocks.MOD_CARVER_REPLACEABLES), ConstantFloat.of(1.0F), ConstantFloat.of(1.0F), ConstantFloat.of(-0.7F))));
    }
}

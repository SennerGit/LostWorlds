package net.sen.lostworlds.datagen;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.Vec3i;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.Pools;
import net.minecraft.data.worldgen.ProcessorLists;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.random.WeightedRandomList;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.heightproviders.ConstantHeight;
import net.minecraft.world.level.levelgen.structure.*;
import net.minecraft.world.level.levelgen.structure.placement.RandomSpreadStructurePlacement;
import net.minecraft.world.level.levelgen.structure.placement.RandomSpreadType;
import net.minecraft.world.level.levelgen.structure.placement.StructurePlacement;
import net.minecraft.world.level.levelgen.structure.pools.StructurePoolElement;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;
import net.minecraft.world.level.levelgen.structure.structures.JigsawStructure;
import net.minecraft.world.level.levelgen.structure.templatesystem.*;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.util.ModTags;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ModStructureGenerator {
    public static final DeferredRegister<StructureType<?>> STRUCTURES = DeferredRegister.create(Registries.STRUCTURE_TYPE, LostWorldsApi.MODID);

    public static final ResourceKey<Structure> GRAVE_STRUCTURE = createStructureKey("grave");
    public static final ResourceKey<StructureSet> GRAVE_STRUCTURE_SET = createStructureSetKey("grave");
    public static final ResourceKey<StructureTemplatePool> GRAVE_POOL = createStructureTemplatePoolKey("grave/start_pool");

    public static final ResourceKey<Structure> STONEHENGE_STRUCTURE = createStructureKey("stonehenge");
    public static final ResourceKey<StructureSet> STONEHENGE_STRUCTURE_SET = createStructureSetKey("stonehenge");
    public static final ResourceKey<StructureTemplatePool> STONEHENGE_POOL = createStructureTemplatePoolKey("stonehenge/start_pool");

    public static final ResourceKey<Structure> ELVEN_VILLAGE_ENCHANTED_FOREST_STRUCTURE = createStructureKey("elven_village_enchanted_forest");
    public static final ResourceKey<StructureSet> ELVEN_VILLAGE_ENCHANTED_FOREST_STRUCTURE_SET = createStructureSetKey("elven_village_enchanted_forest");
    public static final ResourceKey<StructureProcessorList> ELVEN_VILLAGE_ENCHANTED_FOREST_STREETS_PROCESSOR = createStructureProcessors("elven_village_streets_enchanted_forest");
    public static final ResourceKey<StructureTemplatePool> ELVEN_VILLAGE_ENCHANTED_FOREST_POOL_STREETS = createStructureTemplatePoolKey("elven_village/elven_village_enchanted_forest/elven_streets");
    public static final ResourceKey<StructureTemplatePool> ELVEN_VILLAGE_ENCHANTED_FOREST_POOL_HOUSES = createStructureTemplatePoolKey("elven_village/elven_village_enchanted_forest/houses");
    public static final ResourceKey<StructureTemplatePool> ELVEN_VILLAGE_ENCHANTED_FOREST_POOL_TOWN_CENTERS = createStructureTemplatePoolKey("elven_village/elven_village_enchanted_forest/town_centers");

    public static final ResourceKey<Structure> DWARVEN_FORTRESS_STRUCTURE = createStructureKey("dwarven_fortress");
    public static final ResourceKey<StructureSet> DWARVEN_FORTRESS_STRUCTURE_SET = createStructureSetKey("dwarven_fortress");
    public static final ResourceKey<StructureTemplatePool> DWARVEN_FORTRESS_POOL_ENTRENCE = createStructureTemplatePoolKey("dwarven_fortress/dwarven_fortress_entrence");

    @SuppressWarnings("deprecation")
    public static void bootstrapStructures(BootstrapContext<Structure> context) {
        Map<MobCategory, StructureSpawnOverride> mobSpawnBox = Arrays.stream(MobCategory.values())
                .collect(Collectors.toMap((category) -> category, (category) -> new StructureSpawnOverride(StructureSpawnOverride.BoundingBoxType.STRUCTURE, WeightedRandomList.create())));

        Map<MobCategory, StructureSpawnOverride> mobSpawnPiece = Arrays.stream(MobCategory.values())
                .collect(Collectors.toMap((category) -> category, (category) -> new StructureSpawnOverride(StructureSpawnOverride.BoundingBoxType.PIECE, WeightedRandomList.create())));

        HolderGetter<Biome> biomes = context.lookup(Registries.BIOME);
        HolderGetter<StructureTemplatePool> pools = context.lookup(Registries.TEMPLATE_POOL);

        context.register(
                GRAVE_STRUCTURE,
                new JigsawStructure(
                    structure(
                            biomes.getOrThrow(ModTags.Biomes.HAS_GRAVE),
                            GenerationStep.Decoration.SURFACE_STRUCTURES,
                            TerrainAdjustment.NONE
                    ),
                    pools.getOrThrow(GRAVE_POOL),
                    2,
                        ConstantHeight.of(VerticalAnchor.absolute(0)),
                    false
                )
        );

        context.register(
                STONEHENGE_STRUCTURE,
                new JigsawStructure(
                    structure(
                            biomes.getOrThrow(ModTags.Biomes.HAS_STONEHENGE),
                            GenerationStep.Decoration.SURFACE_STRUCTURES,
                            TerrainAdjustment.NONE
                    ),
                    pools.getOrThrow(STONEHENGE_POOL),
                    2,
                        ConstantHeight.of(VerticalAnchor.absolute(0)),
                    false
                )
        );

        context.register(
                ELVEN_VILLAGE_ENCHANTED_FOREST_STRUCTURE,
                new JigsawStructure(
                    structure(
                            biomes.getOrThrow(ModTags.Biomes.HAS_ELVEN_VILLAGE_ENCHANTED_FOREST),
                            GenerationStep.Decoration.SURFACE_STRUCTURES,
                            TerrainAdjustment.BEARD_BOX
                    ),
                    pools.getOrThrow(ELVEN_VILLAGE_ENCHANTED_FOREST_POOL_TOWN_CENTERS),
                    6,
                        ConstantHeight.of(VerticalAnchor.absolute(0)),
                    true
                )
        );

        context.register(
                DWARVEN_FORTRESS_STRUCTURE,
                new JigsawStructure(
                    structure(
                            biomes.getOrThrow(ModTags.Biomes.HAS_DWARVEN_FORTRESS),
                            GenerationStep.Decoration.SURFACE_STRUCTURES,
                            TerrainAdjustment.BEARD_BOX
                    ),
                    pools.getOrThrow(DWARVEN_FORTRESS_POOL_ENTRENCE),
                    6,
                        ConstantHeight.of(VerticalAnchor.absolute(0)),
                    true
                )
        );
    }

    @SuppressWarnings("deprecation")
    public static void bootstrapStructureSets(BootstrapContext<StructureSet> context) {
        HolderGetter<Structure> structures = context.lookup(Registries.STRUCTURE);

        context.register(
                GRAVE_STRUCTURE_SET,
                new StructureSet(
                        structures.getOrThrow(GRAVE_STRUCTURE),
                        new RandomSpreadStructurePlacement(
                                Vec3i.ZERO,
                                StructurePlacement.FrequencyReductionMethod.DEFAULT,
                                0.0f,   //frequency
                                126625065, //salt
                                Optional.empty(),
                                20, //spacing
                                6,  //separation
                                RandomSpreadType.LINEAR
                        )
                )
        );

        context.register(
                STONEHENGE_STRUCTURE_SET,
                new StructureSet(
                        structures.getOrThrow(STONEHENGE_STRUCTURE),
                        new RandomSpreadStructurePlacement(
                                Vec3i.ZERO,
                                StructurePlacement.FrequencyReductionMethod.DEFAULT,
                                0.0f,   //frequency
                                126625065, //salt
                                Optional.empty(),
                                20, //spacing
                                6,  //separation
                                RandomSpreadType.LINEAR
                        )
                )
        );

        context.register(
                ELVEN_VILLAGE_ENCHANTED_FOREST_STRUCTURE_SET,
                new StructureSet(
                        structures.getOrThrow(ELVEN_VILLAGE_ENCHANTED_FOREST_STRUCTURE),
                        new RandomSpreadStructurePlacement(
                                Vec3i.ZERO,
                                StructurePlacement.FrequencyReductionMethod.DEFAULT,
                                0.0f,   //frequency
                                1224466880, //salt
                                Optional.empty(),
                                34, //spacing
                                8,  //separation
                                RandomSpreadType.LINEAR
                        )
                )
        );

        context.register(
                DWARVEN_FORTRESS_STRUCTURE_SET,
                new StructureSet(
                        structures.getOrThrow(DWARVEN_FORTRESS_STRUCTURE),
                        new RandomSpreadStructurePlacement(
                                Vec3i.ZERO,
                                StructurePlacement.FrequencyReductionMethod.DEFAULT,
                                0.0f,   //frequency
                                1335577990, //salt
                                Optional.empty(),
                                34, //spacing
                                8,  //separation
                                RandomSpreadType.LINEAR
                        )
                )
        );
    }

    @SuppressWarnings("deprecation")
    public static void bootstrapStructureTemplatePools(BootstrapContext<StructureTemplatePool> context) {
        Holder<StructureTemplatePool> emptyPool = context.lookup(Registries.TEMPLATE_POOL).getOrThrow(Pools.EMPTY);
        HolderGetter<StructureProcessorList> processors = context.lookup(Registries.PROCESSOR_LIST);

        GravePool(context, emptyPool, processors);
        StonehengePool(context, emptyPool, processors);
        EvlenVillagePool(context, emptyPool, processors);
        DwarvenFortressPool(context, emptyPool, processors);
    }

    @SuppressWarnings("deprecation")
    public static void bootstrapProcessors(BootstrapContext<StructureProcessorList> context) {
        context.register(
                ELVEN_VILLAGE_ENCHANTED_FOREST_STREETS_PROCESSOR,
                new StructureProcessorList(
                    List.of(
                        new RuleProcessor(
                                List.of(
                                        new ProcessorRule(
                                                new BlockMatchTest(Blocks.JUNGLE_PLANKS),
                                                new BlockMatchTest(Blocks.WATER),
                                                Blocks.JUNGLE_PLANKS.defaultBlockState()
                                        )
                                )
                        )
                    )
                )
        );
    }

    private static void GravePool(BootstrapContext<StructureTemplatePool> context, Holder<StructureTemplatePool> emptyPool, HolderGetter<StructureProcessorList> processors) {
        context.register(
                GRAVE_POOL,
                new StructureTemplatePool(
                        emptyPool,
                        ImmutableList.of(
                                Pair.of(
                                        StructurePoolElement.single(
                                                LostWorldsApi.modLoc("grave/lone_grave_1").toString(),
                                                processors.getOrThrow(ProcessorLists.EMPTY)
                                        ),
                                        1
                                )
                        ),
                        StructureTemplatePool.Projection.RIGID
                )
        );
    }
    private static void StonehengePool(BootstrapContext<StructureTemplatePool> context, Holder<StructureTemplatePool> emptyPool, HolderGetter<StructureProcessorList> processors) {
        context.register(
                STONEHENGE_POOL,
                new StructureTemplatePool(
                        emptyPool,
                        ImmutableList.of(
                                Pair.of(
                                        StructurePoolElement.single(
                                                LostWorldsApi.modLoc("stonehenge/stonehenge_1").toString(),
                                                processors.getOrThrow(ProcessorLists.EMPTY)
                                        ),
                                        1
                                )
                        ),
                        StructureTemplatePool.Projection.RIGID
                )
        );
    }
    private static void EvlenVillagePool(BootstrapContext<StructureTemplatePool> context, Holder<StructureTemplatePool> emptyPool, HolderGetter<StructureProcessorList> processors) {
        context.register(
                ELVEN_VILLAGE_ENCHANTED_FOREST_POOL_TOWN_CENTERS,
                new StructureTemplatePool(
                        emptyPool,
                        ImmutableList.of(
                                Pair.of(
                                        StructurePoolElement.single(
                                                LostWorldsApi.modLoc("elven_village/enchanted_forest/town_centers/enchanted_forest_meeting_point_1").toString(),
                                                processors.getOrThrow(ProcessorLists.EMPTY)
                                        ),
                                        1
                                )
                        ),
                        StructureTemplatePool.Projection.RIGID
                )
        );

        context.register(
                ELVEN_VILLAGE_ENCHANTED_FOREST_POOL_HOUSES,
                new StructureTemplatePool(
                        emptyPool,
                        ImmutableList.of(
                                Pair.of(
                                        StructurePoolElement.single(
                                                LostWorldsApi.modLoc("elven_village/enchanted_forest/houses/enchanted_forest_small_house_1").toString(),
                                                processors.getOrThrow(ProcessorLists.EMPTY)
                                        ),
                                        2
                                )
                        ),
                        StructureTemplatePool.Projection.RIGID
                )
        );

        context.register(
                ELVEN_VILLAGE_ENCHANTED_FOREST_POOL_STREETS,
                new StructureTemplatePool(
                        emptyPool,
                        ImmutableList.of(
                                Pair.of(
                                        StructurePoolElement.single(
                                                LostWorldsApi.modLoc("elven_village/enchanted_forest/streets/corner_01").toString(),
                                                processors.getOrThrow(ELVEN_VILLAGE_ENCHANTED_FOREST_STREETS_PROCESSOR)
                                        ),
                                        2
                                ),
                                Pair.of(
                                        StructurePoolElement.single(
                                                LostWorldsApi.modLoc("elven_village/enchanted_forest/streets/corner_02").toString(),
                                                processors.getOrThrow(ELVEN_VILLAGE_ENCHANTED_FOREST_STREETS_PROCESSOR)
                                        ),
                                        2
                                ),
                                Pair.of(
                                        StructurePoolElement.single(
                                                LostWorldsApi.modLoc("elven_village/enchanted_forest/streets/corner_03").toString(),
                                                processors.getOrThrow(ELVEN_VILLAGE_ENCHANTED_FOREST_STREETS_PROCESSOR)
                                        ),
                                        2
                                ),
                                Pair.of(
                                        StructurePoolElement.single(
                                                LostWorldsApi.modLoc("elven_village/enchanted_forest/streets/straight_01").toString(),
                                                processors.getOrThrow(ELVEN_VILLAGE_ENCHANTED_FOREST_STREETS_PROCESSOR)
                                        ),
                                        4
                                ),
                                Pair.of(
                                        StructurePoolElement.single(
                                                LostWorldsApi.modLoc("elven_village/enchanted_forest/streets/straight_02").toString(),
                                                processors.getOrThrow(ELVEN_VILLAGE_ENCHANTED_FOREST_STREETS_PROCESSOR)
                                        ),
                                        4
                                ),
                                Pair.of(
                                        StructurePoolElement.single(
                                                LostWorldsApi.modLoc("elven_village/enchanted_forest/streets/straight_03").toString(),
                                                processors.getOrThrow(ELVEN_VILLAGE_ENCHANTED_FOREST_STREETS_PROCESSOR)
                                        ),
                                        7
                                ),
                                Pair.of(
                                        StructurePoolElement.single(
                                                LostWorldsApi.modLoc("elven_village/enchanted_forest/streets/straight_04").toString(),
                                                processors.getOrThrow(ELVEN_VILLAGE_ENCHANTED_FOREST_STREETS_PROCESSOR)
                                        ),
                                        7
                                ),
                                Pair.of(
                                        StructurePoolElement.single(
                                                LostWorldsApi.modLoc("elven_village/enchanted_forest/streets/straight_05").toString(),
                                                processors.getOrThrow(ELVEN_VILLAGE_ENCHANTED_FOREST_STREETS_PROCESSOR)
                                        ),
                                        3
                                ),
                                Pair.of(
                                        StructurePoolElement.single(
                                                LostWorldsApi.modLoc("elven_village/enchanted_forest/streets/straight_06").toString(),
                                                processors.getOrThrow(ELVEN_VILLAGE_ENCHANTED_FOREST_STREETS_PROCESSOR)
                                        ),
                                        4
                                ),
                                Pair.of(
                                        StructurePoolElement.single(
                                                LostWorldsApi.modLoc("elven_village/enchanted_forest/streets/crossroad_01").toString(),
                                                processors.getOrThrow(ELVEN_VILLAGE_ENCHANTED_FOREST_STREETS_PROCESSOR)
                                        ),
                                        2
                                ),
                                Pair.of(
                                        StructurePoolElement.single(
                                                LostWorldsApi.modLoc("elven_village/enchanted_forest/streets/crossroad_02").toString(),
                                                processors.getOrThrow(ELVEN_VILLAGE_ENCHANTED_FOREST_STREETS_PROCESSOR)
                                        ),
                                        1
                                ),
                                Pair.of(
                                        StructurePoolElement.single(
                                                LostWorldsApi.modLoc("elven_village/enchanted_forest/streets/crossroad_03").toString(),
                                                processors.getOrThrow(ELVEN_VILLAGE_ENCHANTED_FOREST_STREETS_PROCESSOR)
                                        ),
                                        2
                                ),
                                Pair.of(
                                        StructurePoolElement.single(
                                                LostWorldsApi.modLoc("elven_village/enchanted_forest/streets/crossroad_04").toString(),
                                                processors.getOrThrow(ELVEN_VILLAGE_ENCHANTED_FOREST_STREETS_PROCESSOR)
                                        ),
                                        2
                                ),
                                Pair.of(
                                        StructurePoolElement.single(
                                                LostWorldsApi.modLoc("elven_village/enchanted_forest/streets/crossroad_05").toString(),
                                                processors.getOrThrow(ELVEN_VILLAGE_ENCHANTED_FOREST_STREETS_PROCESSOR)
                                        ),
                                        2
                                ),
                                Pair.of(
                                        StructurePoolElement.single(
                                                LostWorldsApi.modLoc("elven_village/enchanted_forest/streets/crossroad_06").toString(),
                                                processors.getOrThrow(ELVEN_VILLAGE_ENCHANTED_FOREST_STREETS_PROCESSOR)
                                        ),
                                        2
                                ),
                                Pair.of(
                                        StructurePoolElement.single(
                                                LostWorldsApi.modLoc("elven_village/enchanted_forest/streets/turn_01").toString(),
                                                processors.getOrThrow(ELVEN_VILLAGE_ENCHANTED_FOREST_STREETS_PROCESSOR)
                                        ),
                                        3
                                )
                        ),
                        StructureTemplatePool.Projection.TERRAIN_MATCHING
                )
        );
    }
    private static void DwarvenFortressPool(BootstrapContext<StructureTemplatePool> context, Holder<StructureTemplatePool> emptyPool, HolderGetter<StructureProcessorList> processors) {
        context.register(
                DWARVEN_FORTRESS_POOL_ENTRENCE,
                new StructureTemplatePool(
                        emptyPool,
                        ImmutableList.of(
                                Pair.of(
                                        StructurePoolElement.single(
                                                LostWorldsApi.modLoc("dwarven_fortress/dwarven_fortress_entrance/dwarven_fortress_entrance_01").toString(),
                                                processors.getOrThrow(ProcessorLists.EMPTY)
                                        ),
                                        1
                                )
                        ),
                        StructureTemplatePool.Projection.RIGID
                )
        );
    }

    private static Structure.StructureSettings structure(@NotNull HolderSet<Biome> holderSet, @NotNull Map<MobCategory, StructureSpawnOverride> spawns, @NotNull GenerationStep.Decoration featureStep, @NotNull TerrainAdjustment terrainAdjustment) {
        return new Structure.StructureSettings(holderSet, spawns, featureStep, terrainAdjustment);
    }

    private static Structure.StructureSettings structure(@NotNull HolderSet<Biome> holderSet, @NotNull GenerationStep.Decoration featureStep, @NotNull TerrainAdjustment terrainAdjustment) {
        return new Structure.StructureSettings(holderSet, Map.of(), featureStep, terrainAdjustment);
    }

    public static ResourceKey<Structure> createStructureKey(String name) {
        return ResourceKey.create(Registries.STRUCTURE, LostWorldsApi.modLoc(name));
    }

    private static ResourceKey<StructureSet> createStructureSetKey(String name) {
        return ResourceKey.create(Registries.STRUCTURE_SET, LostWorldsApi.modLoc(name));
    }

    public static ResourceKey<StructureTemplatePool> createStructureTemplatePoolKey(String name) {
        return ResourceKey.create(Registries.TEMPLATE_POOL, LostWorldsApi.modLoc(name));
    }

    public static ResourceKey<StructureProcessorList> createStructureProcessors(String name) {
        return ResourceKey.create(Registries.PROCESSOR_LIST, LostWorldsApi.modLoc(name));
    }
}

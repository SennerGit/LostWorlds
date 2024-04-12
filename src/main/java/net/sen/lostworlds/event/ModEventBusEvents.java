package net.sen.lostworlds.event;

import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.npc.AbstractVillager;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sen.lostworlds.*;
import net.sen.lostworlds.client.entity.layers.*;
import net.sen.lostworlds.client.entity.model.*;
import net.sen.lostworlds.entity.*;
import net.sen.lostworlds.entity.custom.AbstractSchoolingBigFish;
import net.sen.lostworlds.entity.custom.AbstractSchoolingFishVarients;
import net.sen.lostworlds.entity.custom.WaterMonster;
import net.sen.lostworlds.entity.mob.*;
import org.apache.logging.log4j.core.pattern.NdcPatternConverter;

@Mod.EventBusSubscriber(modid = LostWorldsApi.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.RHINO_LAYER, RhinoModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HELLHOUND_LAYER, HellhoundModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.SHADOWHOUND_LAYER, ShadowhoundModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.SPECTRALHOUND_LAYER, SpectralhoundModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.DWARVES_LAYER, DwarvesModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.VAMPIRE_BAT_LAYER, VampireBatModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CAVE_MOLE_LAYER, CaveMoleModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.ELVES_LAYER, ElvesModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.SHARK_LAYER, SharkModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.MORAY_EELS_LAYER, MorayEelsModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.ELECTRIC_EELS_LAYER, ElectricEelsModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.JELLYFISH_LAYER, JellyfishModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.GIANT_SQUID_LAYER, GiantSquidModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.RAY_LAYER, RayModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.GIANT_OCTOPUS_LAYER, GiantOctopusModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.NUDIBRANCH_SLUG_LAYER, NudibranchSlugModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.GREAT_WHITE_LAYER, GreatWhiteModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.ANGLER_FISH_LAYER, AnglerfishModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.SEAHORSE_LAYER, SeahorseModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CLOWNFISH_LAYER, ClownfishModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.ATLANTIAN_GURDIAN_LAYER, AtlantianGurdianModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.SIREN_LAYER, SirenModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.MERFOLK_LAYER, MerfolkModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.ATLANTIAN_LAYER, AtlantianModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TUNA_LAYER, TunaModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.TANG_FISH_LAYER, TangFishModel::createBodyLayer);

        event.registerLayerDefinition(ModModelLayers.MAGICAL_GORGAN_PROJECTILE_LAYER, MagicGorganProjectileModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.RHINO.get(), RhinoEntity.createAttributes().build());
        event.put(UnderworldEntities.HELLHOUND.get(), HellhoundEntity.createAttributes().build());
        event.put(UnderworldEntities.SHADOWHOUND.get(), ShadowhoundEntity.createAttributes().build());
        event.put(UnderworldEntities.SPECTRALHOUND.get(), SpectralhoundEntity.createAttributes().build());
        event.put(NidavellirEntities.DWARVES.get(), DwarvesEntity.createAttributes().build());
        event.put(NidavellirEntities.VAMPIRE_BAT.get(), VampireBatEntity.createAttributes().build());
        event.put(NidavellirEntities.CAVE_MOLE.get(), CaveMoleEntity.createAttributes().build());
        event.put(AlfheimrEntities.ELVES.get(), ElvesEntity.createAttributes().build());
        event.put(AtlantisEntities.SHARK.get(), SharkEntity.createAttributes().build());
        event.put(AtlantisEntities.MORAY_EELS.get(), MorayEelsEntity.createAttributes().build());
        event.put(AtlantisEntities.ELECTRIC_EELS.get(), ElectricEelsEntity.createAttributes().build());
        event.put(AtlantisEntities.JELLYFISH.get(), JellyfishEntity.createAttributes().build());
        event.put(AtlantisEntities.GIANT_SQUID.get(), GiantSquidEntity.createAttributes().build());
        event.put(AtlantisEntities.RAY.get(), RayEntity.createAttributes().build());
        event.put(AtlantisEntities.GIANT_OCTOPUS.get(), GiantOctopusEntity.createAttributes().build());
        event.put(AtlantisEntities.NUDIBRANCH_SLUG.get(), NudibranchSlugEntity.createAttributes().build());
        event.put(AtlantisEntities.GREAT_WHITE.get(), GreatWhiteEntity.createAttributes().build());
        event.put(AtlantisEntities.ANGLER_FISH.get(), AnglerFishEntity.createAttributes().build());
        event.put(AtlantisEntities.TUNA.get(), TunaEntity.createAttributes().build());
        event.put(AtlantisEntities.TANG_FISH.get(), TangFishEntity.createAttributes().build());
        event.put(AtlantisEntities.SEAHORSE.get(), SeahorseEntity.createAttributes().build());
        event.put(AtlantisEntities.CLOWNFISH.get(), ClownfishEntity.createAttributes().build());
        event.put(AtlantisEntities.ATLANTIAN_GURDIAN.get(), AtlantianGurdianEntity.createAttributes().build());
        event.put(AtlantisEntities.SIREN.get(), SirenEntity.createAttributes().build());
        event.put(AtlantisEntities.MERFOLK.get(), MerfolkEntity.createAttributes().build());
        event.put(AtlantisEntities.ATLANTIAN.get(), AtlantianEntity.createAttributes().build());
    }
    @SubscribeEvent
    public static void registersSpawnPlacement(SpawnPlacementRegisterEvent event) {
        event.register(ModEntities.RHINO.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(UnderworldEntities.HELLHOUND.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(UnderworldEntities.SHADOWHOUND.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(UnderworldEntities.SPECTRALHOUND.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(NidavellirEntities.DWARVES.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                AbstractVillager::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(NidavellirEntities.VAMPIRE_BAT.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Monster::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(NidavellirEntities.CAVE_MOLE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(AlfheimrEntities.ELVES.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                AbstractVillager::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(AtlantisEntities.SHARK.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                WaterAnimal::checkSurfaceWaterAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(AtlantisEntities.MORAY_EELS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(AtlantisEntities.ELECTRIC_EELS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(AtlantisEntities.JELLYFISH.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                AbstractFish::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(AtlantisEntities.GIANT_SQUID.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                AbstractFish::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(AtlantisEntities.RAY.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                AbstractFish::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(AtlantisEntities.TUNA.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                AbstractSchoolingBigFish::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(AtlantisEntities.TANG_FISH.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                AbstractSchoolingFishVarients::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(AtlantisEntities.GIANT_OCTOPUS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(AtlantisEntities.NUDIBRANCH_SLUG.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                AbstractFish::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(AtlantisEntities.GREAT_WHITE.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(AtlantisEntities.ANGLER_FISH.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                WaterMonster::checkSurfaceWaterMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(AtlantisEntities.SEAHORSE.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                AbstractFish::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(AtlantisEntities.CLOWNFISH.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                AbstractSchoolingFishVarients::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(AtlantisEntities.ATLANTIAN_GURDIAN.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(AtlantisEntities.SIREN.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                WaterMonster::checkSurfaceWaterMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(AtlantisEntities.MERFOLK.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                AbstractVillager::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(AtlantisEntities.ATLANTIAN.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                AbstractVillager::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
    }
}

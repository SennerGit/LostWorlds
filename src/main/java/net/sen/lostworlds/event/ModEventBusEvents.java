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

@Mod.EventBusSubscriber(modid = LostWorldsApi.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.RHINO_LAYER, RhinoModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.DWARVES_LAYER, DwarvesModel::createBodyLayer);
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
        event.put(ModEntities.DWARVES.get(), DwarvesEntity.createAttributes().build());
        event.put(ModEntities.ELVES.get(), ElvesEntity.createAttributes().build());
        event.put(ModEntities.SHARK.get(), SharkEntity.createAttributes().build());
        event.put(ModEntities.MORAY_EELS.get(), MorayEelsEntity.createAttributes().build());
        event.put(ModEntities.ELECTRIC_EELS.get(), ElectricEelsEntity.createAttributes().build());
        event.put(ModEntities.JELLYFISH.get(), JellyfishEntity.createAttributes().build());
        event.put(ModEntities.GIANT_SQUID.get(), GiantSquidEntity.createAttributes().build());
        event.put(ModEntities.RAY.get(), RayEntity.createAttributes().build());
        event.put(ModEntities.GIANT_OCTOPUS.get(), GiantOctopusEntity.createAttributes().build());
        event.put(ModEntities.NUDIBRANCH_SLUG.get(), NudibranchSlugEntity.createAttributes().build());
        event.put(ModEntities.GREAT_WHITE.get(), GreatWhiteEntity.createAttributes().build());
        event.put(ModEntities.ANGLER_FISH.get(), AnglerFishEntity.createAttributes().build());
        event.put(ModEntities.TUNA.get(), TunaEntity.createAttributes().build());
        event.put(ModEntities.TANG_FISH.get(), TangFishEntity.createAttributes().build());
        event.put(ModEntities.SEAHORSE.get(), SeahorseEntity.createAttributes().build());
        event.put(ModEntities.CLOWNFISH.get(), ClownfishEntity.createAttributes().build());
        event.put(ModEntities.ATLANTIAN_GURDIAN.get(), AtlantianGurdianEntity.createAttributes().build());
        event.put(ModEntities.SIREN.get(), SirenEntity.createAttributes().build());
        event.put(ModEntities.MERFOLK.get(), MerfolkEntity.createAttributes().build());
        event.put(ModEntities.ATLANTIAN.get(), AtlantianEntity.createAttributes().build());
    }
    @SubscribeEvent
    public static void registersSpawnPlacement(SpawnPlacementRegisterEvent event) {
        event.register(ModEntities.RHINO.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.DWARVES.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                AbstractVillager::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.ELVES.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                AbstractVillager::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.SHARK.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                WaterAnimal::checkSurfaceWaterAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.MORAY_EELS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.ELECTRIC_EELS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.JELLYFISH.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                AbstractFish::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.GIANT_SQUID.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                AbstractFish::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.RAY.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                AbstractFish::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.TUNA.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                AbstractSchoolingBigFish::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.TANG_FISH.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                AbstractSchoolingFishVarients::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.GIANT_OCTOPUS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.NUDIBRANCH_SLUG.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                AbstractFish::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.GREAT_WHITE.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.ANGLER_FISH.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                WaterMonster::checkSurfaceWaterMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.SEAHORSE.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                AbstractFish::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.CLOWNFISH.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                AbstractSchoolingFishVarients::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.ATLANTIAN_GURDIAN.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.SIREN.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                WaterMonster::checkSurfaceWaterMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.MERFOLK.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                AbstractVillager::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.ATLANTIAN.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR,
                AbstractVillager::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
    }
}

package net.sen.lostworlds.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.entity.mob.*;

public class AtlantisEntities {
    public static final DeferredRegister<EntityType<?>> ATLANTIS_ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, LostWorldsApi.MODID);

    /*
    ATLANTIS
     */
    //Oceans
    //Bosses
    //Mobs
    //Sharks
    public static final String SHARK_ID = "shark";
    public static final RegistryObject<EntityType<SharkEntity>> SHARK =
            ATLANTIS_ENTITY_TYPES.register(SHARK_ID,
                    () -> EntityType.Builder.of(SharkEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1f, 1f).build(SHARK_ID)
            );

    //Moray Eels
    public static final String MORAY_EELS_ID = "moray_eels";
    public static final RegistryObject<EntityType<MorayEelsEntity>> MORAY_EELS =
            ATLANTIS_ENTITY_TYPES.register(MORAY_EELS_ID,
                    () -> EntityType.Builder.of(MorayEelsEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1f, 1f).build(MORAY_EELS_ID)
            );

    //Electric Eels
    public static final String ELECTRIC_EELS_ID = "electric_eels";
    public static final RegistryObject<EntityType<ElectricEelsEntity>> ELECTRIC_EELS =
            ATLANTIS_ENTITY_TYPES.register(ELECTRIC_EELS_ID,
                    () -> EntityType.Builder.of(ElectricEelsEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1f, 1f).build(ELECTRIC_EELS_ID)
            );

    //Animals


    //Jellyfish
    public static final String JELLYFISH_ID = "jellyfish";
    public static final RegistryObject<EntityType<JellyfishEntity>> JELLYFISH =
            ATLANTIS_ENTITY_TYPES.register(JELLYFISH_ID,
                    () -> EntityType.Builder.of(JellyfishEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1f, 1f).build(JELLYFISH_ID)
            );

    //Giant Squids
    public static final String GIANT_SQUID_ID = "giant_squid";
    public static final RegistryObject<EntityType<GiantSquidEntity>> GIANT_SQUID =
            ATLANTIS_ENTITY_TYPES.register(GIANT_SQUID_ID,
                    () -> EntityType.Builder.of(GiantSquidEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1f, 1f).build(GIANT_SQUID_ID)
            );

    //Rays
    public static final String RAY_ID = "ray";
    public static final RegistryObject<EntityType<RayEntity>> RAY =
            ATLANTIS_ENTITY_TYPES.register(RAY_ID,
                    () -> EntityType.Builder.of(RayEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1f, 1f).build(RAY_ID)
            );

    //Neutrals
    //Ocean Floor
    //Bosses
    //Mobs

    //Animals
    //Giant Octopus
    public static final String GIANT_OCTOPUS_ID = "giant_octopus";
    public static final RegistryObject<EntityType<GiantOctopusEntity>> GIANT_OCTOPUS =
            ATLANTIS_ENTITY_TYPES.register(GIANT_OCTOPUS_ID,
                    () -> EntityType.Builder.of(GiantOctopusEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1f, 1f).build(GIANT_OCTOPUS_ID)
            );

    //Nudibranch Slug
    public static final String NUDIBRANCH_SLUG_ID = "nudibranch_slug";
    public static final RegistryObject<EntityType<NudibranchSlugEntity>> NUDIBRANCH_SLUG =
            ATLANTIS_ENTITY_TYPES.register(NUDIBRANCH_SLUG_ID,
                    () -> EntityType.Builder.of(NudibranchSlugEntity::new, MobCategory.WATER_AMBIENT)
                            .sized(1f, 1f).build(NUDIBRANCH_SLUG_ID)
            );

    //Neutrals
    //Ocean Cavern
    //Bosses
    //Great White
    public static final String GREAT_WHITE_ID = "great_white";
    public static final RegistryObject<EntityType<GreatWhiteEntity>> GREAT_WHITE =
            ATLANTIS_ENTITY_TYPES.register(GREAT_WHITE_ID,
                    () -> EntityType.Builder.of(GreatWhiteEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1f, 1f).build(GREAT_WHITE_ID)
            );

    //Mobs
    //angler fish
    public static final String ANGLER_FISH_ID = "angler_fish";
    public static final RegistryObject<EntityType<AnglerFishEntity>> ANGLER_FISH =
            ATLANTIS_ENTITY_TYPES.register(ANGLER_FISH_ID,
                    () -> EntityType.Builder.of(AnglerFishEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1f, 1f).build(ANGLER_FISH_ID)
            );

    //Animals

    //Neutrals
    //Coral
    //Bosses
    //Mobs


    //Animals

    //Seahorses
    public static final String SEAHORSE_ID = "seahorse";
    public static final RegistryObject<EntityType<SeahorseEntity>> SEAHORSE =
            ATLANTIS_ENTITY_TYPES.register(SEAHORSE_ID,
                    () -> EntityType.Builder.of(SeahorseEntity::new, MobCategory.WATER_AMBIENT)
                            .sized(1f, 1f).build(SEAHORSE_ID)
            );

    //Clownfish
    public static final String CLOWNFISH_ID = "clownfish";
    public static final RegistryObject<EntityType<ClownfishEntity>> CLOWNFISH =
            ATLANTIS_ENTITY_TYPES.register(CLOWNFISH_ID,
                    () -> EntityType.Builder.of(ClownfishEntity::new, MobCategory.WATER_AMBIENT)
                            .sized(1f, 1f).build(CLOWNFISH_ID)
            );

    //Tang
    public static final String TANG_FISH_ID = "tang_fish";
    public static final RegistryObject<EntityType<TangFishEntity>> TANG_FISH =
            ATLANTIS_ENTITY_TYPES.register(TANG_FISH_ID,
                    () -> EntityType.Builder.of(TangFishEntity::new, MobCategory.WATER_AMBIENT)
                            .sized(1f, 1f).build(TANG_FISH_ID)
            );

    //Tuna
    public static final String TUNA_ID = "tuna";
    public static final RegistryObject<EntityType<TunaEntity>> TUNA =
            ATLANTIS_ENTITY_TYPES.register(TUNA_ID,
                    () -> EntityType.Builder.of(TunaEntity::new, MobCategory.WATER_AMBIENT)
                            .sized(1f, 1f).build(TUNA_ID)
            );
    //Neutrals
    //Abandoned Cities
    //Bosses
    //Atlantian Guardian
    public static final String ATLANTIAN_GURDIAN_ID = "atlantian_gurdian";
    public static final RegistryObject<EntityType<AtlantianGurdianEntity>> ATLANTIAN_GURDIAN =
            ATLANTIS_ENTITY_TYPES.register(ATLANTIAN_GURDIAN_ID,
                    () -> EntityType.Builder.of(AtlantianGurdianEntity::new, MobCategory.WATER_AMBIENT)
                            .sized(1f, 1f).build(ATLANTIAN_GURDIAN_ID)
            );
    //Mobs
    //Sirens
    public static final String SIREN_ID = "siren";
    public static final RegistryObject<EntityType<SirenEntity>> SIREN =
            ATLANTIS_ENTITY_TYPES.register(SIREN_ID,
                    () -> EntityType.Builder.of(SirenEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1f, 1f).build(SIREN_ID)
            );
    //Animals

    //Neutrals
    //Cities
    //Neutrals
    //Merfolk
    public static final String MERFOLK_ID = "merfolk";
    public static final RegistryObject<EntityType<MerfolkEntity>> MERFOLK =
            ATLANTIS_ENTITY_TYPES.register(MERFOLK_ID,
                    () -> EntityType.Builder.of(MerfolkEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1f, 1f).build(MERFOLK_ID)
            );
    //Atlantian
    public static final String ATLANTIAN_ID = "atlantian";
    public static final RegistryObject<EntityType<AtlantianEntity>> ATLANTIAN =
            ATLANTIS_ENTITY_TYPES.register(ATLANTIAN_ID,
                    () -> EntityType.Builder.of(AtlantianEntity::new, MobCategory.CREATURE)
                            .sized(1f, 1f).build(ATLANTIAN_ID)
            );

    public static void register(IEventBus eventBus) {
        ATLANTIS_ENTITY_TYPES.register(eventBus);
    }
}

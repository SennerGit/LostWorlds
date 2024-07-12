package net.sen.lostworlds.entity;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.entity.mob.HellhoundEntity;
import net.sen.lostworlds.entity.mob.ShadowhoundEntity;
import net.sen.lostworlds.entity.mob.SpectralhoundEntity;

public class UnderworldEntities {
    public static final DeferredRegister<EntityType<?>> UNDERWORLD_ENTITY_TYPES =
            DeferredRegister.create(Registries.ENTITY_TYPE, LostWorldsApi.MODID);

    /*
    UNDERWORLD
     */
    //Tartarus
    //Bosses
    //Titans
//    public static final DeferredHolder<EntityType<?>, EntityType<TitanEntity>> TITANS =
//            ENTITY_TYPES.register("titans",
//                    () -> EntityType.Builder.of(TitanEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("titans")
//            );

            //Cyclopean Wardens
//            public static final DeferredHolder<EntityType<?>, EntityType<CyclopeanWardensEntity>> CYCLOPEAN_WARDENS =
//                    ENTITY_TYPES.register("cyclopean_wardens",
//                            () -> EntityType.Builder.of(CyclopeanWardensEntity::new, MobCategory.CREATURE)
//                                    .sized(1f, 1f).build("cyclopean_wardens")
//                    );

    //Fallen Heroes
//            public static final DeferredHolder<EntityType<?>, EntityType<FallenHeroesEntity>> FALLEN_HEROES =
//                    ENTITY_TYPES.register("fallen_heroes",
//                            () -> EntityType.Builder.of(FallenHeroesEntity::new, MobCategory.CREATURE)
//                                    .sized(1f, 1f).build("fallen_heroes")
//                    );

    //Mobs
            //Chimeras
//    public static final DeferredHolder<EntityType<?>, EntityType<ChimerasEntity>> CHIMERAS =
//            ENTITY_TYPES.register("chimeras",
//                    () -> EntityType.Builder.of(ChimerasEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("chimeras")
//            );

    //Abyssal Abominations
//    public static final DeferredHolder<EntityType<?>, EntityType<AbyssalAbominationsEntity>> ABYSSAL_ABOMINATIONS =
//            ENTITY_TYPES.register("abyssal_abominations",
//                    () -> EntityType.Builder.of(AbyssalAbominationsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("abyssal_abominations")
//            );

    //Wailing Wraiths
//    public static final DeferredHolder<EntityType<?>, EntityType<RhinoEntity>> WAILING_WRAITHS =
//            ENTITY_TYPES.register("wailing_wraiths",
//                    () -> EntityType.Builder.of(RhinoEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("wailing_wraiths")
//            );

    //Tormentors of Tantalus
//    public static final DeferredHolder<EntityType<?>, EntityType<WailingWraithsEntity>> TORMENTORS_OF_TANTALUS =
//            ENTITY_TYPES.register("tormentors_of_tantalus",
//                    () -> EntityType.Builder.of(WailingWraithsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("tormentors_of_tantalus")
//            );

    //Dark Spirits of Retribution
//    public static final DeferredHolder<EntityType<?>, EntityType<DarkSpiritsOfRetributionEntity>> DARK_SPIRITS_OF_RETRIBUTION =
//            ENTITY_TYPES.register("dark_spirits_of_retribution",
//                    () -> EntityType.Builder.of(DarkSpiritsOfRetributionEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("dark_spirits_of_retribution")
//            );

    //Basilisk
//    public static final DeferredHolder<EntityType<?>, EntityType<BasiliskEntity>> BASILISK =
//            ENTITY_TYPES.register("basilisk",
//                    () -> EntityType.Builder.of(BasiliskEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("basilisk")
//            );

    //Asphodel Meadows
            //Neutrals
                //Lost Souls
//    public static final DeferredHolder<EntityType<?>, EntityType<LostSoulsEntity>> LOST_SOULS =
//            ENTITY_TYPES.register("lost_souls",
//                    () -> EntityType.Builder.of(LostSoulsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("lost_souls")
//            );

    //Souls of the Deceased
//    public static final DeferredHolder<EntityType<?>, EntityType<SoulsOfTheDeceasedEntity>> SOULS_OF_THE_DECEASED =
//            ENTITY_TYPES.register("souls_of_the_deceased",
//                    () -> EntityType.Builder.of(SoulsOfTheDeceasedEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("souls_of_the_deceased")
//            );

    //Elysian Fields
        //Bosses
            //Rhadamanthus
//    public static final DeferredHolder<EntityType<?>, EntityType<RhadamanthusEntity>> RHADAMANTHUS =
//            ENTITY_TYPES.register("rhadamanthus",
//                    () -> EntityType.Builder.of(RhadamanthusEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("rhadamanthus")
//            );

            //Minos
//    public static final DeferredHolder<EntityType<?>, EntityType<MinosEntity>> MINOS =
//            ENTITY_TYPES.register("minos",
//                    () -> EntityType.Builder.of(MinosEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("minos")
//            );

            //Aeacus
//    public static final DeferredHolder<EntityType<?>, EntityType<AeacusEntity>> AEACUS =
//            ENTITY_TYPES.register("aeacus",
//                    () -> EntityType.Builder.of(AeacusEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("aeacus")
//            );

        //Mobs
            //Virtuous Spirits
//    public static final DeferredHolder<EntityType<?>, EntityType<VirtuousSpiritsEntity>> VIRTUOUS_SPIRITS =
//            ENTITY_TYPES.register("virtuous_spirits",
//                    () -> EntityType.Builder.of(VirtuousSpiritsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("virtuous_spirits")
//            );
        //Animals
            //Elysian Horses
//    public static final DeferredHolder<EntityType<?>, EntityType<ElysianHorseEntity>> ELYSIAN_HORSE =
//            ENTITY_TYPES.register("elysian_horse",
//                    () -> EntityType.Builder.of(ElysianHorseEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("elysian_horse")
//            );

            //Golden birds
//    public static final DeferredHolder<EntityType<?>, EntityType<GoldenBirdEntity>> GOLDEN_BIRD =
//            ENTITY_TYPES.register("golden_bird",
//                    () -> EntityType.Builder.of(GoldenBirdEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("golden_bird")
//            );

                //Elysian Dolphins
//    public static final DeferredHolder<EntityType<?>, EntityType<ElysianDolphinEntity>> ELYSIAN_DOLPHIN =
//            ENTITY_TYPES.register("elysian_dolphin",
//                    () -> EntityType.Builder.of(ElysianDolphinEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("elysian_dolphin")
//            );

            //Neutrals
            //Peaceful Souls
//    public static final DeferredHolder<EntityType<?>, EntityType<PeacefulSoulEntity>> PEACEFUL_SOUL =
//            ENTITY_TYPES.register("peaceful_soul",
//                    () -> EntityType.Builder.of(PeacefulSoulEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("peaceful_soul")
//            );

    //Isles of the blessed
        //Mobs
            //Champion Souls
//    public static final DeferredHolder<EntityType<?>, EntityType<ChampionSoulEntity>> CHAMPION_SOUL =
//            ENTITY_TYPES.register("champion_soul",
//                    () -> EntityType.Builder.of(ChampionSoulEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("champion_soul")
//            );

    //Dominon of Hades
        //Bosses
            //Cerberus
//    public static final DeferredHolder<EntityType<?>, EntityType<CerberusEntity>> CERBERUS =
//            ENTITY_TYPES.register("cerberus",
//                    () -> EntityType.Builder.of(CerberusEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("cerberus")
//            );
            //Hades
//    public static final DeferredHolder<EntityType<?>, EntityType<HadesEntity>> HADES =
//            ENTITY_TYPES.register("hades",
//                    () -> EntityType.Builder.of(HadesEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("hades")
//            );
            //Hades' Shadows
//    public static final DeferredHolder<EntityType<?>, EntityType<HadesShadowEntity>> HADES_SHADOW =
//            ENTITY_TYPES.register("hades_shadow",
//                    () -> EntityType.Builder.of(HadesShadowEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("hades_shadow")
//            );
            //Bone Golems
//    public static final String SHADOWHOUND_ID = "shadowhound";
//    public static final DeferredHolder<EntityType<?>, EntityType<BoneGolemEntity>> BONE_GOLEM =
//            ENTITY_TYPES.register("bone_golem",
//                    () -> EntityType.Builder.of(BoneGolemEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("bone_golem")
//            );
        //Mobs
    //Hellhound
    public static final String HELLHOUND_ID = "hellhound";
    public static final DeferredHolder<EntityType<?>, EntityType<HellhoundEntity>> HELLHOUND =
            UNDERWORLD_ENTITY_TYPES.register(HELLHOUND_ID,
                    () -> EntityType.Builder.of(HellhoundEntity::new, MobCategory.CREATURE)
                            .sized(1f, 1f).build(HELLHOUND_ID)
            );

    //Shadowhound
    public static final String SHADOWHOUND_ID = "shadowhound";
    public static final DeferredHolder<EntityType<?>, EntityType<ShadowhoundEntity>> SHADOWHOUND =
            UNDERWORLD_ENTITY_TYPES.register(SHADOWHOUND_ID,
                    () -> EntityType.Builder.of(ShadowhoundEntity::new, MobCategory.CREATURE)
                            .sized(1f, 1f).build(SHADOWHOUND_ID)
            );

    //Spectralhound
    public static final String SPECTRALHOUND_ID = "spectralhound";
    public static final DeferredHolder<EntityType<?>, EntityType<SpectralhoundEntity>> SPECTRALHOUND =
            UNDERWORLD_ENTITY_TYPES.register(SPECTRALHOUND_ID,
                    () -> EntityType.Builder.of(SpectralhoundEntity::new, MobCategory.CREATURE)
                            .sized(1f, 1f).build(SPECTRALHOUND_ID)
            );
            //Furies
//    public static final DeferredHolder<EntityType<?>, EntityType<FuriesEntity>> FURIES =
//            ENTITY_TYPES.register("furies",
//                    () -> EntityType.Builder.of(FuriesEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("furies")
//            );
            //Shades
//    public static final DeferredHolder<EntityType<?>, EntityType<ShadeEntity>> SHADE =
//            ENTITY_TYPES.register("shade",
//                    () -> EntityType.Builder.of(ShadeEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("shade")
//            );
            //Revenants
//    public static final DeferredHolder<EntityType<?>, EntityType<RevenantEntity>> REVENANT =
//            ENTITY_TYPES.register("revenant",
//                    () -> EntityType.Builder.of(RevenantEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("revenant")
//            );
            //Harpies
//    public static final DeferredHolder<EntityType<?>, EntityType<HarpieEntity>> HARPIE =
//            ENTITY_TYPES.register("harpie",
//                    () -> EntityType.Builder.of(HarpieEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("harpie")
//            );
        //Animals
            //Shadow Wolves
//    public static final DeferredHolder<EntityType<?>, EntityType<ShadowWolvesEntity>> SHADOW_WOLVES =
//            ENTITY_TYPES.register("shadow_wolves",
//                    () -> EntityType.Builder.of(ShadowWolvesEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("shadow_wolves")
//            );
//            //Gloom Bats
//    public static final DeferredHolder<EntityType<?>, EntityType<GloomBatsEntity>> GLOOM_BATS =
//            ENTITY_TYPES.register("gloom_bats",
//                    () -> EntityType.Builder.of(GloomBatsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("gloom_bats")
//            );
            //Ebon Owls
//    public static final DeferredHolder<EntityType<?>, EntityType<EbonOwlsEntity>> EBON_OWLS =
//            ENTITY_TYPES.register("ebon_owls",
//                    () -> EntityType.Builder.of(EbonOwlsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("ebon_owls")
//            );
    //Stygan Marsh
        //Bosses
            //Medusa
//    public static final DeferredHolder<EntityType<?>, EntityType<MedusaEntity>> MEDUSA =
//            ENTITY_TYPES.register("medusa",
//                    () -> EntityType.Builder.of(MedusaEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("medusa")
//            );
            //Arachnid
//    public static final DeferredHolder<EntityType<?>, EntityType<ArachnidEntity>> ARACHNID =
//            ENTITY_TYPES.register("arachnid",
//                    () -> EntityType.Builder.of(ArachnidEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("arachnid")
//            );
            //Mud Dragons
//    public static final DeferredHolder<EntityType<?>, EntityType<MudDragonEntity>> MUD_DRAGON =
//            ENTITY_TYPES.register("mud_dragon",
//                    () -> EntityType.Builder.of(MudDragonEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("mud_dragon")
//            );
        //Mobs
            //Cursed Spiders
//    public static final DeferredHolder<EntityType<?>, EntityType<CursedSpiderEntity>> CURSED_SPIDER =
//            ENTITY_TYPES.register("cursed_spider",
//                    () -> EntityType.Builder.of(CursedSpiderEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("cursed_spider")
//            );
            //Spirit Raptors
//    public static final DeferredHolder<EntityType<?>, EntityType<SpiritRaptorEntity>> SPIRIT_RAPTOR =
//            ENTITY_TYPES.register("spirit_raptor",
//                    () -> EntityType.Builder.of(SpiritRaptorEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("spirit_raptor")
//            );
            //Shadows
//    public static final DeferredHolder<EntityType<?>, EntityType<ShadowMonsterEntity>> SHADOW =
//            ENTITY_TYPES.register("shadow",
//                    () -> EntityType.Builder.of(ShadowMonsterEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("shadow")
//            );
            //Amphibious Lurkers
//    public static final DeferredHolder<EntityType<?>, EntityType<AmphibiousLurkerEntity>> AMPHIBIOUS_LURKER =
//            ENTITY_TYPES.register("amphibious_lurker",
//                    () -> EntityType.Builder.of(AmphibiousLurkerEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("amphibious_lurker")
//            );
        //Animals
            //Haunting Deer
//    public static final DeferredHolder<EntityType<?>, EntityType<HauntingDeerEntity>> HAUNTING_DEER =
//            ENTITY_TYPES.register("haunting_deer",
//                    () -> EntityType.Builder.of(HauntingDeerEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("haunting_deer")
//            );
            //Shadow Horse
//    public static final DeferredHolder<EntityType<?>, EntityType<ShadowHorseEntity>> SHADOW_HORSE =
//            ENTITY_TYPES.register("shadow_horse",
//                    () -> EntityType.Builder.of(ShadowHorseEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("shadow_horse")
//            );
            //Phantom Alligators
//    public static final DeferredHolder<EntityType<?>, EntityType<PhantomAlligatorEntity>> PHANTOM_ALLIGATOR =
//            ENTITY_TYPES.register("phantom_alligator",
//                    () -> EntityType.Builder.of(PhantomAlligatorEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("phantom_alligator")
//            );
    //Land of Dreams
        //Bosses
            //Dreamcatchers
//    public static final DeferredHolder<EntityType<?>, EntityType<DreamCatcherEntity>> DREAM_CATCHER =
//            ENTITY_TYPES.register("dream_catcher",
//                    () -> EntityType.Builder.of(DreamCatcherEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("dream_catcher")
//            );
        //Mobs
            //Lucid Dreamweavers
//    public static final DeferredHolder<EntityType<?>, EntityType<LucidDreamweaverEntity>> LUCID_DREAMWEAVER =
//            ENTITY_TYPES.register("lucid_dreamweaver",
//                    () -> EntityType.Builder.of(LucidDreamweaverEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("lucid_dreamweaver")
//            );
            //Hypnos' Servants
//    public static final DeferredHolder<EntityType<?>, EntityType<HypnosServantEntity>> HYPNOS_SERVANT =
//            ENTITY_TYPES.register("hypnos_servant",
//                    () -> EntityType.Builder.of(HypnosServantEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("hypnos_servant")
//            );
            //Echoes of Nightmares
//    public static final DeferredHolder<EntityType<?>, EntityType<EchosOfNightmaresEntity>> ECHOS_OF_NIGHTMARES =
//            ENTITY_TYPES.register("echos_of_nightmares",
//                    () -> EntityType.Builder.of(EchosOfNightmaresEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("echos_of_nightmares")
//            );
        //Animals
            //Dream Owl
//    public static final DeferredHolder<EntityType<?>, EntityType<DreamOwlEntity>> DREAM_OWL =
//            ENTITY_TYPES.register("dream_owl",
//                    () -> EntityType.Builder.of(DreamOwlEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("dream_owl")
//            );
        //Neutrals
    //River Styx
        //Bosses
            //Hades' Guardians
//    public static final DeferredHolder<EntityType<?>, EntityType<HadesGuardianEntity>> HADES_GUARDIAN =
//            ENTITY_TYPES.register("hades_guardian",
//                    () -> EntityType.Builder.of(HadesGuardianEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("hades_guardian")
//            );
        //Mobs
            //Vengeful Drowned
//    public static final DeferredHolder<EntityType<?>, EntityType<VengefulDrownedEntity>> VENGEFUL_DROWNED =
//            ENTITY_TYPES.register("vengeful_drowned",
//                    () -> EntityType.Builder.of(VengefulDrownedEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("vengeful_drowned")
//            );
            //Netherwardens
//    public static final DeferredHolder<EntityType<?>, EntityType<NetherWardensEntity>> NETHER_WARDENS =
//            ENTITY_TYPES.register("nether_wardens",
//                    () -> EntityType.Builder.of(NetherWardensEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("nether_wardens")
//            );
            //Acheron Eels
//    public static final DeferredHolder<EntityType<?>, EntityType<AcheronEelsEntity>> ACHERON_EELS =
//            ENTITY_TYPES.register("acheron_eels",
//                    () -> EntityType.Builder.of(AcheronEelsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("acheron_eels")
//            );
            //Echoes of Regret
//    public static final DeferredHolder<EntityType<?>, EntityType<EchoesOfRegretEntity>> ECHOES_OF_REGRET =
//            ENTITY_TYPES.register("echoes_of_regret",
//                    () -> EntityType.Builder.of(EchoesOfRegretEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("echoes_of_regret")
//            );
        //Animals
            //Abyssal Fish
//    public static final DeferredHolder<EntityType<?>, EntityType<AbyssalFishEntity>> ABYSSAL_FISH =
//            ENTITY_TYPES.register("abyssal_fish",
//                    () -> EntityType.Builder.of(AbyssalFishEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("abyssal_fish")
//            );
            //Soul-Seeker Fish
//    public static final DeferredHolder<EntityType<?>, EntityType<SoulSeekerFishEntity>> SOUL_SEEKER_FISH =
//            ENTITY_TYPES.register("soul_seeker_fish",
//                    () -> EntityType.Builder.of(SoulSeekerFishEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("soul_seeker_fish")
//            );
            //Stygian Serpents
//    public static final DeferredHolder<EntityType<?>, EntityType<StygianSerperntsEntity>> STYGIAN_SERPERNTS =
//            ENTITY_TYPES.register("stygian_serpernts",
//                    () -> EntityType.Builder.of(StygianSerperntsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("stygian_serpernts")
//            );
            //Charon's Steeds
//    public static final DeferredHolder<EntityType<?>, EntityType<CharonsSteedsEntity>> CHARONS_STEEDS =
//            ENTITY_TYPES.register("charons_steeds",
//                    () -> EntityType.Builder.of(CharonsSteedsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("charons_steeds")
//            );
            //Psyche's Butterflies
//    public static final DeferredHolder<EntityType<?>, EntityType<PsychesButterfliesEntity>> PSYCHES_BUTTERFLIES =
//            ENTITY_TYPES.register("psyches_butterflies",
//                    () -> EntityType.Builder.of(PsychesButterfliesEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("psyches_butterflies")
//            );
        //Neutrals
            //Fog Wraiths
//    public static final DeferredHolder<EntityType<?>, EntityType<FogWraithEntity>> FOG_WRAITH =
//            ENTITY_TYPES.register("fog_wraith",
//                    () -> EntityType.Builder.of(FogWraithEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("fog_wraith")
//            );

    public static void register(IEventBus eventBus) {
        UNDERWORLD_ENTITY_TYPES.register(eventBus);
    }
}

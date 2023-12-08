package net.sen.lostworlds.entity;

import net.minecraft.world.entity.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.*;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.entity.projectile.*;
import net.sen.lostworlds.entity.mob.*;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, LostWorldsConstants.MODID);

    public static final RegistryObject<EntityType<RhinoEntity>> RHINO =
            ENTITY_TYPES.register("rhino",
                    () -> EntityType.Builder.of(RhinoEntity::new, MobCategory.CREATURE)
                        .sized(2.5f, 2.5f).build("rhino")
            );

    /*
    UNDERWORLD
     */
    //Tartarus
        //Bosses
            //Titans
//    public static final RegistryObject<EntityType<TitanEntity>> TITANS =
//            ENTITY_TYPES.register("titans",
//                    () -> EntityType.Builder.of(TitanEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("titans")
//            );
//
//            //Cyclopean Wardens
//            public static final RegistryObject<EntityType<CyclopeanWardensEntity>> CYCLOPEAN_WARDENS =
//                    ENTITY_TYPES.register("cyclopean_wardens",
//                            () -> EntityType.Builder.of(CyclopeanWardensEntity::new, MobCategory.CREATURE)
//                                    .sized(1f, 1f).build("cyclopean_wardens")
//                    );
//
//    //Fallen Heroes
//            public static final RegistryObject<EntityType<FallenHeroesEntity>> FALLEN_HEROES =
//                    ENTITY_TYPES.register("fallen_heroes",
//                            () -> EntityType.Builder.of(FallenHeroesEntity::new, MobCategory.CREATURE)
//                                    .sized(1f, 1f).build("fallen_heroes")
//                    );
//
//    //Mobs
//            //Chimeras
//    public static final RegistryObject<EntityType<ChimerasEntity>> CHIMERAS =
//            ENTITY_TYPES.register("chimeras",
//                    () -> EntityType.Builder.of(ChimerasEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("chimeras")
//            );
//
//    //Abyssal Abominations
//    public static final RegistryObject<EntityType<AbyssalAbominationsEntity>> ABYSSAL_ABOMINATIONS =
//            ENTITY_TYPES.register("abyssal_abominations",
//                    () -> EntityType.Builder.of(AbyssalAbominationsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("abyssal_abominations")
//            );
//
//    //Wailing Wraiths
//    public static final RegistryObject<EntityType<RhinoEntity>> WAILING_WRAITHS =
//            ENTITY_TYPES.register("wailing_wraiths",
//                    () -> EntityType.Builder.of(RhinoEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("wailing_wraiths")
//            );
//
//    //Tormentors of Tantalus
//    public static final RegistryObject<EntityType<WailingWraithsEntity>> TORMENTORS_OF_TANTALUS =
//            ENTITY_TYPES.register("tormentors_of_tantalus",
//                    () -> EntityType.Builder.of(WailingWraithsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("tormentors_of_tantalus")
//            );
//
//    //Dark Spirits of Retribution
//    public static final RegistryObject<EntityType<DarkSpiritsOfRetributionEntity>> DARK_SPIRITS_OF_RETRIBUTION =
//            ENTITY_TYPES.register("dark_spirits_of_retribution",
//                    () -> EntityType.Builder.of(DarkSpiritsOfRetributionEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("dark_spirits_of_retribution")
//            );
//
//    //Basilisk
//    public static final RegistryObject<EntityType<BasiliskEntity>> BASILISK =
//            ENTITY_TYPES.register("basilisk",
//                    () -> EntityType.Builder.of(BasiliskEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("basilisk")
//            );
//
//    //Asphodel Meadows
//            //Neutrals
//                //Lost Souls
//    public static final RegistryObject<EntityType<LostSoulsEntity>> LOST_SOULS =
//            ENTITY_TYPES.register("lost_souls",
//                    () -> EntityType.Builder.of(LostSoulsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("lost_souls")
//            );
//
//    //Souls of the Deceased
//    public static final RegistryObject<EntityType<SoulsOfTheDeceasedEntity>> SOULS_OF_THE_DECEASED =
//            ENTITY_TYPES.register("souls_of_the_deceased",
//                    () -> EntityType.Builder.of(SoulsOfTheDeceasedEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("souls_of_the_deceased")
//            );
//
//    //Elysian Fields
//        //Bosses
//            //Rhadamanthus
//    public static final RegistryObject<EntityType<RhadamanthusEntity>> RHADAMANTHUS =
//            ENTITY_TYPES.register("rhadamanthus",
//                    () -> EntityType.Builder.of(RhadamanthusEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("rhadamanthus")
//            );
//            //Minos
//    public static final RegistryObject<EntityType<MinosEntity>> MINOS =
//            ENTITY_TYPES.register("minos",
//                    () -> EntityType.Builder.of(MinosEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("minos")
//            );
//            //Aeacus
//    public static final RegistryObject<EntityType<AeacusEntity>> AEACUS =
//            ENTITY_TYPES.register("aeacus",
//                    () -> EntityType.Builder.of(AeacusEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("aeacus")
//            );
//        //Mobs
//            //Virtuous Spirits
//    public static final RegistryObject<EntityType<VirtuousSpiritsEntity>> VIRTUOUS_SPIRITS =
//            ENTITY_TYPES.register("virtuous_spirits",
//                    () -> EntityType.Builder.of(VirtuousSpiritsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("virtuous_spirits")
//            );
//        //Animals
//            //Elysian Horses
//    public static final RegistryObject<EntityType<ElysianHorseEntity>> ELYSIAN_HORSE =
//            ENTITY_TYPES.register("elysian_horse",
//                    () -> EntityType.Builder.of(ElysianHorseEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("elysian_horse")
//            );
//            //Golden birds
//    public static final RegistryObject<EntityType<GoldenBirdEntity>> GOLDEN_BIRD =
//            ENTITY_TYPES.register("golden_bird",
//                    () -> EntityType.Builder.of(GoldenBirdEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("golden_bird")
//            );
//            //Elysian Dolphins
//    public static final RegistryObject<EntityType<ElysianDolphinEntity>> ELYSIAN_DOLPHIN =
//            ENTITY_TYPES.register("elysian_dolphin",
//                    () -> EntityType.Builder.of(ElysianDolphinEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("elysian_dolphin")
//            );
//        //Neutrals
//            //Peaceful Souls
//    public static final RegistryObject<EntityType<PeacefulSoulEntity>> PEACEFUL_SOUL =
//            ENTITY_TYPES.register("peaceful_soul",
//                    () -> EntityType.Builder.of(PeacefulSoulEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("peaceful_soul")
//            );
//
//    //Isles of the blessed
//        //Mobs
//            //Champion Souls
//    public static final RegistryObject<EntityType<ChampionSoulEntity>> CHAMPION_SOUL =
//            ENTITY_TYPES.register("champion_soul",
//                    () -> EntityType.Builder.of(ChampionSoulEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("champion_soul")
//            );
//
//    //Dominon of Hades
//        //Bosses
//            //Cerberus
//    public static final RegistryObject<EntityType<CerberusEntity>> CERBERUS =
//            ENTITY_TYPES.register("cerberus",
//                    () -> EntityType.Builder.of(CerberusEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("cerberus")
//            );
//            //Hades
//    public static final RegistryObject<EntityType<HadesEntity>> HADES =
//            ENTITY_TYPES.register("hades",
//                    () -> EntityType.Builder.of(HadesEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("hades")
//            );
//            //Hades' Shadows
//    public static final RegistryObject<EntityType<HadesShadowEntity>> HADES_SHADOW =
//            ENTITY_TYPES.register("hades_shadow",
//                    () -> EntityType.Builder.of(HadesShadowEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("hades_shadow")
//            );
//            //Bone Golems
//    public static final RegistryObject<EntityType<BoneGolemEntity>> BONE_GOLEM =
//            ENTITY_TYPES.register("bone_golem",
//                    () -> EntityType.Builder.of(BoneGolemEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("bone_golem")
//            );
//        //Mobs
//            //Hellhound
//    public static final RegistryObject<EntityType<HellhoundEntity>> HELLHOUND =
//            ENTITY_TYPES.register("hellhound",
//                    () -> EntityType.Builder.of(HellhoundEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("hellhound")
//            );
//            //Furies
//    public static final RegistryObject<EntityType<FuriesEntity>> FURIES =
//            ENTITY_TYPES.register("furies",
//                    () -> EntityType.Builder.of(FuriesEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("furies")
//            );
//            //Shades
//    public static final RegistryObject<EntityType<ShadeEntity>> SHADE =
//            ENTITY_TYPES.register("shade",
//                    () -> EntityType.Builder.of(ShadeEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("shade")
//            );
//            //Revenants
//    public static final RegistryObject<EntityType<RevenantEntity>> REVENANT =
//            ENTITY_TYPES.register("revenant",
//                    () -> EntityType.Builder.of(RevenantEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("revenant")
//            );
//            //Harpies
//    public static final RegistryObject<EntityType<HarpieEntity>> HARPIE =
//            ENTITY_TYPES.register("harpie",
//                    () -> EntityType.Builder.of(HarpieEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("harpie")
//            );
//        //Animals
//            //Shadow Wolves
//    public static final RegistryObject<EntityType<ShadowWolvesEntity>> SHADOW_WOLVES =
//            ENTITY_TYPES.register("shadow_wolves",
//                    () -> EntityType.Builder.of(ShadowWolvesEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("shadow_wolves")
//            );
//            //Gloom Bats
//    public static final RegistryObject<EntityType<GloomBatsEntity>> GLOOM_BATS =
//            ENTITY_TYPES.register("gloom_bats",
//                    () -> EntityType.Builder.of(GloomBatsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("gloom_bats")
//            );
//            //Ebon Owls
//    public static final RegistryObject<EntityType<EbonOwlsEntity>> EBON_OWLS =
//            ENTITY_TYPES.register("ebon_owls",
//                    () -> EntityType.Builder.of(EbonOwlsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("ebon_owls")
//            );
//    //Stygan Marsh
//        //Bosses
//            //Medusa
//    public static final RegistryObject<EntityType<MedusaEntity>> MEDUSA =
//            ENTITY_TYPES.register("medusa",
//                    () -> EntityType.Builder.of(MedusaEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("medusa")
//            );
//            //Arachnid
//    public static final RegistryObject<EntityType<ArachnidEntity>> ARACHNID =
//            ENTITY_TYPES.register("arachnid",
//                    () -> EntityType.Builder.of(ArachnidEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("arachnid")
//            );
//            //Mud Dragons
//    public static final RegistryObject<EntityType<MudDragonEntity>> MUD_DRAGON =
//            ENTITY_TYPES.register("mud_dragon",
//                    () -> EntityType.Builder.of(MudDragonEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("mud_dragon")
//            );
//        //Mobs
//            //Cursed Spiders
//    public static final RegistryObject<EntityType<CursedSpiderEntity>> CURSED_SPIDER =
//            ENTITY_TYPES.register("cursed_spider",
//                    () -> EntityType.Builder.of(CursedSpiderEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("cursed_spider")
//            );
//            //Spirit Raptors
//    public static final RegistryObject<EntityType<SpiritRaptorEntity>> SPIRIT_RAPTOR =
//            ENTITY_TYPES.register("spirit_raptor",
//                    () -> EntityType.Builder.of(SpiritRaptorEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("spirit_raptor")
//            );
//            //Shadows
//    public static final RegistryObject<EntityType<ShadowMonsterEntity>> SHADOW =
//            ENTITY_TYPES.register("shadow",
//                    () -> EntityType.Builder.of(ShadowMonsterEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("shadow")
//            );
//            //Amphibious Lurkers
//    public static final RegistryObject<EntityType<AmphibiousLurkerEntity>> AMPHIBIOUS_LURKER =
//            ENTITY_TYPES.register("amphibious_lurker",
//                    () -> EntityType.Builder.of(AmphibiousLurkerEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("amphibious_lurker")
//            );
//        //Animals
//            //Haunting Deer
//    public static final RegistryObject<EntityType<HauntingDeerEntity>> HAUNTING_DEER =
//            ENTITY_TYPES.register("haunting_deer",
//                    () -> EntityType.Builder.of(HauntingDeerEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("haunting_deer")
//            );
//            //Shadow Horse
//    public static final RegistryObject<EntityType<ShadowHorseEntity>> SHADOW_HORSE =
//            ENTITY_TYPES.register("shadow_horse",
//                    () -> EntityType.Builder.of(ShadowHorseEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("shadow_horse")
//            );
//            //Phantom Alligators
//    public static final RegistryObject<EntityType<PhantomAlligatorEntity>> PHANTOM_ALLIGATOR =
//            ENTITY_TYPES.register("phantom_alligator",
//                    () -> EntityType.Builder.of(PhantomAlligatorEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("phantom_alligator")
//            );
//    //Land of Dreams
//        //Bosses
//            //Dreamcatchers
//    public static final RegistryObject<EntityType<DreamCatcherEntity>> DREAM_CATCHER =
//            ENTITY_TYPES.register("dream_catcher",
//                    () -> EntityType.Builder.of(DreamCatcherEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("dream_catcher")
//            );
//        //Mobs
//            //Lucid Dreamweavers
//    public static final RegistryObject<EntityType<LucidDreamweaverEntity>> LUCID_DREAMWEAVER =
//            ENTITY_TYPES.register("lucid_dreamweaver",
//                    () -> EntityType.Builder.of(LucidDreamweaverEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("lucid_dreamweaver")
//            );
//            //Hypnos' Servants
//    public static final RegistryObject<EntityType<HypnosServantEntity>> HYPNOS_SERVANT =
//            ENTITY_TYPES.register("hypnos_servant",
//                    () -> EntityType.Builder.of(HypnosServantEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("hypnos_servant")
//            );
//            //Echoes of Nightmares
//    public static final RegistryObject<EntityType<EchosOfNightmaresEntity>> ECHOS_OF_NIGHTMARES =
//            ENTITY_TYPES.register("echos_of_nightmares",
//                    () -> EntityType.Builder.of(EchosOfNightmaresEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("echos_of_nightmares")
//            );
//        //Animals
//            //Dream Owl
//    public static final RegistryObject<EntityType<DreamOwlEntity>> DREAM_OWL =
//            ENTITY_TYPES.register("dream_owl",
//                    () -> EntityType.Builder.of(DreamOwlEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("dream_owl")
//            );
//        //Neutrals
//    //River Styx
//        //Bosses
//            //Hades' Guardians
//    public static final RegistryObject<EntityType<HadesGuardianEntity>> HADES_GUARDIAN =
//            ENTITY_TYPES.register("hades_guardian",
//                    () -> EntityType.Builder.of(HadesGuardianEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("hades_guardian")
//            );
//        //Mobs
//            //Vengeful Drowned
//    public static final RegistryObject<EntityType<VengefulDrownedEntity>> VENGEFUL_DROWNED =
//            ENTITY_TYPES.register("vengeful_drowned",
//                    () -> EntityType.Builder.of(VengefulDrownedEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("vengeful_drowned")
//            );
//            //Netherwardens
//    public static final RegistryObject<EntityType<NetherWardensEntity>> NETHER_WARDENS =
//            ENTITY_TYPES.register("nether_wardens",
//                    () -> EntityType.Builder.of(NetherWardensEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("nether_wardens")
//            );
//            //Acheron Eels
//    public static final RegistryObject<EntityType<AcheronEelsEntity>> ACHERON_EELS =
//            ENTITY_TYPES.register("acheron_eels",
//                    () -> EntityType.Builder.of(AcheronEelsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("acheron_eels")
//            );
//            //Echoes of Regret
//    public static final RegistryObject<EntityType<EchoesOfRegretEntity>> ECHOES_OF_REGRET =
//            ENTITY_TYPES.register("echoes_of_regret",
//                    () -> EntityType.Builder.of(EchoesOfRegretEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("echoes_of_regret")
//            );
//        //Animals
//            //Abyssal Fish
//    public static final RegistryObject<EntityType<AbyssalFishEntity>> ABYSSAL_FISH =
//            ENTITY_TYPES.register("abyssal_fish",
//                    () -> EntityType.Builder.of(AbyssalFishEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("abyssal_fish")
//            );
//            //Soul-Seeker Fish
//    public static final RegistryObject<EntityType<SoulSeekerFishEntity>> SOUL_SEEKER_FISH =
//            ENTITY_TYPES.register("soul_seeker_fish",
//                    () -> EntityType.Builder.of(SoulSeekerFishEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("soul_seeker_fish")
//            );
//            //Stygian Serpents
//    public static final RegistryObject<EntityType<StygianSerperntsEntity>> STYGIAN_SERPERNTS =
//            ENTITY_TYPES.register("stygian_serpernts",
//                    () -> EntityType.Builder.of(StygianSerperntsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("stygian_serpernts")
//            );
//            //Charon's Steeds
//    public static final RegistryObject<EntityType<CharonsSteedsEntity>> CHARONS_STEEDS =
//            ENTITY_TYPES.register("charons_steeds",
//                    () -> EntityType.Builder.of(CharonsSteedsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("charons_steeds")
//            );
//            //Psyche's Butterflies
//    public static final RegistryObject<EntityType<PsychesButterfliesEntity>> PSYCHES_BUTTERFLIES =
//            ENTITY_TYPES.register("psyches_butterflies",
//                    () -> EntityType.Builder.of(PsychesButterfliesEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("psyches_butterflies")
//            );
//        //Neutrals
//            //Fog Wraiths
//    public static final RegistryObject<EntityType<FogWraithEntity>> FOG_WRAITH =
//            ENTITY_TYPES.register("fog_wraith",
//                    () -> EntityType.Builder.of(FogWraithEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("fog_wraith")
//            );
//
//    /*
//    NIDAVELLIR
//     */
//
//    /*
//    ALFHEIMR
//     */
//    //Forests
//        //Bosses
//            //Alpha Werewolves
//    public static final RegistryObject<EntityType<AlphaWerewolvesEntity>> ALPHA_WEREWOLVES =
//            ENTITY_TYPES.register("alpha_werewolves",
//                    () -> EntityType.Builder.of(AlphaWerewolvesEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("alpha_werewolves")
//            );
//
//    //Royal Vampires
//    public static final RegistryObject<EntityType<RoyalVampireEntity>> ROYAL_VAMPIRE =
//            ENTITY_TYPES.register("royal_vampire",
//                    () -> EntityType.Builder.of(RoyalVampireEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("royal_vampire")
//            );
//
//    //Mobs
//            //Wendigos
//    public static final RegistryObject<EntityType<WendigoEntity>> WENDIGO =
//            ENTITY_TYPES.register("wendigo",
//                    () -> EntityType.Builder.of(WendigoEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("wendigo")
//            );
//
//    //Will-o'-the-Wisp
//    public static final RegistryObject<EntityType<WillOWispEntity>> WILL_O_WISP =
//            ENTITY_TYPES.register("will_o_wisp",
//                    () -> EntityType.Builder.of(WillOWispEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("will_o_wisp")
//            );
//
//    //Leshy
//    public static final RegistryObject<EntityType<LeshyEntity>> LESHY =
//            ENTITY_TYPES.register("leshy",
//                    () -> EntityType.Builder.of(LeshyEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("leshy")
//            );
//
//    //Werewolves
//    public static final RegistryObject<EntityType<WerewolfEntity>> WEREWOLF =
//            ENTITY_TYPES.register("werewolf",
//                    () -> EntityType.Builder.of(WerewolfEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("werewolf")
//            );
//
//    //Vampires
//    public static final RegistryObject<EntityType<VampireEntity>> VAMPIRE =
//            ENTITY_TYPES.register("vampire",
//                    () -> EntityType.Builder.of(VampireEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("vampire")
//            );
//
//    //Animals
//            //Unicorns
//    public static final RegistryObject<EntityType<UnicornEntity>> UNICORN =
//            ENTITY_TYPES.register("unicorn",
//                    () -> EntityType.Builder.of(UnicornEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("unicorn")
//            );
//
//    //Kitsune
//    public static final RegistryObject<EntityType<KitsuneEntity>> KITSUNE =
//            ENTITY_TYPES.register("kitsune",
//                    () -> EntityType.Builder.of(KitsuneEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("kitsune")
//            );
//
//    //Perytons
//    public static final RegistryObject<EntityType<PerytonEntity>> PERYTON =
//            ENTITY_TYPES.register("peryton",
//                    () -> EntityType.Builder.of(PerytonEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("peryton")
//            );
//
//    //Neutrals
//            //Elves
//    public static final RegistryObject<EntityType<ElvesEntity>> ELVES =
//            ENTITY_TYPES.register("elves",
//                    () -> EntityType.Builder.of(ElvesEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("elves")
//            );
//
//    //Faries
//    public static final RegistryObject<EntityType<FariesEntity>> FARIES =
//            ENTITY_TYPES.register("faries",
//                    () -> EntityType.Builder.of(FariesEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("faries")
//            );
//
//    //Dryads
//    public static final RegistryObject<EntityType<DryadsEntity>> DRYADS =
//            ENTITY_TYPES.register("dryads",
//                    () -> EntityType.Builder.of(DryadsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("dryads")
//            );
//
//    //Treants
//    public static final RegistryObject<EntityType<TreantsEntity>> TREANTS =
//            ENTITY_TYPES.register("treants",
//                    () -> EntityType.Builder.of(TreantsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("treants")
//            );
//
//    //Nymphs
//    public static final RegistryObject<EntityType<NymphsEntity>> NYMPHS =
//            ENTITY_TYPES.register("nymphs",
//                    () -> EntityType.Builder.of(NymphsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("nymphs")
//            );
//
//    //Centaur
//    public static final RegistryObject<EntityType<CentaurEntity>> CENTAUR =
//            ENTITY_TYPES.register("centaur",
//                    () -> EntityType.Builder.of(CentaurEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("centaur")
//            );
//
//    //Underground
//        //Bosses
//
//    //Mobs
//
//    //Animals
//        //Neutrals
//
//    //Corruption
//        //Bosses
//        //Mobs
//        //Animals
//        //Neutrals
//    //Desert
//        //Bosses
//            //Sandworms
//    public static final RegistryObject<EntityType<SandwormEntity>> SANDWORM =
//            ENTITY_TYPES.register("sandworm",
//                    () -> EntityType.Builder.of(SandwormEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("sandworm")
//            );
//
//    //Mobs
//            //Sand Pirates
//    public static final RegistryObject<EntityType<SandPirateEntity>> SAND_PIRATE =
//            ENTITY_TYPES.register("sand_pirate",
//                    () -> EntityType.Builder.of(SandPirateEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("sand_pirate")
//            );
//
//    //Dust Demons
//    public static final RegistryObject<EntityType<DustDemonEntity>> DUST_DEMON =
//            ENTITY_TYPES.register("dust_demon",
//                    () -> EntityType.Builder.of(DustDemonEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("dust_demon")
//            );
//
//    //Animals
//            //Camel
//    public static final RegistryObject<EntityType<CamelEntity>> CAMEL =
//            ENTITY_TYPES.register("camel",
//                    () -> EntityType.Builder.of(CamelEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("camel")
//            );
//
//    //Giant Scorpians
//    public static final RegistryObject<EntityType<GiantScorpianEntity>> GIANT_SCORPIAN =
//            ENTITY_TYPES.register("giant_scorpian",
//                    () -> EntityType.Builder.of(GiantScorpianEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("giant_scorpian")
//            );
//
//    //Drakes
//    public static final RegistryObject<EntityType<DrakeEntity>> DRAKE =
//            ENTITY_TYPES.register("drake",
//                    () -> EntityType.Builder.of(DrakeEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("drake")
//            );
//
//    //Desert Hawks
//    public static final RegistryObject<EntityType<DesertHawkEntity>> DESERT_HAWK =
//            ENTITY_TYPES.register("desert_hawk",
//                    () -> EntityType.Builder.of(DesertHawkEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("desert_hawk")
//            );
//
//    //Neutrals
//            //Sand Dwellers
//    public static final RegistryObject<EntityType<SandDwellerEntity>> SAND_DWELLER =
//            ENTITY_TYPES.register("sand_dweller",
//                    () -> EntityType.Builder.of(SandDwellerEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("sand_dweller")
//            );
//
//    //Snow
//        //Bosses
//
//    //Mobs
//
//    //Glacial Trolls
//    public static final RegistryObject<EntityType<GlacialTrollEntity>> GLACIAL_TROLL =
//            ENTITY_TYPES.register("glacial_troll",
//                    () -> EntityType.Builder.of(GlacialTrollEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("glacial_troll")
//            );
//
//    //Animals
//
//    //Wisp
//    public static final RegistryObject<EntityType<WispEntity>> WISP =
//            ENTITY_TYPES.register("wisp",
//                    () -> EntityType.Builder.of(WispEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("wisp")
//            );
//
//    //Neutrals
//            //Snow Elves
//    public static final RegistryObject<EntityType<SnowElvesEntity>> SNOW_ELVES =
//            ENTITY_TYPES.register("snow_elves",
//                    () -> EntityType.Builder.of(SnowElvesEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("snow_elves")
//            );
//
//    //Winter Nymphs
//    public static final RegistryObject<EntityType<WinterNymphEntity>> WINTER_NYMPH =
//            ENTITY_TYPES.register("winter_nymph",
//                    () -> EntityType.Builder.of(WinterNymphEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("winter_nymph")
//            );
//
//    //Mountains
//        //Bosses
//
//    //Mobs
//
//    //Mountain Trolls
//    public static final RegistryObject<EntityType<MountainTrollEntity>> MOUNTAIN_TROLL =
//            ENTITY_TYPES.register("mountain_troll",
//                    () -> EntityType.Builder.of(MountainTrollEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("mountain_troll")
//            );
//
//    //Animals
//            //Griffons
//    public static final RegistryObject<EntityType<GriffonEntity>> GRIFFON =
//            ENTITY_TYPES.register("griffon",
//                    () -> EntityType.Builder.of(GriffonEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("griffon")
//            );
//
//    //Wyvrans
//    public static final RegistryObject<EntityType<WyvranEntity>> WYVRAN =
//            ENTITY_TYPES.register("wyvran",
//                    () -> EntityType.Builder.of(WyvranEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("wyvran")
//            );
//
//    //Giant Lizards
//    public static final RegistryObject<EntityType<GiantLizardEntity>> GIANT_LIZARD =
//            ENTITY_TYPES.register("giant_lizard",
//                    () -> EntityType.Builder.of(GiantLizardEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("giant_lizard")
//            );
//
//    //Neutrals
//
//
//    //Water
//        //Bosses
//            //Leviathans
//    public static final RegistryObject<EntityType<LeviathanEntity>> LEVIATHAN =
//            ENTITY_TYPES.register("leviathan",
//                    () -> EntityType.Builder.of(LeviathanEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("leviathan")
//            );
//
//    //Krakens
//    public static final RegistryObject<EntityType<KrakenEntity>> KRAKEN =
//            ENTITY_TYPES.register("kraken",
//                    () -> EntityType.Builder.of(KrakenEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("kraken")
//            );
//
//    //Animals
//
//    //Giant Turtles
//    public static final RegistryObject<EntityType<GiantTurtleEntity>> GIANT_TURTLE =
//            ENTITY_TYPES.register("giant_turtle",
//                    () -> EntityType.Builder.of(GiantTurtleEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("giant_turtle")
//            );
//
//    //Neutrals
//            //Naiads
//    public static final RegistryObject<EntityType<NaiadsEntity>> NAIADS =
//            ENTITY_TYPES.register("naiads",
//                    () -> EntityType.Builder.of(NaiadsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("naiads")
//            );
//
//    //Plains
//    //Animals
//
//    //Swamp
//        //Bosses
//
//    //Hydras
//    public static final RegistryObject<EntityType<HydraEntity>> HYDRA =
//            ENTITY_TYPES.register("hydra",
//                    () -> EntityType.Builder.of(HydraEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("hydra")
//            );
//
//    //Mobs
//    //Swamp Trolls
//    public static final RegistryObject<EntityType<SwampTrollEntity>> SWAMP_TROLL =
//            ENTITY_TYPES.register("swamp_troll",
//                    () -> EntityType.Builder.of(SwampTrollEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("swamp_troll")
//            );
//
//    //Muck Dwellers
//    public static final RegistryObject<EntityType<MuckDwellerEntity>> MUCK_DWELLER =
//            ENTITY_TYPES.register("muck_dweller",
//                    () -> EntityType.Builder.of(MuckDwellerEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("muck_dweller")
//            );
//
//    //Animals
//
//    //Giant Dragonfly
//    public static final RegistryObject<EntityType<GiantDragonfliesEntity>> GIANT_DRAGONFLIES =
//            ENTITY_TYPES.register("giant_dragonflies",
//                    () -> EntityType.Builder.of(GiantDragonfliesEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("giant_dragonflies")
//            );
//
//    //Anacondas
//    public static final RegistryObject<EntityType<AnacondaEntity>> ANACONDA =
//            ENTITY_TYPES.register("anaconda",
//                    () -> EntityType.Builder.of(AnacondaEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("anaconda")
//            );
//
//    //Vampire Bats
//    public static final RegistryObject<EntityType<VampireBatsEntity>> VAMPIRE_BATS =
//            ENTITY_TYPES.register("vampire_bats",
//                    () -> EntityType.Builder.of(VampireBatsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("vampire_bats")
//            );
//
//    //Leviathan Lilies
//    public static final RegistryObject<EntityType<LeviathanLiliesEntity>> LEVIATHAN_LILIES =
//            ENTITY_TYPES.register("leviathan_lilies",
//                    () -> EntityType.Builder.of(LeviathanLiliesEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("leviathan_lilies")
//            );
//
//    //Swamp Apes
//    public static final RegistryObject<EntityType<SwampApesEntity>> SWAMP_APES =
//            ENTITY_TYPES.register("swamp_apes",
//                    () -> EntityType.Builder.of(SwampApesEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("swamp_apes")
//            );
//
//    //Neutrals
//
//    //Swamp Nymphs
//    public static final RegistryObject<EntityType<SwampNymphsEntity>> SWAMP_NYMPHS =
//            ENTITY_TYPES.register("swamp_nymphs",
//                    () -> EntityType.Builder.of(SwampNymphsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("swamp_nymphs")
//            );
//
//    //Lizardfolks
//    public static final RegistryObject<EntityType<LizardfolkEntity>> LIZARDFOLK =
//            ENTITY_TYPES.register("lizardfolk",
//                    () -> EntityType.Builder.of(LizardfolkEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("lizardfolk")
//            );
//
//    //Swamp Faries
//    public static final RegistryObject<EntityType<SwampFariesEntity>> SWAMP_FARIES =
//            ENTITY_TYPES.register("swamp_faries",
//                    () -> EntityType.Builder.of(SwampFariesEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("swamp_faries")
//            );


    /*
    ATLANTIS
     */
    //Oceans
        //Bosses
        //Mobs
            //Sharks
    public static final RegistryObject<EntityType<SharkEntity>> SHARK =
            ENTITY_TYPES.register("shark",
                    () -> EntityType.Builder.of(SharkEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1f, 1f).build("shark")
            );

    //Moray Eels
    public static final RegistryObject<EntityType<MorayEelsEntity>> MORAY_EELS =
            ENTITY_TYPES.register("moray_eels",
                    () -> EntityType.Builder.of(MorayEelsEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1f, 1f).build("moray_eels")
            );

    //Electric Eels
    public static final RegistryObject<EntityType<ElectricEelsEntity>> ELECTRIC_EELS =
            ENTITY_TYPES.register("electric_eels",
                    () -> EntityType.Builder.of(ElectricEelsEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1f, 1f).build("electric_eels")
            );

    //Animals


    //Jellyfish
    public static final RegistryObject<EntityType<JellyfishEntity>> JELLYFISH =
            ENTITY_TYPES.register("jellyfish",
                    () -> EntityType.Builder.of(JellyfishEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1f, 1f).build("jellyfish")
            );

    //Giant Squids
    public static final RegistryObject<EntityType<GiantSquidEntity>> GIANT_SQUID =
            ENTITY_TYPES.register("giant_squid",
                    () -> EntityType.Builder.of(GiantSquidEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1f, 1f).build("giant_squid")
            );

    //Rays
    public static final RegistryObject<EntityType<RayEntity>> RAY =
            ENTITY_TYPES.register("ray",
                    () -> EntityType.Builder.of(RayEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1f, 1f).build("ray")
            );

    //Neutrals
    //Ocean Floor
        //Bosses
        //Mobs

    //Animals
            //Giant Octopus
    public static final RegistryObject<EntityType<GiantOctopusEntity>> GIANT_OCTOPUS =
            ENTITY_TYPES.register("giant_octopus",
                    () -> EntityType.Builder.of(GiantOctopusEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1f, 1f).build("giant_octopus")
            );

    //Nudibranch Slug
    public static final RegistryObject<EntityType<NudibranchSlugEntity>> NUDIBRANCH_SLUG =
            ENTITY_TYPES.register("nudibranch_slug",
                    () -> EntityType.Builder.of(NudibranchSlugEntity::new, MobCategory.WATER_AMBIENT)
                            .sized(1f, 1f).build("nudibranch_slug")
            );

    //Neutrals
    //Ocean Cavern
        //Bosses
            //Great White
    public static final RegistryObject<EntityType<GreatWhiteEntity>> GREAT_WHITE =
            ENTITY_TYPES.register("great_white",
                    () -> EntityType.Builder.of(GreatWhiteEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1f, 1f).build("great_white")
            );

    //Mobs
    //angler fish
    public static final RegistryObject<EntityType<AnglerFishEntity>> ANGLER_FISH =
            ENTITY_TYPES.register("angler_fish",
                    () -> EntityType.Builder.of(AnglerFishEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1f, 1f).build("angler_fish")
            );

    //Animals

    //Neutrals
    //Coral
        //Bosses
        //Mobs


    //Animals

            //Seahorses
    public static final RegistryObject<EntityType<SeahorseEntity>> SEAHORSE =
            ENTITY_TYPES.register("seahorse",
                    () -> EntityType.Builder.of(SeahorseEntity::new, MobCategory.WATER_AMBIENT)
                            .sized(1f, 1f).build("seahorse")
            );

            //Clownfish
    public static final RegistryObject<EntityType<ClownfishEntity>> CLOWNFISH =
            ENTITY_TYPES.register("clownfish",
                    () -> EntityType.Builder.of(ClownfishEntity::new, MobCategory.WATER_AMBIENT)
                            .sized(1f, 1f).build("clownfish")
            );

            //Tang
    public static final RegistryObject<EntityType<TangFishEntity>> TANG_FISH =
            ENTITY_TYPES.register("tang_fish",
                    () -> EntityType.Builder.of(TangFishEntity::new, MobCategory.WATER_AMBIENT)
                            .sized(1f, 1f).build("tang_fish")
            );

            //Tuna
    public static final RegistryObject<EntityType<TunaEntity>> TUNA =
            ENTITY_TYPES.register("tuna",
                    () -> EntityType.Builder.of(TunaEntity::new, MobCategory.WATER_AMBIENT)
                            .sized(1f, 1f).build("tuna")
            );
        //Neutrals
    //Abandoned Cities
        //Bosses
            //Atlantian Guardian
    public static final RegistryObject<EntityType<AtlantianGurdianEntity>> ATLANTIAN_GURDIAN =
            ENTITY_TYPES.register("atlantian_gurdian",
                    () -> EntityType.Builder.of(AtlantianGurdianEntity::new, MobCategory.WATER_AMBIENT)
                            .sized(1f, 1f).build("atlantian_gurdian")
            );
        //Mobs
            //Sirens
    public static final RegistryObject<EntityType<SirenEntity>> SIREN =
            ENTITY_TYPES.register("siren",
                    () -> EntityType.Builder.of(SirenEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1f, 1f).build("siren")
            );
        //Animals

        //Neutrals
    //Cities
        //Neutrals
            //Merfolk
    public static final RegistryObject<EntityType<MerfolkEntity>> MERFOLK =
            ENTITY_TYPES.register("merfolk",
                    () -> EntityType.Builder.of(MerfolkEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1f, 1f).build("merfolk")
            );
            //Atlantian
    public static final RegistryObject<EntityType<AtlantianEntity>> ATLANTIAN =
            ENTITY_TYPES.register("atlantian",
                    () -> EntityType.Builder.of(AtlantianEntity::new, MobCategory.CREATURE)
                            .sized(1f, 1f).build("atlantian")
            );

    /*
    SKYOPIA
     */
//Bosses
    //Sky Shark
//    public static final RegistryObject<EntityType<SkySharkEntity>> SKY_SHARK =
//            ENTITY_TYPES.register("sky_shark",
//                    () -> EntityType.Builder.of(SkySharkEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("sky_shark")
//            );
//Mobs
//Animals
    //Sky Whales
//    public static final RegistryObject<EntityType<SkyWhaleEntity>> SKY_WHALE =
//            ENTITY_TYPES.register("sky_whale",
//                    () -> EntityType.Builder.of(SkyWhaleEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("sky_whale")
//            );
//Neutrals

    /*
    PROJECTILES
     */
    public static final RegistryObject<EntityType<DiceProjectileEntity>> DICE_PROJECTILE =
            ENTITY_TYPES.register("dice_projectile",
                    () -> EntityType.Builder.<DiceProjectileEntity>of(DiceProjectileEntity::new, MobCategory.MISC)
                            .sized(0.5f, 0.5f)
                            .clientTrackingRange(4)
                            .updateInterval(20)
                            .setCustomClientFactory((spawnEntity, level) -> new DiceProjectileEntity(level))
                            .build("dice_projectile")
            );

    public static final RegistryObject<EntityType<MagicGorganProjectileEntity>> MAGIC_GORGAN_PROJECTILE =
            ENTITY_TYPES.register("magic_gorgan_projectile",
                    () -> EntityType.Builder.<MagicGorganProjectileEntity>of(MagicGorganProjectileEntity::new, MobCategory.MISC)
                            .sized(0.5f, 0.5f)
                            .clientTrackingRange(4)
                            .updateInterval(20)
                            .build("magic_gorgan_projectile")
            );

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}

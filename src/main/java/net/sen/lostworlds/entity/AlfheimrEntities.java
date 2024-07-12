package net.sen.lostworlds.entity;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.entity.mob.ElvesEntity;

public class AlfheimrEntities {
    public static final DeferredRegister<EntityType<?>> ALFHEIMR_ENTITY_TYPES =
            DeferredRegister.create(Registries.ENTITY_TYPE, LostWorldsApi.MODID);

    /*
    ALFHEIMR
     */
    //Forests
        //Bosses
            //Alpha Werewolves
//    public static final DeferredHolder<EntityType<?>, EntityType<AlphaWerewolvesEntity>> ALPHA_WEREWOLVES =
//            ENTITY_TYPES.register("alpha_werewolves",
//                    () -> EntityType.Builder.of(AlphaWerewolvesEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("alpha_werewolves")
//            );

    //Royal Vampires
//    public static final DeferredHolder<EntityType<?>, EntityType<RoyalVampireEntity>> ROYAL_VAMPIRE =
//            ENTITY_TYPES.register("royal_vampire",
//                    () -> EntityType.Builder.of(RoyalVampireEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("royal_vampire")
//            );

    //Mobs
            //Wendigos
//    public static final DeferredHolder<EntityType<?>, EntityType<WendigoEntity>> WENDIGO =
//            ENTITY_TYPES.register("wendigo",
//                    () -> EntityType.Builder.of(WendigoEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("wendigo")
//            );

    //Will-o'-the-Wisp
//    public static final DeferredHolder<EntityType<?>, EntityType<WillOWispEntity>> WILL_O_WISP =
//            ENTITY_TYPES.register("will_o_wisp",
//                    () -> EntityType.Builder.of(WillOWispEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("will_o_wisp")
//            );

    //Leshy
//    public static final DeferredHolder<EntityType<?>, EntityType<LeshyEntity>> LESHY =
//            ENTITY_TYPES.register("leshy",
//                    () -> EntityType.Builder.of(LeshyEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("leshy")
//            );

    //Werewolves
//    public static final DeferredHolder<EntityType<?>, EntityType<WerewolfEntity>> WEREWOLF =
//            ENTITY_TYPES.register("werewolf",
//                    () -> EntityType.Builder.of(WerewolfEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("werewolf")
//            );

    //Vampires
//    public static final DeferredHolder<EntityType<?>, EntityType<VampireEntity>> VAMPIRE =
//            ENTITY_TYPES.register("vampire",
//                    () -> EntityType.Builder.of(VampireEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("vampire")
//            );

    //Animals
            //Unicorns
//    public static final DeferredHolder<EntityType<?>, EntityType<UnicornEntity>> UNICORN =
//            ENTITY_TYPES.register("unicorn",
//                    () -> EntityType.Builder.of(UnicornEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("unicorn")
//            );

    //Kitsune
//    public static final DeferredHolder<EntityType<?>, EntityType<KitsuneEntity>> KITSUNE =
//            ENTITY_TYPES.register("kitsune",
//                    () -> EntityType.Builder.of(KitsuneEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("kitsune")
//            );

    //Perytons
//    public static final DeferredHolder<EntityType<?>, EntityType<PerytonEntity>> PERYTON =
//            ENTITY_TYPES.register("peryton",
//                    () -> EntityType.Builder.of(PerytonEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("peryton")
//            );

    //Neutrals
    //Elves
    public static final String ELVES_ID = "elves";
    public static final DeferredHolder<EntityType<?>, EntityType<ElvesEntity>> ELVES =
            ALFHEIMR_ENTITY_TYPES.register(ELVES_ID,
                    () -> EntityType.Builder.of(ElvesEntity::new, MobCategory.CREATURE)
                            .sized(1f, 1f).build(ELVES_ID)
            );

    //Faries
//    public static final DeferredHolder<EntityType<?>, EntityType<FariesEntity>> FARIES =
//            ENTITY_TYPES.register("faries",
//                    () -> EntityType.Builder.of(FariesEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("faries")
//            );

    //Dryads
//    public static final DeferredHolder<EntityType<?>, EntityType<DryadsEntity>> DRYADS =
//            ENTITY_TYPES.register("dryads",
//                    () -> EntityType.Builder.of(DryadsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("dryads")
//            );

    //Treants
//    public static final DeferredHolder<EntityType<?>, EntityType<TreantsEntity>> TREANTS =
//            ENTITY_TYPES.register("treants",
//                    () -> EntityType.Builder.of(TreantsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("treants")
//            );

    //Nymphs
//    public static final DeferredHolder<EntityType<?>, EntityType<NymphsEntity>> NYMPHS =
//            ENTITY_TYPES.register("nymphs",
//                    () -> EntityType.Builder.of(NymphsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("nymphs")
//            );

    //Centaur
//    public static final DeferredHolder<EntityType<?>, EntityType<CentaurEntity>> CENTAUR =
//            ENTITY_TYPES.register("centaur",
//                    () -> EntityType.Builder.of(CentaurEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("centaur")
//            );

    //Underground
        //Bosses

    //Mobs

    //Animals
        //Neutrals

    //Corruption
        //Bosses
        //Mobs
        //Animals
        //Neutrals
    //Desert
        //Bosses
            //Sandworms
//    public static final DeferredHolder<EntityType<?>, EntityType<SandwormEntity>> SANDWORM =
//            ENTITY_TYPES.register("sandworm",
//                    () -> EntityType.Builder.of(SandwormEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("sandworm")
//            );

    //Mobs
            //Sand Pirates
//    public static final DeferredHolder<EntityType<?>, EntityType<SandPirateEntity>> SAND_PIRATE =
//            ENTITY_TYPES.register("sand_pirate",
//                    () -> EntityType.Builder.of(SandPirateEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("sand_pirate")
//            );

    //Dust Demons
//    public static final DeferredHolder<EntityType<?>, EntityType<DustDemonEntity>> DUST_DEMON =
//            ENTITY_TYPES.register("dust_demon",
//                    () -> EntityType.Builder.of(DustDemonEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("dust_demon")
//            );

    //Animals
            //Camel
//    public static final DeferredHolder<EntityType<?>, EntityType<CamelEntity>> CAMEL =
//            ENTITY_TYPES.register("camel",
//                    () -> EntityType.Builder.of(CamelEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("camel")
//            );

    //Giant Scorpians
//    public static final DeferredHolder<EntityType<?>, EntityType<GiantScorpianEntity>> GIANT_SCORPIAN =
//            ENTITY_TYPES.register("giant_scorpian",
//                    () -> EntityType.Builder.of(GiantScorpianEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("giant_scorpian")
//            );

    //Drakes
//    public static final DeferredHolder<EntityType<?>, EntityType<DrakeEntity>> DRAKE =
//            ENTITY_TYPES.register("drake",
//                    () -> EntityType.Builder.of(DrakeEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("drake")
//            );

    //Desert Hawks
//    public static final DeferredHolder<EntityType<?>, EntityType<DesertHawkEntity>> DESERT_HAWK =
//            ENTITY_TYPES.register("desert_hawk",
//                    () -> EntityType.Builder.of(DesertHawkEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("desert_hawk")
//            );

    //Neutrals
            //Sand Dwellers
//    public static final DeferredHolder<EntityType<?>, EntityType<SandDwellerEntity>> SAND_DWELLER =
//            ENTITY_TYPES.register("sand_dweller",
//                    () -> EntityType.Builder.of(SandDwellerEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("sand_dweller")
//            );

    //Snow
        //Bosses

    //Mobs

    //Glacial Trolls
//    public static final DeferredHolder<EntityType<?>, EntityType<GlacialTrollEntity>> GLACIAL_TROLL =
//            ENTITY_TYPES.register("glacial_troll",
//                    () -> EntityType.Builder.of(GlacialTrollEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("glacial_troll")
//            );

    //Animals

    //Wisp
//    public static final DeferredHolder<EntityType<?>, EntityType<WispEntity>> WISP =
//            ENTITY_TYPES.register("wisp",
//                    () -> EntityType.Builder.of(WispEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("wisp")
//            );

    //Neutrals
            //Snow Elves
//    public static final DeferredHolder<EntityType<?>, EntityType<SnowElvesEntity>> SNOW_ELVES =
//            ENTITY_TYPES.register("snow_elves",
//                    () -> EntityType.Builder.of(SnowElvesEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("snow_elves")
//            );

    //Winter Nymphs
//    public static final DeferredHolder<EntityType<?>, EntityType<WinterNymphEntity>> WINTER_NYMPH =
//            ENTITY_TYPES.register("winter_nymph",
//                    () -> EntityType.Builder.of(WinterNymphEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("winter_nymph")
//            );

    //Mountains
        //Bosses

    //Mobs

    //Mountain Trolls
//    public static final DeferredHolder<EntityType<?>, EntityType<MountainTrollEntity>> MOUNTAIN_TROLL =
//            ENTITY_TYPES.register("mountain_troll",
//                    () -> EntityType.Builder.of(MountainTrollEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("mountain_troll")
//            );

    //Animals
            //Griffons
//    public static final DeferredHolder<EntityType<?>, EntityType<GriffonEntity>> GRIFFON =
//            ENTITY_TYPES.register("griffon",
//                    () -> EntityType.Builder.of(GriffonEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("griffon")
//            );

    //Wyvrans
//    public static final DeferredHolder<EntityType<?>, EntityType<WyvranEntity>> WYVRAN =
//            ENTITY_TYPES.register("wyvran",
//                    () -> EntityType.Builder.of(WyvranEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("wyvran")
//            );

    //Giant Lizards
//    public static final DeferredHolder<EntityType<?>, EntityType<GiantLizardEntity>> GIANT_LIZARD =
//            ENTITY_TYPES.register("giant_lizard",
//                    () -> EntityType.Builder.of(GiantLizardEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("giant_lizard")
//            );

    //Neutrals


    //Water
        //Bosses
            //Leviathans
//    public static final DeferredHolder<EntityType<?>, EntityType<LeviathanEntity>> LEVIATHAN =
//            ENTITY_TYPES.register("leviathan",
//                    () -> EntityType.Builder.of(LeviathanEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("leviathan")
//            );

    //Krakens
//    public static final DeferredHolder<EntityType<?>, EntityType<KrakenEntity>> KRAKEN =
//            ENTITY_TYPES.register("kraken",
//                    () -> EntityType.Builder.of(KrakenEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("kraken")
//            );

    //Animals

    //Giant Turtles
//    public static final DeferredHolder<EntityType<?>, EntityType<GiantTurtleEntity>> GIANT_TURTLE =
//            ENTITY_TYPES.register("giant_turtle",
//                    () -> EntityType.Builder.of(GiantTurtleEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("giant_turtle")
//            );

    //Neutrals
            //Naiads
//    public static final DeferredHolder<EntityType<?>, EntityType<NaiadsEntity>> NAIADS =
//            ENTITY_TYPES.register("naiads",
//                    () -> EntityType.Builder.of(NaiadsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("naiads")
//            );

    //Plains
    //Animals

    //Swamp
        //Bosses

    //Hydras
//    public static final DeferredHolder<EntityType<?>, EntityType<HydraEntity>> HYDRA =
//            ENTITY_TYPES.register("hydra",
//                    () -> EntityType.Builder.of(HydraEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("hydra")
//            );

    //Mobs
    //Swamp Trolls
//    public static final DeferredHolder<EntityType<?>, EntityType<SwampTrollEntity>> SWAMP_TROLL =
//            ENTITY_TYPES.register("swamp_troll",
//                    () -> EntityType.Builder.of(SwampTrollEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("swamp_troll")
//            );

    //Muck Dwellers
//    public static final DeferredHolder<EntityType<?>, EntityType<MuckDwellerEntity>> MUCK_DWELLER =
//            ENTITY_TYPES.register("muck_dweller",
//                    () -> EntityType.Builder.of(MuckDwellerEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("muck_dweller")
//            );

    //Animals

    //Giant Dragonfly
//    public static final DeferredHolder<EntityType<?>, EntityType<GiantDragonfliesEntity>> GIANT_DRAGONFLIES =
//            ENTITY_TYPES.register("giant_dragonflies",
//                    () -> EntityType.Builder.of(GiantDragonfliesEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("giant_dragonflies")
//            );

    //Anacondas
//    public static final DeferredHolder<EntityType<?>, EntityType<AnacondaEntity>> ANACONDA =
//            ENTITY_TYPES.register("anaconda",
//                    () -> EntityType.Builder.of(AnacondaEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("anaconda")
//            );

    //Vampire Bats
//    public static final DeferredHolder<EntityType<?>, EntityType<VampireBatsEntity>> VAMPIRE_BATS =
//            ENTITY_TYPES.register("vampire_bats",
//                    () -> EntityType.Builder.of(VampireBatsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("vampire_bats")
//            );

    //Leviathan Lilies
//    public static final DeferredHolder<EntityType<?>, EntityType<LeviathanLiliesEntity>> LEVIATHAN_LILIES =
//            ENTITY_TYPES.register("leviathan_lilies",
//                    () -> EntityType.Builder.of(LeviathanLiliesEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("leviathan_lilies")
//            );

    //Swamp Apes
//    public static final DeferredHolder<EntityType<?>, EntityType<SwampApesEntity>> SWAMP_APES =
//            ENTITY_TYPES.register("swamp_apes",
//                    () -> EntityType.Builder.of(SwampApesEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("swamp_apes")
//            );

    //Neutrals

    //Swamp Nymphs
//    public static final DeferredHolder<EntityType<?>, EntityType<SwampNymphsEntity>> SWAMP_NYMPHS =
//            ENTITY_TYPES.register("swamp_nymphs",
//                    () -> EntityType.Builder.of(SwampNymphsEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("swamp_nymphs")
//            );

    //Lizardfolks
//    public static final DeferredHolder<EntityType<?>, EntityType<LizardfolkEntity>> LIZARDFOLK =
//            ENTITY_TYPES.register("lizardfolk",
//                    () -> EntityType.Builder.of(LizardfolkEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("lizardfolk")
//            );

    //Swamp Faries
//    public static final DeferredHolder<EntityType<?>, EntityType<SwampFariesEntity>> SWAMP_FARIES =
//            ENTITY_TYPES.register("swamp_faries",
//                    () -> EntityType.Builder.of(SwampFariesEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("swamp_faries")
//            );

    public static void register(IEventBus eventBus) {
        ALFHEIMR_ENTITY_TYPES.register(eventBus);
    }
}

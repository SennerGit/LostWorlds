package net.sen.lostworlds.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.entity.*;

public class ModSpawnEggs {
    public static final DeferredRegister<Item> SPAWN_EGGS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LostWorldsApi.MODID);

    //Spawn Egg
    public static final RegistryObject<Item> RHINO_SPAWN_EGG = SPAWN_EGGS.register(ModEntities.RHINO_ID + "_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.RHINO, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final RegistryObject<Item> HELLHOUND_SPAWN_EGG = SPAWN_EGGS.register(UnderworldEntities.HELLHOUND_ID + "_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.RHINO, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final RegistryObject<Item> SHADOWHOUND_SPAWN_EGG = SPAWN_EGGS.register(UnderworldEntities.SHADOWHOUND_ID + "_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.RHINO, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final RegistryObject<Item> SPECTRALHOUND_SPAWN_EGG = SPAWN_EGGS.register(UnderworldEntities.SPECTRALHOUND_ID + "_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.RHINO, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final RegistryObject<Item> DWARVES_SPAWN_EGG = SPAWN_EGGS.register(NidavellirEntities.DWARVES_ID + "_spawn_egg",
            () -> new ForgeSpawnEggItem(NidavellirEntities.DWARVES, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final RegistryObject<Item> VAMPIRE_BAT_SPAWN_EGG = SPAWN_EGGS.register(NidavellirEntities.VAMPIRE_BAT_ID + "_spawn_egg",
            () -> new ForgeSpawnEggItem(NidavellirEntities.VAMPIRE_BAT, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final RegistryObject<Item> CAVE_MOLE_SPAWN_EGG = SPAWN_EGGS.register(NidavellirEntities.CAVE_MOLE_ID + "_spawn_egg",
            () -> new ForgeSpawnEggItem(NidavellirEntities.CAVE_MOLE, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final RegistryObject<Item> ELVES_SPAWN_EGG = SPAWN_EGGS.register(AlfheimrEntities.ELVES_ID + "_spawn_egg",
            () -> new ForgeSpawnEggItem(AlfheimrEntities.ELVES, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final RegistryObject<Item> SHARK_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.SHARK_ID + "_spawn_egg",
            () -> new ForgeSpawnEggItem(AtlantisEntities.SHARK, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final RegistryObject<Item> MORAY_EELS_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.MORAY_EELS_ID + "_spawn_egg",
            () -> new ForgeSpawnEggItem(AtlantisEntities.MORAY_EELS, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final RegistryObject<Item> ELECTRIC_EELS_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.ELECTRIC_EELS_ID + "_spawn_egg",
            () -> new ForgeSpawnEggItem(AtlantisEntities.ELECTRIC_EELS, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final RegistryObject<Item> JELLYFISH_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.JELLYFISH_ID + "_spawn_egg",
            () -> new ForgeSpawnEggItem(AtlantisEntities.JELLYFISH, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final RegistryObject<Item> GIANT_SQUID_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.GIANT_SQUID_ID + "_spawn_egg",
            () -> new ForgeSpawnEggItem(AtlantisEntities.GIANT_SQUID, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final RegistryObject<Item> RAY_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.RAY_ID + "_spawn_egg",
            () -> new ForgeSpawnEggItem(AtlantisEntities.RAY, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final RegistryObject<Item> GIANT_OCTOPUS_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.GIANT_OCTOPUS_ID + "_spawn_egg",
            () -> new ForgeSpawnEggItem(AtlantisEntities.GIANT_OCTOPUS, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final RegistryObject<Item> NUDIBRANCH_SLUG_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.NUDIBRANCH_SLUG_ID + "_spawn_egg",
            () -> new ForgeSpawnEggItem(AtlantisEntities.NUDIBRANCH_SLUG, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final RegistryObject<Item> GREAT_WHITE_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.GREAT_WHITE_ID + "_spawn_egg",
            () -> new ForgeSpawnEggItem(AtlantisEntities.GREAT_WHITE, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final RegistryObject<Item> ANGLER_FISH_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.ANGLER_FISH_ID + "_spawn_egg",
            () -> new ForgeSpawnEggItem(AtlantisEntities.ANGLER_FISH, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final RegistryObject<Item> SEAHORSE_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.SEAHORSE_ID + "_spawn_egg",
            () -> new ForgeSpawnEggItem(AtlantisEntities.SEAHORSE, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final RegistryObject<Item> CLOWNFISH_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.CLOWNFISH_ID + "_spawn_egg",
            () -> new ForgeSpawnEggItem(AtlantisEntities.CLOWNFISH, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final RegistryObject<Item> ATLANTIAN_GURDIAN_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.ATLANTIAN_GURDIAN_ID + "_spawn_egg",
            () -> new ForgeSpawnEggItem(AtlantisEntities.ATLANTIAN_GURDIAN, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final RegistryObject<Item> SIREN_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.SIREN_ID + "_spawn_egg",
            () -> new ForgeSpawnEggItem(AtlantisEntities.SIREN, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final RegistryObject<Item> MERFOLK_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.MERFOLK_ID + "_spawn_egg",
            () -> new ForgeSpawnEggItem(AtlantisEntities.MERFOLK, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final RegistryObject<Item> ATLANTIAN_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.ATLANTIAN_ID + "_spawn_egg",
            () -> new ForgeSpawnEggItem(AtlantisEntities.ATLANTIAN, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final RegistryObject<Item> TANG_FISH_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.TANG_FISH_ID + "_spawn_egg",
            () -> new ForgeSpawnEggItem(AtlantisEntities.TANG_FISH, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final RegistryObject<Item> TUNA_SPAWN_EGG = SPAWN_EGGS.register( AtlantisEntities.TUNA_ID + "_spawn_egg",
            () -> new ForgeSpawnEggItem(AtlantisEntities.TUNA, 0x7e9680, 0xc5d1c5, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        SPAWN_EGGS.register(eventBus);
    }
}

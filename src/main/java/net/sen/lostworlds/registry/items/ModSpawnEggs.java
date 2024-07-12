package net.sen.lostworlds.registry.items;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.entity.*;

public class ModSpawnEggs {
    public static final DeferredRegister.Items SPAWN_EGGS = DeferredRegister.createItems(LostWorldsApi.MODID);

    //Spawn Egg
    public static final DeferredItem<Item> RHINO_SPAWN_EGG = SPAWN_EGGS.register(ModEntities.RHINO_ID + "_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.RHINO, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final DeferredItem<Item> HELLHOUND_SPAWN_EGG = SPAWN_EGGS.register(UnderworldEntities.HELLHOUND_ID + "_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.RHINO, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final DeferredItem<Item> SHADOWHOUND_SPAWN_EGG = SPAWN_EGGS.register(UnderworldEntities.SHADOWHOUND_ID + "_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.RHINO, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final DeferredItem<Item> SPECTRALHOUND_SPAWN_EGG = SPAWN_EGGS.register(UnderworldEntities.SPECTRALHOUND_ID + "_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.RHINO, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final DeferredItem<Item> DWARVES_SPAWN_EGG = SPAWN_EGGS.register(NidavellirEntities.DWARVES_ID + "_spawn_egg",
            () -> new DeferredSpawnEggItem(NidavellirEntities.DWARVES, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final DeferredItem<Item> VAMPIRE_BAT_SPAWN_EGG = SPAWN_EGGS.register(NidavellirEntities.VAMPIRE_BAT_ID + "_spawn_egg",
            () -> new DeferredSpawnEggItem(NidavellirEntities.VAMPIRE_BAT, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final DeferredItem<Item> CAVE_MOLE_SPAWN_EGG = SPAWN_EGGS.register(NidavellirEntities.CAVE_MOLE_ID + "_spawn_egg",
            () -> new DeferredSpawnEggItem(NidavellirEntities.CAVE_MOLE, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final DeferredItem<Item> ELVES_SPAWN_EGG = SPAWN_EGGS.register(AlfheimrEntities.ELVES_ID + "_spawn_egg",
            () -> new DeferredSpawnEggItem(AlfheimrEntities.ELVES, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final DeferredItem<Item> SHARK_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.SHARK_ID + "_spawn_egg",
            () -> new DeferredSpawnEggItem(AtlantisEntities.SHARK, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final DeferredItem<Item> MORAY_EELS_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.MORAY_EELS_ID + "_spawn_egg",
            () -> new DeferredSpawnEggItem(AtlantisEntities.MORAY_EELS, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final DeferredItem<Item> ELECTRIC_EELS_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.ELECTRIC_EELS_ID + "_spawn_egg",
            () -> new DeferredSpawnEggItem(AtlantisEntities.ELECTRIC_EELS, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final DeferredItem<Item> JELLYFISH_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.JELLYFISH_ID + "_spawn_egg",
            () -> new DeferredSpawnEggItem(AtlantisEntities.JELLYFISH, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final DeferredItem<Item> GIANT_SQUID_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.GIANT_SQUID_ID + "_spawn_egg",
            () -> new DeferredSpawnEggItem(AtlantisEntities.GIANT_SQUID, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final DeferredItem<Item> RAY_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.RAY_ID + "_spawn_egg",
            () -> new DeferredSpawnEggItem(AtlantisEntities.RAY, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final DeferredItem<Item> GIANT_OCTOPUS_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.GIANT_OCTOPUS_ID + "_spawn_egg",
            () -> new DeferredSpawnEggItem(AtlantisEntities.GIANT_OCTOPUS, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final DeferredItem<Item> NUDIBRANCH_SLUG_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.NUDIBRANCH_SLUG_ID + "_spawn_egg",
            () -> new DeferredSpawnEggItem(AtlantisEntities.NUDIBRANCH_SLUG, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final DeferredItem<Item> GREAT_WHITE_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.GREAT_WHITE_ID + "_spawn_egg",
            () -> new DeferredSpawnEggItem(AtlantisEntities.GREAT_WHITE, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final DeferredItem<Item> ANGLER_FISH_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.ANGLER_FISH_ID + "_spawn_egg",
            () -> new DeferredSpawnEggItem(AtlantisEntities.ANGLER_FISH, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final DeferredItem<Item> SEAHORSE_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.SEAHORSE_ID + "_spawn_egg",
            () -> new DeferredSpawnEggItem(AtlantisEntities.SEAHORSE, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final DeferredItem<Item> CLOWNFISH_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.CLOWNFISH_ID + "_spawn_egg",
            () -> new DeferredSpawnEggItem(AtlantisEntities.CLOWNFISH, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final DeferredItem<Item> ATLANTIAN_GURDIAN_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.ATLANTIAN_GURDIAN_ID + "_spawn_egg",
            () -> new DeferredSpawnEggItem(AtlantisEntities.ATLANTIAN_GURDIAN, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final DeferredItem<Item> SIREN_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.SIREN_ID + "_spawn_egg",
            () -> new DeferredSpawnEggItem(AtlantisEntities.SIREN, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final DeferredItem<Item> MERFOLK_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.MERFOLK_ID + "_spawn_egg",
            () -> new DeferredSpawnEggItem(AtlantisEntities.MERFOLK, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final DeferredItem<Item> ATLANTIAN_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.ATLANTIAN_ID + "_spawn_egg",
            () -> new DeferredSpawnEggItem(AtlantisEntities.ATLANTIAN, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final DeferredItem<Item> TANG_FISH_SPAWN_EGG = SPAWN_EGGS.register(AtlantisEntities.TANG_FISH_ID + "_spawn_egg",
            () -> new DeferredSpawnEggItem(AtlantisEntities.TANG_FISH, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static final DeferredItem<Item> TUNA_SPAWN_EGG = SPAWN_EGGS.register( AtlantisEntities.TUNA_ID + "_spawn_egg",
            () -> new DeferredSpawnEggItem(AtlantisEntities.TUNA, 0x7e9680, 0xc5d1c5, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        SPAWN_EGGS.register(eventBus);
    }
}

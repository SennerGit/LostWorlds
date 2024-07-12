package net.sen.lostworlds.datagen.loottable;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.entity.*;
import net.sen.lostworlds.registry.items.AtlantisItems;

import java.util.stream.Stream;

public class ModEntityLootTables extends EntityLootSubProvider {
    protected ModEntityLootTables(HolderLookup.Provider pRegistries) {
        super(FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    public void generate() {
        this.add(ModEntities.RHINO.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(UnderworldEntities.HELLHOUND.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(UnderworldEntities.SHADOWHOUND.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(UnderworldEntities.SPECTRALHOUND.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(NidavellirEntities.DWARVES.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(NidavellirEntities.VAMPIRE_BAT.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(NidavellirEntities.CAVE_MOLE.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(AlfheimrEntities.ELVES.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(AtlantisEntities.SHARK.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(AtlantisEntities.MORAY_EELS.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(AtlantisEntities.ELECTRIC_EELS.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(AtlantisEntities.TANG_FISH.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(AtlantisItems.TANG_FISH.get()))
                        ));

        this.add(AtlantisEntities.TUNA.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(AtlantisItems.RAW_TUNA.get()))
                        )
        );

        this.add(AtlantisEntities.TUNA.get(),
                ResourceKey.create(Registries.LOOT_TABLE,
                        LostWorldsApi.modLoc("entities/tuna_small")),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(2))
                                .add(LootItem.lootTableItem(AtlantisItems.RAW_TUNA.get()))
                        )
        );

        this.add(AtlantisEntities.TUNA.get(),
                ResourceKey.create(Registries.LOOT_TABLE,
                        LostWorldsApi.modLoc("entities/tuna_mid")),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(3))
                                .add(LootItem.lootTableItem(AtlantisItems.RAW_TUNA.get()))
                        )
        );

        this.add(AtlantisEntities.TUNA.get(),
                ResourceKey.create(Registries.LOOT_TABLE,
                        LostWorldsApi.modLoc("entities/tuna_large")),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(4))
                                .add(LootItem.lootTableItem(AtlantisItems.RAW_TUNA.get()))
                        )
        );

        this.add(AtlantisEntities.TUNA.get(),
                ResourceKey.create(Registries.LOOT_TABLE,
                        LostWorldsApi.modLoc("entities/tuna_giant")),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(5))
                                .add(LootItem.lootTableItem(AtlantisItems.RAW_TUNA.get()))
                        )
        );

        this.add(AtlantisEntities.JELLYFISH.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(AtlantisEntities.GIANT_SQUID.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(AtlantisEntities.RAY.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(AtlantisEntities.GIANT_OCTOPUS.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(AtlantisEntities.NUDIBRANCH_SLUG.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(AtlantisEntities.GREAT_WHITE.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(AtlantisEntities.ANGLER_FISH.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(AtlantisEntities.SEAHORSE.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(AtlantisEntities.CLOWNFISH.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(AtlantisItems.CLOWNFISH.get()))
                        ));

        this.add(AtlantisEntities.ATLANTIAN_GURDIAN.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(AtlantisEntities.SIREN.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(AtlantisEntities.MERFOLK.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(AtlantisEntities.ATLANTIAN.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));
    }

    @Override
    protected Stream<EntityType<?>> getKnownEntityTypes() {
        return BuiltInRegistries.ENTITY_TYPE.stream()
                .filter(entities -> BuiltInRegistries.ENTITY_TYPE.getKey(entities)
                        .getNamespace().equals(LostWorldsApi.MODID));    }
}

package net.sen.lostworlds.datagen.loottable;

import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.parameters.LootContextParam;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.predicates.LootItemKilledByPlayerCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.ForgeRegistries;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.entity.ModEntities;
import net.sen.lostworlds.item.ModItems;
import net.sen.lostworlds.util.ModTags;

import java.util.stream.Stream;

public class ModEntityLootTables extends EntityLootSubProvider {
    protected ModEntityLootTables() {
        super(FeatureFlags.REGISTRY.allFlags());
    }


    @Override
    public void generate() {
        this.add(ModEntities.RHINO.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(ModEntities.DWARVES.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(ModEntities.ELVES.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(ModEntities.SHARK.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(ModEntities.MORAY_EELS.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(ModEntities.ELECTRIC_EELS.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(ModEntities.TANG_FISH.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(ModItems.TANG_FISH.get()))
                        ));

        this.add(ModEntities.TUNA.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(ModItems.RAW_TUNA.get()))
                        )
        );

        this.add(ModEntities.TUNA.get(),
                new ResourceLocation(LostWorldsConstants.MODID, "entities/tuna_small"),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(2))
                                .add(LootItem.lootTableItem(ModItems.RAW_TUNA.get()))
                        )
        );

        this.add(ModEntities.TUNA.get(),
                new ResourceLocation(LostWorldsConstants.MODID, "entities/tuna_mid"),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(3))
                                .add(LootItem.lootTableItem(ModItems.RAW_TUNA.get()))
                        )
        );

        this.add(ModEntities.TUNA.get(),
                new ResourceLocation(LostWorldsConstants.MODID, "entities/tuna_large"),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(4))
                                .add(LootItem.lootTableItem(ModItems.RAW_TUNA.get()))
                        )
        );

        this.add(ModEntities.TUNA.get(),
                new ResourceLocation(LostWorldsConstants.MODID, "entities/tuna_giant"),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(5))
                                .add(LootItem.lootTableItem(ModItems.RAW_TUNA.get()))
                        )
        );

        this.add(ModEntities.JELLYFISH.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(ModEntities.GIANT_SQUID.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(ModEntities.RAY.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(ModEntities.GIANT_OCTOPUS.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(ModEntities.NUDIBRANCH_SLUG.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(ModEntities.GREAT_WHITE.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(ModEntities.ANGLER_FISH.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(ModEntities.SEAHORSE.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(ModEntities.CLOWNFISH.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(ModItems.CLOWNFISH.get()))
                        ));

        this.add(ModEntities.ATLANTIAN_GURDIAN.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(ModEntities.SIREN.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(ModEntities.MERFOLK.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));

        this.add(ModEntities.ATLANTIAN.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1))
                                .add(LootItem.lootTableItem(Items.BEEF))
                        ));
    }

    @Override
    protected Stream<EntityType<?>> getKnownEntityTypes() {
        return ForgeRegistries.ENTITY_TYPES.getValues().stream()
                .filter(entities -> ForgeRegistries.ENTITY_TYPES.getKey(entities)
                        .getNamespace().equals(LostWorldsConstants.MODID));    }
}

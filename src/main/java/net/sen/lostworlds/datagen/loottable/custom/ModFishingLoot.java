package net.sen.lostworlds.datagen.loottable.custom;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.sen.lostworlds.registry.items.AtlantisItems;

import java.util.function.BiConsumer;

public class ModFishingLoot implements LootTableSubProvider {
    protected ModFishingLoot (HolderLookup.Provider pRegistries) {

    }

    @Override
    public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> pOutput) {
        pOutput.accept(BuiltInLootTables.FISHING_FISH, fishingFishLootTable());
    }

    public static LootTable.Builder fishingFishLootTable() {
        return LootTable.lootTable().withPool(LootPool.lootPool()
                .add(LootItem.lootTableItem(AtlantisItems.CLOWNFISH.get()).setWeight(60))
                .add(LootItem.lootTableItem(AtlantisItems.TANG_FISH.get()).setWeight(60))
        );
    }
}

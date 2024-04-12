package net.sen.lostworlds.datagen.loottable.custom;

import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.sen.lostworlds.item.AtlantisItems;
import net.sen.lostworlds.item.ModItems;

import java.util.function.BiConsumer;

public class ModFishingLoot implements LootTableSubProvider {
    @Override
    public void generate(BiConsumer<ResourceLocation, LootTable.Builder> pOutput) {
        pOutput.accept(BuiltInLootTables.FISHING_FISH, fishingFishLootTable());
    }

    public static LootTable.Builder fishingFishLootTable() {
        return LootTable.lootTable().withPool(LootPool.lootPool()
                .add(LootItem.lootTableItem(AtlantisItems.CLOWNFISH.get()).setWeight(60))
                .add(LootItem.lootTableItem(AtlantisItems.TANG_FISH.get()).setWeight(60))
        );
    }
}

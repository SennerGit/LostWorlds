package net.sen.lostworlds.datagen.loottable;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.sen.lostworlds.datagen.loottable.custom.ModFishingLoot;
import net.sen.lostworlds.datagen.loottable.custom.ModLootTable;
import com.mojang.datafixers.util.Pair;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ModLootTableProvider extends LootTableProvider {
    public ModLootTableProvider(PackOutput pOutput) {
        super(pOutput, ModLootTable.allBuiltin(), List.of(
                new LootTableProvider.SubProviderEntry(ModBlockLootTables::new, LootContextParamSets.BLOCK),
                new LootTableProvider.SubProviderEntry(ModFishingLoot::new, LootContextParamSets.FISHING),
                new LootTableProvider.SubProviderEntry(ModEntityLootTables::new, LootContextParamSets.ENTITY)
        ));
    }

//    public static LootTableProvider create(PackOutput packOutput) {
//        return new LootTableProvider(packOutput, Set.of(),
//                List.of(
//                        new LootTableProvider.SubProviderEntry(ModBlockLootTables::new, LootContextParamSets.BLOCK),
//                        new LootTableProvider.SubProviderEntry(ModFishingLoot::new, LootContextParamSets.FISHING),
//                        new LootTableProvider.SubProviderEntry(ModEntityLootTables::new, LootContextParamSets.ENTITY)
//                ));
//    }


//    @Override
//    protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext validationcontext) {
//
//    }
}

package net.sen.lostworlds.datagen.loottable.custom;

import com.google.common.collect.Sets;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;
import net.sen.lostworlds.api.LostWorldsApi;

import java.util.Collections;
import java.util.Locale;
import java.util.Set;

public class ModLootTable {
    private static final Set<ResourceKey<LootTable>> LOOT_TABLES = Sets.newHashSet();
    public static final int DEFAULT_PLACE_FLAG = 2;

    public final ResourceLocation lootTable;
    private ModLootTable(String path) {
        this.lootTable = LostWorldsApi.modLoc(String.format("chests/%s", path).toLowerCase(Locale.ROOT));
    }

    public static Set<ResourceKey<LootTable>> allBuiltin() {
        return Collections.unmodifiableSet(LOOT_TABLES);
    }
}

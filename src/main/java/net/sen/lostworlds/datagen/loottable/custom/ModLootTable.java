package net.sen.lostworlds.datagen.loottable.custom;

import com.google.common.collect.Sets;
import net.minecraft.resources.ResourceLocation;
import net.sen.lostworlds.LostWorlds;

import java.util.Collections;
import java.util.Locale;
import java.util.Set;

public class ModLootTable {
    private static final Set<ResourceLocation> LOOT_TABLES = Sets.newHashSet();
    public static final int DEFAULT_PLACE_FLAG = 2;

    public final ResourceLocation lootTable;
    private ModLootTable(String path) {
        this.lootTable = new ResourceLocation(LostWorlds.MODID, String.format("chests/%s", path).toLowerCase(Locale.ROOT));
    }

    public static Set<ResourceLocation> allBuiltin() {
        return Collections.unmodifiableSet(LOOT_TABLES);
    }
}

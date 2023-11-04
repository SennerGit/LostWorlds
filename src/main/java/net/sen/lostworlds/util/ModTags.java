package net.sen.lostworlds.util;

import com.google.common.base.Preconditions;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.sen.lostworlds.LostWorlds;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class ModTags {
    public static class Biomes {
        private static TagKey<Biome> tag(String name) {
            return BiomeTags.create(new ResourceLocation(LostWorlds.MODID, "biome_tag_" + name).toString());
        }
    }

    public static class Items {
        public static final TagKey<Item> ELDER_WOOD_LOGS = tag("elder_wood_logs");
        public static final TagKey<Item> ELDER_WOOD_STRIPPED_LOGS = tag("elder_wood_stripped_logs");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(LostWorlds.MODID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Blocks {
        public static final TagKey<Block> MAGICAL_BLOCK = tag("magical_block");
        public static final TagKey<Block> NEEDS_NETHER_STEEL_TOOL = tag("needs_nether_steel_tool");
        public static final TagKey<Block> PAXEL_MINEABLE = tag("mineable/paxel");

        public static final TagKey<Block> ELDER_WOOD_LOGS = tag("elder_wood_logs");

        public static final TagKey<Block> ELDER_WOOD_STRIPPED_LOGS = tag("elder_wood_stripped_logs");
        public static final TagKey<Block> UNDERWORLD_PORTAL_FRAME_BLOCKS = tag("underworld_portal_frame_block");
        public static final TagKey<Block> NIDAVELLIR_PORTAL_FRAME_BLOCKS = tag("nidavellir_portal_frame_blocks");
        public static final TagKey<Block> ALFHEIMR_PORTAL_FRAME_BLOCKS = tag("alfheimr_portal_frame_blocks");
        public static final TagKey<Block> ATLANTIS_PORTAL_FRAME_BLOCKS = tag("atlantis_portal_frame_blocks");
        public static final TagKey<Block> SKYOPIA_PORTAL_FRAME_BLOCKS = tag("skyopia_portal_frame_blocks");

        public static final TagKey<Block> MOD_CARVER_REPLACEABLES = tag("mod_carver_replaceables");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(LostWorlds.MODID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    /* Code By BluSunrize
    * https://github.com/BluSunrize/ImmersiveEngineering/blob/1.19.2/src/api/java/blusunrize/immersiveengineering/api/IETags.java#L36
    * */

    private static final Map<TagKey<Block>, TagKey<Item>> toItemTag = new HashMap<>();

    static {
        toItemTag.put(Blocks.ELDER_WOOD_LOGS, Items.ELDER_WOOD_LOGS);
        toItemTag.put(Blocks.ELDER_WOOD_STRIPPED_LOGS, Items.ELDER_WOOD_STRIPPED_LOGS);
    }

    public static TagKey<Item> getItemTag(TagKey<Block> blockTag)
    {
        Preconditions.checkArgument(toItemTag.containsKey(blockTag));
        return toItemTag.get(blockTag);
    }

    public static void forAllBlocktags(BiConsumer<TagKey<Block>, TagKey<Item>> out)
    {
        for(Map.Entry<TagKey<Block>, TagKey<Item>> entry : toItemTag.entrySet())
            out.accept(entry.getKey(), entry.getValue());
    }
}

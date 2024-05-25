package net.sen.lostworlds.util;

import com.google.common.base.Preconditions;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.sen.lostworlds.LostWorldsApi;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class ModTags {
    public static class Biomes {
        public static final TagKey<Biome> IS_ALFHEIMR_OCEAN = tag("is_alfheimr_ocean");
        public static final TagKey<Biome> IS_ALFHEIMR_BADLANDS = tag("is_alfheimr_badlands");
        public static final TagKey<Biome> IS_ALFHEIMR_BEACH = tag("is_alfheimr_beach");
        public static final TagKey<Biome> IS_ALFHEIMR_DEEP_OCEAN = tag("is_alfheimr_deep_ocean");
        public static final TagKey<Biome> IS_ALFHEIMR_FOREST = tag("is_alfheimr_forest");
        public static final TagKey<Biome> IS_ALFHEIMR_MUSHROOM_FOREST = tag("is_alfheimr_mushroom_forest");
        public static final TagKey<Biome> IS_ALFHEIMR_CRYSTAL_FOREST = tag("is_alfheimr_crystal_forest");
        public static final TagKey<Biome> IS_ALFHEIMR_HILL = tag("is_alfheimr_hill");
        public static final TagKey<Biome> IS_ALFHEIMR_JUNGLE = tag("is_alfheimr_jungle");
        public static final TagKey<Biome> IS_ALFHEIMR_MOUNTAIN = tag("is_alfheimr_mountain");
        public static final TagKey<Biome> IS_ALFHEIMR = tag("is_alfheimr");
        public static final TagKey<Biome> IS_ALFHEIMR_RIVER = tag("is_alfheimr_river");
        public static final TagKey<Biome> IS_ALFHEIMR_SAVANNA = tag("is_alfheimr_savanna");
        public static final TagKey<Biome> IS_ALFHEIMR_DESERT = tag("is_alfheimr_desert");
        public static final TagKey<Biome> IS_ALFHEIMR_FLAT_LANDS = tag("is_alfheimr_flat_lands");
        public static final TagKey<Biome> IS_ALFHEIMR_SWAMP = tag("is_alfheimr_swamp");

        public static final TagKey<Biome> HAS_GRAVE = tag("has_structure/has_grave");
        public static final TagKey<Biome> HAS_STONEHENGE = tag("has_structure/has_stonehenge");
        public static final TagKey<Biome> HAS_ELVEN_VILLAGE_ENCHANTED_FOREST = tag("has_structure/has_elven_village_enchanted_forest");
        public static final TagKey<Biome> HAS_DWARVEN_FORTRESS = tag("has_structure/has_dwarven_fortress");

//        private static TagKey<Biome> tag(String name) {
//            return BiomeTags.create(LostWorldsApi.modLoc("biome_tag_" + name).toString());
//        }

        private static TagKey<Biome> tag(String name) {
            return BiomeTags.create(new ResourceLocation(LostWorldsApi.MODID, name).toString());
        }

    }

    public static class CreativeTabs {
        public static final TagKey<Item> GENERAL = tag("general");
        public static final TagKey<Item> UNDERWORLD = tag("underworld");
        public static final TagKey<Item> NIDAVELLIR = tag("nidavellir");
        public static final TagKey<Item> ALFHEIMR = tag("alfheimr");
        public static final TagKey<Item> ATLANTIS = tag("atlantis");
        public static final TagKey<Item> SKYOPIA = tag("skyopia");

        public static final TagKey<Item> METALS = tag("metals");
        public static final TagKey<Item> BUILDING_BLOCKS = tag("building_blocks");
        public static final TagKey<Item> MISCS = tag("miscs");
        public static final TagKey<Item> NATURAL_BLOCKS = tag("natural_blocks");
        public static final TagKey<Item> COLORED_BLOCKS = tag("colored_blocks");
        public static final TagKey<Item> FUNCTIONAL_BLOCKS = tag("functional_blocks");
        public static final TagKey<Item> FARMING = tag("farming");
        public static final TagKey<Item> REDSTONE_BLOCKS = tag("redstone_blocks");
        public static final TagKey<Item> MAGIC = tag("magic");
        public static final TagKey<Item> TOOLS_AND_UTILITIES = tag("tools_and_utilities");
        public static final TagKey<Item> COMBAT = tag("combat");
        public static final TagKey<Item> FOOD_AND_DRINKS = tag("food_and_drinks");
        public static final TagKey<Item> SPAWN_EGGS = tag("spawn_eggs");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(LostWorldsApi.modLoc(name));
        }
    }

    public static class Items {
        public static final TagKey<Item> ELDER_WOOD_LOGS = tag("elder_wood_logs");
        public static final TagKey<Item> ELDER_WOOD_STRIPPED_LOGS = tag("elder_wood_stripped_logs");

        public static final TagKey<Item> OLIVE_LOGS = tag("olive_logs");
        public static final TagKey<Item> OLIVE_STRIPPED_LOGS = tag("olive_stripped_logs");

        public static final TagKey<Item> MYRRH_LOGS = tag("myrrh_logs");
        public static final TagKey<Item> MYRRH_STRIPPED_LOGS = tag("myrrh_stripped_logs");

        public static final TagKey<Item> LAUREL_LOGS = tag("laurel_logs");
        public static final TagKey<Item> LAUREL_STRIPPED_LOGS = tag("laurel_stripped_logs");

        public static final TagKey<Item> CYPRESS_LOGS = tag("cypress_logs");
        public static final TagKey<Item> CYPRESS_STRIPPED_LOGS = tag("cypress_stripped_logs");

        public static final TagKey<Item> BLACK_BIRCH_LOGS = tag("black_birch_logs");
        public static final TagKey<Item> BLACK_BIRCH_STRIPPED_LOGS = tag("black_birch_stripped_logs");

        public static final TagKey<Item> WHITE_OAK_LOGS = tag("white_oak_logs");
        public static final TagKey<Item> WHITE_OAK_STRIPPED_LOGS = tag("white_oak_stripped_logs");

        public static final TagKey<Item> BUR_OAK_LOGS = tag("bur_oak_logs");
        public static final TagKey<Item> BUR_OAK_STRIPPED_LOGS = tag("bur_oak_stripped_logs");

        public static final TagKey<Item> BLOOD_CHERRY_LOGS = tag("blood_cherry_logs");
        public static final TagKey<Item> BLOOD_CHERRY_STRIPPED_LOGS = tag("blood_cherry_stripped_logs");

        public static final TagKey<Item> SACRED_TREE_LOGS = tag("sacred_tree_logs");
        public static final TagKey<Item> SACRED_TREE_STRIPPED_LOGS = tag("sacred_tree_stripped_logs");

        public static final TagKey<Item> WILLOW_LOGS = tag("willow_logs");
        public static final TagKey<Item> WILLOW_STRIPPED_LOGS = tag("willow_stripped_logs");

        public static final TagKey<Item> DEADWOOD_LOGS = tag("deadwood_logs");
        public static final TagKey<Item> DEADWOOD_STRIPPED_LOGS = tag("deadwood_stripped_logs");

        public static final TagKey<Item> EBONY_KINGSWOOD_LOGS = tag("ebony_kingswood_logs");
        public static final TagKey<Item> EBONY_KINGSWOOD_STRIPPED_LOGS = tag("ebony_kingswood_stripped_logs");

        public static final TagKey<Item> IVORY_KINGSWOOD_LOGS = tag("ivory_kingswood_logs");
        public static final TagKey<Item> IVORY_KINGSWOOD_STRIPPED_LOGS = tag("ivory_kingswood_stripped_logs");

        public static final TagKey<Item> WEAVER_LOGS = tag("weaver_logs");
        public static final TagKey<Item> WEAVER_STRIPPED_LOGS = tag("weaver_stripped_logs");


        public static final TagKey<Item> MUSHROOMS = tag("mushrooms");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(LostWorldsApi.modLoc(name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(LostWorldsApi.forgeLoc(name));
        }
    }

    public static class Blocks {
        public static final TagKey<Block> MAGICAL_BLOCK = tag("magical_block");
        public static final TagKey<Block> NEEDS_NETHER_STEEL_TOOL = tag("needs_nether_steel_tool");
        public static final TagKey<Block> PAXEL_MINEABLE = tag("mineable/paxel");

        public static final TagKey<Block> ELDER_WOOD = tag("elder_wood");
        public static final TagKey<Block> ELDER_WOOD_LOGS = tag("elder_wood_logs");
        public static final TagKey<Block> ELDER_WOOD_STRIPPED_LOGS = tag("elder_wood_stripped_logs");

        public static final TagKey<Block> OLIVE_WOOD = tag("olive_wood");
        public static final TagKey<Block> OLIVE_LOGS = tag("olive_logs");
        public static final TagKey<Block> OLIVE_STRIPPED_LOGS = tag("olive_stripped_logs");

        public static final TagKey<Block> MYRRH_WOOD = tag("myrrh_wood");
        public static final TagKey<Block> MYRRH_LOGS = tag("myrrh_logs");
        public static final TagKey<Block> MYRRH_STRIPPED_LOGS = tag("myrrh_stripped_logs");

        public static final TagKey<Block> LAUREL_WOOD = tag("laurel_wood");
        public static final TagKey<Block> LAUREL_LOGS = tag("laurel_logs");
        public static final TagKey<Block> LAUREL_STRIPPED_LOGS = tag("laurel_stripped_logs");

        public static final TagKey<Block> CYPRESS_WOOD = tag("cypress_wood");
        public static final TagKey<Block> CYPRESS_LOGS = tag("cypress_logs");
        public static final TagKey<Block> CYPRESS_STRIPPED_LOGS = tag("cypress_stripped_logs");

        public static final TagKey<Block> BLACK_BIRCH_WOOD = tag("black_birch_wood");
        public static final TagKey<Block> BLACK_BIRCH_LOGS = tag("black_birch_logs");
        public static final TagKey<Block> BLACK_BIRCH_STRIPPED_LOGS = tag("black_birch_stripped_logs");

        public static final TagKey<Block> WHITE_OAK_WOOD = tag("white_oak_wood");
        public static final TagKey<Block> WHITE_OAK_LOGS = tag("white_oak_logs");
        public static final TagKey<Block> WHITE_OAK_STRIPPED_LOGS = tag("white_oak_stripped_logs");

        public static final TagKey<Block> BUR_OAK_WOOD = tag("bur_oak_wood");
        public static final TagKey<Block> BUR_OAK_LOGS = tag("bur_oak_logs");
        public static final TagKey<Block> BUR_OAK_STRIPPED_LOGS = tag("bur_oak_stripped_logs");

        public static final TagKey<Block> BLOOD_CHERRY_WOOD = tag("blood_cherry_wood");
        public static final TagKey<Block> BLOOD_CHERRY_LOGS = tag("blood_cherry_logs");
        public static final TagKey<Block> BLOOD_CHERRY_STRIPPED_LOGS = tag("blood_cherry_stripped_logs");

        public static final TagKey<Block> SACRED_TREE_WOOD = tag("sacred_tree_wood");
        public static final TagKey<Block> SACRED_TREE_LOGS = tag("sacred_tree_logs");
        public static final TagKey<Block> SACRED_TREE_STRIPPED_LOGS = tag("sacred_tree_stripped_logs");

        public static final TagKey<Block> WILLOW_WOOD = tag("willow_wood");
        public static final TagKey<Block> WILLOW_LOGS = tag("willow_logs");
        public static final TagKey<Block> WILLOW_STRIPPED_LOGS = tag("willow_stripped_logs");

        public static final TagKey<Block> DEADWOOD_WOOD = tag("deadwood_wood");
        public static final TagKey<Block> DEADWOOD_LOGS = tag("deadwood_logs");
        public static final TagKey<Block> DEADWOOD_STRIPPED_LOGS = tag("deadwood_stripped_logs");

        public static final TagKey<Block> EBONY_KINGSWOOD_WOOD = tag("ebony_kingswood_wood");
        public static final TagKey<Block> EBONY_KINGSWOOD_LOGS = tag("ebony_kingswood_logs");
        public static final TagKey<Block> EBONY_KINGSWOOD_STRIPPED_LOGS = tag("ebony_kingswood_stripped_logs");

        public static final TagKey<Block> IVORY_KINGSWOOD_WOOD = tag("ivory_kingswood_wood");
        public static final TagKey<Block> IVORY_KINGSWOOD_LOGS = tag("ivory_kingswood_logs");
        public static final TagKey<Block> IVORY_KINGSWOOD_STRIPPED_LOGS = tag("ivory_kingswood_stripped_logs");

        public static final TagKey<Block> WEAVER_WOOD = tag("weaver_wood");
        public static final TagKey<Block> WEAVER_LOGS = tag("weaver_logs");
        public static final TagKey<Block> WEAVER_STRIPPED_LOGS = tag("weaver_stripped_logs");

        public static final TagKey<Block> UNDERWORLD_PORTAL_FRAME_BLOCKS = tag("underworld_portal_frame_block");
        public static final TagKey<Block> NIDAVELLIR_PORTAL_FRAME_BLOCKS = tag("nidavellir_portal_frame_blocks");
        public static final TagKey<Block> ALFHEIMR_PORTAL_FRAME_BLOCKS = tag("alfheimr_portal_frame_blocks");
        public static final TagKey<Block> ATLANTIS_PORTAL_FRAME_BLOCKS = tag("atlantis_portal_frame_blocks");
        public static final TagKey<Block> SKYOPIA_PORTAL_FRAME_BLOCKS = tag("skyopia_portal_frame_blocks");
        public static final TagKey<Block> MYSTIC_GATEWAYS_PORTAL_FRAME_BLOCKS = tag("mystic_gateways_portal_frame_blocks");
        public static final TagKey<Block> MYSTIC_GATEWAYS_PORTAL_CONTROLLER_BLOCKS = tag("mystic_gateways_portal_controller_blocks");

        public static final TagKey<Block> MOD_CARVER_REPLACEABLES = tag("mod_carver_replaceables");

        public static final TagKey<Block> NEEDS_NETHERITE_TOOL = tag("needs_netherite_tool");

        public static final TagKey<Block> MUSHROOMS = tag("mushrooms");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(LostWorldsApi.modLoc(name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(LostWorldsApi.forgeLoc(name));
        }

        private static TagKey<Block> mcTag(String name) {
            return BlockTags.create(LostWorldsApi.mcLoc(name));
        }
    }

    /* Code By BluSunrize
    * https://github.com/BluSunrize/ImmersiveEngineering/blob/1.19.2/src/api/java/blusunrize/immersiveengineering/api/IETags.java#L36
    * */

    private static final Map<TagKey<Block>, TagKey<Item>> toItemTag = new HashMap<>();

    static {
        toItemTag.put(Blocks.ELDER_WOOD_LOGS, Items.ELDER_WOOD_LOGS);
        toItemTag.put(Blocks.ELDER_WOOD_STRIPPED_LOGS, Items.ELDER_WOOD_STRIPPED_LOGS);

        toItemTag.put(Blocks.OLIVE_LOGS, Items.OLIVE_LOGS);
        toItemTag.put(Blocks.OLIVE_STRIPPED_LOGS, Items.OLIVE_STRIPPED_LOGS);

        toItemTag.put(Blocks.MYRRH_LOGS, Items.MYRRH_LOGS);
        toItemTag.put(Blocks.MYRRH_STRIPPED_LOGS, Items.MYRRH_STRIPPED_LOGS);

        toItemTag.put(Blocks.LAUREL_LOGS, Items.LAUREL_LOGS);
        toItemTag.put(Blocks.LAUREL_STRIPPED_LOGS, Items.LAUREL_STRIPPED_LOGS);

        toItemTag.put(Blocks.CYPRESS_LOGS, Items.CYPRESS_LOGS);
        toItemTag.put(Blocks.CYPRESS_STRIPPED_LOGS, Items.CYPRESS_STRIPPED_LOGS);

        toItemTag.put(Blocks.BLACK_BIRCH_LOGS, Items.BLACK_BIRCH_LOGS);
        toItemTag.put(Blocks.BLACK_BIRCH_STRIPPED_LOGS, Items.BLACK_BIRCH_STRIPPED_LOGS);

        toItemTag.put(Blocks.WHITE_OAK_LOGS, Items.WHITE_OAK_LOGS);
        toItemTag.put(Blocks.WHITE_OAK_STRIPPED_LOGS, Items.WHITE_OAK_STRIPPED_LOGS);

        toItemTag.put(Blocks.BUR_OAK_LOGS, Items.BUR_OAK_LOGS);
        toItemTag.put(Blocks.BUR_OAK_STRIPPED_LOGS, Items.BUR_OAK_STRIPPED_LOGS);

        toItemTag.put(Blocks.BLOOD_CHERRY_LOGS, Items.BLOOD_CHERRY_LOGS);
        toItemTag.put(Blocks.BLOOD_CHERRY_STRIPPED_LOGS, Items.BLOOD_CHERRY_STRIPPED_LOGS);

        toItemTag.put(Blocks.SACRED_TREE_LOGS, Items.SACRED_TREE_LOGS);
        toItemTag.put(Blocks.SACRED_TREE_STRIPPED_LOGS, Items.SACRED_TREE_STRIPPED_LOGS);

        toItemTag.put(Blocks.WILLOW_LOGS, Items.WILLOW_LOGS);
        toItemTag.put(Blocks.WILLOW_STRIPPED_LOGS, Items.WILLOW_STRIPPED_LOGS);

        toItemTag.put(Blocks.DEADWOOD_LOGS, Items.DEADWOOD_LOGS);
        toItemTag.put(Blocks.DEADWOOD_STRIPPED_LOGS, Items.DEADWOOD_STRIPPED_LOGS);

        toItemTag.put(Blocks.EBONY_KINGSWOOD_LOGS, Items.EBONY_KINGSWOOD_LOGS);
        toItemTag.put(Blocks.EBONY_KINGSWOOD_STRIPPED_LOGS, Items.EBONY_KINGSWOOD_STRIPPED_LOGS);

        toItemTag.put(Blocks.IVORY_KINGSWOOD_LOGS, Items.IVORY_KINGSWOOD_LOGS);
        toItemTag.put(Blocks.IVORY_KINGSWOOD_STRIPPED_LOGS, Items.IVORY_KINGSWOOD_STRIPPED_LOGS);

        toItemTag.put(Blocks.WEAVER_LOGS, Items.WEAVER_LOGS);
        toItemTag.put(Blocks.WEAVER_STRIPPED_LOGS, Items.WEAVER_STRIPPED_LOGS);

        toItemTag.put(Blocks.MUSHROOMS, Items.MUSHROOMS);
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

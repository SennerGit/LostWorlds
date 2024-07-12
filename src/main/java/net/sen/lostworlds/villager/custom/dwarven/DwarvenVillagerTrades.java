//package net.sen.lostworlds.villager.custom.dwarven;
//
//import com.google.common.collect.ImmutableMap;
//import com.google.common.collect.Lists;
//import com.google.common.collect.Maps;
//import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
//import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
//import net.minecraft.Util;
//import net.minecraft.core.BlockPos;
//import net.minecraft.core.registries.BuiltInRegistries;
//import net.minecraft.network.chat.Component;
//import net.minecraft.server.level.ServerLevel;
//import net.minecraft.tags.StructureTags;
//import net.minecraft.tags.TagKey;
//import net.minecraft.util.Mth;
//import net.minecraft.util.RandomSource;
//import net.minecraft.world.effect.MobEffect;
//import net.minecraft.world.effect.MobEffects;
//import net.minecraft.world.entity.Entity;
//import net.minecraft.world.entity.npc.VillagerDataHolder;
//import net.minecraft.world.entity.npc.VillagerType;
//import net.minecraft.world.item.*;
//import net.minecraft.world.item.alchemy.Potion;
//import net.minecraft.world.item.alchemy.PotionBrewing;
//import net.minecraft.world.item.enchantment.Enchantment;
//import net.minecraft.world.item.enchantment.EnchantmentHelper;
//import net.minecraft.world.item.enchantment.EnchantmentInstance;
//import net.minecraft.world.item.trading.MerchantOffer;
//import net.minecraft.world.level.ItemLike;
//import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.block.Blocks;
//import net.minecraft.world.level.levelgen.structure.Structure;
//import net.minecraft.world.level.saveddata.maps.MapDecoration;
//import net.minecraft.world.level.saveddata.maps.MapItemSavedData;
//
//import javax.annotation.Nullable;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class DwarvenVillagerTrades {
//    private static final int DEFAULT_SUPPLY = 12;
//    private static final int COMMON_ITEMS_SUPPLY = 16;
//    private static final int UNCOMMON_ITEMS_SUPPLY = 3;
//    private static final int XP_LEVEL_1_SELL = 1;
//    private static final int XP_LEVEL_1_BUY = 2;
//    private static final int XP_LEVEL_2_SELL = 5;
//    private static final int XP_LEVEL_2_BUY = 10;
//    private static final int XP_LEVEL_3_SELL = 10;
//    private static final int XP_LEVEL_3_BUY = 20;
//    private static final int XP_LEVEL_4_SELL = 15;
//    private static final int XP_LEVEL_4_BUY = 30;
//    private static final int XP_LEVEL_5_TRADE = 30;
//    private static final float LOW_TIER_PRICE_MULTIPLIER = 0.05F;
//    private static final float HIGH_TIER_PRICE_MULTIPLIER = 0.2F;
//    public static final Map<DwarvenVillagerProfessionsFactory, Int2ObjectMap<DwarvenVillagerTrades.ItemListing[]>> TRADES = Util.make(Maps.newHashMap(), (p_35633_) -> {
////        p_35633_.put(DwarvenVillagerProfessionsFactory.FARMER, toIntMap(ImmutableMap.of(1, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.WHEAT, 20, 16, 2), new DwarvenVillagerTrades.EmeraldForItems(Items.POTATO, 26, 16, 2), new DwarvenVillagerTrades.EmeraldForItems(Items.CARROT, 22, 16, 2), new DwarvenVillagerTrades.EmeraldForItems(Items.BEETROOT, 15, 16, 2), new DwarvenVillagerTrades.ItemsForEmeralds(Items.BREAD, 1, 6, 16, 1)}, 2, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Blocks.PUMPKIN, 6, 12, 10), new DwarvenVillagerTrades.ItemsForEmeralds(Items.PUMPKIN_PIE, 1, 4, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Items.APPLE, 1, 4, 16, 5)}, 3, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.ItemsForEmeralds(Items.COOKIE, 3, 18, 10), new DwarvenVillagerTrades.EmeraldForItems(Blocks.MELON, 4, 12, 20)}, 4, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.CAKE, 1, 1, 12, 15), new DwarvenVillagerTrades.SuspiciousStewForEmerald(MobEffects.NIGHT_VISION, 100, 15), new DwarvenVillagerTrades.SuspiciousStewForEmerald(MobEffects.JUMP, 160, 15), new DwarvenVillagerTrades.SuspiciousStewForEmerald(MobEffects.WEAKNESS, 140, 15), new DwarvenVillagerTrades.SuspiciousStewForEmerald(MobEffects.BLINDNESS, 120, 15), new DwarvenVillagerTrades.SuspiciousStewForEmerald(MobEffects.POISON, 280, 15), new DwarvenVillagerTrades.SuspiciousStewForEmerald(MobEffects.SATURATION, 7, 15)}, 5, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.ItemsForEmeralds(Items.GOLDEN_CARROT, 3, 3, 30), new DwarvenVillagerTrades.ItemsForEmeralds(Items.GLISTERING_MELON_SLICE, 4, 3, 30)})));
////        p_35633_.put(DwarvenVillagerProfessionsFactory.FISHERMAN, toIntMap(ImmutableMap.of(1, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.STRING, 20, 16, 2), new DwarvenVillagerTrades.EmeraldForItems(Items.COAL, 10, 16, 2), new DwarvenVillagerTrades.ItemsAndEmeraldsToItems(Items.COD, 6, Items.COOKED_COD, 6, 16, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.COD_BUCKET, 3, 1, 16, 1)}, 2, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.COD, 15, 16, 10), new DwarvenVillagerTrades.ItemsAndEmeraldsToItems(Items.SALMON, 6, Items.COOKED_SALMON, 6, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Items.CAMPFIRE, 2, 1, 5)}, 3, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.SALMON, 13, 16, 20), new DwarvenVillagerTrades.EnchantedItemForEmeralds(Items.FISHING_ROD, 3, 3, 10, 0.2F)}, 4, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.TROPICAL_FISH, 6, 12, 30)}, 5, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.PUFFERFISH, 4, 12, 30), new DwarvenVillagerTrades.EmeraldsForVillagerTypeItem(1, 12, 30, ImmutableMap.<DwarvenVillagerType, Item>builder().put(DwarvenVillagerType.PLAINS, Items.OAK_BOAT).put(DwarvenVillagerType.TAIGA, Items.SPRUCE_BOAT).put(DwarvenVillagerType.SNOW, Items.SPRUCE_BOAT).put(DwarvenVillagerType.DESERT, Items.JUNGLE_BOAT).put(DwarvenVillagerType.JUNGLE, Items.JUNGLE_BOAT).put(DwarvenVillagerType.SAVANNA, Items.ACACIA_BOAT).put(DwarvenVillagerType.SWAMP, Items.DARK_OAK_BOAT).build())})));
////        p_35633_.put(DwarvenVillagerProfessionsFactory.SHEPHERD, toIntMap(ImmutableMap.of(1, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Blocks.WHITE_WOOL, 18, 16, 2), new DwarvenVillagerTrades.EmeraldForItems(Blocks.BROWN_WOOL, 18, 16, 2), new DwarvenVillagerTrades.EmeraldForItems(Blocks.BLACK_WOOL, 18, 16, 2), new DwarvenVillagerTrades.EmeraldForItems(Blocks.GRAY_WOOL, 18, 16, 2), new DwarvenVillagerTrades.ItemsForEmeralds(Items.SHEARS, 2, 1, 1)}, 2, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.WHITE_DYE, 12, 16, 10), new DwarvenVillagerTrades.EmeraldForItems(Items.GRAY_DYE, 12, 16, 10), new DwarvenVillagerTrades.EmeraldForItems(Items.BLACK_DYE, 12, 16, 10), new DwarvenVillagerTrades.EmeraldForItems(Items.LIGHT_BLUE_DYE, 12, 16, 10), new DwarvenVillagerTrades.EmeraldForItems(Items.LIME_DYE, 12, 16, 10), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.WHITE_WOOL, 1, 1, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.ORANGE_WOOL, 1, 1, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.MAGENTA_WOOL, 1, 1, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.LIGHT_BLUE_WOOL, 1, 1, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.YELLOW_WOOL, 1, 1, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.LIME_WOOL, 1, 1, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.PINK_WOOL, 1, 1, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.GRAY_WOOL, 1, 1, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.LIGHT_GRAY_WOOL, 1, 1, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.CYAN_WOOL, 1, 1, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.PURPLE_WOOL, 1, 1, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.BLUE_WOOL, 1, 1, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.BROWN_WOOL, 1, 1, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.GREEN_WOOL, 1, 1, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.RED_WOOL, 1, 1, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.BLACK_WOOL, 1, 1, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.WHITE_CARPET, 1, 4, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.ORANGE_CARPET, 1, 4, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.MAGENTA_CARPET, 1, 4, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.LIGHT_BLUE_CARPET, 1, 4, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.YELLOW_CARPET, 1, 4, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.LIME_CARPET, 1, 4, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.PINK_CARPET, 1, 4, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.GRAY_CARPET, 1, 4, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.LIGHT_GRAY_CARPET, 1, 4, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.CYAN_CARPET, 1, 4, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.PURPLE_CARPET, 1, 4, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.BLUE_CARPET, 1, 4, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.BROWN_CARPET, 1, 4, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.GREEN_CARPET, 1, 4, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.RED_CARPET, 1, 4, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.BLACK_CARPET, 1, 4, 16, 5)}, 3, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.YELLOW_DYE, 12, 16, 20), new DwarvenVillagerTrades.EmeraldForItems(Items.LIGHT_GRAY_DYE, 12, 16, 20), new DwarvenVillagerTrades.EmeraldForItems(Items.ORANGE_DYE, 12, 16, 20), new DwarvenVillagerTrades.EmeraldForItems(Items.RED_DYE, 12, 16, 20), new DwarvenVillagerTrades.EmeraldForItems(Items.PINK_DYE, 12, 16, 20), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.WHITE_BED, 3, 1, 12, 10), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.YELLOW_BED, 3, 1, 12, 10), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.RED_BED, 3, 1, 12, 10), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.BLACK_BED, 3, 1, 12, 10), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.BLUE_BED, 3, 1, 12, 10), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.BROWN_BED, 3, 1, 12, 10), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.CYAN_BED, 3, 1, 12, 10), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.GRAY_BED, 3, 1, 12, 10), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.GREEN_BED, 3, 1, 12, 10), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.LIGHT_BLUE_BED, 3, 1, 12, 10), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.LIGHT_GRAY_BED, 3, 1, 12, 10), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.LIME_BED, 3, 1, 12, 10), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.MAGENTA_BED, 3, 1, 12, 10), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.ORANGE_BED, 3, 1, 12, 10), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.PINK_BED, 3, 1, 12, 10), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.PURPLE_BED, 3, 1, 12, 10)}, 4, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.BROWN_DYE, 12, 16, 30), new DwarvenVillagerTrades.EmeraldForItems(Items.PURPLE_DYE, 12, 16, 30), new DwarvenVillagerTrades.EmeraldForItems(Items.BLUE_DYE, 12, 16, 30), new DwarvenVillagerTrades.EmeraldForItems(Items.GREEN_DYE, 12, 16, 30), new DwarvenVillagerTrades.EmeraldForItems(Items.MAGENTA_DYE, 12, 16, 30), new DwarvenVillagerTrades.EmeraldForItems(Items.CYAN_DYE, 12, 16, 30), new DwarvenVillagerTrades.ItemsForEmeralds(Items.WHITE_BANNER, 3, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.BLUE_BANNER, 3, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.LIGHT_BLUE_BANNER, 3, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.RED_BANNER, 3, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.PINK_BANNER, 3, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.GREEN_BANNER, 3, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.LIME_BANNER, 3, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.GRAY_BANNER, 3, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.BLACK_BANNER, 3, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.PURPLE_BANNER, 3, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.MAGENTA_BANNER, 3, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.CYAN_BANNER, 3, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.BROWN_BANNER, 3, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.YELLOW_BANNER, 3, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.ORANGE_BANNER, 3, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.LIGHT_GRAY_BANNER, 3, 1, 12, 15)}, 5, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.ItemsForEmeralds(Items.PAINTING, 2, 3, 30)})));
////        p_35633_.put(DwarvenVillagerProfessionsFactory.FLETCHER, toIntMap(ImmutableMap.of(1, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.STICK, 32, 16, 2), new DwarvenVillagerTrades.ItemsForEmeralds(Items.ARROW, 1, 16, 1), new DwarvenVillagerTrades.ItemsAndEmeraldsToItems(Blocks.GRAVEL, 10, Items.FLINT, 10, 12, 1)}, 2, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.FLINT, 26, 12, 10), new DwarvenVillagerTrades.ItemsForEmeralds(Items.BOW, 2, 1, 5)}, 3, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.STRING, 14, 16, 20), new DwarvenVillagerTrades.ItemsForEmeralds(Items.CROSSBOW, 3, 1, 10)}, 4, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.FEATHER, 24, 16, 30), new DwarvenVillagerTrades.EnchantedItemForEmeralds(Items.BOW, 2, 3, 15)}, 5, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.TRIPWIRE_HOOK, 8, 12, 30), new DwarvenVillagerTrades.EnchantedItemForEmeralds(Items.CROSSBOW, 3, 3, 15), new DwarvenVillagerTrades.TippedArrowForItemsAndEmeralds(Items.ARROW, 5, Items.TIPPED_ARROW, 5, 2, 12, 30)})));
////        p_35633_.put(DwarvenVillagerProfessionsFactory.LIBRARIAN, toIntMap(ImmutableMap.<Integer, DwarvenVillagerTrades.ItemListing[]>builder().put(1, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.PAPER, 24, 16, 2), new DwarvenVillagerTrades.EnchantBookForEmeralds(1), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.BOOKSHELF, 9, 1, 12, 1)}).put(2, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.BOOK, 4, 12, 10), new DwarvenVillagerTrades.EnchantBookForEmeralds(5), new DwarvenVillagerTrades.ItemsForEmeralds(Items.LANTERN, 1, 1, 5)}).put(3, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.INK_SAC, 5, 12, 20), new DwarvenVillagerTrades.EnchantBookForEmeralds(10), new DwarvenVillagerTrades.ItemsForEmeralds(Items.GLASS, 1, 4, 10)}).put(4, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.WRITABLE_BOOK, 2, 12, 30), new DwarvenVillagerTrades.EnchantBookForEmeralds(15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.CLOCK, 5, 1, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.COMPASS, 4, 1, 15)}).put(5, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.ItemsForEmeralds(Items.NAME_TAG, 20, 1, 30)}).build()));
////        p_35633_.put(DwarvenVillagerProfessionsFactory.CARTOGRAPHER, toIntMap(ImmutableMap.of(1, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.PAPER, 24, 16, 2), new DwarvenVillagerTrades.ItemsForEmeralds(Items.MAP, 7, 1, 1)}, 2, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.GLASS_PANE, 11, 16, 10), new DwarvenVillagerTrades.TreasureMapForEmeralds(13, StructureTags.ON_OCEAN_EXPLORER_MAPS, "filled_map.monument", MapDecoration.Type.MONUMENT, 12, 5)}, 3, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.COMPASS, 1, 12, 20), new DwarvenVillagerTrades.TreasureMapForEmeralds(14, StructureTags.ON_WOODLAND_EXPLORER_MAPS, "filled_map.mansion", MapDecoration.Type.MANSION, 12, 10)}, 4, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.ItemsForEmeralds(Items.ITEM_FRAME, 7, 1, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.WHITE_BANNER, 3, 1, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.BLUE_BANNER, 3, 1, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.LIGHT_BLUE_BANNER, 3, 1, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.RED_BANNER, 3, 1, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.PINK_BANNER, 3, 1, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.GREEN_BANNER, 3, 1, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.LIME_BANNER, 3, 1, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.GRAY_BANNER, 3, 1, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.BLACK_BANNER, 3, 1, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.PURPLE_BANNER, 3, 1, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.MAGENTA_BANNER, 3, 1, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.CYAN_BANNER, 3, 1, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.BROWN_BANNER, 3, 1, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.YELLOW_BANNER, 3, 1, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.ORANGE_BANNER, 3, 1, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Items.LIGHT_GRAY_BANNER, 3, 1, 15)}, 5, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.ItemsForEmeralds(Items.GLOBE_BANNER_PATTERN, 8, 1, 30)})));
////        p_35633_.put(DwarvenVillagerProfessionsFactory.CLERIC, toIntMap(ImmutableMap.of(1, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.ROTTEN_FLESH, 32, 16, 2), new DwarvenVillagerTrades.ItemsForEmeralds(Items.REDSTONE, 1, 2, 1)}, 2, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.GOLD_INGOT, 3, 12, 10), new DwarvenVillagerTrades.ItemsForEmeralds(Items.LAPIS_LAZULI, 1, 1, 5)}, 3, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.RABBIT_FOOT, 2, 12, 20), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.GLOWSTONE, 4, 1, 12, 10)}, 4, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.SCUTE, 4, 12, 30), new DwarvenVillagerTrades.EmeraldForItems(Items.GLASS_BOTTLE, 9, 12, 30), new DwarvenVillagerTrades.ItemsForEmeralds(Items.ENDER_PEARL, 5, 1, 15)}, 5, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.NETHER_WART, 22, 12, 30), new DwarvenVillagerTrades.ItemsForEmeralds(Items.EXPERIENCE_BOTTLE, 3, 1, 30)})));
////        p_35633_.put(DwarvenVillagerProfessionsFactory.ARMORER, toIntMap(ImmutableMap.of(1, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.COAL, 15, 16, 2), new DwarvenVillagerTrades.ItemsForEmeralds(new ItemStack(Items.IRON_LEGGINGS), 7, 1, 12, 1, 0.2F), new DwarvenVillagerTrades.ItemsForEmeralds(new ItemStack(Items.IRON_BOOTS), 4, 1, 12, 1, 0.2F), new DwarvenVillagerTrades.ItemsForEmeralds(new ItemStack(Items.IRON_HELMET), 5, 1, 12, 1, 0.2F), new DwarvenVillagerTrades.ItemsForEmeralds(new ItemStack(Items.IRON_CHESTPLATE), 9, 1, 12, 1, 0.2F)}, 2, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.IRON_INGOT, 4, 12, 10), new DwarvenVillagerTrades.ItemsForEmeralds(new ItemStack(Items.BELL), 36, 1, 12, 5, 0.2F), new DwarvenVillagerTrades.ItemsForEmeralds(new ItemStack(Items.CHAINMAIL_BOOTS), 1, 1, 12, 5, 0.2F), new DwarvenVillagerTrades.ItemsForEmeralds(new ItemStack(Items.CHAINMAIL_LEGGINGS), 3, 1, 12, 5, 0.2F)}, 3, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.LAVA_BUCKET, 1, 12, 20), new DwarvenVillagerTrades.EmeraldForItems(Items.DIAMOND, 1, 12, 20), new DwarvenVillagerTrades.ItemsForEmeralds(new ItemStack(Items.CHAINMAIL_HELMET), 1, 1, 12, 10, 0.2F), new DwarvenVillagerTrades.ItemsForEmeralds(new ItemStack(Items.CHAINMAIL_CHESTPLATE), 4, 1, 12, 10, 0.2F), new DwarvenVillagerTrades.ItemsForEmeralds(new ItemStack(Items.SHIELD), 5, 1, 12, 10, 0.2F)}, 4, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EnchantedItemForEmeralds(Items.DIAMOND_LEGGINGS, 14, 3, 15, 0.2F), new DwarvenVillagerTrades.EnchantedItemForEmeralds(Items.DIAMOND_BOOTS, 8, 3, 15, 0.2F)}, 5, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EnchantedItemForEmeralds(Items.DIAMOND_HELMET, 8, 3, 30, 0.2F), new DwarvenVillagerTrades.EnchantedItemForEmeralds(Items.DIAMOND_CHESTPLATE, 16, 3, 30, 0.2F)})));
////        p_35633_.put(DwarvenVillagerProfessionsFactory.WEAPONSMITH, toIntMap(ImmutableMap.of(1, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.COAL, 15, 16, 2), new DwarvenVillagerTrades.ItemsForEmeralds(new ItemStack(Items.IRON_AXE), 3, 1, 12, 1, 0.2F), new DwarvenVillagerTrades.EnchantedItemForEmeralds(Items.IRON_SWORD, 2, 3, 1)}, 2, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.IRON_INGOT, 4, 12, 10), new DwarvenVillagerTrades.ItemsForEmeralds(new ItemStack(Items.BELL), 36, 1, 12, 5, 0.2F)}, 3, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.FLINT, 24, 12, 20)}, 4, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.DIAMOND, 1, 12, 30), new DwarvenVillagerTrades.EnchantedItemForEmeralds(Items.DIAMOND_AXE, 12, 3, 15, 0.2F)}, 5, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EnchantedItemForEmeralds(Items.DIAMOND_SWORD, 8, 3, 30, 0.2F)})));
////        p_35633_.put(DwarvenVillagerProfessionsFactory.TOOLSMITH, toIntMap(ImmutableMap.of(1, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.COAL, 15, 16, 2), new DwarvenVillagerTrades.ItemsForEmeralds(new ItemStack(Items.STONE_AXE), 1, 1, 12, 1, 0.2F), new DwarvenVillagerTrades.ItemsForEmeralds(new ItemStack(Items.STONE_SHOVEL), 1, 1, 12, 1, 0.2F), new DwarvenVillagerTrades.ItemsForEmeralds(new ItemStack(Items.STONE_PICKAXE), 1, 1, 12, 1, 0.2F), new DwarvenVillagerTrades.ItemsForEmeralds(new ItemStack(Items.STONE_HOE), 1, 1, 12, 1, 0.2F)}, 2, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.IRON_INGOT, 4, 12, 10), new DwarvenVillagerTrades.ItemsForEmeralds(new ItemStack(Items.BELL), 36, 1, 12, 5, 0.2F)}, 3, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.FLINT, 30, 12, 20), new DwarvenVillagerTrades.EnchantedItemForEmeralds(Items.IRON_AXE, 1, 3, 10, 0.2F), new DwarvenVillagerTrades.EnchantedItemForEmeralds(Items.IRON_SHOVEL, 2, 3, 10, 0.2F), new DwarvenVillagerTrades.EnchantedItemForEmeralds(Items.IRON_PICKAXE, 3, 3, 10, 0.2F), new DwarvenVillagerTrades.ItemsForEmeralds(new ItemStack(Items.DIAMOND_HOE), 4, 1, 3, 10, 0.2F)}, 4, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.DIAMOND, 1, 12, 30), new DwarvenVillagerTrades.EnchantedItemForEmeralds(Items.DIAMOND_AXE, 12, 3, 15, 0.2F), new DwarvenVillagerTrades.EnchantedItemForEmeralds(Items.DIAMOND_SHOVEL, 5, 3, 15, 0.2F)}, 5, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EnchantedItemForEmeralds(Items.DIAMOND_PICKAXE, 13, 3, 30, 0.2F)})));
////        p_35633_.put(DwarvenVillagerProfessionsFactory.BUTCHER, toIntMap(ImmutableMap.of(1, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.CHICKEN, 14, 16, 2), new DwarvenVillagerTrades.EmeraldForItems(Items.PORKCHOP, 7, 16, 2), new DwarvenVillagerTrades.EmeraldForItems(Items.RABBIT, 4, 16, 2), new DwarvenVillagerTrades.ItemsForEmeralds(Items.RABBIT_STEW, 1, 1, 1)}, 2, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.COAL, 15, 16, 2), new DwarvenVillagerTrades.ItemsForEmeralds(Items.COOKED_PORKCHOP, 1, 5, 16, 5), new DwarvenVillagerTrades.ItemsForEmeralds(Items.COOKED_CHICKEN, 1, 8, 16, 5)}, 3, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.MUTTON, 7, 16, 20), new DwarvenVillagerTrades.EmeraldForItems(Items.BEEF, 10, 16, 20)}, 4, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.DRIED_KELP_BLOCK, 10, 12, 30)}, 5, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.SWEET_BERRIES, 10, 12, 30)})));
////        p_35633_.put(DwarvenVillagerProfessionsFactory.LEATHERWORKER, toIntMap(ImmutableMap.of(1, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.LEATHER, 6, 16, 2), new DwarvenVillagerTrades.DyedArmorForEmeralds(Items.LEATHER_LEGGINGS, 3), new DwarvenVillagerTrades.DyedArmorForEmeralds(Items.LEATHER_CHESTPLATE, 7)}, 2, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.FLINT, 26, 12, 10), new DwarvenVillagerTrades.DyedArmorForEmeralds(Items.LEATHER_HELMET, 5, 12, 5), new DwarvenVillagerTrades.DyedArmorForEmeralds(Items.LEATHER_BOOTS, 4, 12, 5)}, 3, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.RABBIT_HIDE, 9, 12, 20), new DwarvenVillagerTrades.DyedArmorForEmeralds(Items.LEATHER_CHESTPLATE, 7)}, 4, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.SCUTE, 4, 12, 30), new DwarvenVillagerTrades.DyedArmorForEmeralds(Items.LEATHER_HORSE_ARMOR, 6, 12, 15)}, 5, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.ItemsForEmeralds(new ItemStack(Items.SADDLE), 6, 1, 12, 30, 0.2F), new DwarvenVillagerTrades.DyedArmorForEmeralds(Items.LEATHER_HELMET, 5, 12, 30)})));
////        p_35633_.put(DwarvenVillagerProfessionsFactory.MASON, toIntMap(ImmutableMap.of(1, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.CLAY_BALL, 10, 16, 2), new DwarvenVillagerTrades.ItemsForEmeralds(Items.BRICK, 1, 10, 16, 1)}, 2, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Blocks.STONE, 20, 16, 10), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.CHISELED_STONE_BRICKS, 1, 4, 16, 5)}, 3, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Blocks.GRANITE, 16, 16, 20), new DwarvenVillagerTrades.EmeraldForItems(Blocks.ANDESITE, 16, 16, 20), new DwarvenVillagerTrades.EmeraldForItems(Blocks.DIORITE, 16, 16, 20), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.DRIPSTONE_BLOCK, 1, 4, 16, 10), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.POLISHED_ANDESITE, 1, 4, 16, 10), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.POLISHED_DIORITE, 1, 4, 16, 10), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.POLISHED_GRANITE, 1, 4, 16, 10)}, 4, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.EmeraldForItems(Items.QUARTZ, 12, 12, 30), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.ORANGE_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.WHITE_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.BLUE_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.LIGHT_BLUE_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.GRAY_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.LIGHT_GRAY_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.BLACK_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.RED_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.PINK_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.MAGENTA_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.LIME_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.GREEN_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.CYAN_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.PURPLE_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.YELLOW_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.BROWN_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.ORANGE_GLAZED_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.WHITE_GLAZED_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.BLUE_GLAZED_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.GRAY_GLAZED_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.BLACK_GLAZED_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.RED_GLAZED_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.PINK_GLAZED_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.MAGENTA_GLAZED_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.LIME_GLAZED_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.GREEN_GLAZED_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.CYAN_GLAZED_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.PURPLE_GLAZED_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.YELLOW_GLAZED_TERRACOTTA, 1, 1, 12, 15), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.BROWN_GLAZED_TERRACOTTA, 1, 1, 12, 15)}, 5, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.QUARTZ_PILLAR, 1, 1, 12, 30), new DwarvenVillagerTrades.ItemsForEmeralds(Blocks.QUARTZ_BLOCK, 1, 1, 12, 30)})));
//    });
//    public static final Int2ObjectMap<DwarvenVillagerTrades.ItemListing[]> WANDERING_TRADER_TRADES = toIntMap(ImmutableMap.of(1, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.ItemsForEmeralds(Items.SEA_PICKLE, 2, 1, 5, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.SLIME_BALL, 4, 1, 5, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.GLOWSTONE, 2, 1, 5, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.NAUTILUS_SHELL, 5, 1, 5, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.FERN, 1, 1, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.SUGAR_CANE, 1, 1, 8, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.PUMPKIN, 1, 1, 4, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.KELP, 3, 1, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.CACTUS, 3, 1, 8, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.DANDELION, 1, 1, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.POPPY, 1, 1, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.BLUE_ORCHID, 1, 1, 8, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.ALLIUM, 1, 1, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.AZURE_BLUET, 1, 1, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.RED_TULIP, 1, 1, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.ORANGE_TULIP, 1, 1, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.WHITE_TULIP, 1, 1, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.PINK_TULIP, 1, 1, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.OXEYE_DAISY, 1, 1, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.CORNFLOWER, 1, 1, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.LILY_OF_THE_VALLEY, 1, 1, 7, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.WHEAT_SEEDS, 1, 1, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.BEETROOT_SEEDS, 1, 1, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.PUMPKIN_SEEDS, 1, 1, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.MELON_SEEDS, 1, 1, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.ACACIA_SAPLING, 5, 1, 8, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.BIRCH_SAPLING, 5, 1, 8, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.DARK_OAK_SAPLING, 5, 1, 8, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.JUNGLE_SAPLING, 5, 1, 8, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.OAK_SAPLING, 5, 1, 8, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.SPRUCE_SAPLING, 5, 1, 8, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.CHERRY_SAPLING, 5, 1, 8, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.MANGROVE_PROPAGULE, 5, 1, 8, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.RED_DYE, 1, 3, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.WHITE_DYE, 1, 3, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.BLUE_DYE, 1, 3, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.PINK_DYE, 1, 3, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.BLACK_DYE, 1, 3, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.GREEN_DYE, 1, 3, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.LIGHT_GRAY_DYE, 1, 3, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.MAGENTA_DYE, 1, 3, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.YELLOW_DYE, 1, 3, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.GRAY_DYE, 1, 3, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.PURPLE_DYE, 1, 3, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.LIGHT_BLUE_DYE, 1, 3, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.LIME_DYE, 1, 3, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.ORANGE_DYE, 1, 3, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.BROWN_DYE, 1, 3, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.CYAN_DYE, 1, 3, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.BRAIN_CORAL_BLOCK, 3, 1, 8, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.BUBBLE_CORAL_BLOCK, 3, 1, 8, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.FIRE_CORAL_BLOCK, 3, 1, 8, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.HORN_CORAL_BLOCK, 3, 1, 8, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.TUBE_CORAL_BLOCK, 3, 1, 8, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.VINE, 1, 1, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.BROWN_MUSHROOM, 1, 1, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.RED_MUSHROOM, 1, 1, 12, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.LILY_PAD, 1, 2, 5, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.SMALL_DRIPLEAF, 1, 2, 5, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.SAND, 1, 8, 8, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.RED_SAND, 1, 4, 6, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.POINTED_DRIPSTONE, 1, 2, 5, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.ROOTED_DIRT, 1, 2, 5, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.MOSS_BLOCK, 1, 2, 5, 1)}, 2, new DwarvenVillagerTrades.ItemListing[]{new DwarvenVillagerTrades.ItemsForEmeralds(Items.TROPICAL_FISH_BUCKET, 5, 1, 4, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.PUFFERFISH_BUCKET, 5, 1, 4, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.PACKED_ICE, 3, 1, 6, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.BLUE_ICE, 6, 1, 6, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.GUNPOWDER, 1, 1, 8, 1), new DwarvenVillagerTrades.ItemsForEmeralds(Items.PODZOL, 3, 3, 6, 1)}));
//
//    private static Int2ObjectMap<DwarvenVillagerTrades.ItemListing[]> toIntMap(ImmutableMap<Integer, DwarvenVillagerTrades.ItemListing[]> pMap) {
//        return new Int2ObjectOpenHashMap<>(pMap);
//    }
//
//    static class DyedArmorForEmeralds implements DwarvenVillagerTrades.ItemListing {
//        private final Item item;
//        private final int value;
//        private final int maxUses;
//        private final int villagerXp;
//
//        public DyedArmorForEmeralds(Item pItem, int pValue) {
//            this(pItem, pValue, 12, 1);
//        }
//
//        public DyedArmorForEmeralds(Item pItem, int pValue, int pMaxUses, int pVillagerXp) {
//            this.item = pItem;
//            this.value = pValue;
//            this.maxUses = pMaxUses;
//            this.villagerXp = pVillagerXp;
//        }
//
//        public MerchantOffer getOffer(Entity pTrader, RandomSource pRandom) {
//            ItemStack itemstack = new ItemStack(Items.EMERALD, this.value);
//            ItemStack itemstack1 = new ItemStack(this.item);
//            if (this.item instanceof DyeableArmorItem) {
//                List<DyeItem> list = Lists.newArrayList();
//                list.add(getRandomDye(pRandom));
//                if (pRandom.nextFloat() > 0.7F) {
//                    list.add(getRandomDye(pRandom));
//                }
//
//                if (pRandom.nextFloat() > 0.8F) {
//                    list.add(getRandomDye(pRandom));
//                }
//
//                itemstack1 = DyeableLeatherItem.dyeArmor(itemstack1, list);
//            }
//
//            return new MerchantOffer(itemstack, itemstack1, this.maxUses, this.villagerXp, 0.2F);
//        }
//
//        private static DyeItem getRandomDye(RandomSource pRandom) {
//            return DyeItem.byColor(DyeColor.byId(pRandom.nextInt(16)));
//        }
//    }
//
//    static class EmeraldForItems implements DwarvenVillagerTrades.ItemListing {
//        private final Item item;
//        private final int cost;
//        private final int maxUses;
//        private final int villagerXp;
//        private final float priceMultiplier;
//
//        public EmeraldForItems(ItemLike pItem, int pCost, int pMaxUses, int pVillagerXp) {
//            this.item = pItem.asItem();
//            this.cost = pCost;
//            this.maxUses = pMaxUses;
//            this.villagerXp = pVillagerXp;
//            this.priceMultiplier = 0.05F;
//        }
//
//        public MerchantOffer getOffer(Entity pTrader, RandomSource pRandom) {
//            ItemStack itemstack = new ItemStack(this.item, this.cost);
//            return new MerchantOffer(itemstack, new ItemStack(Items.EMERALD), this.maxUses, this.villagerXp, this.priceMultiplier);
//        }
//    }
//
//    static class EmeraldsForVillagerTypeItem implements DwarvenVillagerTrades.ItemListing {
//        private final Map<DwarvenVillagerType, Item> trades;
//        private final int cost;
//        private final int maxUses;
//        private final int villagerXp;
//
//        public EmeraldsForVillagerTypeItem(int pCost, int pMaxUses, int pVillagerXp, Map<DwarvenVillagerType, Item> pTrades) {
//            BuiltInRegistries.VILLAGER_TYPE.stream().filter((p_35680_) -> {
//                return !pTrades.containsKey(p_35680_);
//            }).findAny().ifPresent((p_258962_) -> {
//                throw new IllegalStateException("Missing trade for villager type: " + BuiltInRegistries.VILLAGER_TYPE.getKey(p_258962_));
//            });
//            this.trades = pTrades;
//            this.cost = pCost;
//            this.maxUses = pMaxUses;
//            this.villagerXp = pVillagerXp;
//        }
//
//        @Nullable
//        public MerchantOffer getOffer(Entity pTrader, RandomSource pRandom) {
//            if (pTrader instanceof DwarvenVillagerDataHolder) {
//                ItemStack itemstack = new ItemStack(this.trades.get(((DwarvenVillagerDataHolder)pTrader).getDwarvenVillagerData().getType()), this.cost);
//                return new MerchantOffer(itemstack, new ItemStack(Items.EMERALD), this.maxUses, this.villagerXp, 0.05F);
//            } else {
//                return null;
//            }
//        }
//    }
//
//    static class EnchantBookForEmeralds implements DwarvenVillagerTrades.ItemListing {
//        private final int villagerXp;
//
//        public EnchantBookForEmeralds(int pVillagerXp) {
//            this.villagerXp = pVillagerXp;
//        }
//
//        public MerchantOffer getOffer(Entity pTrader, RandomSource pRandom) {
//            List<Enchantment> list = BuiltInRegistries.ENCHANTMENT.stream().filter(Enchantment::isTradeable).collect(Collectors.toList());
//            Enchantment enchantment = list.get(pRandom.nextInt(list.size()));
//            int i = Mth.nextInt(pRandom, enchantment.getMinLevel(), enchantment.getMaxLevel());
//            ItemStack itemstack = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(enchantment, i));
//            int j = 2 + pRandom.nextInt(5 + i * 10) + 3 * i;
//            if (enchantment.isTreasureOnly()) {
//                j *= 2;
//            }
//
//            if (j > 64) {
//                j = 64;
//            }
//
//            return new MerchantOffer(new ItemStack(Items.EMERALD, j), new ItemStack(Items.BOOK), itemstack, 12, this.villagerXp, 0.2F);
//        }
//    }
//
//    static class EnchantedItemForEmeralds implements DwarvenVillagerTrades.ItemListing {
//        private final ItemStack itemStack;
//        private final int baseEmeraldCost;
//        private final int maxUses;
//        private final int villagerXp;
//        private final float priceMultiplier;
//
//        public EnchantedItemForEmeralds(Item pItem, int pBaseEmeraldCost, int pMaxUses, int pVillagerXp) {
//            this(pItem, pBaseEmeraldCost, pMaxUses, pVillagerXp, 0.05F);
//        }
//
//        public EnchantedItemForEmeralds(Item pItem, int pBaseEmeraldCost, int pMaxUses, int pVillagerXp, float pPriceMultiplier) {
//            this.itemStack = new ItemStack(pItem);
//            this.baseEmeraldCost = pBaseEmeraldCost;
//            this.maxUses = pMaxUses;
//            this.villagerXp = pVillagerXp;
//            this.priceMultiplier = pPriceMultiplier;
//        }
//
//        public MerchantOffer getOffer(Entity pTrader, RandomSource pRandom) {
//            int i = 5 + pRandom.nextInt(15);
//            ItemStack itemstack = EnchantmentHelper.enchantItem(pRandom, new ItemStack(this.itemStack.getItem()), i, false);
//            int j = Math.min(this.baseEmeraldCost + i, 64);
//            ItemStack itemstack1 = new ItemStack(Items.EMERALD, j);
//            return new MerchantOffer(itemstack1, itemstack, this.maxUses, this.villagerXp, this.priceMultiplier);
//        }
//    }
//
//    public interface ItemListing {
//        @Nullable
//        MerchantOffer getOffer(Entity pTrader, RandomSource pRandom);
//    }
//
//    static class ItemsAndEmeraldsToItems implements DwarvenVillagerTrades.ItemListing {
//        private final ItemStack fromItem;
//        private final int fromCount;
//        private final int emeraldCost;
//        private final ItemStack toItem;
//        private final int toCount;
//        private final int maxUses;
//        private final int villagerXp;
//        private final float priceMultiplier;
//
//        public ItemsAndEmeraldsToItems(ItemLike pFromItem, int pFromCount, Item pToItem, int pToCount, int pMaxUses, int pVillagerXp) {
//            this(pFromItem, pFromCount, 1, pToItem, pToCount, pMaxUses, pVillagerXp);
//        }
//
//        public ItemsAndEmeraldsToItems(ItemLike pFromItem, int pFromCount, int pEmeraldCost, Item pToItem, int pToCount, int pMaxUses, int pVillagerXp) {
//            this.fromItem = new ItemStack(pFromItem);
//            this.fromCount = pFromCount;
//            this.emeraldCost = pEmeraldCost;
//            this.toItem = new ItemStack(pToItem);
//            this.toCount = pToCount;
//            this.maxUses = pMaxUses;
//            this.villagerXp = pVillagerXp;
//            this.priceMultiplier = 0.05F;
//        }
//
//        @Nullable
//        public MerchantOffer getOffer(Entity pTrader, RandomSource pRandom) {
//            return new MerchantOffer(new ItemStack(Items.EMERALD, this.emeraldCost), new ItemStack(this.fromItem.getItem(), this.fromCount), new ItemStack(this.toItem.getItem(), this.toCount), this.maxUses, this.villagerXp, this.priceMultiplier);
//        }
//    }
//
//    static class ItemsForEmeralds implements DwarvenVillagerTrades.ItemListing {
//        private final ItemStack itemStack;
//        private final int emeraldCost;
//        private final int numberOfItems;
//        private final int maxUses;
//        private final int villagerXp;
//        private final float priceMultiplier;
//
//        public ItemsForEmeralds(Block pBlock, int pEmeraldCost, int pNumberOfItems, int pMaxUses, int pVillagerXp) {
//            this(new ItemStack(pBlock), pEmeraldCost, pNumberOfItems, pMaxUses, pVillagerXp);
//        }
//
//        public ItemsForEmeralds(Item pItem, int pEmeraldCost, int pNumberOfItems, int pVillagerXp) {
//            this(new ItemStack(pItem), pEmeraldCost, pNumberOfItems, 12, pVillagerXp);
//        }
//
//        public ItemsForEmeralds(Item pItem, int pEmeraldCost, int pNumberOfItems, int pMaxUses, int pVillagerXp) {
//            this(new ItemStack(pItem), pEmeraldCost, pNumberOfItems, pMaxUses, pVillagerXp);
//        }
//
//        public ItemsForEmeralds(ItemStack pItemStack, int pEmeraldCost, int pNumberOfItems, int pMaxUses, int pVillagerXp) {
//            this(pItemStack, pEmeraldCost, pNumberOfItems, pMaxUses, pVillagerXp, 0.05F);
//        }
//
//        public ItemsForEmeralds(ItemStack pItemStack, int pEmeraldCost, int pNumberOfItems, int pMaxUses, int pVillagerXp, float pPriceMultiplier) {
//            this.itemStack = pItemStack;
//            this.emeraldCost = pEmeraldCost;
//            this.numberOfItems = pNumberOfItems;
//            this.maxUses = pMaxUses;
//            this.villagerXp = pVillagerXp;
//            this.priceMultiplier = pPriceMultiplier;
//        }
//
//        public MerchantOffer getOffer(Entity pTrader, RandomSource pRandom) {
//            return new MerchantOffer(new ItemStack(Items.EMERALD, this.emeraldCost), new ItemStack(this.itemStack.getItem(), this.numberOfItems), this.maxUses, this.villagerXp, this.priceMultiplier);
//        }
//    }
//
//    static class SuspiciousStewForEmerald implements DwarvenVillagerTrades.ItemListing {
//        final MobEffect effect;
//        final int duration;
//        final int xp;
//        private final float priceMultiplier;
//
//        public SuspiciousStewForEmerald(MobEffect pEffect, int pDuration, int pXp) {
//            this.effect = pEffect;
//            this.duration = pDuration;
//            this.xp = pXp;
//            this.priceMultiplier = 0.05F;
//        }
//
//        @Nullable
//        public MerchantOffer getOffer(Entity pTrader, RandomSource pRandom) {
//            ItemStack itemstack = new ItemStack(Items.SUSPICIOUS_STEW, 1);
//            SuspiciousStewItem.saveMobEffect(itemstack, this.effect, this.duration);
//            return new MerchantOffer(new ItemStack(Items.EMERALD, 1), itemstack, 12, this.xp, this.priceMultiplier);
//        }
//    }
//
//    static class TippedArrowForItemsAndEmeralds implements DwarvenVillagerTrades.ItemListing {
//        /** An ItemStack that can have potion effects written to it. */
//        private final ItemStack toItem;
//        private final int toCount;
//        private final int emeraldCost;
//        private final int maxUses;
//        private final int villagerXp;
//        private final Item fromItem;
//        private final int fromCount;
//        private final float priceMultiplier;
//
//        public TippedArrowForItemsAndEmeralds(Item pFromItem, int pFromCount, Item pToItem, int pToCount, int pEmeraldCost, int pMaxUses, int pVillagerXp) {
//            this.toItem = new ItemStack(pToItem);
//            this.emeraldCost = pEmeraldCost;
//            this.maxUses = pMaxUses;
//            this.villagerXp = pVillagerXp;
//            this.fromItem = pFromItem;
//            this.fromCount = pFromCount;
//            this.toCount = pToCount;
//            this.priceMultiplier = 0.05F;
//        }
//
//        public MerchantOffer getOffer(Entity pTrader, RandomSource pRandom) {
//            ItemStack itemstack = new ItemStack(Items.EMERALD, this.emeraldCost);
//            List<Potion> list = BuiltInRegistries.POTION.stream().filter((p_35804_) -> {
//                return !p_35804_.getEffects().isEmpty() && PotionBrewing.isBrewablePotion(p_35804_);
//            }).collect(Collectors.toList());
//            Potion potion = list.get(pRandom.nextInt(list.size()));
//            ItemStack itemstack1 = PotionUtils.setPotion(new ItemStack(this.toItem.getItem(), this.toCount), potion);
//            return new MerchantOffer(itemstack, new ItemStack(this.fromItem, this.fromCount), itemstack1, this.maxUses, this.villagerXp, this.priceMultiplier);
//        }
//    }
//
//    static class TreasureMapForEmeralds implements DwarvenVillagerTrades.ItemListing {
//        private final int emeraldCost;
//        private final TagKey<Structure> destination;
//        private final String displayName;
//        private final MapDecoration.Type destinationType;
//        private final int maxUses;
//        private final int villagerXp;
//
//        public TreasureMapForEmeralds(int pEmeraldCost, TagKey<Structure> pDestination, String pDisplayName, MapDecoration.Type pDestinationType, int pMaxUses, int pVillagerXp) {
//            this.emeraldCost = pEmeraldCost;
//            this.destination = pDestination;
//            this.displayName = pDisplayName;
//            this.destinationType = pDestinationType;
//            this.maxUses = pMaxUses;
//            this.villagerXp = pVillagerXp;
//        }
//
//        @Nullable
//        public MerchantOffer getOffer(Entity pTrader, RandomSource pRandom) {
//            if (!(pTrader.level() instanceof ServerLevel)) {
//                return null;
//            } else {
//                ServerLevel serverlevel = (ServerLevel)pTrader.level();
//                BlockPos blockpos = serverlevel.findNearestMapStructure(this.destination, pTrader.blockPosition(), 100, true);
//                if (blockpos != null) {
//                    ItemStack itemstack = MapItem.create(serverlevel, blockpos.getX(), blockpos.getZ(), (byte)2, true, true);
//                    MapItem.renderBiomePreviewMap(serverlevel, itemstack);
//                    MapItemSavedData.addTargetDecoration(itemstack, blockpos, "+", this.destinationType);
//                    itemstack.setHoverName(Component.translatable(this.displayName));
//                    return new MerchantOffer(new ItemStack(Items.EMERALD, this.emeraldCost), new ItemStack(Items.COMPASS), itemstack, this.maxUses, this.villagerXp, 0.2F);
//                } else {
//                    return null;
//                }
//            }
//        }
//    }
//}
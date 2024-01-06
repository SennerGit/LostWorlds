package net.sen.lostworlds.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LostWorldsConstants.MODID);

    public static final RegistryObject<CreativeModeTab> MAIN = CREATIVE_MODE_TABS.register("creative_tab", () -> {
        CreativeModeTab.Builder builder = CreativeModeTab.builder();

        builder.icon(() -> new ItemStack(ModItems.BASIC_PORTAL_CORE.get()));
        builder.title(Component.translatable("itemGroup.cfm"));
        builder.withSearchBar();
        builder.displayItems((parameters, output) -> {
            ModItems.ITEMS.getEntries().forEach(registryObject -> {
                Item item = registryObject.get();
                if (item instanceof CreativeItem creativeItem) {
                    creativeItem.fill(output::accept);
                    return;
                }
                output.accept(registryObject.get());
            });
        });

        return builder.build();
    });

//    public static final RegistryObject<CreativeModeTab> LOST_WORLDS_TAB = CREATIVE_MODE_TABS.register("lost_worlds_tab", () -> CreativeModeTab.builder()
//            .icon(() -> new ItemStack(ModItems.BASIC_PORTAL_CORE.get()))
//            .title(Component.translatable("creativetab.lost_worlds_tab"))
//            .withSearchBar()
//            .displayItems((parameters, output) -> {
//                output.accept(ModItems.LOST_WORLDS_BOOK.get());
//
//                output.accept(ModItems.DICE.get());
//
//                output.accept(ModItems.BASIC_PORTAL_CORE.get());
//
//                output.accept(ModItems.BASIC_PORTAL_ACTIVATOR.get());
//
//                output.accept(ModItems.OLIVE.get());
//
//                output.accept(ModBlocks.ZINC_BLOCK.get());
//                output.accept(ModBlocks.RAW_ZINC_BLOCK.get());
//                output.accept(ModBlocks.ZINC_ORE.get());
//                output.accept(ModBlocks.DEEPSLATE_ZINC_ORE.get());
//                output.accept(ModItems.ZINC_INGOT.get());
//                output.accept(ModItems.RAW_ZINC.get());
//                output.accept(ModItems.ZINC_NUGGET.get());
//                output.accept(ModItems.ZINC_SWORD.get());
//                output.accept(ModItems.ZINC_PICKAXE.get());
//                output.accept(ModItems.ZINC_SHOVEL.get());
//                output.accept(ModItems.ZINC_AXE.get());
//                output.accept(ModItems.ZINC_HOE.get());
//                output.accept(ModItems.ZINC_HELMET.get());
//                output.accept(ModItems.ZINC_CHESTPLATE.get());
//                output.accept(ModItems.ZINC_LEGGINGS.get());
//                output.accept(ModItems.ZINC_BOOTS.get());
//                output.accept(ModItems.ZINC_HORSE_ARMOR.get());
//
//                output.accept(ModBlocks.TIN_BLOCK.get());
//                output.accept(ModBlocks.RAW_TIN_BLOCK.get());
//                output.accept(ModBlocks.TIN_ORE.get());
//                output.accept(ModBlocks.DEEPSLATE_TIN_ORE.get());
//                output.accept(ModItems.TIN_INGOT.get());
//                output.accept(ModItems.RAW_TIN.get());
//                output.accept(ModItems.TIN_NUGGET.get());
//                output.accept(ModItems.TIN_SWORD.get());
//                output.accept(ModItems.TIN_PICKAXE.get());
//                output.accept(ModItems.TIN_SHOVEL.get());
//                output.accept(ModItems.TIN_AXE.get());
//                output.accept(ModItems.TIN_HOE.get());
//                output.accept(ModItems.TIN_HELMET.get());
//                output.accept(ModItems.TIN_CHESTPLATE.get());
//                output.accept(ModItems.TIN_LEGGINGS.get());
//                output.accept(ModItems.TIN_BOOTS.get());
//                output.accept(ModItems.TIN_HORSE_ARMOR.get());
//
//                output.accept(ModBlocks.AURICHALCITE_BLOCK.get());
//                output.accept(ModItems.AURICHALCITE.get());
//
//                output.accept(ModBlocks.BRASS_BLOCK.get());
//                output.accept(ModItems.BRASS_INGOT.get());
//                output.accept(ModItems.BRASS_NUGGET.get());
//                output.accept(ModItems.BRASS_SWORD.get());
//                output.accept(ModItems.BRASS_PICKAXE.get());
//                output.accept(ModItems.BRASS_SHOVEL.get());
//                output.accept(ModItems.BRASS_AXE.get());
//                output.accept(ModItems.BRASS_HOE.get());
//                output.accept(ModItems.BRASS_HELMET.get());
//                output.accept(ModItems.BRASS_CHESTPLATE.get());
//                output.accept(ModItems.BRASS_LEGGINGS.get());
//                output.accept(ModItems.BRASS_BOOTS.get());
//                output.accept(ModItems.BRASS_HORSE_ARMOR.get());
//
//                output.accept(ModBlocks.BRONZE_BLOCK.get());
//                output.accept(ModItems.BRONZE_INGOT.get());
//                output.accept(ModItems.BRONZE_NUGGET.get());
//                output.accept(ModItems.BRONZE_SWORD.get());
//                output.accept(ModItems.BRONZE_PICKAXE.get());
//                output.accept(ModItems.BRONZE_SHOVEL.get());
//                output.accept(ModItems.BRONZE_AXE.get());
//                output.accept(ModItems.BRONZE_HOE.get());
//                output.accept(ModItems.BRONZE_HELMET.get());
//                output.accept(ModItems.BRONZE_CHESTPLATE.get());
//                output.accept(ModItems.BRONZE_LEGGINGS.get());
//                output.accept(ModItems.BRONZE_BOOTS.get());
//                output.accept(ModItems.BRONZE_HORSE_ARMOR.get());
//
//                output.accept(ModItems.DATA_TABLET.get());
//                output.accept(ModItems.MEDUSA_HEAD.get());
//
//                output.accept(ModItems.MAGICAL_DOWSING_ROD.get());
//                output.accept(ModItems.BAR_BRAWL_RECORD.get());
//                output.accept(ModBlocks.SOUND_BLOCK.get());
//                output.accept(ModBlocks.ALLOY_SMELTER.get());
//
//                output.accept(ModItems.CUSTOM_BOW.get());
//                output.accept(ModItems.ALEXANDRITE_SHIELD.get());
//
//                output.accept(ModItems.STYX_WATER_BUCKET.get());
//
//                output.accept(ModBlocks.ELDER_WOOD_LOG.get());
//                output.accept(ModBlocks.STRIPPED_ELDER_WOOD_LOG.get());
//                output.accept(ModBlocks.ELDER_WOOD.get());
//                output.accept(ModBlocks.STRIPPED_ELDER_WOOD.get());
//                output.accept(ModBlocks.ELDER_WOOD_LEAVES.get());
//                output.accept(ModBlocks.ELDER_WOOD_SAPLING.get());
//                output.accept(ModBlocks.ELDER_WOOD_PLANKS.get());
//                output.accept(ModBlocks.ELDER_WOOD_PLANKS_SLAB.get());
//                output.accept(ModBlocks.ELDER_WOOD_PLANKS_STAIRS.get());
//                output.accept(ModBlocks.ELDER_WOOD_PLANKS_PRESSURE_PLATE.get());
//                output.accept(ModBlocks.ELDER_WOOD_PLANKS_DOOR.get());
//                output.accept(ModBlocks.ELDER_WOOD_PLANKS_TRAPDOOR.get());
//                output.accept(ModBlocks.ELDER_WOOD_PLANKS_FENCE.get());
//                output.accept(ModBlocks.ELDER_WOOD_PLANKS_FENCE_GATE.get());
//                output.accept(ModBlocks.ELDER_WOOD_PLANKS_BUTTON.get());
//                output.accept(ModItems.ELDER_WOOD_SIGN.get());
//                output.accept(ModItems.ELDER_WOOD_HANGING_SIGN.get());
//
//                output.accept(ModBlocks.OLIVE_LOG.get());
//                output.accept(ModBlocks.STRIPPED_OLIVE_LOG.get());
//                output.accept(ModBlocks.OLIVE_WOOD.get());
//                output.accept(ModBlocks.STRIPPED_OLIVE_WOOD.get());
//                output.accept(ModBlocks.OLIVE_LEAVES.get());
//                output.accept(ModBlocks.OLIVE_SAPLING.get());
//                output.accept(ModBlocks.OLIVE_PLANKS.get());
//                output.accept(ModBlocks.OLIVE_PLANKS_SLAB.get());
//                output.accept(ModBlocks.OLIVE_PLANKS_STAIRS.get());
//                output.accept(ModBlocks.OLIVE_PLANKS_PRESSURE_PLATE.get());
//                output.accept(ModBlocks.OLIVE_PLANKS_DOOR.get());
//                output.accept(ModBlocks.OLIVE_PLANKS_TRAPDOOR.get());
//                output.accept(ModBlocks.OLIVE_PLANKS_FENCE.get());
//                output.accept(ModBlocks.OLIVE_PLANKS_FENCE_GATE.get());
//                output.accept(ModBlocks.OLIVE_PLANKS_BUTTON.get());
//                output.accept(ModItems.OLIVE_SIGN.get());
//                output.accept(ModItems.OLIVE_HANGING_SIGN.get());
//
//                output.accept(ModBlocks.MYRRH_LOG.get());
//                output.accept(ModBlocks.STRIPPED_MYRRH_LOG.get());
//                output.accept(ModBlocks.MYRRH_WOOD.get());
//                output.accept(ModBlocks.STRIPPED_MYRRH_WOOD.get());
//                output.accept(ModBlocks.MYRRH_LEAVES.get());
//                output.accept(ModBlocks.MYRRH_SAPLING.get());
//                output.accept(ModBlocks.MYRRH_PLANKS.get());
//                output.accept(ModBlocks.MYRRH_PLANKS_SLAB.get());
//                output.accept(ModBlocks.MYRRH_PLANKS_STAIRS.get());
//                output.accept(ModBlocks.MYRRH_PLANKS_PRESSURE_PLATE.get());
//                output.accept(ModBlocks.MYRRH_PLANKS_DOOR.get());
//                output.accept(ModBlocks.MYRRH_PLANKS_TRAPDOOR.get());
//                output.accept(ModBlocks.MYRRH_PLANKS_FENCE.get());
//                output.accept(ModBlocks.MYRRH_PLANKS_FENCE_GATE.get());
//                output.accept(ModBlocks.MYRRH_PLANKS_BUTTON.get());
//                output.accept(ModItems.MYRRH_SIGN.get());
//                output.accept(ModItems.MYRRH_HANGING_SIGN.get());
//
//                output.accept(ModBlocks.LAUREL_LOG.get());
//                output.accept(ModBlocks.STRIPPED_LAUREL_LOG.get());
//                output.accept(ModBlocks.LAUREL_WOOD.get());
//                output.accept(ModBlocks.STRIPPED_LAUREL_WOOD.get());
//                output.accept(ModBlocks.LAUREL_LEAVES.get());
//                output.accept(ModBlocks.LAUREL_SAPLING.get());
//                output.accept(ModBlocks.LAUREL_PLANKS.get());
//                output.accept(ModBlocks.LAUREL_PLANKS_SLAB.get());
//                output.accept(ModBlocks.LAUREL_PLANKS_STAIRS.get());
//                output.accept(ModBlocks.LAUREL_PLANKS_PRESSURE_PLATE.get());
//                output.accept(ModBlocks.LAUREL_PLANKS_DOOR.get());
//                output.accept(ModBlocks.LAUREL_PLANKS_TRAPDOOR.get());
//                output.accept(ModBlocks.LAUREL_PLANKS_FENCE.get());
//                output.accept(ModBlocks.LAUREL_PLANKS_FENCE_GATE.get());
//                output.accept(ModBlocks.LAUREL_PLANKS_BUTTON.get());
//                output.accept(ModItems.LAUREL_SIGN.get());
//                output.accept(ModItems.LAUREL_HANGING_SIGN.get());
//
//                output.accept(ModBlocks.CYPRESS_LOG.get());
//                output.accept(ModBlocks.STRIPPED_CYPRESS_LOG.get());
//                output.accept(ModBlocks.CYPRESS_WOOD.get());
//                output.accept(ModBlocks.STRIPPED_CYPRESS_WOOD.get());
//                output.accept(ModBlocks.CYPRESS_LEAVES.get());
//                output.accept(ModBlocks.CYPRESS_SAPLING.get());
//                output.accept(ModBlocks.CYPRESS_PLANKS.get());
//                output.accept(ModBlocks.CYPRESS_PLANKS_SLAB.get());
//                output.accept(ModBlocks.CYPRESS_PLANKS_STAIRS.get());
//                output.accept(ModBlocks.CYPRESS_PLANKS_PRESSURE_PLATE.get());
//                output.accept(ModBlocks.CYPRESS_PLANKS_DOOR.get());
//                output.accept(ModBlocks.CYPRESS_PLANKS_TRAPDOOR.get());
//                output.accept(ModBlocks.CYPRESS_PLANKS_FENCE.get());
//                output.accept(ModBlocks.CYPRESS_PLANKS_FENCE_GATE.get());
//                output.accept(ModBlocks.CYPRESS_PLANKS_BUTTON.get());
//                output.accept(ModItems.CYPRESS_SIGN.get());
//                output.accept(ModItems.CYPRESS_HANGING_SIGN.get());
//            })
//            .build());
//
//    public static final RegistryObject<CreativeModeTab> LOST_WORLDS_UNDERWORLD_TAB = CREATIVE_MODE_TABS.register("lost_worlds_underworld_tab", () -> CreativeModeTab.builder()
//            .icon(() -> new ItemStack(ModBlocks.UNDERWORLD_PORTAL_FRAME.get()))
//            .title(Component.translatable("creativetab.lost_worlds_underworld_tab"))
//            .withSearchBar()
//            .displayItems((parameters, output) -> {
//                output.accept(ModBlocks.UNDERWORLD_PORTAL_FRAME.get());
//
////                output.accept(ModBlocks.UNDERWORLD_GRASS_BLOCK.get());
//
//                output.accept(ModBlocks.TARTARUS_STONE.get());
//                output.accept(ModBlocks.TARTARUS_STONE_STAIRS.get());
//                output.accept(ModBlocks.TARTARUS_STONE_SLAB.get());
//                output.accept(ModBlocks.TARTARUS_STONE_PRESSURE_PLATE.get());
//                output.accept(ModBlocks.TARTARUS_STONE_BUTTON.get());
//                output.accept(ModBlocks.TARTARUS_STONE_WALL.get());
//                output.accept(ModBlocks.TARTARUS_STONE_SMOOTH_STONE.get());
//                output.accept(ModBlocks.TARTARUS_STONE_COBBLESTONE.get());
//                output.accept(ModBlocks.TARTARUS_STONE_COBBLESTONE_STAIRS.get());
//                output.accept(ModBlocks.TARTARUS_STONE_COBBLESTONE_SLAB.get());
//                output.accept(ModBlocks.TARTARUS_STONE_COBBLESTONE_WALL.get());
//                output.accept(ModBlocks.TARTARUS_STONE_COBBLESTONE_MOSSY.get());
//                output.accept(ModBlocks.TARTARUS_STONE_BRICKS.get());
//                output.accept(ModBlocks.TARTARUS_STONE_BRICKS_STAIRS.get());
//                output.accept(ModBlocks.TARTARUS_STONE_BRICKS_SLAB.get());
//                output.accept(ModBlocks.TARTARUS_STONE_BRICKS_WALL.get());
//                output.accept(ModBlocks.TARTARUS_STONE_BRICKS_MOSSY.get());
//                output.accept(ModBlocks.TARTARUS_STONE_BRICKS_CRACKED.get());
//                output.accept(ModBlocks.TARTARUS_STONE_BRICKS_CHISELED.get());
//
//                output.accept(ModBlocks.UNDERWORLD_DIRT.get());
//
//                output.accept(ModBlocks.ORICHALCUM_BLOCK.get());
//                output.accept(ModBlocks.RAW_ORICHALCUM_BLOCK.get());
//                output.accept(ModBlocks.ORICHALCUM_ORE.get());
//                output.accept(ModBlocks.DEEPSLATE_ORICHALCUM_ORE.get());
//                output.accept(ModItems.ORICHALCUM_INGOT.get());
//                output.accept(ModItems.RAW_ORICHALCUM.get());
//                output.accept(ModItems.ORICHALCUM_NUGGET.get());
//                output.accept(ModItems.ORICHALCUM_SWORD.get());
//                output.accept(ModItems.ORICHALCUM_PICKAXE.get());
//                output.accept(ModItems.ORICHALCUM_SHOVEL.get());
//                output.accept(ModItems.ORICHALCUM_AXE.get());
//                output.accept(ModItems.ORICHALCUM_HOE.get());
//                output.accept(ModItems.ORICHALCUM_HELMET.get());
//                output.accept(ModItems.ORICHALCUM_CHESTPLATE.get());
//                output.accept(ModItems.ORICHALCUM_LEGGINGS.get());
//                output.accept(ModItems.ORICHALCUM_BOOTS.get());
//                output.accept(ModItems.ORICHALCUM_HORSE_ARMOR.get());
//
//                output.accept(ModBlocks.ADAMANT_BLOCK.get());
//                output.accept(ModBlocks.ADAMANT_ORE.get());
//                output.accept(ModBlocks.DEEPSLATE_ADAMANT_ORE.get());
//                output.accept(ModItems.ADAMANT.get());
//
//                output.accept(ModItems.POMEGRANATE.get());
//                output.accept(ModItems.POMEGRANATE_SEEDS.get());
//
//                output.accept(ModBlocks.IRIS_FLOWER.get());
//            })
//            .build());
//
//    public static final RegistryObject<CreativeModeTab> LOST_WORLDS_NIDAVELLIR_TAB = CREATIVE_MODE_TABS.register("lost_worlds_nidavellir_tab", () -> CreativeModeTab.builder()
//            .icon(() -> new ItemStack(ModBlocks.NIDAVELLIR_PORTAL_FRAME.get()))
//            .title(Component.translatable("creativetab.lost_worlds_nidavellir_tab"))
//            .withSearchBar()
//            .displayItems((parameters, output) -> {
//
//                output.accept(ModBlocks.NIDAVELLIR_PORTAL_FRAME.get());
//
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_STAIRS.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_SLAB.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_PRESSURE_PLATE.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_BUTTON.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_WALL.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_SMOOTH_STONE.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_STAIRS.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_SLAB.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_WALL.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_COBBLESTONE_MOSSY.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_STAIRS.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_SLAB.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_WALL.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_MOSSY.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_CRACKED.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_BRICKS_CHISELED.get());
//
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_OPAL_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_RUBY_ORE.get());
//
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_IRON_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_GOLD_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_COPPER_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_TIN_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_ZINC_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_DIAMOND_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_EMERALD_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_COAL_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_REDSTONE_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_LAPIS_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_AQUAMARINE_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_OPAL_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_SOFT_STONE_RUBY_ORE_CLUSTER.get());
//
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_STAIRS.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_SLAB.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_PRESSURE_PLATE.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_BUTTON.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_WALL.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_SMOOTH_STONE.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_STAIRS.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_SLAB.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_WALL.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_COBBLESTONE_MOSSY.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_STAIRS.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_SLAB.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_WALL.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_MOSSY.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_CRACKED.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_BRICKS_CHISELED.get());
//
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_OPAL_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_RUBY_ORE.get());
//
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_IRON_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_GOLD_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_COPPER_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_TIN_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_ZINC_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_DIAMOND_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_EMERALD_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_COAL_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_REDSTONE_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_LAPIS_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_AQUAMARINE_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_HARD_STONE_RUBY_ORE_CLUSTER.get());
//
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_STAIRS.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_SLAB.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_PRESSURE_PLATE.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BUTTON.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_WALL.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_SMOOTH_STONE.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_STAIRS.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_SLAB.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_WALL.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_COBBLESTONE_MOSSY.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_STAIRS.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_SLAB.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_WALL.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_MOSSY.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_CRACKED.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_BRICKS_CHISELED.get());
//
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_OPAL_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_RUBY_ORE.get());
//
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_IRON_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_GOLD_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_COPPER_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_TIN_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_ZINC_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_DIAMOND_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_EMERALD_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_COAL_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_REDSTONE_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_LAPIS_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_AQUAMARINE_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_OPAL_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_ENHANCED_STONE_RUBY_ORE_CLUSTER.get());
//
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_STAIRS.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_SLAB.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_PRESSURE_PLATE.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BUTTON.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_WALL.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_SMOOTH_STONE.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_STAIRS.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_SLAB.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_WALL.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_COBBLESTONE_MOSSY.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_STAIRS.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_SLAB.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_WALL.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_MOSSY.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CRACKED.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_BRICKS_CHISELED.get());
//
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE.get());
//
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_IRON_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_GOLD_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COPPER_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_TIN_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_ZINC_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_DIAMOND_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_EMERALD_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_COAL_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_REDSTONE_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_LAPIS_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_AQUAMARINE_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_OPAL_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_DEEPSLATE_STONE_RUBY_ORE_CLUSTER.get());
//
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_STAIRS.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_SLAB.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_PRESSURE_PLATE.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BUTTON.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_WALL.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_SMOOTH_STONE.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_STAIRS.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_SLAB.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_WALL.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_COBBLESTONE_MOSSY.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_STAIRS.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_SLAB.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_WALL.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_MOSSY.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_CRACKED.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_BRICKS_CHISELED.get());
//
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_OPAL_ORE.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_RUBY_ORE.get());
//
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_IRON_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_GOLD_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_COPPER_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_TIN_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_ZINC_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_DIAMOND_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_EMERALD_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_COAL_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_REDSTONE_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_LAPIS_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_AQUAMARINE_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_OPAL_ORE_CLUSTER.get());
//                output.accept(ModBlocks.NIDAVELLIR_CRIMSON_STONE_RUBY_ORE_CLUSTER.get());
//
//                output.accept(ModItems.CRIMSON_DIAMOND.get());
//                output.accept(ModItems.NETHER_STEEL_INGOT.get());
//                output.accept(ModItems.NETHER_STEEL_NUGGET.get());
//                output.accept(ModItems.RAW_NETHER_STEEL.get());
//                output.accept(ModItems.NETHER_STEEL_SWORD.get());
//                output.accept(ModItems.NETHER_STEEL_PICKAXE.get());
//                output.accept(ModItems.NETHER_STEEL_SHOVEL.get());
//                output.accept(ModItems.NETHER_STEEL_AXE.get());
//                output.accept(ModItems.NETHER_STEEL_HOE.get());
//                output.accept(ModItems.NETHER_STEEL_PAXEL.get());
//                output.accept(ModItems.NETHER_STEEL_HAMMER.get());
//                output.accept(ModItems.NETHER_STEEL_HELMET.get());
//                output.accept(ModItems.NETHER_STEEL_CHESTPLATE.get());
//                output.accept(ModItems.NETHER_STEEL_LEGGINGS.get());
//                output.accept(ModItems.NETHER_STEEL_BOOTS.get());
//                output.accept(ModItems.NETHER_STEEL_HORSE_ARMOR.get());
//
//                output.accept(ModBlocks.CRIMSON_STONE.get());
//                output.accept(ModBlocks.CRIMSON_STONE_STAIRS.get());
//                output.accept(ModBlocks.CRIMSON_STONE_SLAB.get());
//                output.accept(ModBlocks.CRIMSON_STONE_PRESSURE_PLATE.get());
//                output.accept(ModBlocks.CRIMSON_STONE_BUTTON.get());
//                output.accept(ModBlocks.CRIMSON_STONE_FENCE.get());
//                output.accept(ModBlocks.CRIMSON_STONE_FENCE_GATE.get());
//                output.accept(ModBlocks.CRIMSON_STONE_WALL.get());
//                output.accept(ModBlocks.CRIMSON_STONE_DOOR.get());
//                output.accept(ModBlocks.CRIMSON_STONE_TRAPDOOR.get());
//                output.accept(ModBlocks.CRIMSON_COBBLESTONE.get());
//                output.accept(ModBlocks.CRIMSON_COBBLESTONE_STAIRS.get());
//                output.accept(ModBlocks.CRIMSON_COBBLESTONE_SLAB.get());
//                output.accept(ModBlocks.CRIMSON_STONE_BRICKS.get());
//                output.accept(ModBlocks.CRIMSON_STONE_BRICK_STAIRS.get());
//                output.accept(ModBlocks.CRIMSON_STONE_BRICK_SLAB.get());
//
//                output.accept(ModItems.AQUAMARINE.get());
//                output.accept(ModItems.OPAL.get());
//                output.accept(ModItems.RUBY.get());
//
//                output.accept(ModItems.CRIMSON_APPLE.get());
//                output.accept(ModItems.CRIMSON_TEAR.get());
//
//                output.accept(ModBlocks.CRIMSON_DIAMOND_BLOCK.get());
//                output.accept(ModBlocks.CRIMSON_DIAMOND_LAMP.get());
//                output.accept(ModBlocks.NETHER_STEEL_BLOCK.get());
//                output.accept(ModBlocks.RAW_NETHER_STEEL_BLOCK.get());
//                output.accept(ModBlocks.NETHER_STEEL_ORE.get());
//                output.accept(ModBlocks.DEEPSLATE_NETHER_STEEL_ORE.get());
//            })
//            .build());
//
//    public static final RegistryObject<CreativeModeTab> LOST_WORLDS_ALFHEIMR_TAB = CREATIVE_MODE_TABS.register("lost_worlds_alfheimr_tab", () -> CreativeModeTab.builder()
//            .icon(() -> new ItemStack(ModBlocks.ALFHEIMR_PORTAL_FRAME.get()))
//            .title(Component.translatable("creativetab.lost_worlds_alfheimr_tab"))
//            .withSearchBar()
//            .displayItems((parameters, output) -> {
//                output.accept(ModBlocks.ALFHEIMR_PORTAL_FRAME.get());
//
//                output.accept(ModBlocks.ALFHEIMR_MAGIC_GRASS.get());
//
//                output.accept(ModBlocks.DARK_BLOOM_FLOWER.get());
//                output.accept(ModBlocks.DREAD_NIGHT_FLOWER.get());
//                output.accept(ModBlocks.BLACK_LOTUS_FLOWER.get());
//                output.accept(ModBlocks.NIGHT_ROSE_FLOWER.get());
//                output.accept(ModBlocks.AQUA_ROSE_FLOWER.get());
//                output.accept(ModBlocks.MOON_FLOWER.get());
//                output.accept(ModBlocks.CATHERINE_FLOWER.get());
//                output.accept(ModBlocks.TAINTED_ROSE_FLOWER.get());
//                output.accept(ModBlocks.CINNAMON_ROSE_FLOWER.get());
//                output.accept(ModBlocks.BUTTERFLY_FLOWER.get());
//                output.accept(ModBlocks.GAIA_TULIP_FLOWER.get());
//                output.accept(ModBlocks.BEARDED_IRIS_FLOWER.get());
//                output.accept(ModBlocks.CORNFLOWER_FLOWER.get());
//                output.accept(ModBlocks.MORNING_GLORY_FLOWER.get());
//                output.accept(ModBlocks.GEORGIA_BLUE_FLOWER.get());
//                output.accept(ModBlocks.BLUE_POPPY_FLOWER.get());
//                output.accept(ModBlocks.TULIP_FLOWER.get());
//                output.accept(ModBlocks.CARNATION_FLOWER.get());
//                output.accept(ModBlocks.LADYS_MANTLE_FLOWER.get());
//                output.accept(ModBlocks.GREEN_ROSE_FLOWER.get());
//                output.accept(ModBlocks.CLEMATIS_FLOWER.get());
//                output.accept(ModBlocks.BLUE_STAR_FLOWER.get());
//                output.accept(ModBlocks.SALVIA_FLOWER.get());
//                output.accept(ModBlocks.FALSE_INDIGO_FLOWER.get());
//                output.accept(ModBlocks.WHITE_SAGE_FLOWER.get());
//                output.accept(ModBlocks.SILVER_SCHEHERAZADE_FLOWER.get());
//                output.accept(ModBlocks.SILVER_SPRING_FLOWER.get());
//                output.accept(ModBlocks.SILVER_SHADOWS_FLOWER.get());
//                output.accept(ModBlocks.GREEN_BALL_FLOWER.get());
//                output.accept(ModBlocks.LIME_DAHLIA_FLOWER.get());
//                output.accept(ModBlocks.HYDRANGEA_FLOWER.get());
//                output.accept(ModBlocks.ZINNIA_FLOWER.get());
//                output.accept(ModBlocks.BUTTERFLY_CANDY_FLOWER.get());
//                output.accept(ModBlocks.CABARET_FLOWER.get());
//                output.accept(ModBlocks.DIANTHUS_FLOWER.get());
//                output.accept(ModBlocks.TITAN_CRANBERRY_VINCA_FLOWER.get());
//                output.accept(ModBlocks.ORANGE_ZINNIA_FLOWER.get());
//                output.accept(ModBlocks.BEGONIA_FLOWER.get());
//                output.accept(ModBlocks.CROWN_IMPERIAL_FLOWER.get());
//                output.accept(ModBlocks.ORIENTAL_POPPY_FLOWER.get());
//                output.accept(ModBlocks.AZALEA_FLOWER.get());
//                output.accept(ModBlocks.PINK_DELIGHT_FLOWER.get());
//                output.accept(ModBlocks.CHRYSANTHEMUM_FLOWER.get());
//                output.accept(ModBlocks.HIBISCUS_FLOWER.get());
//                output.accept(ModBlocks.CARDINAL_FLOWER.get());
//                output.accept(ModBlocks.GERBERA_FLOWER.get());
//                output.accept(ModBlocks.RED_TULIP_FLOWER.get());
//                output.accept(ModBlocks.FREESIA_FLOWER.get());
//                output.accept(ModBlocks.GARDENIAS_FLOWER.get());
//                output.accept(ModBlocks.STAR_JASMINE_FLOWER.get());
//                output.accept(ModBlocks.WHITE_WARATAH_FLOWER.get());
//                output.accept(ModBlocks.FLANNEL_FLOWER.get());
//                output.accept(ModBlocks.BEARS_EARS_FLOWER.get());
//                output.accept(ModBlocks.BIDENS_FLOWER.get());
//                output.accept(ModBlocks.BLANKET_FLOWER.get());
//                output.accept(ModBlocks.BULBINE_FLOWER.get());
//                output.accept(ModBlocks.SILVER_BRUNIA_FLOWER.get());
//                output.accept(ModBlocks.GRAY_ROSES_FLOWER.get());
//                output.accept(ModBlocks.MOON_CARROT_FLOWER.get());
//                output.accept(ModBlocks.SILVER_BABY_FLOWER.get());
//                output.accept(ModBlocks.LAVENDER_FLOWER.get());
//                output.accept(ModBlocks.BELLFLOWER_FLOWER.get());
//                output.accept(ModBlocks.LILAC_FLOWER.get());
//                output.accept(ModBlocks.SWEET_PEA_FLOWER.get());
//
//                output.accept(ModItems.DURUM_WHEAT.get());
//                output.accept(ModItems.DURUM_WHEAT_SEEDS.get());
//                output.accept(ModItems.TOMATO.get());
//                output.accept(ModItems.TOMATO_SEEDS.get());
//                output.accept(ModItems.WILD_ONION.get());
//                output.accept(ModItems.ONION_STAGE_1.get());
//                output.accept(ModItems.ONION_STAGE_2.get());
//                output.accept(ModItems.ONION_STAGE_3.get());
//                output.accept(ModItems.ONION.get());
//                output.accept(ModItems.DRAGON_FRUIT.get());
//                output.accept(ModItems.DRAGON_FRUIT_SEEDS.get());
//                output.accept(ModItems.CHILLI.get());
//                output.accept(ModItems.CHILLI_SEEDS.get());
//
//                output.accept(ModBlocks.POINT_MUSHROOM_BLOCK.get());
//                output.accept(ModBlocks.TOP_POINT_MUSHROOM_BLOCK.get());
//                output.accept(ModBlocks.POINT_MUSHROOM_STEM_BLOCK.get());
//
//                output.accept(ModBlocks.WITCHES_MUSHROOM_BLOCK.get());
//                output.accept(ModBlocks.TOP_WITCHES_MUSHROOM_BLOCK.get());
//                output.accept(ModBlocks.WITCHES_MUSHROOM_STEM_BLOCK.get());
//
//                output.accept(ModBlocks.ROYAL_BLUE_MUSHROOM_BLOCK.get());
//                output.accept(ModBlocks.TOP_ROYAL_BLUE_MUSHROOM_BLOCK.get());
//                output.accept(ModBlocks.ROYAL_BLUE_MUSHROOM_STEM_BLOCK.get());
//                output.accept(ModBlocks.ROYAL_BLUE_MUSHROOM_GLOW_BLOCK.get());
//
//                output.accept(ModBlocks.SHORT_TOP_MUSHROOM_BLOCK.get());
//                output.accept(ModBlocks.TOP_SHORT_TOP_MUSHROOM_BLOCK.get());
//                output.accept(ModBlocks.SHORT_TOP_MUSHROOM_STEM_BLOCK.get());
//
//                output.accept(ModBlocks.SPECTRAL_MUSHROOM_BLOCK.get());
//                output.accept(ModBlocks.TOP_SPECTRAL_MUSHROOM_BLOCK.get());
//                output.accept(ModBlocks.SPECTRAL_MUSHROOM_STEM_BLOCK.get());
//
//                output.accept(ModBlocks.SHADE_MUSHROOM_BLOCK.get());
//                output.accept(ModBlocks.SHADE_MUSHROOM_VINE_BLOCK.get());
//
//                output.accept(ModBlocks.CAP_MUSHROOM_BLOCK.get());
//                output.accept(ModBlocks.CAP_MUSHROOM_VINE_BLOCK.get());
//            })
//            .build());
//
//    public static final RegistryObject<CreativeModeTab> LOST_WORLDS_ATLANTIS_TAB = CREATIVE_MODE_TABS.register("lost_worlds_atlantis_tab", () -> CreativeModeTab.builder()
//            .icon(() -> new ItemStack(ModBlocks.ATLANTIS_PORTAL_FRAME.get()))
//            .title(Component.translatable("creativetab.lost_worlds_atlantis_tab"))
//            .withSearchBar()
//            .displayItems((parameters, output) -> {
//                output.accept(ModBlocks.ATLANTIS_PORTAL_FRAME.get());
//
//                output.accept(ModBlocks.ATLANTAS_WATER_REMOVER_BLOCK.get());
//                output.accept(ModItems.CLOWNFISH_BUCKET.get());
//                output.accept(ModItems.TANG_FISH_BUCKET.get());
//
//                output.accept(ModItems.SHARK_TOOTH.get());
//
//                output.accept(ModItems.RAW_TUNA.get());
//                output.accept(ModItems.COOKED_TUNA.get());
//
//                output.accept(ModItems.CLOWNFISH.get());
//                output.accept(ModItems.COOKED_CLOWNFISH.get());
//                output.accept(ModItems.TANG_FISH.get());
//                output.accept(ModItems.COOKED_TANG_FISH.get());
//            })
//            .build());
//
//    public static final RegistryObject<CreativeModeTab> LOST_WORLDS_SKYOPIA_TAB = CREATIVE_MODE_TABS.register("lost_worlds_skyopia_tab", () -> CreativeModeTab.builder()
//            .icon(() -> new ItemStack(ModBlocks.SKYOPIA_PORTAL_FRAME.get()))
//            .title(Component.translatable("creativetab.lost_worlds_skyopia_tab"))
//            .withSearchBar()
//            .displayItems((parameters, output) -> {
//                output.accept(ModBlocks.SKYOPIA_PORTAL_FRAME.get());
//            })
//            .build());
//
//    public static final RegistryObject<CreativeModeTab> LOST_WORLDS_ENTITIES_TAB = CREATIVE_MODE_TABS.register("lost_worlds_entities_tab", () -> CreativeModeTab.builder()
//            .icon(() -> new ItemStack(ModItems.RHINO_SPAWN_EGG.get()))
//            .title(Component.translatable("creativetab.lost_worlds_entities_tab"))
//            .withSearchBar()
//            .displayItems((parameters, output) -> {
//                output.accept(ModItems.RHINO_SPAWN_EGG.get());
//                output.accept(ModItems.DWARVES_SPAWN_EGG.get());
//                output.accept(ModItems.ELVES_SPAWN_EGG.get());
//                output.accept(ModItems.SHARK_SPAWN_EGG.get());
//                output.accept(ModItems.MORAY_EELS_SPAWN_EGG.get());
//                output.accept(ModItems.ELECTRIC_EELS_SPAWN_EGG.get());
//                output.accept(ModItems.JELLYFISH_SPAWN_EGG.get());
//                output.accept(ModItems.GIANT_SQUID_SPAWN_EGG.get());
//                output.accept(ModItems.RAY_SPAWN_EGG.get());
//                output.accept(ModItems.GIANT_OCTOPUS_SPAWN_EGG.get());
//                output.accept(ModItems.NUDIBRANCH_SLUG_SPAWN_EGG.get());
//                output.accept(ModItems.GREAT_WHITE_SPAWN_EGG.get());
//                output.accept(ModItems.ANGLER_FISH_SPAWN_EGG.get());
//                output.accept(ModItems.SEAHORSE_SPAWN_EGG.get());
//                output.accept(ModItems.CLOWNFISH_SPAWN_EGG.get());
//                output.accept(ModItems.ATLANTIAN_GURDIAN_SPAWN_EGG.get());
//                output.accept(ModItems.SIREN_SPAWN_EGG.get());
//                output.accept(ModItems.MERFOLK_SPAWN_EGG.get());
//                output.accept(ModItems.ATLANTIAN_SPAWN_EGG.get());
//                output.accept(ModItems.TANG_FISH_SPAWN_EGG.get());
//                output.accept(ModItems.TUNA_SPAWN_EGG.get());
//            })
//            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}

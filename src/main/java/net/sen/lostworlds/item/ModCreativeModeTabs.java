package net.sen.lostworlds.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LostWorlds.MODID);

    public static final RegistryObject<CreativeModeTab> LOST_WORLDS_TAB = CREATIVE_MODE_TABS.register("lost_worlds_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.BRONZE_INGOT.get()))
            .title(Component.translatable("creativetab.lost_worlds_tab"))
            .displayItems((parameters, output) -> {
                output.accept(ModItems.LOST_WORLDS_BOOK.get());

                output.accept(ModItems.DICE.get());
                output.accept(ModItems.BASIC_PORTAL_ACTIVATOR.get());

                output.accept(ModBlocks.ZINC_BLOCK.get());
                output.accept(ModBlocks.RAW_ZINC_BLOCK.get());
                output.accept(ModBlocks.ZINC_ORE.get());
                output.accept(ModBlocks.DEEPSLATE_ZINC_ORE.get());
                output.accept(ModItems.ZINC_INGOT.get());
                output.accept(ModItems.RAW_ZINC.get());
                output.accept(ModItems.ZINC_NUGGET.get());
                output.accept(ModItems.ZINC_SWORD.get());
                output.accept(ModItems.ZINC_PICKAXE.get());
                output.accept(ModItems.ZINC_SHOVEL.get());
                output.accept(ModItems.ZINC_AXE.get());
                output.accept(ModItems.ZINC_HOE.get());
                output.accept(ModItems.ZINC_HELMET.get());
                output.accept(ModItems.ZINC_CHESTPLATE.get());
                output.accept(ModItems.ZINC_LEGGINGS.get());
                output.accept(ModItems.ZINC_BOOTS.get());
                output.accept(ModItems.ZINC_HORSE_ARMOR.get());

                output.accept(ModBlocks.TIN_BLOCK.get());
                output.accept(ModBlocks.RAW_TIN_BLOCK.get());
                output.accept(ModBlocks.TIN_ORE.get());
                output.accept(ModBlocks.DEEPSLATE_TIN_ORE.get());
                output.accept(ModItems.TIN_INGOT.get());
                output.accept(ModItems.RAW_TIN.get());
                output.accept(ModItems.TIN_NUGGET.get());
                output.accept(ModItems.TIN_SWORD.get());
                output.accept(ModItems.TIN_PICKAXE.get());
                output.accept(ModItems.TIN_SHOVEL.get());
                output.accept(ModItems.TIN_AXE.get());
                output.accept(ModItems.TIN_HOE.get());
                output.accept(ModItems.TIN_HELMET.get());
                output.accept(ModItems.TIN_CHESTPLATE.get());
                output.accept(ModItems.TIN_LEGGINGS.get());
                output.accept(ModItems.TIN_BOOTS.get());
                output.accept(ModItems.TIN_HORSE_ARMOR.get());

                output.accept(ModBlocks.AURICHALCITE_BLOCK.get());
                output.accept(ModItems.AURICHALCITE.get());

                output.accept(ModBlocks.BRASS_BLOCK.get());
                output.accept(ModItems.BRASS_INGOT.get());
                output.accept(ModItems.BRASS_NUGGET.get());
                output.accept(ModItems.BRASS_SWORD.get());
                output.accept(ModItems.BRASS_PICKAXE.get());
                output.accept(ModItems.BRASS_SHOVEL.get());
                output.accept(ModItems.BRASS_AXE.get());
                output.accept(ModItems.BRASS_HOE.get());
                output.accept(ModItems.BRASS_HELMET.get());
                output.accept(ModItems.BRASS_CHESTPLATE.get());
                output.accept(ModItems.BRASS_LEGGINGS.get());
                output.accept(ModItems.BRASS_BOOTS.get());
                output.accept(ModItems.BRASS_HORSE_ARMOR.get());

                output.accept(ModBlocks.BRONZE_BLOCK.get());
                output.accept(ModItems.BRONZE_INGOT.get());
                output.accept(ModItems.BRONZE_NUGGET.get());
                output.accept(ModItems.BRONZE_SWORD.get());
                output.accept(ModItems.BRONZE_PICKAXE.get());
                output.accept(ModItems.BRONZE_SHOVEL.get());
                output.accept(ModItems.BRONZE_AXE.get());
                output.accept(ModItems.BRONZE_HOE.get());
                output.accept(ModItems.BRONZE_HELMET.get());
                output.accept(ModItems.BRONZE_CHESTPLATE.get());
                output.accept(ModItems.BRONZE_LEGGINGS.get());
                output.accept(ModItems.BRONZE_BOOTS.get());
                output.accept(ModItems.BRONZE_HORSE_ARMOR.get());

                output.accept(ModItems.DATA_TABLET.get());
                output.accept(ModItems.MEDUSA_HEAD.get());

                output.accept(ModItems.MAGICAL_DOWSING_ROD.get());
                output.accept(ModItems.BAR_BRAWL_RECORD.get());
                output.accept(ModBlocks.SOUND_BLOCK.get());
                output.accept(ModBlocks.ALLOY_SMELTER.get());

                output.accept(ModItems.CUSTOM_BOW.get());
                output.accept(ModItems.ALEXANDRITE_SHIELD.get());

                output.accept(ModItems.STYX_WATER_BUCKET.get());

                output.accept(ModBlocks.ELDER_WOOD_LOG.get());
                output.accept(ModBlocks.STRIPPED_ELDER_WOOD_LOG.get());
                output.accept(ModBlocks.ELDER_WOOD.get());
                output.accept(ModBlocks.STRIPPED_ELDER_WOOD.get());
                output.accept(ModBlocks.ELDER_WOOD_LEAVES.get());
                output.accept(ModBlocks.ELDER_WOOD_SAPLING.get());
                output.accept(ModBlocks.ELDER_WOOD_PLANKS.get());
                output.accept(ModBlocks.ELDER_WOOD_PLANKS_SLAB.get());
                output.accept(ModBlocks.ELDER_WOOD_PLANKS_STAIRS.get());
                output.accept(ModBlocks.ELDER_WOOD_PLANKS_PRESSURE_PLATE.get());
                output.accept(ModBlocks.ELDER_WOOD_PLANKS_DOOR.get());
                output.accept(ModBlocks.ELDER_WOOD_PLANKS_TRAPDOOR.get());
                output.accept(ModBlocks.ELDER_WOOD_PLANKS_FENCE.get());
                output.accept(ModBlocks.ELDER_WOOD_PLANKS_FENCE_GATE.get());
                output.accept(ModBlocks.ELDER_WOOD_PLANKS_BUTTON.get());
                output.accept(ModItems.ELDER_WOOD_SIGN.get());
                output.accept(ModItems.ELDER_WOOD_HANGING_SIGN.get());
            })
            .build());

    public static final RegistryObject<CreativeModeTab> LOST_WORLDS_UNDERWORLD_TAB = CREATIVE_MODE_TABS.register("lost_worlds_underworld_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.ADAMANT.get()))
            .title(Component.translatable("creativetab.lost_worlds_underworld_tab"))
            .displayItems((parameters, output) -> {
//                output.accept(ModBlocks.UNDERWORLD_GRASS_BLOCK.get());

                output.accept(ModBlocks.UNDERWORLD_PORTAL_FRAME.get());

                output.accept(ModBlocks.UNDERWORLD_DIRT.get());

                output.accept(ModBlocks.ORICHALCUM_BLOCK.get());
                output.accept(ModBlocks.RAW_ORICHALCUM_BLOCK.get());
                output.accept(ModBlocks.ORICHALCUM_ORE.get());
                output.accept(ModBlocks.DEEPSLATE_ORICHALCUM_ORE.get());
                output.accept(ModItems.ORICHALCUM_INGOT.get());
                output.accept(ModItems.RAW_ORICHALCUM.get());
                output.accept(ModItems.ORICHALCUM_NUGGET.get());
                output.accept(ModItems.ORICHALCUM_SWORD.get());
                output.accept(ModItems.ORICHALCUM_PICKAXE.get());
                output.accept(ModItems.ORICHALCUM_SHOVEL.get());
                output.accept(ModItems.ORICHALCUM_AXE.get());
                output.accept(ModItems.ORICHALCUM_HOE.get());
                output.accept(ModItems.ORICHALCUM_HELMET.get());
                output.accept(ModItems.ORICHALCUM_CHESTPLATE.get());
                output.accept(ModItems.ORICHALCUM_LEGGINGS.get());
                output.accept(ModItems.ORICHALCUM_BOOTS.get());
                output.accept(ModItems.ORICHALCUM_HORSE_ARMOR.get());

                output.accept(ModBlocks.ADAMANT_BLOCK.get());
                output.accept(ModBlocks.ADAMANT_ORE.get());
                output.accept(ModBlocks.DEEPSLATE_ADAMANT_ORE.get());
                output.accept(ModItems.ADAMANT.get());

                output.accept(ModItems.POMEGRANATE.get());
                output.accept(ModItems.POMEGRANATE_SEEDS.get());

                output.accept(ModBlocks.IRIS_FLOWER.get());
            })
            .build());

    public static final RegistryObject<CreativeModeTab> LOST_WORLDS_NIDAVELLIR_TAB = CREATIVE_MODE_TABS.register("lost_worlds_nidavellir_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.CRIMSON_DIAMOND.get()))
            .title(Component.translatable("creativetab.lost_worlds_nidavellir_tab"))
            .displayItems((parameters, output) -> {

                output.accept(ModBlocks.NIDAVELLIR_PORTAL_FRAME.get());

                output.accept(ModItems.CRIMSON_DIAMOND.get());
                output.accept(ModItems.NETHER_STEEL_INGOT.get());
                output.accept(ModItems.NETHER_STEEL_NUGGET.get());
                output.accept(ModItems.RAW_NETHER_STEEL.get());
                output.accept(ModItems.NETHER_STEEL_SWORD.get());
                output.accept(ModItems.NETHER_STEEL_PICKAXE.get());
                output.accept(ModItems.NETHER_STEEL_SHOVEL.get());
                output.accept(ModItems.NETHER_STEEL_AXE.get());
                output.accept(ModItems.NETHER_STEEL_HOE.get());
                output.accept(ModItems.NETHER_STEEL_PAXEL.get());
                output.accept(ModItems.NETHER_STEEL_HAMMER.get());
                output.accept(ModItems.NETHER_STEEL_HELMET.get());
                output.accept(ModItems.NETHER_STEEL_CHESTPLATE.get());
                output.accept(ModItems.NETHER_STEEL_LEGGINGS.get());
                output.accept(ModItems.NETHER_STEEL_BOOTS.get());
                output.accept(ModItems.NETHER_STEEL_HORSE_ARMOR.get());

                output.accept(ModBlocks.CRIMSON_STONE.get());
                output.accept(ModBlocks.CRIMSON_STONE_STAIRS.get());
                output.accept(ModBlocks.CRIMSON_STONE_SLAB.get());
                output.accept(ModBlocks.CRIMSON_STONE_PRESSURE_PLATE.get());
                output.accept(ModBlocks.CRIMSON_STONE_BUTTON.get());
                output.accept(ModBlocks.CRIMSON_STONE_FENCE.get());
                output.accept(ModBlocks.CRIMSON_STONE_FENCE_GATE.get());
                output.accept(ModBlocks.CRIMSON_STONE_WALL.get());
                output.accept(ModBlocks.CRIMSON_STONE_DOOR.get());
                output.accept(ModBlocks.CRIMSON_STONE_TRAPDOOR.get());
                output.accept(ModBlocks.CRIMSON_COBBLESTONE.get());
                output.accept(ModBlocks.CRIMSON_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.CRIMSON_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.CRIMSON_STONE_BRICKS.get());
                output.accept(ModBlocks.CRIMSON_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.CRIMSON_STONE_BRICK_SLAB.get());

                output.accept(ModItems.CRIMSON_APPLE.get());
                output.accept(ModItems.CRIMSON_TEAR.get());

                output.accept(ModBlocks.CRIMSON_DIAMOND_BLOCK.get());
                output.accept(ModBlocks.CRIMSON_DIAMOND_LAMP.get());
                output.accept(ModBlocks.NETHER_STEEL_BLOCK.get());
                output.accept(ModBlocks.RAW_NETHER_STEEL_BLOCK.get());
                output.accept(ModBlocks.NETHER_STEEL_ORE.get());
                output.accept(ModBlocks.DEEPSLATE_NETHER_STEEL_ORE.get());
            })
            .build());

    public static final RegistryObject<CreativeModeTab> LOST_WORLDS_ALFHEIMR_TAB = CREATIVE_MODE_TABS.register("lost_worlds_alfheimr_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.CRIMSON_DIAMOND.get()))
            .title(Component.translatable("creativetab.lost_worlds_alfheimr_tab"))
            .displayItems((parameters, output) -> {
                output.accept(ModBlocks.ALFHEIMR_PORTAL_FRAME.get());
            })
            .build());

    public static final RegistryObject<CreativeModeTab> LOST_WORLDS_ATLANTIS_TAB = CREATIVE_MODE_TABS.register("lost_worlds_atlantis_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(Items.COD))
            .title(Component.translatable("creativetab.lost_worlds_atlantis_tab"))
            .displayItems((parameters, output) -> {
                output.accept(ModBlocks.ATLANTIS_PORTAL_FRAME.get());

                output.accept(ModBlocks.ATLANTAS_WATER_REMOVER_BLOCK.get());
            })
            .build());

    public static final RegistryObject<CreativeModeTab> LOST_WORLDS_SKYOPIA_TAB = CREATIVE_MODE_TABS.register("lost_worlds_skyopia_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(Items.COD))
            .title(Component.translatable("creativetab.lost_worlds_skyopia_tab"))
            .displayItems((parameters, output) -> {
                output.accept(ModBlocks.SKYOPIA_PORTAL_FRAME.get());
            })
            .build());

    public static final RegistryObject<CreativeModeTab> LOST_WORLDS_ENTITIES_TAB = CREATIVE_MODE_TABS.register("lost_worlds_entities_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.RHINO_SPAWN_EGG.get()))
            .title(Component.translatable("creativetab.lost_worlds_Entities_tab"))
            .displayItems((parameters, output) -> {
                output.accept(ModItems.RHINO_SPAWN_EGG.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

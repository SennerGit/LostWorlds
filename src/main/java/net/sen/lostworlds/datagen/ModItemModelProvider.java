package net.sen.lostworlds.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.client.model.generators.loaders.ItemLayerModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.datagen.modonomicon.LostWorldsBookItem;
import net.sen.lostworlds.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, LostWorldsConstants.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.CRIMSON_APPLE);
        simpleItem(ModItems.POMEGRANATE);
        simpleItem(ModItems.POMEGRANATE_SEEDS);
        simpleItem(ModItems.OLIVE);

        simpleItem(ModItems.CRIMSON_DIAMOND);
        simpleItem(ModItems.CRIMSON_TEAR);
        simpleItem(ModItems.NETHER_STEEL_INGOT);
        simpleItem(ModItems.NETHER_STEEL_NUGGET);
        simpleItem(ModItems.RAW_NETHER_STEEL);
        simpleItem(ModItems.MAGICAL_DOWSING_ROD);
        simpleItem(ModItems.BAR_BRAWL_RECORD);

        //Orichalcum
        simpleItem(ModItems.ORICHALCUM_INGOT);
        simpleItem(ModItems.RAW_ORICHALCUM);
        simpleItem(ModItems.ORICHALCUM_NUGGET);

        handheldItem(ModItems.ORICHALCUM_SWORD);
        handheldItem(ModItems.ORICHALCUM_PICKAXE);
        handheldItem(ModItems.ORICHALCUM_SHOVEL);
        handheldItem(ModItems.ORICHALCUM_AXE);
        handheldItem(ModItems.ORICHALCUM_HOE);

        simpleItem(ModItems.ORICHALCUM_HORSE_ARMOR);

        //Zinc
        simpleItem(ModItems.ZINC_INGOT);
        simpleItem(ModItems.RAW_ZINC);
        simpleItem(ModItems.ZINC_NUGGET);

        handheldItem(ModItems.ZINC_SWORD);
        handheldItem(ModItems.ZINC_PICKAXE);
        handheldItem(ModItems.ZINC_SHOVEL);
        handheldItem(ModItems.ZINC_AXE);
        handheldItem(ModItems.ZINC_HOE);

        simpleItem(ModItems.ZINC_HORSE_ARMOR);

        //Tin
        simpleItem(ModItems.TIN_INGOT);
        simpleItem(ModItems.RAW_TIN);
        simpleItem(ModItems.TIN_NUGGET);

        handheldItem(ModItems.TIN_SWORD);
        handheldItem(ModItems.TIN_PICKAXE);
        handheldItem(ModItems.TIN_SHOVEL);
        handheldItem(ModItems.TIN_AXE);
        handheldItem(ModItems.TIN_HOE);

        simpleItem(ModItems.TIN_HORSE_ARMOR);

        //Aurichalcite
        simpleItem(ModItems.AURICHALCITE);

        //Brass
        simpleItem(ModItems.BRASS_INGOT);
        simpleItem(ModItems.BRASS_NUGGET);

        handheldItem(ModItems.BRASS_SWORD);
        handheldItem(ModItems.BRASS_PICKAXE);
        handheldItem(ModItems.BRASS_SHOVEL);
        handheldItem(ModItems.BRASS_AXE);
        handheldItem(ModItems.BRASS_HOE);

        simpleItem(ModItems.BRASS_HORSE_ARMOR);

        //Bronze
        simpleItem(ModItems.BRONZE_INGOT);
        simpleItem(ModItems.BRONZE_NUGGET);

        handheldItem(ModItems.BRONZE_SWORD);
        handheldItem(ModItems.BRONZE_PICKAXE);
        handheldItem(ModItems.BRONZE_SHOVEL);
        handheldItem(ModItems.BRONZE_AXE);
        handheldItem(ModItems.BRONZE_HOE);

        simpleItem(ModItems.BRONZE_HORSE_ARMOR);

        //Adamant
        simpleItem(ModItems.ADAMANT);

        //Crimson Stone
        buttonItem(ModBlocks.CRIMSON_STONE_BUTTON, ModBlocks.CRIMSON_STONE);
        fenceItem(ModBlocks.CRIMSON_STONE_FENCE, ModBlocks.CRIMSON_STONE);
        wallItem(ModBlocks.CRIMSON_STONE_WALL, ModBlocks.CRIMSON_STONE);

        this.simpleBlockItemUi(ModBlocks.CRIMSON_STONE_DOOR);
        this.simpleBlockItemUi(ModBlocks.IRIS_FLOWER);

        handheldItem(ModItems.NETHER_STEEL_SWORD);
        handheldItem(ModItems.NETHER_STEEL_PICKAXE);
        handheldItem(ModItems.NETHER_STEEL_SHOVEL);
        handheldItem(ModItems.NETHER_STEEL_AXE);
        handheldItem(ModItems.NETHER_STEEL_HOE);
        handheldItem(ModItems.NETHER_STEEL_PAXEL);
        handheldItem(ModItems.NETHER_STEEL_HAMMER);

        simpleItem(ModItems.NETHER_STEEL_HORSE_ARMOR);
        //simpleItem(ModItems.DATA_TABLET);

        //simpleItem(ModItems.NETHER_STEEL_HELMET);
        //simpleItem(ModItems.NETHER_STEEL_CHESTPLATE);
        //simpleItem(ModItems.NETHER_STEEL_LEGGINGS);
        //simpleItem(ModItems.NETHER_STEEL_BOOTS);

        complexBlock(ModBlocks.ALLOY_SMELTER.get());
//        simpleBlockItem(ModBlocks.UNDERWORLD_GRASS_BLOCK);


        simpleItem(ModItems.STYX_WATER_BUCKET);

        simpleItem(ModItems.CLOWNFISH_BUCKET);
        simpleItem(ModItems.TANG_FISH_BUCKET);

        /*
         * TREES
         */
        //Elder Wood
        saplingItem(ModBlocks.ELDER_WOOD_SAPLING);

        fenceItem(ModBlocks.ELDER_WOOD_PLANKS_FENCE, ModBlocks.ELDER_WOOD_PLANKS);
        buttonItem(ModBlocks.ELDER_WOOD_PLANKS_BUTTON, ModBlocks.ELDER_WOOD_PLANKS);
        this.simpleBlockItemUi(ModBlocks.ELDER_WOOD_PLANKS_DOOR);
        simpleItem(ModItems.ELDER_WOOD_SIGN);
        simpleItem(ModItems.ELDER_WOOD_HANGING_SIGN);

        //Olive
        saplingItem(ModBlocks.OLIVE_SAPLING);

        fenceItem(ModBlocks.OLIVE_PLANKS_FENCE, ModBlocks.OLIVE_PLANKS);
        buttonItem(ModBlocks.OLIVE_PLANKS_BUTTON, ModBlocks.OLIVE_PLANKS);
        this.simpleBlockItemUi(ModBlocks.OLIVE_PLANKS_DOOR);
        simpleItem(ModItems.OLIVE_SIGN);
        simpleItem(ModItems.OLIVE_HANGING_SIGN);

        //Myrrh
        saplingItem(ModBlocks.MYRRH_SAPLING);

        fenceItem(ModBlocks.MYRRH_PLANKS_FENCE, ModBlocks.MYRRH_PLANKS);
        buttonItem(ModBlocks.MYRRH_PLANKS_BUTTON, ModBlocks.MYRRH_PLANKS);
        this.simpleBlockItemUi(ModBlocks.MYRRH_PLANKS_DOOR);
        simpleItem(ModItems.MYRRH_SIGN);
        simpleItem(ModItems.MYRRH_HANGING_SIGN);

        //Laurel
        saplingItem(ModBlocks.LAUREL_SAPLING);

        fenceItem(ModBlocks.LAUREL_PLANKS_FENCE, ModBlocks.LAUREL_PLANKS);
        buttonItem(ModBlocks.LAUREL_PLANKS_BUTTON, ModBlocks.LAUREL_PLANKS);
        this.simpleBlockItemUi(ModBlocks.LAUREL_PLANKS_DOOR);
        simpleItem(ModItems.LAUREL_SIGN);
        simpleItem(ModItems.LAUREL_HANGING_SIGN);

        //Cypress
        saplingItem(ModBlocks.CYPRESS_SAPLING);

        fenceItem(ModBlocks.CYPRESS_PLANKS_FENCE, ModBlocks.CYPRESS_PLANKS);
        buttonItem(ModBlocks.CYPRESS_PLANKS_BUTTON, ModBlocks.CYPRESS_PLANKS);
        this.simpleBlockItemUi(ModBlocks.CYPRESS_PLANKS_DOOR);
        simpleItem(ModItems.CYPRESS_SIGN);
        simpleItem(ModItems.CYPRESS_HANGING_SIGN);

        simpleBookItem(ModItems.LOST_WORLDS_BOOK);

        createArmourSet(ModItems.NETHER_STEEL_HELMET, ModItems.NETHER_STEEL_CHESTPLATE, ModItems.NETHER_STEEL_LEGGINGS, ModItems.NETHER_STEEL_BOOTS);
        createArmourSet(ModItems.ORICHALCUM_HELMET, ModItems.ORICHALCUM_CHESTPLATE, ModItems.ORICHALCUM_LEGGINGS, ModItems.ORICHALCUM_BOOTS);
        createArmourSet(ModItems.ZINC_HELMET, ModItems.ZINC_CHESTPLATE, ModItems.ZINC_LEGGINGS, ModItems.ZINC_BOOTS);
        createArmourSet(ModItems.TIN_HELMET, ModItems.TIN_CHESTPLATE, ModItems.TIN_LEGGINGS, ModItems.TIN_BOOTS);
        createArmourSet(ModItems.BRASS_HELMET, ModItems.BRASS_CHESTPLATE, ModItems.BRASS_LEGGINGS, ModItems.BRASS_BOOTS);
        createArmourSet(ModItems.BRONZE_HELMET, ModItems.BRONZE_CHESTPLATE, ModItems.BRONZE_LEGGINGS, ModItems.BRONZE_BOOTS);

        withExistingParent(ModItems.RHINO_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.SHARK_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.MORAY_EELS_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.ELECTRIC_EELS_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.JELLYFISH_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.GIANT_SQUID_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.RAY_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.GIANT_OCTOPUS_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.NUDIBRANCH_SLUG_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.GREAT_WHITE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.ANGLER_FISH_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.SEAHORSE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.CLOWNFISH_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.ATLANTIAN_GURDIAN_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.SIREN_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.MERFOLK_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.ATLANTIAN_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.TANG_FISH_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.TUNA_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        simpleItem(ModItems.DICE);
        simpleItem(ModItems.BASIC_PORTAL_ACTIVATOR);
        simpleItem(ModItems.BASIC_PORTAL_CORE);

        //Misc
        simpleItem(ModItems.SHARK_TOOTH);
        simpleItem(ModItems.CLOWNFISH);
        simpleItem(ModItems.COOKED_CLOWNFISH);
        simpleItem(ModItems.RAW_TUNA);
        simpleItem(ModItems.COOKED_TUNA);
        simpleItem(ModItems.TANG_FISH);
        simpleItem(ModItems.COOKED_TANG_FISH);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                LostWorldsConstants.mcLoc("item/generated")).texture("layer0",
                LostWorldsConstants.modLoc("item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                LostWorldsConstants.modLoc("block/" + block.getId().getPath()));
    }

    private ItemModelBuilder simpleBookItem(RegistryObject<LostWorldsBookItem> item) {
        return withExistingParent(item.getId().getPath(),
                LostWorldsConstants.mcLoc("item/generated")).texture("layer0",
                LostWorldsConstants.modLoc("item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItemUi(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                LostWorldsConstants.mcLoc("item/generated")).texture("layer0",
                LostWorldsConstants.modLoc("item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                LostWorldsConstants.mcLoc("item/handheld")).texture("layer0",
                LostWorldsConstants.modLoc("item/" + item.getId().getPath()));
    }

    private void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", LostWorldsConstants.modLoc("block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", LostWorldsConstants.modLoc("block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", LostWorldsConstants.modLoc("block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder complexBlock(Block block) {
        return withExistingParent(ForgeRegistries.BLOCKS.getKey(block).getPath(), new ResourceLocation(LostWorldsConstants.MODID,
                "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                LostWorldsConstants.mcLoc("item/generated")).texture("layer0",
                new ResourceLocation(LostWorldsConstants.MODID,"block/" + item.getId().getPath()));
    }

    public void createArmourSet(RegistryObject<Item> helmet, RegistryObject<Item> chestplate, RegistryObject<Item> leggings, RegistryObject<Item> boots) {
        createArmourPiece(helmet, "helmet");
        createArmourPiece(chestplate, "chestplate");
        createArmourPiece(leggings, "leggings");
        createArmourPiece(boots, "boots");
    }

    public void createArmourPiece(RegistryObject<Item> item, String name) {
//        ItemModelBuilder base = this.simpleItem(item);
//        for (ItemModelGenerators.TrimModelData trim : ItemModelGenerators.GENERATED_TRIM_MODELS) {
//
//        }
        createTrim(item, name, TrimMaterials.QUARTZ, 0.1f);
        createTrim(item, name, TrimMaterials.IRON, 0.2f);
        createTrim(item, name, TrimMaterials.NETHERITE, 0.3f);
        createTrim(item, name, TrimMaterials.REDSTONE, 0.4f);
        createTrim(item, name, TrimMaterials.COPPER, 0.5f);
        createTrim(item, name, TrimMaterials.GOLD, 0.6f);
        createTrim(item, name, TrimMaterials.EMERALD, 0.7f);
        createTrim(item, name, TrimMaterials.DIAMOND, 0.8f);
        createTrim(item, name, TrimMaterials.LAPIS, 0.9f);
        createTrim(item, name, TrimMaterials.AMETHYST, 1.0f);
        createArmor(item);
    }

    private ItemModelBuilder createTrim(RegistryObject<Item> item, String name, ResourceKey<TrimMaterial> trimMaterials, float indexId) {
        ItemModelBuilder base = this.simpleItem(item);
        ModelFile trimModel = this.withExistingParent(item.getId().getPath() + "_" + trimMaterials.location().getPath() + "_trim",
                LostWorldsConstants.mcLoc("item/generated"))
                .texture("layer0", new ResourceLocation(LostWorldsConstants.MODID,"item/" + item.getId().getPath()))
//                .texture("layer1", this.mcLoc("trims/items/" + name + "_trim"));

                //@Error Need to include trim but throws error because the trim file doesn't exist
//                .texture("layer1", LostWorldsConstants.mcLoc("minecraft", "trims/items/" + name + "_trim_" + trimMaterials.location().getPath()));
                .texture("layer1", LostWorldsConstants.mcLoc("trims/items/" + name + "_trim_" + trimMaterials.location().getPath()));

        return base.override().predicate(LostWorldsConstants.mcLoc("trim_type"), indexId).model(trimModel).end();
    }

    private ItemModelBuilder createArmor(RegistryObject<Item> item) {
        ModelFile quartzLoc = generateArmorModel(LostWorldsConstants.MODID + ":item/" + item.getId().getPath() + "_quartz_trim");
        ModelFile ironLoc = generateArmorModel(LostWorldsConstants.MODID + ":item/" + item.getId().getPath() + "_iron_trim");
        ModelFile netheriteLoc = generateArmorModel(LostWorldsConstants.MODID + ":item/" + item.getId().getPath() + "_netherite_trim");
        ModelFile redstoneLoc = generateArmorModel(LostWorldsConstants.MODID + ":item/" + item.getId().getPath() + "_redstone_trim");
        ModelFile copperLoc = generateArmorModel(LostWorldsConstants.MODID + ":item/" + item.getId().getPath() + "_copper_trim");
        ModelFile goldLoc = generateArmorModel(LostWorldsConstants.MODID + ":item/" + item.getId().getPath() + "_gold_trim");
        ModelFile emeraldLoc = generateArmorModel(LostWorldsConstants.MODID + ":item/" + item.getId().getPath() + "_emerald_trim");
        ModelFile diamondLoc = generateArmorModel(LostWorldsConstants.MODID + ":item/" + item.getId().getPath() + "_diamond_trim");
        ModelFile lapisLoc = generateArmorModel(LostWorldsConstants.MODID + ":item/" + item.getId().getPath() + "_lapis_trim");
        ModelFile amethystLoc = generateArmorModel(LostWorldsConstants.MODID + ":item/" + item.getId().getPath() + "_amethyst_trim");

        return withExistingParent(item.getId().getPath(),
                LostWorldsConstants.mcLoc("item/generated"))
                .override().predicate(LostWorldsConstants.modLoc("item/" + item.getId().getPath()), 0.1f).model(quartzLoc).end()
                .override().predicate(LostWorldsConstants.modLoc("item/" + item.getId().getPath()), 0.2f).model(ironLoc).end()
                .override().predicate(LostWorldsConstants.modLoc("item/" + item.getId().getPath()), 0.3f).model(netheriteLoc).end()
                .override().predicate(LostWorldsConstants.modLoc("item/" + item.getId().getPath()), 0.4f).model(redstoneLoc).end()
                .override().predicate(LostWorldsConstants.modLoc("item/" + item.getId().getPath()), 0.5f).model(copperLoc).end()
                .override().predicate(LostWorldsConstants.modLoc("item/" + item.getId().getPath()), 0.6f).model(goldLoc).end()
                .override().predicate(LostWorldsConstants.modLoc("item/" + item.getId().getPath()), 0.7f).model(emeraldLoc).end()
                .override().predicate(LostWorldsConstants.modLoc("item/" + item.getId().getPath()), 0.8f).model(diamondLoc).end()
                .override().predicate(LostWorldsConstants.modLoc("item/" + item.getId().getPath()), 0.9f).model(lapisLoc).end()
                .override().predicate(LostWorldsConstants.modLoc("item/" + item.getId().getPath()), 1.0f).model(amethystLoc).end()
                .texture("layer0", new ResourceLocation(LostWorldsConstants.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder generateArmorModel(String name, ResourceLocation... layers) {
        return buildItemModel(name, "item/generated", 0, layers);
    }

    private ItemModelBuilder generateArmorModel(String name) {
        return buildItemModel(name, "item/generated", 0);
    }

    private ItemModelBuilder buildItemModel(String name, String parent, int emissivity, ResourceLocation... layers) {
        ItemModelBuilder builder = withExistingParent(name, parent);
        for (int i = 0; i < layers.length; i++) {
            builder = builder.texture("layer" + i, layers[i]);
        }
        if (emissivity > 0) builder = builder.customLoader(ItemLayerModelBuilder::begin).emissive(emissivity, emissivity, 0).renderType("minecraft:translucent", 0).end();
        return builder;
    }

    private ItemModelBuilder buildItemModel(String name, String parent, int emissivity) {
        ItemModelBuilder builder = withExistingParent(name, parent);

        if (emissivity > 0) builder = builder.customLoader(ItemLayerModelBuilder::begin).emissive(emissivity, emissivity, 0).renderType("minecraft:translucent", 0).end();
        return builder;
    }
}
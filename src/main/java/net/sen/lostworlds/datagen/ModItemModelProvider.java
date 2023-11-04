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
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.compat.modonomicon.LostWorldsBookItem;
import net.sen.lostworlds.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, LostWorlds.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.CRIMSON_APPLE);
        simpleItem(ModItems.POMEGRANATE);
        simpleItem(ModItems.POMEGRANATE_SEEDS);
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
        simpleBookItem(ModItems.LOST_WORLDS_BOOK);

        createArmourSet(ModItems.NETHER_STEEL_HELMET, ModItems.NETHER_STEEL_CHESTPLATE, ModItems.NETHER_STEEL_LEGGINGS, ModItems.NETHER_STEEL_BOOTS);
        createArmourSet(ModItems.ORICHALCUM_HELMET, ModItems.ORICHALCUM_CHESTPLATE, ModItems.ORICHALCUM_LEGGINGS, ModItems.ORICHALCUM_BOOTS);
        createArmourSet(ModItems.ZINC_HELMET, ModItems.ZINC_CHESTPLATE, ModItems.ZINC_LEGGINGS, ModItems.ZINC_BOOTS);
        createArmourSet(ModItems.TIN_HELMET, ModItems.TIN_CHESTPLATE, ModItems.TIN_LEGGINGS, ModItems.TIN_BOOTS);
        createArmourSet(ModItems.BRASS_HELMET, ModItems.BRASS_CHESTPLATE, ModItems.BRASS_LEGGINGS, ModItems.BRASS_BOOTS);
        createArmourSet(ModItems.BRONZE_HELMET, ModItems.BRONZE_CHESTPLATE, ModItems.BRONZE_LEGGINGS, ModItems.BRONZE_BOOTS);

        withExistingParent(ModItems.RHINO_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        simpleItem(ModItems.DICE);
        simpleItem(ModItems.BASIC_PORTAL_ACTIVATOR);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(LostWorlds.MODID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation(LostWorlds.MODID, "block/" + block.getId().getPath()));
    }

    private ItemModelBuilder simpleBookItem(RegistryObject<LostWorldsBookItem> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(LostWorlds.MODID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItemUi(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(LostWorlds.MODID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(LostWorlds.MODID, "item/" + item.getId().getPath()));
    }

    private void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", new ResourceLocation(LostWorlds.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", new ResourceLocation(LostWorlds.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", new ResourceLocation(LostWorlds.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder complexBlock(Block block) {
        return withExistingParent(ForgeRegistries.BLOCKS.getKey(block).getPath(), new ResourceLocation(LostWorlds.MODID,
                "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(LostWorlds.MODID,"block/" + item.getId().getPath()));
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
                new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(LostWorlds.MODID,"item/" + item.getId().getPath()))
//                .texture("layer1", this.mcLoc("trims/items/" + name + "_trim"));

                //@Error Need to include trim but throws error because the trim file doesn't exist
//                .texture("layer1", new ResourceLocation("minecraft", "trims/items/" + name + "_trim_" + trimMaterials.location().getPath()));
                .texture("layer1", new ResourceLocation("minecraft", "trims/items/" + name + "_trim_" + trimMaterials.location().getPath()));

        return base.override().predicate(new ResourceLocation("trim_type"), indexId).model(trimModel).end();
    }

    private ItemModelBuilder createArmor(RegistryObject<Item> item) {
        ModelFile quartzLoc = generateArmorModel(LostWorlds.MODID + ":item/" + item.getId().getPath() + "_quartz_trim");
        ModelFile ironLoc = generateArmorModel(LostWorlds.MODID + ":item/" + item.getId().getPath() + "_iron_trim");
        ModelFile netheriteLoc = generateArmorModel(LostWorlds.MODID + ":item/" + item.getId().getPath() + "_netherite_trim");
        ModelFile redstoneLoc = generateArmorModel(LostWorlds.MODID + ":item/" + item.getId().getPath() + "_redstone_trim");
        ModelFile copperLoc = generateArmorModel(LostWorlds.MODID + ":item/" + item.getId().getPath() + "_copper_trim");
        ModelFile goldLoc = generateArmorModel(LostWorlds.MODID + ":item/" + item.getId().getPath() + "_gold_trim");
        ModelFile emeraldLoc = generateArmorModel(LostWorlds.MODID + ":item/" + item.getId().getPath() + "_emerald_trim");
        ModelFile diamondLoc = generateArmorModel(LostWorlds.MODID + ":item/" + item.getId().getPath() + "_diamond_trim");
        ModelFile lapisLoc = generateArmorModel(LostWorlds.MODID + ":item/" + item.getId().getPath() + "_lapis_trim");
        ModelFile amethystLoc = generateArmorModel(LostWorlds.MODID + ":item/" + item.getId().getPath() + "_amethyst_trim");

        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated"))
                .override().predicate(new ResourceLocation(LostWorlds.MODID, "item/" + item.getId().getPath()), 0.1f).model(quartzLoc).end()
                .override().predicate(new ResourceLocation(LostWorlds.MODID, "item/" + item.getId().getPath()), 0.2f).model(ironLoc).end()
                .override().predicate(new ResourceLocation(LostWorlds.MODID, "item/" + item.getId().getPath()), 0.3f).model(netheriteLoc).end()
                .override().predicate(new ResourceLocation(LostWorlds.MODID, "item/" + item.getId().getPath()), 0.4f).model(redstoneLoc).end()
                .override().predicate(new ResourceLocation(LostWorlds.MODID, "item/" + item.getId().getPath()), 0.5f).model(copperLoc).end()
                .override().predicate(new ResourceLocation(LostWorlds.MODID, "item/" + item.getId().getPath()), 0.6f).model(goldLoc).end()
                .override().predicate(new ResourceLocation(LostWorlds.MODID, "item/" + item.getId().getPath()), 0.7f).model(emeraldLoc).end()
                .override().predicate(new ResourceLocation(LostWorlds.MODID, "item/" + item.getId().getPath()), 0.8f).model(diamondLoc).end()
                .override().predicate(new ResourceLocation(LostWorlds.MODID, "item/" + item.getId().getPath()), 0.9f).model(lapisLoc).end()
                .override().predicate(new ResourceLocation(LostWorlds.MODID, "item/" + item.getId().getPath()), 1.0f).model(amethystLoc).end()
                .texture("layer0", new ResourceLocation(LostWorlds.MODID,"item/" + item.getId().getPath()));
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
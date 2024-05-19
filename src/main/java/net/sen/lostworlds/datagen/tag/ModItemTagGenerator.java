package net.sen.lostworlds.datagen.tag;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.block.AlfheimrBlocks;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.block.UnderworldBlocks;
import net.sen.lostworlds.item.ModItems;
import net.sen.lostworlds.item.UnderworldItems;
import net.sen.lostworlds.util.ModTags;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, LostWorldsApi.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR).add(
                ModItems.ZINC_HELMET.get(),
                ModItems.ZINC_CHESTPLATE.get(),
                ModItems.ZINC_LEGGINGS.get(),
                ModItems.ZINC_BOOTS.get(),
                ModItems.TIN_HELMET.get(),
                ModItems.TIN_CHESTPLATE.get(),
                ModItems.TIN_LEGGINGS.get(),
                ModItems.TIN_BOOTS.get(),
                ModItems.BRASS_HELMET.get(),
                ModItems.BRASS_CHESTPLATE.get(),
                ModItems.BRASS_LEGGINGS.get(),
                ModItems.BRASS_BOOTS.get(),
                ModItems.BRONZE_HELMET.get(),
                ModItems.BRONZE_CHESTPLATE.get(),
                ModItems.BRONZE_LEGGINGS.get(),
                ModItems.BRONZE_BOOTS.get(),
                UnderworldItems.ORICHALCUM_HELMET.get(),
                UnderworldItems.ORICHALCUM_CHESTPLATE.get(),
                UnderworldItems.ORICHALCUM_LEGGINGS.get(),
                UnderworldItems.ORICHALCUM_BOOTS.get()
        );

        this.tag(ItemTags.MUSIC_DISCS).add(
                ModItems.BAR_BRAWL_RECORD.get()
        );

        this.tag(ModTags.Items.ELDER_WOOD_LOGS).add(
                Item.byBlock(UnderworldBlocks.ELDER_WOOD_LOG.get()),
                Item.byBlock(UnderworldBlocks.ELDER_WOOD.get()),
                Item.byBlock(UnderworldBlocks.STRIPPED_ELDER_WOOD_LOG.get()),
                Item.byBlock(UnderworldBlocks.STRIPPED_ELDER_WOOD.get())
        );

        this.tag(ModTags.Items.ELDER_WOOD_STRIPPED_LOGS).add(
                Item.byBlock(UnderworldBlocks.STRIPPED_ELDER_WOOD_LOG.get()),
                Item.byBlock(UnderworldBlocks.STRIPPED_ELDER_WOOD.get())
        );

        this.tag(ModTags.Items.OLIVE_LOGS).add(
                Item.byBlock(UnderworldBlocks.OLIVE_LOG.get()),
                Item.byBlock(UnderworldBlocks.OLIVE_WOOD.get()),
                Item.byBlock(UnderworldBlocks.STRIPPED_OLIVE_LOG.get()),
                Item.byBlock(UnderworldBlocks.STRIPPED_OLIVE_WOOD.get())
        );

        this.tag(ModTags.Items.OLIVE_STRIPPED_LOGS).add(
                Item.byBlock(UnderworldBlocks.STRIPPED_OLIVE_LOG.get()),
                Item.byBlock(UnderworldBlocks.STRIPPED_OLIVE_WOOD.get())
        );

        this.tag(ModTags.Items.MYRRH_LOGS).add(
                Item.byBlock(UnderworldBlocks.MYRRH_LOG.get()),
                Item.byBlock(UnderworldBlocks.MYRRH_WOOD.get()),
                Item.byBlock(UnderworldBlocks.STRIPPED_MYRRH_LOG.get()),
                Item.byBlock(UnderworldBlocks.STRIPPED_MYRRH_WOOD.get())
        );

        this.tag(ModTags.Items.MYRRH_STRIPPED_LOGS).add(
                Item.byBlock(UnderworldBlocks.STRIPPED_MYRRH_LOG.get()),
                Item.byBlock(UnderworldBlocks.STRIPPED_MYRRH_WOOD.get())
        );

        this.tag(ModTags.Items.LAUREL_LOGS).add(
                Item.byBlock(UnderworldBlocks.LAUREL_LOG.get()),
                Item.byBlock(UnderworldBlocks.LAUREL_WOOD.get()),
                Item.byBlock(UnderworldBlocks.STRIPPED_LAUREL_LOG.get()),
                Item.byBlock(UnderworldBlocks.STRIPPED_LAUREL_WOOD.get())
        );

        this.tag(ModTags.Items.LAUREL_STRIPPED_LOGS).add(
                Item.byBlock(UnderworldBlocks.STRIPPED_LAUREL_LOG.get()),
                Item.byBlock(UnderworldBlocks.STRIPPED_LAUREL_WOOD.get())
        );

        this.tag(ModTags.Items.CYPRESS_LOGS).add(
                Item.byBlock(UnderworldBlocks.CYPRESS_LOG.get()),
                Item.byBlock(UnderworldBlocks.CYPRESS_WOOD.get()),
                Item.byBlock(UnderworldBlocks.STRIPPED_CYPRESS_LOG.get()),
                Item.byBlock(UnderworldBlocks.STRIPPED_CYPRESS_WOOD.get())
        );

        this.tag(ModTags.Items.CYPRESS_STRIPPED_LOGS).add(
                Item.byBlock(UnderworldBlocks.STRIPPED_CYPRESS_LOG.get()),
                Item.byBlock(UnderworldBlocks.STRIPPED_CYPRESS_WOOD.get())
        );

        this.tag(ModTags.Items.BLACK_BIRCH_LOGS).add(
                Item.byBlock(AlfheimrBlocks.BLACK_BIRCH_LOG.get()),
                Item.byBlock(AlfheimrBlocks.BLACK_BIRCH_WOOD.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_BLACK_BIRCH_LOG.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_BLACK_BIRCH_WOOD.get())
        );

        this.tag(ModTags.Items.BLACK_BIRCH_STRIPPED_LOGS).add(
                Item.byBlock(AlfheimrBlocks.STRIPPED_BLACK_BIRCH_LOG.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_BLACK_BIRCH_WOOD.get())
        );

        this.tag(ModTags.Items.WHITE_OAK_LOGS).add(
                Item.byBlock(AlfheimrBlocks.WHITE_OAK_LOG.get()),
                Item.byBlock(AlfheimrBlocks.WHITE_OAK_WOOD.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_WHITE_OAK_LOG.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_WHITE_OAK_WOOD.get())
        );

        this.tag(ModTags.Items.WHITE_OAK_STRIPPED_LOGS).add(
                Item.byBlock(AlfheimrBlocks.STRIPPED_WHITE_OAK_LOG.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_WHITE_OAK_WOOD.get())
        );

        this.tag(ModTags.Items.BUR_OAK_LOGS).add(
                Item.byBlock(AlfheimrBlocks.BUR_OAK_LOG.get()),
                Item.byBlock(AlfheimrBlocks.BUR_OAK_WOOD.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_BUR_OAK_LOG.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_BUR_OAK_WOOD.get())
        );

        this.tag(ModTags.Items.BUR_OAK_STRIPPED_LOGS).add(
                Item.byBlock(AlfheimrBlocks.STRIPPED_BUR_OAK_LOG.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_BUR_OAK_WOOD.get())
        );

        this.tag(ModTags.Items.BLOOD_CHERRY_LOGS).add(
                Item.byBlock(AlfheimrBlocks.BLOOD_CHERRY_LOG.get()),
                Item.byBlock(AlfheimrBlocks.BLOOD_CHERRY_WOOD.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_BLOOD_CHERRY_LOG.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_BLOOD_CHERRY_WOOD.get())
        );

        this.tag(ModTags.Items.BLOOD_CHERRY_STRIPPED_LOGS).add(
                Item.byBlock(AlfheimrBlocks.STRIPPED_BLOOD_CHERRY_LOG.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_BLOOD_CHERRY_WOOD.get())
        );

        this.tag(ModTags.Items.SACRED_TREE_LOGS).add(
                Item.byBlock(AlfheimrBlocks.SACRED_TREE_LOG.get()),
                Item.byBlock(AlfheimrBlocks.SACRED_TREE_WOOD.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_SACRED_TREE_LOG.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_SACRED_TREE_WOOD.get())
        );

        this.tag(ModTags.Items.SACRED_TREE_STRIPPED_LOGS).add(
                Item.byBlock(AlfheimrBlocks.STRIPPED_SACRED_TREE_LOG.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_SACRED_TREE_WOOD.get())
        );

        this.tag(ModTags.Items.WILLOW_LOGS).add(
                Item.byBlock(AlfheimrBlocks.WILLOW_LOG.get()),
                Item.byBlock(AlfheimrBlocks.WILLOW_WOOD.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_WILLOW_LOG.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_WILLOW_WOOD.get())
        );

        this.tag(ModTags.Items.WILLOW_STRIPPED_LOGS).add(
                Item.byBlock(AlfheimrBlocks.STRIPPED_WILLOW_LOG.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_WILLOW_WOOD.get())
        );

        this.tag(ModTags.Items.DEADWOOD_LOGS).add(
                Item.byBlock(AlfheimrBlocks.DEADWOOD_LOG.get()),
                Item.byBlock(AlfheimrBlocks.DEADWOOD_WOOD.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_DEADWOOD_LOG.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_DEADWOOD_WOOD.get())
        );

        this.tag(ModTags.Items.DEADWOOD_STRIPPED_LOGS).add(
                Item.byBlock(AlfheimrBlocks.STRIPPED_DEADWOOD_LOG.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_DEADWOOD_WOOD.get())
        );

        this.tag(ModTags.Items.EBONY_KINGSWOOD_LOGS).add(
                Item.byBlock(AlfheimrBlocks.EBONY_KINGSWOOD_LOG.get()),
                Item.byBlock(AlfheimrBlocks.EBONY_KINGSWOOD_WOOD.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_EBONY_KINGSWOOD_LOG.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_EBONY_KINGSWOOD_WOOD.get())
        );

        this.tag(ModTags.Items.EBONY_KINGSWOOD_STRIPPED_LOGS).add(
                Item.byBlock(AlfheimrBlocks.STRIPPED_EBONY_KINGSWOOD_LOG.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_EBONY_KINGSWOOD_WOOD.get())
        );

        this.tag(ModTags.Items.IVORY_KINGSWOOD_LOGS).add(
                Item.byBlock(AlfheimrBlocks.IVORY_KINGSWOOD_LOG.get()),
                Item.byBlock(AlfheimrBlocks.IVORY_KINGSWOOD_WOOD.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_IVORY_KINGSWOOD_LOG.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_IVORY_KINGSWOOD_WOOD.get())
        );

        this.tag(ModTags.Items.IVORY_KINGSWOOD_STRIPPED_LOGS).add(
                Item.byBlock(AlfheimrBlocks.STRIPPED_IVORY_KINGSWOOD_LOG.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_IVORY_KINGSWOOD_WOOD.get())
        );

        this.tag(ModTags.Items.WEAVER_LOGS).add(
                Item.byBlock(AlfheimrBlocks.WEAVER_LOG.get()),
                Item.byBlock(AlfheimrBlocks.WEAVER_WOOD.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_WEAVER_LOG.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_WEAVER_WOOD.get())
        );

        this.tag(ModTags.Items.WEAVER_STRIPPED_LOGS).add(
                Item.byBlock(AlfheimrBlocks.STRIPPED_WEAVER_LOG.get()),
                Item.byBlock(AlfheimrBlocks.STRIPPED_WEAVER_WOOD.get())
        );

        this.tag(ModTags.Items.MUSHROOMS).add(
                Item.byBlock(Blocks.BROWN_MUSHROOM),
                Item.byBlock(Blocks.RED_MUSHROOM),
                Item.byBlock(AlfheimrBlocks.POINT_MUSHROOM_BLOCK.get()),
                Item.byBlock(AlfheimrBlocks.WITCHES_MUSHROOM_BLOCK.get()),
                Item.byBlock(AlfheimrBlocks.ROYAL_BLUE_MUSHROOM_BLOCK.get()),
                Item.byBlock(AlfheimrBlocks.SHORT_TOP_MUSHROOM_BLOCK.get()),
                Item.byBlock(AlfheimrBlocks.SPECTRAL_MUSHROOM_BLOCK.get()),
                Item.byBlock(AlfheimrBlocks.SHADE_MUSHROOM_BLOCK.get()),
                Item.byBlock(AlfheimrBlocks.CAP_MUSHROOM_BLOCK.get())
        );
    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}

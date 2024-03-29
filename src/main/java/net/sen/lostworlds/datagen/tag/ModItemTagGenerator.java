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
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.item.ModItems;
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
                ModItems.NETHER_STEEL_HELMET.get(),
                ModItems.NETHER_STEEL_CHESTPLATE.get(),
                ModItems.NETHER_STEEL_LEGGINGS.get(),
                ModItems.NETHER_STEEL_BOOTS.get(),
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
                ModItems.ORICHALCUM_HELMET.get(),
                ModItems.ORICHALCUM_CHESTPLATE.get(),
                ModItems.ORICHALCUM_LEGGINGS.get(),
                ModItems.ORICHALCUM_BOOTS.get()
        );

        this.tag(ItemTags.MUSIC_DISCS).add(
                ModItems.BAR_BRAWL_RECORD.get()
        );

        this.tag(ModTags.Items.ELDER_WOOD_LOGS).add(
                Item.byBlock(ModBlocks.ELDER_WOOD_LOG.get()),
                Item.byBlock(ModBlocks.ELDER_WOOD.get()),
                Item.byBlock(ModBlocks.STRIPPED_ELDER_WOOD_LOG.get()),
                Item.byBlock(ModBlocks.STRIPPED_ELDER_WOOD.get())
        );

        this.tag(ModTags.Items.ELDER_WOOD_STRIPPED_LOGS).add(
                Item.byBlock(ModBlocks.STRIPPED_ELDER_WOOD_LOG.get()),
                Item.byBlock(ModBlocks.STRIPPED_ELDER_WOOD.get())
        );

        this.tag(ModTags.Items.OLIVE_LOGS).add(
                Item.byBlock(ModBlocks.OLIVE_LOG.get()),
                Item.byBlock(ModBlocks.OLIVE_WOOD.get()),
                Item.byBlock(ModBlocks.STRIPPED_OLIVE_LOG.get()),
                Item.byBlock(ModBlocks.STRIPPED_OLIVE_WOOD.get())
        );

        this.tag(ModTags.Items.OLIVE_STRIPPED_LOGS).add(
                Item.byBlock(ModBlocks.STRIPPED_OLIVE_LOG.get()),
                Item.byBlock(ModBlocks.STRIPPED_OLIVE_WOOD.get())
        );

        this.tag(ModTags.Items.MYRRH_LOGS).add(
                Item.byBlock(ModBlocks.MYRRH_LOG.get()),
                Item.byBlock(ModBlocks.MYRRH_WOOD.get()),
                Item.byBlock(ModBlocks.STRIPPED_MYRRH_LOG.get()),
                Item.byBlock(ModBlocks.STRIPPED_MYRRH_WOOD.get())
        );

        this.tag(ModTags.Items.MYRRH_STRIPPED_LOGS).add(
                Item.byBlock(ModBlocks.STRIPPED_MYRRH_LOG.get()),
                Item.byBlock(ModBlocks.STRIPPED_MYRRH_WOOD.get())
        );

        this.tag(ModTags.Items.LAUREL_LOGS).add(
                Item.byBlock(ModBlocks.LAUREL_LOG.get()),
                Item.byBlock(ModBlocks.LAUREL_WOOD.get()),
                Item.byBlock(ModBlocks.STRIPPED_LAUREL_LOG.get()),
                Item.byBlock(ModBlocks.STRIPPED_LAUREL_WOOD.get())
        );

        this.tag(ModTags.Items.LAUREL_STRIPPED_LOGS).add(
                Item.byBlock(ModBlocks.STRIPPED_LAUREL_LOG.get()),
                Item.byBlock(ModBlocks.STRIPPED_LAUREL_WOOD.get())
        );

        this.tag(ModTags.Items.CYPRESS_LOGS).add(
                Item.byBlock(ModBlocks.CYPRESS_LOG.get()),
                Item.byBlock(ModBlocks.CYPRESS_WOOD.get()),
                Item.byBlock(ModBlocks.STRIPPED_CYPRESS_LOG.get()),
                Item.byBlock(ModBlocks.STRIPPED_CYPRESS_WOOD.get())
        );

        this.tag(ModTags.Items.CYPRESS_STRIPPED_LOGS).add(
                Item.byBlock(ModBlocks.STRIPPED_CYPRESS_LOG.get()),
                Item.byBlock(ModBlocks.STRIPPED_CYPRESS_WOOD.get())
        );

        this.tag(ModTags.Items.MUSHROOMS).add(
                Item.byBlock(Blocks.BROWN_MUSHROOM),
                Item.byBlock(Blocks.RED_MUSHROOM),
                Item.byBlock(ModBlocks.POINT_MUSHROOM_BLOCK.get()),
                Item.byBlock(ModBlocks.WITCHES_MUSHROOM_BLOCK.get()),
                Item.byBlock(ModBlocks.ROYAL_BLUE_MUSHROOM_BLOCK.get()),
                Item.byBlock(ModBlocks.SHORT_TOP_MUSHROOM_BLOCK.get()),
                Item.byBlock(ModBlocks.SPECTRAL_MUSHROOM_BLOCK.get()),
                Item.byBlock(ModBlocks.SHADE_MUSHROOM_BLOCK.get()),
                Item.byBlock(ModBlocks.CAP_MUSHROOM_BLOCK.get())
        );
    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}

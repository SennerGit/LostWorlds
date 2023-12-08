package net.sen.lostworlds.datagen.modonomicon;

import com.klikli_dev.modonomicon.api.ModonomiconAPI;
import com.klikli_dev.modonomicon.api.datagen.BookProvider;
import com.klikli_dev.modonomicon.api.datagen.CategoryEntryMap;
import com.klikli_dev.modonomicon.api.datagen.book.BookCategoryModel;
import com.klikli_dev.modonomicon.api.datagen.book.BookEntryModel;
import com.klikli_dev.modonomicon.api.datagen.book.BookModel;
import com.klikli_dev.modonomicon.api.datagen.book.page.BookTextPageModel;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.item.ModItems;

public class ModBookProvider extends BookProvider {
    public static final String COLOUR_ORANGE = "ad03fc";

    public ModBookProvider(PackOutput packOutput, LanguageProvider defaultLang) {
        super(ModItems.LOST_WORLDS_BOOK.getId().getPath(), packOutput, LostWorldsConstants.MODID, defaultLang);
    }

    @Override
    protected void registerDefaultMacros() {

    }

    @Override
    protected BookModel generateBook() {
        this.context().book("lost_worlds_book");
//        this.lang().add(this.context().bookName(), "Lost Worlds Book");
//        this.lang().add(this.context().bookTooltip(), "A book about the hidden world.");

        int sortNum = 1;

        BookCategoryModel baseBookCategory = BaseBookSection.makeBaseBookCategory(this.context).withSortNumber(sortNum++);
        BookCategoryModel underworldBookCategory = UnderworldBookSection.makeUnderworldBookCategory(this.context).withSortNumber(sortNum++);
        BookCategoryModel alfheimrBookCategory = AlfheimrBookSection.makeAlfheimrBookCategory(this.context).withSortNumber(sortNum++);
        BookCategoryModel nidavellirBookCategory = NidavellirBookSection.makeNidavellirBookCategory(this.context).withSortNumber(sortNum++);
        BookCategoryModel atlantisBookCategory = AtlantisBookSection.makeAtlantisBookCategory(this.context).withSortNumber(sortNum++);
        BookCategoryModel skyopiaBookCategory = SkyopiaBookSection.makeSkyopiaBookCategory(this.context).withSortNumber(sortNum++);

        var lostWorldsBook = BookModel.create(this.modLoc("lost_worlds_book"), this.context().bookName())
                .withModel(this.modLoc("lost_worlds_book_icon"))
                .withTooltip(this.context().bookTooltip())
                .withCategories(
                        baseBookCategory,
                        underworldBookCategory,
                        alfheimrBookCategory,
                        nidavellirBookCategory,
                        atlantisBookCategory,
                        skyopiaBookCategory
                )
                .withCraftingTexture(this.modLoc("textures/gui/book/crafting_textures.png"))
                .withGenerateBookItem(false)
                .withCustomBookItem(this.modLoc("lost_worlds_book"))
                .withAutoAddReadConditions(true);
        return lostWorldsBook;
    }
}

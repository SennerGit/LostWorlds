package net.sen.lostworlds.compat.modonomicon;

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
import net.sen.lostworlds.item.ModItems;

public class ModBookProvider extends BookProvider {
    public static final String COLOUR_ORANGE = "ad03fc";

    public ModBookProvider(PackOutput packOutput, LanguageProvider defaultLang) {
        super(ModItems.LOST_WORLDS_BOOK.getId().getPath(), packOutput, LostWorlds.MODID, defaultLang);
    }

    @Override
    protected void registerDefaultMacros() {

    }

    @Override
    protected BookModel generateBook() {
        this.context().book("lost_worlds_book");
        this.lang().add(this.context().bookName(), "Lost Worlds Book");
        this.lang().add(this.context().bookTooltip(), "A book about the hidden world.");

        int sortNum = 1;

        BookCategoryModel gettingStartedCategory = this.makeGettingStartedCategory().withSortNumber(sortNum++);

        var lostWorldsBook = BookModel.create(this.modLoc("lost_worlds_book"), this.context().bookName())
                .withModel(this.modLoc("lost_worlds_book_icon"))
                .withTooltip(this.context().bookTooltip())
                .withCategories(
                        gettingStartedCategory
                )
                .withCraftingTexture(this.modLoc("textures/gui/book/crafting_textures.png"))
                .withGenerateBookItem(false)
                .withCustomBookItem(this.modLoc("lost_worlds_book"))
                .withAutoAddReadConditions(true);
        return lostWorldsBook;
    }

    private BookCategoryModel makeGettingStartedCategory() {
        this.context().category("getting_started");
        this.lang().add(this.context().categoryName(), "Getting Started");

        CategoryEntryMap entryMap = ModonomiconAPI.get().getEntryMap();
        entryMap.setMap(
                "__________________________________",
                "__________________________________",
                "__________________________________",
                "__________________________________",
                "_______i__________________________",
                "__________________________________",
                "__________________________________",
                "__________________________________",
                "__________________________________"
        );

        BookEntryModel introEntry = this.makeIntroEntry(entryMap, 'i');

        return BookCategoryModel.create(this.modLoc(this.context().categoryId()), this.context().categoryName())
                .withIcon(ModItems.CRIMSON_DIAMOND.getId().toString())
                .withEntries(
                        introEntry
                );
    }

    private BookEntryModel makeIntroEntry(CategoryEntryMap entryMap, char icon) {
        this.context().entry("intro");
        this.lang.add(this.context().entryName(), "About");
        this.lang.add(this.context().entryDescription(), "About using the book");

        this.context().page("intro");
        BookTextPageModel intro = BookTextPageModel.builder()
                .withTitle(this.context().pageTitle())
                .withText(this.context().pageText())
                .build();
        this.lang.add(this.context().pageTitle(), "Getting Help");
        this.lang.add(this.context().pageText(),
                ""
        );

        return BookEntryModel.create(this.modLoc(this.context().categoryId() + "/" + this.context.entryId()), this.context().entryName())
                .withDescription(this.context().entryDescription())
                .withIcon(ModItems.CRIMSON_DIAMOND.getId().toString())
                .withLocation(entryMap.get(icon))
                .withEntryBackground(0, 1)
                .withPages(
                        intro
                );
    }
}

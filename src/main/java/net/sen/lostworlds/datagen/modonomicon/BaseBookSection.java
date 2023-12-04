package net.sen.lostworlds.datagen.modonomicon;

import com.klikli_dev.modonomicon.api.ModonomiconAPI;
import com.klikli_dev.modonomicon.api.datagen.BookContextHelper;
import com.klikli_dev.modonomicon.api.datagen.CategoryEntryMap;
import com.klikli_dev.modonomicon.api.datagen.book.BookCategoryModel;
import com.klikli_dev.modonomicon.api.datagen.book.BookEntryModel;
import com.klikli_dev.modonomicon.api.datagen.book.page.BookTextPageModel;
import net.minecraft.resources.ResourceLocation;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.item.ModItems;

public class BaseBookSection {
    
    public static BookCategoryModel makeBaseBookCategory(BookContextHelper context) {
        context.category("getting_started");
//        this.lang().add(context().categoryName(), "Getting Started");

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

        BookEntryModel introEntry = makeIntroEntry(context, entryMap, 'i');

        return BookCategoryModel.create(modLoc(context.categoryId()), context.categoryName())
                .withIcon(ModItems.BASIC_PORTAL_CORE.getId().toString())
                .withEntries(
                        introEntry
                );
    }

    public static BookEntryModel makeIntroEntry(BookContextHelper context, CategoryEntryMap entryMap, char icon) {
        context.entry("intro");
//        this.lang.add(context().entryName(), "About");
//        this.lang.add(context().entryDescription(), "About using the book");

        context.page("intro");
        BookTextPageModel intro = BookTextPageModel.builder()
                .withTitle(context.pageTitle())
                .withText(context.pageText())
                .build();
//        this.lang.add(context().pageTitle(), "Getting Help");
//        this.lang.add(context().pageText(),
//                ""
//        );

        return BookEntryModel.create(modLoc(context.categoryId() + "/" + context.entryId()), context.entryName())
                .withDescription(context.entryDescription())
                .withIcon(ModItems.BASIC_PORTAL_CORE.getId().toString())
                .withLocation(entryMap.get(icon))
                .withEntryBackground(0, 1)
                .withPages(
                        intro
                );
    }

    protected static ResourceLocation modLoc(String name) {
        return new ResourceLocation(LostWorlds.MODID, name);
    }
}

package net.sen.lostworlds.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.registry.blocks.*;
import net.sen.lostworlds.registry.items.*;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LostWorldsApi.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LOSTWORLDS_TAB = createTab("lostworlds_tab", ModItems.BASIC_PORTAL_CORE.get(), ModItems.ITEMS, ModBlocks.BLOCKS);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> UNDERWORLD = createTab("underworld_tab", UnderworldBlocks.UNDERWORLD_PORTAL_FRAME.get(), UnderworldItems.UNDERWORLD_ITEMS, UnderworldBlocks.UNDERWORLD_BLOCKS);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ALFHEIMR_TAB = createTab("alfheimr_tab", AlfheimrBlocks.ALFHEIMR_PORTAL_FRAME.get(), AlfheimrItems.ALFHEIMR_ITEMS, AlfheimrBlocks.ALFHEIMR_BLOCKS);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NIDAVELLIR_TAB = createTab("nidavellir_tab", NidavellirBlocks.NIDAVELLIR_PORTAL_FRAME.get(), NidavellirItems.NIDAVELLIR_ITEMS, NidavellirBlocks.NIDAVELLIR_BLOCKS);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ATLANTIS_TAB = createTab("atlantis_tab", AtlantisBlocks.ATLANTIS_PORTAL_FRAME.get(), AtlantisItems.ATLANTIS_ITEMS, AtlantisBlocks.ATLANTIS_BLOCKS);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SKYOPIA_TAB = createTab("skyopia_tab", SkyopiaBlocks.SKYOPIA_PORTAL_FRAME.get(), SkyopiaItems.SKYOPIA_ITEMS, SkyopiaBlocks.SKYOPIA_BLOCKS);

    private static DeferredHolder<CreativeModeTab, CreativeModeTab> createTab(String name, ItemLike icon, DeferredRegister.Items itemDeferredRegister, DeferredRegister.Blocks blockDeferredRegister, Item... skip) {
        return CREATIVE_MODE_TABS.register(name,
                () -> CreativeModeTab.builder()
                        .title(Component.translatable("itemgroup." + name))
                        .icon(() -> new ItemStack(icon))
                        .displayItems((pParameters, pOutput) -> {
                            itemDeferredRegister.getEntries().forEach(i -> {
                                for (Item item : skip) {
                                    if (i.get() == item) return;
                                }

                                var stack = new ItemStack(i.get());

                                pOutput.accept(stack);
                            });

                            blockDeferredRegister.getEntries().forEach(i -> {
                                for (Item item : skip) {
                                    if (i.get().asItem() == item) return;
                                }

                                var stack = new ItemStack(i.get());

                                pOutput.accept(stack);
                            });
                        })
                        .build()
        );
    }

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

package net.sen.lostworlds.screen;

import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.screen.alloysmelter.AlloySmelterMenu;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, LostWorldsApi.MODID);

    public static final RegistryObject<MenuType<AlloySmelterMenu>> ALLOY_SMELTER_MENU = registerMenuType("alloy_smelter_menu", AlloySmelterMenu::new);

//    public static final RegistryObject<MenuType<LostWorldsInventory>> LOST_WORLDS_INVENTORY =
//    registerMenuType("lost_worlds_inventory", LostWorldsInventory::new);

    public static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registerMenuType(String name, IContainerFactory<T> factory) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}

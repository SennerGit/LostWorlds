package net.sen.lostworlds.screen;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.network.IContainerFactory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.lostworlds.api.LostWorldsApi;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(Registries.MENU, LostWorldsApi.MODID);

//    public static final DeferredHolder<MenuType<?>, MenuType<AlloySmelterMenu>> ALLOY_SMELTER_MENU = registerMenuType("alloy_smelter_menu", AlloySmelterMenu::new);
    public static final DeferredHolder<MenuType<?>, MenuType<MysticGatewayControllerMenu>> MYSTIC_GATEWAY_CONTROLLER_MENU = registerMenuType("mystic_gateway_controller_menu", MysticGatewayControllerMenu::new);

//    public static final DeferredHolder<MenuType<?>, MenuType<LostWorldsInventory>> LOST_WORLDS_INVENTORY =
//    registerMenuType("lost_worlds_inventory", LostWorldsInventory::new);

    public static <T extends AbstractContainerMenu>DeferredHolder<MenuType<?>, MenuType<T>> registerMenuType(String name, IContainerFactory<T> factory) {
        return MENUS.register(name, () ->  IMenuTypeExtension.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}

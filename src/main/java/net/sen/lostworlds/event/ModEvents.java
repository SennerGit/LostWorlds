package net.sen.lostworlds.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.RegisterCommandsEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.event.village.WandererTradesEvent;
import net.neoforged.neoforge.server.command.ConfigCommand;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.command.ReturnHomeCommand;
import net.sen.lostworlds.command.SetHomeCommand;
import net.sen.lostworlds.registry.items.ModItems;
import net.sen.lostworlds.registry.items.UnderworldItems;
import net.minecraft.world.item.ItemStack;
import net.sen.lostworlds.villager.ModVillagers;
import java.util.List;

@EventBusSubscriber(modid = LostWorldsApi.MODID, bus = EventBusSubscriber.Bus.GAME)
public class ModEvents {
    @SubscribeEvent
    public static void onCommandsRegister(RegisterCommandsEvent event) {
        new SetHomeCommand(event.getDispatcher());
        new ReturnHomeCommand(event.getDispatcher());

        ConfigCommand.register(event.getDispatcher());
    }

    @SubscribeEvent
    public static void onPlayerCloned(PlayerEvent.Clone event) {
        event.getEntity().getPersistentData().putIntArray(LostWorldsApi.MODID + ".homepos", event.getOriginal().getPersistentData().getIntArray(LostWorldsApi.MODID + ".homepos"));
    }

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if (event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(UnderworldItems.POMEGRANATE.get(), 6);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((pTrader, pRandom) -> tradingCost(2, UnderworldItems.POMEGRANATE.get(), 6, 10, 2, 0.02f));
        }

//        if (event.getType() == ModVillagers.ALLOY_MASTER.get()) {
//            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
//
//            trades.get(1).add((pTrader, pRandom) -> tradingCost(2, Items.COPPER_INGOT, 6, 10, 2, 0.02f));
//            trades.get(1).add((pTrader, pRandom) -> tradingCost(2, ModItems.ZINC_INGOT.get(), 6, 10, 2, 0.02f));
//            trades.get(1).add((pTrader, pRandom) -> tradingCost(2, ModItems.TIN_INGOT.get(), 6, 10, 2, 0.02f));
//            trades.get(2).add((pTrader, pRandom) -> tradingCost(2, ModItems.BRASS_INGOT.get(), 6, 10, 2, 0.02f));
//            trades.get(2).add((pTrader, pRandom) -> tradingCost(2, ModItems.BRONZE_INGOT.get(), 6, 10, 2, 0.02f));
//        }
    }

    @SubscribeEvent
    public static void addCustomWanderingTrades(WandererTradesEvent event) {
            List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
            List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();
            ItemStack stack = new ItemStack(UnderworldItems.POMEGRANATE.get(), 6);
            int villagerLevel = 1;

            genericTrades.add((pTrader, pRandom) -> tradingCost(2, UnderworldItems.POMEGRANATE.get(), 6, 10, 2, 0.02f));
    }

    public static MerchantOffer tradingCost(int cost, Item item, int itemAmount, int maxUses, int xp, float priceMultiplier) {
        MerchantOffer newOffer;
        ItemCost emeraldCost = new ItemCost(Items.EMERALD, cost);
        ItemStack stack = new ItemStack(item, itemAmount);
        newOffer = new MerchantOffer(emeraldCost, stack, maxUses, xp, priceMultiplier);
        return newOffer;
    }
}

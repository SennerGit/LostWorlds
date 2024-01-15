package net.sen.lostworlds.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.server.command.ConfigCommand;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.command.ReturnHomeCommand;
import net.sen.lostworlds.command.SetHomeCommand;
import net.sen.lostworlds.item.ModItems;
import net.sen.lostworlds.item.custom.HammerItem;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sen.lostworlds.magic.MagicCapability;
import net.sen.lostworlds.magic.MagicCapabilityAttacher;
import net.sen.lostworlds.magic.ModMagicProperties;
import net.sen.lostworlds.villager.ModVillagers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Mod.EventBusSubscriber(modid = LostWorldsApi.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEvents {

    // Done with the help of https://github.com/CoFH/CoFHCore/blob/1.19.x/src/main/java/cofh/core/event/AreaEffectEvents.java
    // Don't be a jerk License
    private static final Set<BlockPos> HARVESTED_BLOCKS = new HashSet<>();

    @SubscribeEvent
    public static void onHammerUsage(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        ItemStack mainHandItem = player.getMainHandItem();

        if(mainHandItem.getItem() instanceof HammerItem hammer && player instanceof ServerPlayer serverPlayer) {
            BlockPos initalBlockPos = event.getPos();
            if (HARVESTED_BLOCKS.contains(initalBlockPos)) {
                return;
            }

            for (BlockPos pos : HammerItem.getBlocksToBeDestroyed(1, initalBlockPos, serverPlayer)) {
                if(pos == initalBlockPos || !hammer.isCorrectToolForDrops(mainHandItem, event.getLevel().getBlockState(pos))) {
                    continue;
                }

                // Have to add them to a Set otherwise, the same code right here will get called for each block!
                HARVESTED_BLOCKS.add(pos);
                serverPlayer.gameMode.destroyBlock(pos);
                HARVESTED_BLOCKS.remove(pos);
            }
        }
    }

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
    public static void livingDamage(LivingDamageEvent event) {
//        if (event.getEntity() instanceof Sheep) {
//            if (event.getSource().getDirectEntity() instanceof Player player) {
//                if (player.getItemInHand(InteractionHand.MAIN_HAND).getItem() == ModItems.NETHER_STEEL_AXE.get()) {
//                    LostWorlds.LOGGER.info("Sheep was hit with Nether Steel Axe by " + player.getName().getString());
//                } else if (player.getItemInHand(InteractionHand.MAIN_HAND).getItem() == Items.DIAMOND_AXE) {
//                    LostWorlds.LOGGER.info("Sheep was hit with Diamond Axe by " + player.getName().getString());
//                } else {
//                    LostWorlds.LOGGER.info("Sheep was hit with something else by " + player.getName().getString());
//                }
//            }
//        }
    }

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if (event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.POMEGRANATE.get(), 6);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((pTrader, pRandom) -> tradingCost(2, ModItems.POMEGRANATE.get(), 6, 10, 2, 0.02f));
//            trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
//                    stack, new ItemStack(ModItems.POMEGRANATE.get(), 6),
//                    10, 2, 0.02f)
//            );
        }

        if (event.getType() == ModVillagers.ALLOY_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> tradingCost(2, Items.COPPER_INGOT, 6, 10, 2, 0.02f));
            trades.get(1).add((pTrader, pRandom) -> tradingCost(2, ModItems.ZINC_INGOT.get(), 6, 10, 2, 0.02f));
            trades.get(1).add((pTrader, pRandom) -> tradingCost(2, ModItems.TIN_INGOT.get(), 6, 10, 2, 0.02f));
            trades.get(2).add((pTrader, pRandom) -> tradingCost(2, ModItems.BRASS_INGOT.get(), 6, 10, 2, 0.02f));
            trades.get(2).add((pTrader, pRandom) -> tradingCost(2, ModItems.BRONZE_INGOT.get(), 6, 10, 2, 0.02f));
//            trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
//                    stack, new ItemStack(ModItems.POMEGRANATE.get(), 6),
//                    10, 2, 0.02f)
//            );
        }
    }

//    @SubscribeEvent
//    public static void addCustomDwarvenTrades(DwarvenVillagerTradesEvent event) {
//        if (event.getType() == ModDwarvenVillagers.ALLOY_MASTER.get()) {
//            Int2ObjectMap<List<DwarvenVillagerTrades.ItemListing>> trades = event.getTrades();
//
//            trades.get(1).add((pTrader, pRandom) -> tradingCost(2, Items.COPPER_INGOT, 6, 10, 2, 0.02f));
//            trades.get(1).add((pTrader, pRandom) -> tradingCost(2, ModItems.ZINC_INGOT.get(), 6, 10, 2, 0.02f));
//            trades.get(1).add((pTrader, pRandom) -> tradingCost(2, ModItems.TIN_INGOT.get(), 6, 10, 2, 0.02f));
//            trades.get(2).add((pTrader, pRandom) -> tradingCost(2, ModItems.BRASS_INGOT.get(), 6, 10, 2, 0.02f));
//            trades.get(2).add((pTrader, pRandom) -> tradingCost(2, ModItems.BRONZE_INGOT.get(), 6, 10, 2, 0.02f));
////            trades.get(villagerLevel).add((pTrader, pRandom) -> new MerchantOffer(
////                    stack, new ItemStack(ModItems.POMEGRANATE.get(), 6),
////                    10, 2, 0.02f)
////            );
//        }
//    }

    @SubscribeEvent
    public static void addCustomWanderingTrades(WandererTradesEvent event) {
            List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
            List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();
            ItemStack stack = new ItemStack(ModItems.POMEGRANATE.get(), 6);
            int villagerLevel = 1;

            genericTrades.add((pTrader, pRandom) -> tradingCost(2, ModItems.POMEGRANATE.get(), 6, 10, 2, 0.02f));
//            genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
//                    stack, new ItemStack(ModItems.POMEGRANATE.get(), 6),
//                    10, 2, 0.02f)
//            );
    }

    public static MerchantOffer tradingCost(int cost, Item item, int itemAmount, int maxUses, int xp, float priceMultiplier) {
        MerchantOffer newOffer;
        ItemStack emeraldCost = new ItemStack(Items.EMERALD, cost);
        ItemStack stack = new ItemStack(item, itemAmount);
        newOffer = new MerchantOffer(emeraldCost, stack, maxUses, xp, priceMultiplier);
        return newOffer;
    }

    @SubscribeEvent
    public static void registerCaps(RegisterCapabilitiesEvent event) {
        MagicCapability.register(event);
    }

    @SubscribeEvent
    public static void addMagicToItems(AttachCapabilitiesEvent<Item> event) {
        if (event.getObject() == Items.ENDER_EYE)
            MagicCapabilityAttacher.attach(event, ModMagicProperties.PORTAL_CORE);
    }

    @SubscribeEvent
    public static void onTick(TickEvent.LevelTickEvent event) {
        var level = event.level;

        if (!(level instanceof ServerLevel serverLevel) || event.side != LogicalSide.SERVER)
            return;

        if (event.phase == TickEvent.Phase.START)
            onServerLevelTickStart(serverLevel);
        else if (event.phase == TickEvent.Phase.END)
            onServerLevelTickEnd(serverLevel);
    }

    private static void onServerLevelTickStart(ServerLevel level) {
    }

    private static void onServerLevelTickEnd(ServerLevel level) {
    }
}

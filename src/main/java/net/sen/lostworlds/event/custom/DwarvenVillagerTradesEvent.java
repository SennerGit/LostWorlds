//package net.sen.lostworlds.event.custom;
//
//import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
//import net.minecraft.world.entity.npc.VillagerProfession;
//import net.minecraft.world.entity.npc.VillagerTrades;
//import net.neoforged.bus.api.Event;
//import net.sen.lostworlds.villager.custom.dwarven.*;
//
//import java.util.List;
//
//public class DwarvenVillagerTradesEvent extends Event {
//    protected Int2ObjectMap<List<DwarvenVillagerTrades.ItemListing>> trades;
//    protected DwarvenVillagerProfessionsFactory type;
//
//    public DwarvenVillagerTradesEvent(Int2ObjectMap<List<DwarvenVillagerTrades.ItemListing>> trades, DwarvenVillagerProfessionsFactory type)
//    {
//        this.trades = trades;
//        this.type = type;
//    }
//
//    public Int2ObjectMap<List<DwarvenVillagerTrades.ItemListing>> getTrades()
//    {
//        return trades;
//    }
//
//    public DwarvenVillagerProfessionsFactory getType()
//    {
//        return type;
//    }
//}

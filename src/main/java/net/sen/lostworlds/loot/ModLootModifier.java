//package net.sen.lostworlds.loot;
//
//import com.mojang.serialization.Codec;
//import net.minecraft.core.registries.Registries;
//import net.neoforged.bus.api.IEventBus;
//import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
//import net.neoforged.neoforge.registries.DeferredHolder;
//import net.neoforged.neoforge.registries.DeferredRegister;
//import net.neoforged.neoforge.registries.NeoForgeRegistries;
//import net.sen.lostworlds.api.LostWorldsApi;
//
//public class ModLootModifier {
//    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS =
//            DeferredRegister.create(NeoForgeRegistries.GLOBAL_LOOT_MODIFIER_SERIALIZERS, LostWorldsApi.MODID);
//
//    public static final DeferredHolder<Codec<?>, Codec<?extends  IGlobalLootModifier>> ADD_ITEM =
//            LOOT_MODIFIER_SERIALIZERS.register("add_item", AddItemModifier.CODEC);
//    public static final DeferredHolder<Codec<?>, Codec<?extends  IGlobalLootModifier>> ADD_SUS_SAND_ITEM =
//            LOOT_MODIFIER_SERIALIZERS.register("add_sus_sand_item", AddSusSandItemModifier.CODEC);
//
//    public static void register(IEventBus eventBus) {
//        LOOT_MODIFIER_SERIALIZERS.register(eventBus);
//    }
//}

package net.sen.lostworlds.villager;

import com.google.common.collect.ImmutableSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.registry.blocks.ModBlocks;

import java.util.function.Supplier;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(Registries.POINT_OF_INTEREST_TYPE, LostWorldsApi.MODID);

    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(Registries.VILLAGER_PROFESSION, LostWorldsApi.MODID);

//    public static final DeferredHolder<PoiType, PoiType> ALLOY_POI = POI_TYPES.register("alloy_poi",
//            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.ALLOY_SMELTER.get().getStateDefinition().getPossibleStates()),
//                    1, 1));

//    private static final String alloyName = "alloy_master";
//    public static final DeferredHolder<VillagerProfession, VillagerProfession> ALLOY_MASTER =
//            VILLAGER_PROFESSIONS.register(alloyName, () -> new VillagerProfession(alloyName,
//                    x -> x.value() == ALLOY_POI.get(), x -> x.value() == ALLOY_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
//                    SoundEvents.VILLAGER_WORK_TOOLSMITH));

//    public static final DeferredHolder<VillagerProfession> ALLOY_MASTER = registerProfession("alloy_master",
//            () -> new VillagerProfession("alloy_master",
//                    x -> x.get() == ALLOY_POI.get(), x -> x.get() == ALLOY_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
//                    SoundEvents.VILLAGER_WORK_TOOLSMITH));

    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }

//    private static <T extends VillagerProfession> DeferredHolder<T> registerProfession(String name, PoiType poiType, SoundEvent soundEvents) {
//        Supplier<VillagerProfession> supplier = () -> new VillagerProfession(name,
//                x -> x.get() == poiType, x -> x.get() == poiType, ImmutableSet.of(), ImmutableSet.of(), soundEvents);
//        DeferredHolder<T> toReturn = VILLAGER_PROFESSIONS.register(name, supplier);
////        return VILLAGER_PROFESSIONS.register(name, () -> new VillagerProfession(name,
////                x -> x.get() == poiType, x -> x.get() == poiType, ImmutableSet.of(), ImmutableSet.of(), soundEvents));
//        return toReturn;
//    }

//    private static <T extends VillagerProfession> DeferredHolder<T> registerProfession(String name, PoiType poiType, SoundEvent soundEvents) {
//        Supplier<T> supplier = () -> new VillagerProfession(name,
//                x -> x.get() == poiType, x -> x.get() == poiType, ImmutableSet.of(), ImmutableSet.of(), soundEvents);
//        DeferredHolder<T> toReturn = VILLAGER_PROFESSIONS.register(name, supplier);
//
//        return toReturn;
//    }

    private static <T extends VillagerProfession> DeferredHolder<VillagerProfession, T> registerProfession(String name, Supplier<T> supplier) {
        DeferredHolder<VillagerProfession, T> toReturn = VILLAGER_PROFESSIONS.register(name, supplier);

        return toReturn;
    }
}

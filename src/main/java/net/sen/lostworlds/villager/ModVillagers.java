package net.sen.lostworlds.villager;

import com.google.common.collect.ImmutableSet;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.block.ModBlocks;

import java.util.function.Supplier;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, LostWorldsConstants.MODID);

    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, LostWorldsConstants.MODID);

    public static final RegistryObject<PoiType> ALLOY_POI = POI_TYPES.register("alloy_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.ALLOY_SMELTER.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    private static final String alloyName = "alloy_master";
    public static final RegistryObject<VillagerProfession> ALLOY_MASTER =
            VILLAGER_PROFESSIONS.register(alloyName, () -> new VillagerProfession(alloyName,
                    x -> x.get() == ALLOY_POI.get(), x -> x.get() == ALLOY_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_TOOLSMITH));

//    public static final RegistryObject<VillagerProfession> ALLOY_MASTER = registerProfession("alloy_master",
//            () -> new VillagerProfession("alloy_master",
//                    x -> x.get() == ALLOY_POI.get(), x -> x.get() == ALLOY_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
//                    SoundEvents.VILLAGER_WORK_TOOLSMITH));

    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }

//    private static <T extends VillagerProfession> RegistryObject<T> registerProfession(String name, PoiType poiType, SoundEvent soundEvents) {
//        Supplier<VillagerProfession> supplier = () -> new VillagerProfession(name,
//                x -> x.get() == poiType, x -> x.get() == poiType, ImmutableSet.of(), ImmutableSet.of(), soundEvents);
//        RegistryObject<T> toReturn = VILLAGER_PROFESSIONS.register(name, supplier);
////        return VILLAGER_PROFESSIONS.register(name, () -> new VillagerProfession(name,
////                x -> x.get() == poiType, x -> x.get() == poiType, ImmutableSet.of(), ImmutableSet.of(), soundEvents));
//        return toReturn;
//    }

//    private static <T extends VillagerProfession> RegistryObject<T> registerProfession(String name, PoiType poiType, SoundEvent soundEvents) {
//        Supplier<T> supplier = () -> new VillagerProfession(name,
//                x -> x.get() == poiType, x -> x.get() == poiType, ImmutableSet.of(), ImmutableSet.of(), soundEvents);
//        RegistryObject<T> toReturn = VILLAGER_PROFESSIONS.register(name, supplier);
//
//        return toReturn;
//    }

    private static <T extends VillagerProfession> RegistryObject<T> registerProfession(String name, Supplier<T> supplier) {
        RegistryObject<T> toReturn = VILLAGER_PROFESSIONS.register(name, supplier);

        return toReturn;
    }
}

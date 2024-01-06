package net.sen.lostworlds.villager.custom.dwarven;

import com.google.common.collect.ImmutableSet;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.*;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.block.ModBlocks;

import java.util.function.Supplier;

public class ModDwarvenVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, LostWorldsConstants.MODID);

//    public static final RegistryObject<PoiType> ALLOY_POI = POI_TYPES.register("alloy_poi",
//            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.ALLOY_SMELTER.get().getStateDefinition().getPossibleStates()),
//                    1, 1));

    public static final DeferredRegister<DwarvenVillagerProfessionsFactory> DWARVEN_VILLAGER_PROFESSIONS_FACTORY =
            DeferredRegister.create(LostWorldsConstants.modLoc("dwarven_villager_professions_factory"), LostWorldsConstants.MODID);

//    public static final ResourceKey<Registry<DwarvenVillagerProfessionsFactory>> DWARVEN_VILLAGER_PROFESSIONS_KEY = key("dwarven_villager_professions_factory");

//    public static final IForgeRegistry<DwarvenVillagerProfessionsFactory> DWARVEN_VILLAGER_PROFESSIONS = RegistryManager.ACTIVE.getRegistry(DWARVEN_VILLAGER_PROFESSIONS_KEY);

//    public static final Supplier<IForgeRegistry<DwarvenVillagerProfessionsFactory>> REGISTRY = DWARVEN_VILLAGER_PROFESSIONS_FACTORY.makeRegistry(
//            () -> new RegistryBuilder<DwarvenVillagerProfessionsFactory>().disableSaving().setMaxID(Integer.MAX_VALUE - 1)
//    );

    private static final String alloyName = "alloy_master";
//    public static final RegistryObject<DwarvenVillagerProfessionsFactory> ALLOY_MASTER =
//            DWARVEN_VILLAGER_PROFESSIONS_FACTORY.register(alloyName, () -> new DwarvenVillagerProfessionsFactory(alloyName,
//                    x -> x.get() == ALLOY_POI.get(), x -> x.get() == ALLOY_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
//                    SoundEvents.VILLAGER_WORK_TOOLSMITH));

    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        DWARVEN_VILLAGER_PROFESSIONS_FACTORY.register(eventBus);
    }

    private static <T> ResourceKey<Registry<T>> key(String name)
    {
        return ResourceKey.createRegistryKey(new ResourceLocation(name));
    }
}

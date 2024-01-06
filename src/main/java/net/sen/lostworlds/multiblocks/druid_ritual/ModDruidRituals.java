//package net.sen.lostworlds.multiblocks.druid_ritual;
//
//import net.minecraftforge.eventbus.api.IEventBus;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.IForgeRegistry;
//import net.minecraftforge.registries.RegistryBuilder;
//import net.sen.lostworlds.LostWorldsConstants;
//
//import java.util.function.Supplier;
//
//public class ModDruidRituals {
//    public static final DeferredRegister<DruidRitualFactory> DRUID_RITUAL_FACTORIES = DeferredRegister.create(LostWorldsConstants.modLoc("druid_ritual_factory"), LostWorldsConstants.MODID);
//
//    public static final Supplier<IForgeRegistry<DruidRitualFactory>> REGISTRY = DRUID_RITUAL_FACTORIES.makeRegistry(
//            () -> new RegistryBuilder<DruidRitualFactory>().disableSaving().setMaxID(Integer.MAX_VALUE - 1)
//    );
//
//        public static void register(IEventBus eventBus) {
//        DRUID_RITUAL_FACTORIES.register(eventBus);
//    }
//}

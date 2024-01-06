//package net.sen.lostworlds.multiblocks.druid_ritual;
//
//import java.util.function.Function;
//
//public class DruidRitualFactory {
//    Function<DruidRitualRecipe, ? extends DruidRitual> constructor;
//
//    public DruidRitualFactory(Function<DruidRitualRecipe, ? extends DruidRitual> constructor) {
//        this.constructor = constructor;
//    }
//
//    public DruidRitual create(DruidRitualRecipe druidRitualRecipe) {
//        DruidRitual ritual = this.constructor.apply(druidRitualRecipe);
//        ritual.setFactoryId(ModDruidRituals.REGISTRY.get().getKey(this));
//        return ritual;
//    }
//}

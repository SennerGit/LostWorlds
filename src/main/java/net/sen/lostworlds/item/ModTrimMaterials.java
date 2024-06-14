//package net.sen.lostworlds.item;
//
//import net.minecraft.Util;
//import net.minecraft.core.Holder;
//import net.minecraft.core.registries.Registries;
//import net.minecraft.data.worldgen.BootstapContext;
//import net.minecraft.network.chat.Component;
//import net.minecraft.resources.ResourceKey;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.item.armortrim.TrimMaterial;
//import net.sen.lostworlds.LostWorldsApi;
//
//import javax.swing.text.Style;
//import java.util.Map;
//
//public class ModTrimMaterials {
//    private static ResourceKey<TrimMaterial> registerKey(String name) {
//        return ResourceKey.create(Registries.TRIM_MATERIAL, LostWorldsApi.modLoc(name));
//    }
//
//    public static void bootstrap(BootstapContext<TrimMaterial> context) {
//
//    }
//
//    private static void register(BootstapContext<TrimMaterial> context, ResourceKey<TrimMaterial> trimKey, Holder<Item> trimItem, Style colour, float itemModelIndex) {
//        TrimMaterial material = new TrimMaterial(trimKey.location().getPath(), trimItem, itemModelIndex, Map.of(), Component.translatable(Util.makeDescriptionId("trim_material", trimKey.location())).withStyle(colour));
//        context.register(trimKey, material);
//    }
//}

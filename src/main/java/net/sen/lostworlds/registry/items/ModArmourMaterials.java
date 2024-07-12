package net.sen.lostworlds.registry.items;

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.lostworlds.api.LostWorldsApi;

import java.util.EnumMap;
import java.util.List;

public class ModArmourMaterials {
    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS = DeferredRegister.create(Registries.ARMOR_MATERIAL, LostWorldsApi.MODID);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> ZINC = register("zinc", 4, 5, 7, 5, 11, 15, SoundEvents.ARMOR_EQUIP_IRON, ModItems.ZINC_INGOT, 3.0F, 0.1F);
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> TIN = register("tin", 4, 5, 7, 5, 11, 15, SoundEvents.ARMOR_EQUIP_IRON, ModItems.ZINC_INGOT, 3.0F, 0.1F);
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> BRASS = register("brass", 4, 5, 7, 5, 11, 15, SoundEvents.ARMOR_EQUIP_IRON, ModItems.ZINC_INGOT, 3.0F, 0.1F);
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> BRONZE = register("bronze", 4, 5, 7, 5, 11, 15, SoundEvents.ARMOR_EQUIP_IRON, ModItems.ZINC_INGOT, 3.0F, 0.1F);
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> ORICHALCUM = register("orichalcum", 4, 5, 7, 5, 11, 15, SoundEvents.ARMOR_EQUIP_IRON, ModItems.ZINC_INGOT, 3.0F, 0.1F);

    private static DeferredHolder<ArmorMaterial, ArmorMaterial> register(String name, int boot, int leggings, int chestplate, int helmet, int body, int enchantmentValue,
                                                                         Holder<SoundEvent> soundEvents, DeferredItem<Item> item, float toughness, float knockbackResistance) {
        return ARMOR_MATERIALS.register(
                name,
                () -> new ArmorMaterial(
                        Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                            attribute.put(ArmorItem.Type.BOOTS, boot);
                            attribute.put(ArmorItem.Type.LEGGINGS, leggings);
                            attribute.put(ArmorItem.Type.CHESTPLATE, chestplate);
                            attribute.put(ArmorItem.Type.HELMET, helmet);
                            attribute.put(ArmorItem.Type.BODY, body);
                        }), enchantmentValue, soundEvents, () -> Ingredient.of(item.get()), List.of(new ArmorMaterial.Layer(LostWorldsApi.modLoc(name))), toughness, knockbackResistance)
                );
    }
}

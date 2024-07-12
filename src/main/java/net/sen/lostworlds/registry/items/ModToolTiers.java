package net.sen.lostworlds.registry.items;

import com.google.common.base.Suppliers;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public enum ModToolTiers implements Tier {
    ZINC(5, 2000, 9f, 3, () -> Ingredient.of(ModItems.ZINC_INGOT.get()), BlockTags.INCORRECT_FOR_IRON_TOOL),
    TIN(5, 2000, 9f, 3, () -> Ingredient.of(ModItems.ZINC_INGOT.get()), BlockTags.INCORRECT_FOR_IRON_TOOL),
    BRASS(5, 2000, 9f, 3, () -> Ingredient.of(ModItems.ZINC_INGOT.get()), BlockTags.INCORRECT_FOR_IRON_TOOL),
    BRONZE(5, 2000, 9f, 3, () -> Ingredient.of(ModItems.ZINC_INGOT.get()), BlockTags.INCORRECT_FOR_IRON_TOOL),
    ORICHALCUM(5, 2000, 9f, 3, () -> Ingredient.of(ModItems.ZINC_INGOT.get()), BlockTags.INCORRECT_FOR_IRON_TOOL);

    private final int durability;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;
    private final TagKey<Block> incorrectTag;

    ModToolTiers(int durability, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient, TagKey<Block> incorrectTag) {
        this.durability = durability;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
        this.incorrectTag = incorrectTag;
    }

    public int getUses() {
        return this.durability;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrectTag;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}

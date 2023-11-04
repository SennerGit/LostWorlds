package net.sen.lostworlds.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier NETHER_STEEL = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2000, 9f, 3f, 26,
                    ModTags.Blocks.NEEDS_NETHER_STEEL_TOOL, () -> Ingredient.of(ModItems.NETHER_STEEL_INGOT.get())),
            new ResourceLocation(LostWorlds.MODID, "nether_steel"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier ZINC = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2000, 9f, 3f, 26,
                    ModTags.Blocks.NEEDS_NETHER_STEEL_TOOL, () -> Ingredient.of(ModItems.ZINC_INGOT.get())),
            new ResourceLocation(LostWorlds.MODID, "zinc"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier TIN = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2000, 9f, 3f, 26,
                    ModTags.Blocks.NEEDS_NETHER_STEEL_TOOL, () -> Ingredient.of(ModItems.TIN_INGOT.get())),
            new ResourceLocation(LostWorlds.MODID, "tin"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier BRASS = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2000, 9f, 3f, 26,
                    ModTags.Blocks.NEEDS_NETHER_STEEL_TOOL, () -> Ingredient.of(ModItems.BRASS_INGOT.get())),
            new ResourceLocation(LostWorlds.MODID, "brass"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier BRONZE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2000, 9f, 3f, 26,
                    ModTags.Blocks.NEEDS_NETHER_STEEL_TOOL, () -> Ingredient.of(ModItems.BRONZE_INGOT.get())),
            new ResourceLocation(LostWorlds.MODID, "bronze"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier ORICHALCUM = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2000, 9f, 3f, 26,
                    ModTags.Blocks.NEEDS_NETHER_STEEL_TOOL, () -> Ingredient.of(ModItems.ORICHALCUM_INGOT.get())),
            new ResourceLocation(LostWorlds.MODID, "orichalcum"), List.of(Tiers.NETHERITE), List.of());
}

package net.sen.lostworlds.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier ZINC = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2000, 9f, 3f, 26,
                    ModTags.Blocks.NEEDS_NETHER_STEEL_TOOL, () -> Ingredient.of(ModItems.ZINC_INGOT.get())),
            LostWorldsApi.modLoc("zinc"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier TIN = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2000, 9f, 3f, 26,
                    ModTags.Blocks.NEEDS_NETHER_STEEL_TOOL, () -> Ingredient.of(ModItems.TIN_INGOT.get())),
            LostWorldsApi.modLoc("tin"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier BRASS = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2000, 9f, 3f, 26,
                    ModTags.Blocks.NEEDS_NETHER_STEEL_TOOL, () -> Ingredient.of(ModItems.BRASS_INGOT.get())),
            LostWorldsApi.modLoc("brass"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier BRONZE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2000, 9f, 3f, 26,
                    ModTags.Blocks.NEEDS_NETHER_STEEL_TOOL, () -> Ingredient.of(ModItems.BRONZE_INGOT.get())),
            LostWorldsApi.modLoc("bronze"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier ORICHALCUM = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2000, 9f, 3f, 26,
                    ModTags.Blocks.NEEDS_NETHER_STEEL_TOOL, () -> Ingredient.of(UnderworldItems.ORICHALCUM_INGOT.get())),
            LostWorldsApi.modLoc("orichalcum"), List.of(Tiers.NETHERITE), List.of());
}

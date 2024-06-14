package net.sen.lostworlds.mixins;

import com.google.common.collect.ImmutableSet;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.WorldDimensions;
import net.sen.lostworlds.worldgen.dimension.ModDimensions;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Set;

@Mixin(WorldDimensions.class)
public class WorldDimensionsMixin {
    @Mutable
    @Shadow
    @Final
    private static Set<ResourceKey<LevelStem>> BUILTIN_ORDER;

    @Mutable
    @Shadow
    @Final
    private static int VANILLA_DIMENSION_COUNT;

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void init(CallbackInfo info) {
        ImmutableSet.Builder<ResourceKey<LevelStem>> order = ImmutableSet.builderWithExpectedSize(BUILTIN_ORDER.size() + 1);
        order.addAll(BUILTIN_ORDER);
        order.add(ModDimensions.ALFHEIMR_KEY);
        order.add(ModDimensions.UNDERWORLD_KEY);
        order.add(ModDimensions.NIDAVELLIR_KEY);
        order.add(ModDimensions.ATLANTIS_KEY);
        order.add(ModDimensions.SKYOPIA_KEY);
        BUILTIN_ORDER = order.build();

        VANILLA_DIMENSION_COUNT++;
    }

    @Inject(method = "isVanillaLike", at = @At("HEAD"), cancellable = true)
    private static void isDimensionStable(ResourceKey<LevelStem> key, LevelStem levelStem, CallbackInfoReturnable<Boolean> info) {
        if (key == ModDimensions.ALFHEIMR_KEY) info.setReturnValue(true);
        if (key == ModDimensions.UNDERWORLD_KEY) info.setReturnValue(true);
        if (key == ModDimensions.NIDAVELLIR_KEY) info.setReturnValue(true);
        if (key == ModDimensions.ATLANTIS_KEY) info.setReturnValue(true);
        if (key == ModDimensions.SKYOPIA_KEY) info.setReturnValue(true);
    }
}

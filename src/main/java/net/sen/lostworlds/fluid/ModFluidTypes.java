package net.sen.lostworlds.fluid;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.sen.lostworlds.api.LostWorldsApi;
import org.joml.Vector3f;

public class ModFluidTypes {
    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, LostWorldsApi.MODID);

    public static final ResourceLocation WATER_STILL_RL = LostWorldsApi.mcLoc("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = LostWorldsApi.mcLoc("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = LostWorldsApi.mcLoc("block/water_overlay");
    public static final DeferredHolder<FluidType, FluidType> STYX_WATER_FLUID_TYPE = registerFluidType("styx_water_fluid_type",
            new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL, 0xA1E038D0,
                    new Vector3f(224f / 255f, 56f / 255f, 208f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(5).density(15)));

    public static DeferredHolder<FluidType, FluidType> registerFluidType(String name, FluidType fluidType) {
        return FLUID_TYPES.register(name, () -> fluidType);
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}

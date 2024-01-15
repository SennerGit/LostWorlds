package net.sen.lostworlds.fluid;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorldsApi;
import org.joml.Vector3f;

public class ModFluidTypes {
    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, LostWorldsApi.MODID);

    public static final ResourceLocation WATER_STILL_RL = LostWorldsApi.mcLoc("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = LostWorldsApi.mcLoc("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = LostWorldsApi.mcLoc("block/water_overlay");
    public static final RegistryObject<FluidType> STYX_WATER_FLUID_TYPE = registerFluidType("styx_water_fluid_type",
            new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL, 0xA1E038D0,
                    new Vector3f(224f / 255f, 56f / 255f, 208f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(5).density(15)));

    public static RegistryObject<FluidType> registerFluidType(String name, FluidType fluidType) {
        return FLUID_TYPES.register(name, () -> fluidType);
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}

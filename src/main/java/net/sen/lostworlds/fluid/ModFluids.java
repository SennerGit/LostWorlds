package net.sen.lostworlds.fluid;

import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.block.UnderworldBlocks;
import net.sen.lostworlds.item.ModItems;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, LostWorldsApi.MODID);

    public static final RegistryObject<FlowingFluid> SOURCE_STYX_WATER = FLUIDS.register("styx_water_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.STYX_WATER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_STYX_WATER = FLUIDS.register("flowing_styx_water_fluid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.STYX_WATER_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties STYX_WATER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.STYX_WATER_FLUID_TYPE, SOURCE_STYX_WATER, FLOWING_STYX_WATER)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(UnderworldBlocks.STYX_WATER_BLOCK).bucket(ModItems.STYX_WATER_BUCKET);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}

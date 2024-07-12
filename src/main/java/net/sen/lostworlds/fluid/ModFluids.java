package net.sen.lostworlds.fluid;

import com.mojang.blaze3d.shaders.FogShape;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.PointedDripstoneBlock;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.registry.blocks.UnderworldBlocks;
import net.sen.lostworlds.registry.items.ModItems;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;

import java.util.function.Consumer;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(Registries.FLUID, LostWorldsApi.MODID);
    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, LostWorldsApi.MODID);

    public static final DeferredHolder<FluidType, FluidType> STYX_TYPE = registerType("styx");

    private static DeferredHolder<FluidType, FluidType> registerType(String name) {
            return FLUID_TYPES.register(name, () -> new FluidType(FluidType.Properties.create()
                    .descriptionId("block." + LostWorldsApi.MODID + "." + name)
                    .motionScale(0.00116666666)
                    .canExtinguish(true)
                    .lightLevel(10)
                    .density(1500)
                    .temperature(600)
                    .viscosity(1000)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .addDripstoneDripping(PointedDripstoneBlock.WATER_TRANSFER_PROBABILITY_PER_RANDOM_TICK, ParticleTypes.DRIPPING_DRIPSTONE_WATER, UnderworldBlocks.STYX_CAULDRON.get(), SoundEvents.POINTED_DRIPSTONE_DRIP_WATER_INTO_CAULDRON)
            ){
                @Override
                public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
                    consumer.accept(new IClientFluidTypeExtensions() {
                        @Override
                        public ResourceLocation getStillTexture() {
                            return LostWorldsApi.modLoc("fluid/" + name + "_still");
                        }

                        @Override
                        public ResourceLocation getFlowingTexture() {
                            return LostWorldsApi.modLoc("fluid/" + name + "_flow");
                        }

                        @Override
                        public @Nullable ResourceLocation getOverlayTexture() {
                            return LostWorldsApi.modLoc("fluid/" + name + "_flow");
                        }

                        @Override
                        public Vector3f modifyFogColor(Camera camera, float partialTick, ClientLevel level, int renderDistance, float darkenWorldAmount, Vector3f fluidFogColor) {
                            return new Vector3f(57 / 255f, 25 / 255f, 80 / 255f);
                        }

                        @Override
                        public void modifyFogRender(Camera camera, FogRenderer.FogMode mode, float renderDistance, float partialTick, float nearDistance, float farDistance, FogShape shape) {
                            RenderSystem.setShaderFogStart(0.0f);
                            RenderSystem.setShaderFogEnd(3.0f);
                        }
                    });
                }
            });
    }


    public static final DeferredHolder<Fluid, StyxFluid.Source> STYX_SOURCE = FLUIDS.register("styx_source",
            () -> new StyxFluid.Source(ModFluids.STYX_PROPERTIES));
    public static final DeferredHolder<Fluid, StyxFluid.Flowing> STYX_FLOWING = FLUIDS.register("styx_flowing",
            () -> new StyxFluid.Flowing(ModFluids.STYX_PROPERTIES));

    public static final BaseFlowingFluid.Properties STYX_PROPERTIES = new BaseFlowingFluid.Properties(
            STYX_TYPE, STYX_SOURCE, STYX_FLOWING)
            .bucket(ModItems.STYX_WATER_BUCKET)
            .block(UnderworldBlocks.STYX_WATER_BLOCK);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
        FLUID_TYPES.register(eventBus);
    }
}

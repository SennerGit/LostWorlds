package net.sen.lostworlds.worldgen.portal;

import com.google.common.collect.ImmutableSet;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorldsApi;
import net.sen.lostworlds.block.ModBlocks;

public class ModPortals {
    public static final DeferredRegister<PoiType> POIS =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, LostWorldsApi.MODID);

    public static final RegistryObject<PoiType> UNDERWORLD_PORTAL_POI =
            POIS.register("underworld_portal_poi", () -> new PoiType(ImmutableSet.copyOf(
                    ModBlocks.UNDERWORLD_PORTAL.get().getStateDefinition().getPossibleStates()),
                    0, 1));

    public static final RegistryObject<PoiType> NIDAVELLIR_PORTAL_POI =
            POIS.register("nidavellir_portal_poi", () -> new PoiType(ImmutableSet.copyOf(
                    ModBlocks.NIDAVELLIR_PORTAL.get().getStateDefinition().getPossibleStates()),
                    0, 1));

    public static final RegistryObject<PoiType> ALFHEIMR_PORTAL_POI =
            POIS.register("alfheimr_portal_poi", () -> new PoiType(ImmutableSet.copyOf(
                    ModBlocks.ALFHEIMR_PORTAL.get().getStateDefinition().getPossibleStates()),
                    0, 1));

    public static final RegistryObject<PoiType> ATLANTIS_PORTAL_POI =
            POIS.register("atlantis_portal_poi", () -> new PoiType(ImmutableSet.copyOf(
                    ModBlocks.ATLANTIS_PORTAL.get().getStateDefinition().getPossibleStates()),
                    0, 1));

    public static final RegistryObject<PoiType> SKYOPIA_PORTAL_POI =
            POIS.register("skyopia_portal_poi", () -> new PoiType(ImmutableSet.copyOf(
                    ModBlocks.SKYOPIA_PORTAL.get().getStateDefinition().getPossibleStates()),
                    0, 1));

    public static void register(IEventBus eventBus) {
        POIS.register(eventBus);
    }
}

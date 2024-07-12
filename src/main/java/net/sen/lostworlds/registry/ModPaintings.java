package net.sen.lostworlds.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.lostworlds.api.LostWorldsApi;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(Registries.PAINTING_VARIANT, LostWorldsApi.MODID);

    public static final DeferredHolder<PaintingVariant, PaintingVariant> SAW_THEM = createPainting("saw_them",16, 16);

    public static final DeferredHolder<PaintingVariant, PaintingVariant> SHRIMP = createPainting("shrimp",32, 16);

    public static final DeferredHolder<PaintingVariant, PaintingVariant> WORLD = createPainting("world",32, 32);

    public static DeferredHolder<PaintingVariant, PaintingVariant> createPainting(String name, int width, int height) {
        return PAINTING_VARIANTS.register(name, () -> new PaintingVariant(width, height, LostWorldsApi.modLoc(name)));
    }

    public static void register(IEventBus eventBus) {
        PAINTING_VARIANTS.register(eventBus);
    }
}

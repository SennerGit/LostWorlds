package net.sen.lostworlds.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.sen.lostworlds.LostWorldsApi;

public class SkyopiaEntities {
    public static final DeferredRegister<EntityType<?>> SKYOPIA_ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, LostWorldsApi.MODID);

    /*
    SKYOPIA
     */
//Bosses
    //Sky Shark
//    public static final RegistryObject<EntityType<SkySharkEntity>> SKY_SHARK =
//            ENTITY_TYPES.register("sky_shark",
//                    () -> EntityType.Builder.of(SkySharkEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("sky_shark")
//            );
//Mobs
//Animals
    //Sky Whales
//    public static final RegistryObject<EntityType<SkyWhaleEntity>> SKY_WHALE =
//            ENTITY_TYPES.register("sky_whale",
//                    () -> EntityType.Builder.of(SkyWhaleEntity::new, MobCategory.CREATURE)
//                            .sized(1f, 1f).build("sky_whale")
//            );
//Neutrals

    public static void register(IEventBus eventBus) {
        SKYOPIA_ENTITY_TYPES.register(eventBus);
    }
}

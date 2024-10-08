package net.sen.lostworlds.entity;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.entity.mob.*;

public class NidavellirEntities {
    public static final DeferredRegister<EntityType<?>> NIDAVELLIR_ENTITY_TYPES =
            DeferredRegister.create(Registries.ENTITY_TYPE, LostWorldsApi.MODID);

    /*
//    NIDAVELLIR
//     */
//    Goblins
//    Dwarves
    public static final String DWARVES_ID = "dwarves";
    public static final DeferredHolder<EntityType<?>, EntityType<DwarvesEntity>> DWARVES =
            NIDAVELLIR_ENTITY_TYPES.register(DWARVES_ID,
                    () -> EntityType.Builder.of(DwarvesEntity::new, MobCategory.CREATURE)
                            .sized(1f, 1f).build(DWARVES_ID)
            );

    //    Vampire Bats
    public static final String VAMPIRE_BAT_ID = "vampire_bat";
    public static final DeferredHolder<EntityType<?>, EntityType<VampireBatEntity>> VAMPIRE_BAT =
            NIDAVELLIR_ENTITY_TYPES.register(VAMPIRE_BAT_ID,
                    () -> EntityType.Builder.of(VampireBatEntity::new, MobCategory.MONSTER)
                            .sized(1f, 1f).build(VAMPIRE_BAT_ID)
            );

    // Cave Mole
    public static final String CAVE_MOLE_ID = "cave_mole";
    public static final DeferredHolder<EntityType<?>, EntityType<CaveMoleEntity>> CAVE_MOLE =
            NIDAVELLIR_ENTITY_TYPES.register(CAVE_MOLE_ID,
                    () -> EntityType.Builder.of(CaveMoleEntity::new, MobCategory.MONSTER)
                            .sized(1f, 1f).build(CAVE_MOLE_ID)
            );

//    Cave Fish
//    Cave Salamanders
//    Cave Spiders
//    Glowworms
//    Kobolds
//    Cave Trolls
//    Umber Hulks

    public static void register(IEventBus eventBus) {
        NIDAVELLIR_ENTITY_TYPES.register(eventBus);
    }
}

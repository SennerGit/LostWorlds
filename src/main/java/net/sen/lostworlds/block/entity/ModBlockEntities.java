package net.sen.lostworlds.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sen.lostworlds.LostWorlds;
import net.sen.lostworlds.LostWorldsConstants;
import net.sen.lostworlds.block.ModBlocks;
import net.sen.lostworlds.block.custom.ModHangingSignBlock;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, LostWorldsConstants.MODID);

    public static final RegistryObject<BlockEntityType<AlloySmelterBlockEntity>> ALLOY_SMELTER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("alloy_smelter_block_entity", () -> BlockEntityType.Builder.of(
                    AlloySmelterBlockEntity::new, ModBlocks.ALLOY_SMELTER.get()).build(null));

    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> MOD_SIGN =
            BLOCK_ENTITIES.register("mod_sign", () -> BlockEntityType.Builder.of(
                    ModSignBlockEntity::new,
                    ModBlocks.ELDER_WOOD_PLANKS_SIGN.get(),
                    ModBlocks.ELDER_WOOD_PLANKS_WALL_SIGN.get()
            ).build(null));

    public static final RegistryObject<BlockEntityType<ModHangingSignBlockEntity>> MOD_HANGING_SIGN =
            BLOCK_ENTITIES.register("mod_hanging_sign", () -> BlockEntityType.Builder.of(
                    ModHangingSignBlockEntity::new,
                    ModBlocks.ELDER_WOOD_PLANKS_HANGING_SIGN.get(),
                    ModBlocks.ELDER_WOOD_PLANKS_WALL_HANGING_SIGN.get()
            ).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}

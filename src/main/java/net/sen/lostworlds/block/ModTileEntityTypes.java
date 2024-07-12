package net.sen.lostworlds.block;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.block.custom.tileentity.WaterRemoverBlockTileEntity;
import net.sen.lostworlds.registry.blocks.AtlantisBlocks;

import java.util.Set;

public class ModTileEntityTypes {
    public static final DeferredRegister<BlockEntityType<?>> TILE_ENTITIES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, LostWorldsApi.MODID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WaterRemoverBlockTileEntity>> WATER_REMOVER_BLOCK_TILE_ENTITY =
            TILE_ENTITIES.register("water_remover_block_tile_entity", () -> new BlockEntityType<>(WaterRemoverBlockTileEntity::new, Set.of(AtlantisBlocks.ATLANTAS_WATER_REMOVER_BLOCK.get()), null));

    public static void register(IEventBus eventBus) {
        TILE_ENTITIES.register(eventBus);
    }
}

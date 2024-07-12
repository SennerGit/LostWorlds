package net.sen.lostworlds.registry.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.block.portal.SkyopiaPortalBlock;
import net.sen.lostworlds.registry.items.ModItems;

import java.util.function.Supplier;

public class SkyopiaBlocks {
    public static final DeferredRegister.Blocks SKYOPIA_BLOCKS = DeferredRegister.createBlocks(LostWorldsApi.MODID);

    /*
    MULTI BLOCK
     */
    /*
    STONE
     */
    /*
     * WOOD TYPES
     */
    /*
    Metals
     */
    /*
     *Mushroom
     */
    /*
     FLOWERS
     */
    /*
    CROPS
     */
    /*
    FLUIDS
     */
    /*
     * WORLD BLOCKS
     */
    /*
    DIMENSIONAL BLOCKS
     */
    public static final DeferredBlock<Block> SKYOPIA_PORTAL_FRAME = registerBlock("skyopia_portal_frame", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> SKYOPIA_PORTAL = registerBlock("skyopia_portal", SkyopiaPortalBlock::new);

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = SKYOPIA_BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> DeferredItem<Item> registerBlockItem(String name, DeferredBlock<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        SKYOPIA_BLOCKS.register(eventBus);
    }
}

package net.sen.lostworlds.screen.inventory;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.inventory.InventoryMenu;
import net.minecraft.world.inventory.ResultContainer;
import net.minecraft.world.inventory.TransientCraftingContainer;

public class LostWorldsInventory extends InventoryMenu {
    private static final ResourceLocation[] ARMOR_SLOT_TEXTURES = new ResourceLocation[] {
            InventoryMenu.EMPTY_ARMOR_SLOT_BOOTS,
            InventoryMenu.EMPTY_ARMOR_SLOT_LEGGINGS,
            InventoryMenu.EMPTY_ARMOR_SLOT_CHESTPLATE,
            InventoryMenu.EMPTY_ARMOR_SLOT_HELMET
    };
    private static final EquipmentSlot[] VALID_EQUIPMENT_SLOTS = new EquipmentSlot[] {
            EquipmentSlot.HEAD,
            EquipmentSlot.CHEST,
            EquipmentSlot.LEGS,
            EquipmentSlot.FEET
    };
    public static final String[] LOST_WORLDS_IDENTIFIERS = new String[] {
//            "aether_pendant",
//            "aether_cape",
//            "aether_shield",
//            "aether_ring",
//            "aether_gloves",
//            "aether_accessory"
    };

    public LostWorldsInventory(int containerId, Inventory playerInventory) {
        this(containerId, playerInventory, true);
    }

    public LostWorldsInventory(int containerId, Inventory playerInventory, boolean hasButton) {
        super(playerInventory, playerInventory.player.level().isClientSide(), playerInventory.player);
    }
}

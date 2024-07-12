package net.sen.lostworlds.screen;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.registry.blocks.ModBlocks;
import net.sen.lostworlds.screen.widgets.MysticGatewayVisbilityButton;

public class MysticGatewayControllerScreen extends AbstractContainerScreen<MysticGatewayControllerMenu> {
    public static final ResourceLocation TEXTURE = LostWorldsApi.modLoc("textures/gui/menu/" + ModBlocks.MYSTIC_GATEWAYS_PORTAL_CONTROLLER.getId().getPath() + "_gui.png");
    private EditBox textField;
    private MysticGatewayVisbilityButton visibilityButton;

    public MysticGatewayControllerScreen(MysticGatewayControllerMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }

    @Override
    protected void renderBg(GuiGraphics pGuiGraphics, float pPartialTick, int pMouseX, int pMouseY) {

    }
}

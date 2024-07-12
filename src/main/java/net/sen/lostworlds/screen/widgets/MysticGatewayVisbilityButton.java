package net.sen.lostworlds.screen.widgets;

import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.sen.lostworlds.api.LostWorldsApi;
import net.sen.lostworlds.registry.blocks.ModBlocks;

import java.util.List;

public class MysticGatewayVisbilityButton extends Button {
    private static final ResourceLocation TEXTURE = LostWorldsApi.modLoc("textures/gui/menu/" + ModBlocks.MYSTIC_GATEWAYS_PORTAL_CONTROLLER.getId().getPath() + "_gui.png");

    private final List<MysticGatewayVisibility> options;
    private final boolean canEdit;
    private MysticGatewayVisibility visibility;

    protected MysticGatewayVisbilityButton(int x, int y, MysticGatewayVisibility visibility, List<MysticGatewayVisibility> options, boolean canEdit) {
        super(x, y, 18, 18, Component.empty(), button -> {
        }, Button.DEFAULT_NARRATION);
        this.options = options;
        this.visibility = visibility;
        this.canEdit = canEdit;
    }
}

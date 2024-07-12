//package net.sen.lostworlds.screen.alloysmelter;
//
//import com.mojang.blaze3d.systems.RenderSystem;
//import net.minecraft.client.gui.GuiGraphics;
//import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
//import net.minecraft.client.renderer.GameRenderer;
//import net.minecraft.network.chat.Component;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.entity.player.Inventory;
//import net.sen.lostworlds.api.LostWorldsApi;
//import net.sen.lostworlds.registry.blocks.ModBlocks;
//
//public class AlloySmelterScreen extends AbstractContainerScreen<AlloySmelterMenu> {
//    public static final ResourceLocation TEXTURE = LostWorldsApi.modLoc("textures/gui/container/" + ModBlocks.ALLOY_SMELTER.getId().getPath() + "_gui.png");
//
//    public AlloySmelterScreen(AlloySmelterMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
//        super(pMenu, pPlayerInventory, pTitle);
//    }
//
//    @Override
//    protected void init() {
//        super.init();
//        this.inventoryLabelY = 10000;
//        this.titleLabelY = 10000;
//    }
//
//    @Override
//    protected void renderBg(GuiGraphics guiGraphics, float pPartialTick, int pMouseX, int pMouseY) {
//        RenderSystem.setShader(GameRenderer::getPositionTexShader);
//        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
//        RenderSystem.setShaderTexture(0, TEXTURE);
//        int x = (width - imageWidth) / 2;
//        int y = (height - imageHeight) / 2;
//
//        guiGraphics.blit(TEXTURE, x, y, 0, 0, imageWidth, imageHeight);
//
//        renderProgressArrow(guiGraphics, x, y);
//        renderBurnProgressArrow(guiGraphics, x, y);
//    }
//
//    private void renderProgressArrow(GuiGraphics guiGraphics, int x, int y) {
//        if(menu.isCrafting()) {
//            guiGraphics.blit(TEXTURE, x + 80, y + 35, 176, 14, menu.getScaledProgress(), 16);
//        }
//    }
//
//    private void renderBurnProgressArrow(GuiGraphics guiGraphics, int x, int y) {
//        if(menu.isCrafting()) {
//            guiGraphics.blit(TEXTURE, x + 57, y + 37, 70, 50, 14, menu.getScaledBurnProgress());
//        }
//    }
//
//    @Override
//    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float delta) {
//        renderBackground(guiGraphics);
//        super.render(guiGraphics, mouseX, mouseY, delta);
//        renderTooltip(guiGraphics, mouseX, mouseY);
//    }
//}

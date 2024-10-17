package net.mriota.thebox.client.gui;

import net.mriota.thebox.world.inventory.TheBoxGuiMenu;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TheBoxGuiScreen extends AbstractContainerScreen<TheBoxGuiMenu> {
	private final static HashMap<String, Object> guistate = TheBoxGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public TheBoxGuiScreen(TheBoxGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 174;
		this.imageHeight = 210;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("the_box:textures/screens/the_box_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(ResourceLocation.parse("the_box:textures/screens/name.png"), this.leftPos + 0, this.topPos + -20, 0, 0, 53, 21, 53, 21);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.the_box.the_box_gui.label_inventory"), 7, 118, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.the_box.the_box_gui.label_the_box"), 6, -13, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}

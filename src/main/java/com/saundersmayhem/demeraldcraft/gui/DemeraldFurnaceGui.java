package com.saundersmayhem.demeraldcraft.gui;

import java.io.IOException;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

import com.saundersmayhem.demeraldcraft.blocks.DemeraldFurnaceTileEntity;

public class DemeraldFurnaceGui  extends GuiContainer {

	public static final ResourceLocation texture = new ResourceLocation("demeraldcraft:/textures/gui/DemeraldFurnaceGui.png");
	
	public DemeraldFurnaceGui(InventoryPlayer playerinv, DemeraldFurnaceTileEntity tileentity) {
		super(new DemeraldFurnaceContainer(playerinv, tileentity));
		
		xSize = 300;
		ySize = 200;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float arg0, int arg1,
			int arg2) {
		GL11.glColor4f(1f, 1f, 1f, 1f);
		Minecraft.getMinecraft().getResourceManager().getResource(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}

}

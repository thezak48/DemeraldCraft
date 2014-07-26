package com.saundersmayhem.demeraldcraft.client.render.tileentity;

import org.lwjgl.opengl.GL11;

import com.saundersmayhem.demeraldcraft.reference.Reference;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class TileEntityRenderDemeraldFurnace extends TileEntitySpecialRenderer
{

	private final ResourceLocation textureDemeraldFurnaceFront = new ResourceLocation(Reference.MOD_ID, "textures/model/DemeraldFurnaceFront.png");
	
	private int textureWidth = 128;
	
	private int textureHight = 128;
	
	private float pixel = 1f/16;
	
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f)
	{
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x, (float)y, (float)z);
		
		Tessellator tessellator = Tessellator.instance;
		this.bindTexture(textureDemeraldFurnaceFront);
		tessellator.startDrawingQuads(); //Start Drawing Front
		{
			
		}
	}
}

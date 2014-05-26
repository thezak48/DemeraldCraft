package com.saundersmayhem.demeraldcraft.renderer.tileEntity;

import org.lwjgl.opengl.GL11;

import com.saundersmayhem.demeraldcraft.Demeraldcraft;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class TileEntityRenderWindmill extends TileEntitySpecialRenderer {

	private final ResourceLocation textureWindmill = new ResourceLocation(com.saundersmayhem.demeraldcraft.lib.References.MODID, "textures/model/windmill.png");
	private final ResourceLocation textureWindmillBlade = new ResourceLocation(com.saundersmayhem.demeraldcraft.lib.References.MODID, "textures/model/windmillBlade.png");
	
	private float pixel = 1F/16F;
	
	private int textureWidth = 8;
	private int textureHight = 1;
	
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
		int x1 = tileentity.xCoord;
		int y1 = tileentity.yCoord;
		int z1 = tileentity.zCoord;
		
		int metadata = tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord);
		
		while(tileentity.getWorldObj().getBlockMetadata(x1, y1, z1) < 7 && tileentity.getWorldObj().getBlock(x1, y1, z1) == Demeraldcraft.BlockWindmill){
			y1++;
		}
		int direction = 7-tileentity.getWorldObj().getBlockMetadata(x1, y1, z1);
		
		GL11.glPushMatrix();
			GL11.glTranslatef((float)x, (float)y, (float)z);
			
			Tessellator tessellator = Tessellator.instance;
			this.bindTexture(textureWindmill);
			tessellator.startDrawingQuads(); // Start
			{
				if(metadata > 0 && metadata < 7){	
					tessellator.addVertexWithUV((16-8)/2*pixel, -0.6, 1-(16-8)/2*pixel, 1, 1);
					tessellator.addVertexWithUV((16-8)/2*pixel, 1, 1-(16-8)/2*pixel, 1, 0);
					tessellator.addVertexWithUV((16-8)/2*pixel, 1, (16-8)/2*pixel, 0, 0);
					tessellator.addVertexWithUV((16-8)/2*pixel, -0.6, (16-8)/2*pixel, 0, 1);
					
					tessellator.addVertexWithUV(1-(16-8)/2*pixel, -0.6, 1-(16-8)/2*pixel, 1, 1);
					tessellator.addVertexWithUV(1-(16-8)/2*pixel, 1, 1-(16-8)/2*pixel, 1, 0);
					tessellator.addVertexWithUV((16-8)/2*pixel, 1, 1-(16-8)/2*pixel, 0, 0);
					tessellator.addVertexWithUV((16-8)/2*pixel, -0.6, 1-(16-8)/2*pixel, 0, 1);
					
					tessellator.addVertexWithUV((16-8)/2*pixel, -0.6, (16-8)/2*pixel, 1, 1);
					tessellator.addVertexWithUV((16-8)/2*pixel, 1, (16-8)/2*pixel, 1, 0);
					tessellator.addVertexWithUV(1-(16-8)/2*pixel, 1, (16-8)/2*pixel, 0, 0);
					tessellator.addVertexWithUV(1-(16-8)/2*pixel, -0.6, (16-8)/2*pixel, 0, 1);
					
					tessellator.addVertexWithUV(1-(16-8)/2*pixel, -0.6, (16-8)/2*pixel, 1, 1);
					tessellator.addVertexWithUV(1-(16-8)/2*pixel, 1, (16-8)/2*pixel, 1, 0);
					tessellator.addVertexWithUV(1-(16-8)/2*pixel, 1, 1-(16-8)/2*pixel, 0, 0);
					tessellator.addVertexWithUV(1-(16-8)/2*pixel, -0.6, 1-(16-8)/2*pixel, 0, 1);
				}
				if(metadata > 7){
					
				}
			}
			tessellator.draw(); // Ends
			if(metadata > 7){
				drawRotor();
			}
		GL11.glPopMatrix();
	}

	
	private void drawRotor(){
		Tessellator tessellator = Tessellator.instance;
		this.bindTexture(textureWindmillBlade);
		tessellator.startDrawingQuads();
		{
			tessellator.addVertexWithUV(-2*pixel, 0.5+1*pixel, 1*pixel+0.5F, 1, 1);
			tessellator.addVertexWithUV(-2*pixel, 2.5, 1*pixel+0.5F, 1, 1);
			tessellator.addVertexWithUV(-2*pixel, 2.5, -1*pixel+0.5F, 1, 1);
			tessellator.addVertexWithUV(-2*pixel, 0.5+1*pixel, -1*pixel+0.5F, 1, 1);
	
			tessellator.addVertexWithUV(-2*pixel, -1.5, 1*pixel+0.5F, 1, 1);
			tessellator.addVertexWithUV(-2*pixel, 0.5-1*pixel, 1*pixel+0.5F, 1, 1);
			tessellator.addVertexWithUV(-2*pixel, 0.5-1*pixel, -1*pixel+0.5F, 1, 1);
			tessellator.addVertexWithUV(-2*pixel, -1.5, -1*pixel+0.5F, 1, 1);
	
			tessellator.addVertexWithUV(-2*pixel, 0.5-1*pixel, 2.5F, 1, 1);
			tessellator.addVertexWithUV(-2*pixel, 0.5+1*pixel, 2.5F, 1, 1);
			tessellator.addVertexWithUV(-2*pixel, 0.5+1*pixel, 0.5F+1*pixel, 1, 1);
			tessellator.addVertexWithUV(-2*pixel, 0.5-1*pixel, 0.5F+1*pixel, 1, 1);
	
			tessellator.addVertexWithUV(-2*pixel, 0.5-1*pixel, 0.5F-1*pixel, 1, 1);
			tessellator.addVertexWithUV(-2*pixel, 0.5+1*pixel, 0.5F-1*pixel, 1, 1);
			tessellator.addVertexWithUV(-2*pixel, 0.5+1*pixel, -1.5F, 1, 1);
			tessellator.addVertexWithUV(-2*pixel, 0.5-1*pixel, -1.5F, 1, 1);
		}
		tessellator.draw();
		
	}
}

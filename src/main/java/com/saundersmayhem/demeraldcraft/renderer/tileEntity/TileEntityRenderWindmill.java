package com.saundersmayhem.demeraldcraft.renderer.tileEntity;

import org.lwjgl.opengl.GL11;

import com.saundersmayhem.demeraldcraft.Demeraldcraft;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class TileEntityRenderWindmill extends TileEntitySpecialRenderer {

	private final ResourceLocation textureWindmill = new ResourceLocation(com.saundersmayhem.demeraldcraft.lib.References.MODID, "textures/model/windmill.png");
	
	private float pixel = 1F/16F;
	
	private int textureWidth = 8;
	private int textureHight = 1;
	
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
		int x1 = tileentity.xCoord;
		int y1 = tileentity.yCoord;
		int z1 = tileentity.zCoord;
		
		int metadata = tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord);
		
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
			}
			tessellator.draw(); // Ends
		GL11.glPopMatrix();
	}

}

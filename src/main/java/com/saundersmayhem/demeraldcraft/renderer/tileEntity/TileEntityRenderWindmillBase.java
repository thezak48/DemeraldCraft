package com.saundersmayhem.demeraldcraft.renderer.tileEntity;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class TileEntityRenderWindmillBase extends TileEntitySpecialRenderer {

	private final ResourceLocation textureWindmillBase = new ResourceLocation(com.saundersmayhem.demeraldcraft.lib.References.MODID, "textures/model/windmillBase.png");
	
	private int textureWidth = 32;
		
	private int textureHight = 32;
	
	private float pixel = 1F/69F;
	
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x, (float)y, (float)z);
		
		Tessellator tessellator = Tessellator.instance;
		this.bindTexture(textureWindmillBase);
		tessellator.startDrawingQuads(); // Start
		{	
			if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord)==0){
				tessellator.addVertexWithUV(1, 0.4F, 1, 1F/textureWidth*(32), 1F/textureHight*(32));
				tessellator.addVertexWithUV(1, 0.4F, 0, 1F/textureWidth*(32), 1F/textureHight*(0));
				tessellator.addVertexWithUV(0, 0.4F, 0, 1F/textureWidth*(0), 1F/textureHight*(0));
				tessellator.addVertexWithUV(0, 0.4F, 1, 1F/textureWidth*(0), 1F/textureHight*(32));
			}
			
			if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord)==1){
				tessellator.addVertexWithUV(0.5, 0.4F, 0.5, 1F/textureWidth*(32), 1F/textureHight*(32));
				tessellator.addVertexWithUV(0.5, 0.4F, 0, 1F/textureWidth*(32), 1F/textureHight*(8+16));
				tessellator.addVertexWithUV(0, 0.4F, 0, 1F/textureWidth*(8+16), 1F/textureHight*(8+16));
				tessellator.addVertexWithUV(0, 0.4F, 0.5, 1F/textureWidth*(8+16), 1F/textureHight*(32));
			}
			
			if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord)==2){
				tessellator.addVertexWithUV(0.5, 0.4F, 1, 1F/textureWidth*(32), 1F/textureHight*(8+16));
				tessellator.addVertexWithUV(0.5, 0.4F, 0, 1F/textureWidth*(32), 1F/textureHight*(8));
				tessellator.addVertexWithUV(0, 0.4F, 0, 1F/textureWidth*(8+16), 1F/textureHight*(8));
				tessellator.addVertexWithUV(0, 0.4F, 1, 1F/textureWidth*(8+16), 1F/textureHight*(8+16));
			}
			
			if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord)==3){
				tessellator.addVertexWithUV(0.5, 0.4F, 1, 1F/textureWidth*(32), 1F/textureHight*(8));
				tessellator.addVertexWithUV(0.5, 0.4F, 0.5, 1F/textureWidth*(32), 1F/textureHight*(0));
				tessellator.addVertexWithUV(0, 0.4F, 0.5, 1F/textureWidth*(8+16), 1F/textureHight*(0));
				tessellator.addVertexWithUV(0, 0.4F, 1, 1F/textureWidth*(8+16), 1F/textureHight*(8));
			}
			
			if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord)==4){
				tessellator.addVertexWithUV(1, 0.4F, 0.5, 1F/textureWidth*(8+16), 1F/textureHight*(32));
				tessellator.addVertexWithUV(1, 0.4F, 0, 1F/textureWidth*(8+16), 1F/textureHight*(8+16));
				tessellator.addVertexWithUV(0, 0.4F, 0, 1F/textureWidth*(8), 1F/textureHight*(8+16));
				tessellator.addVertexWithUV(0, 0.4F, 0.5, 1F/textureWidth*(8), 1F/textureHight*(32));
			}
			
			if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord)==5){
				tessellator.addVertexWithUV(1, 0.4F, 1, 1F/textureWidth*(8+16), 1F/textureHight*(8+16));
				tessellator.addVertexWithUV(1, 0.4F, 0, 1F/textureWidth*(8+16), 1F/textureHight*8);
				tessellator.addVertexWithUV(0, 0.4F, 0, 1F/textureWidth*8, 1F/textureHight*8);
				tessellator.addVertexWithUV(0, 0.4F, 1, 1F/textureWidth*8, 1F/textureHight*(8+16));
			}
			
			if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord)==6){
				tessellator.addVertexWithUV(1, 0.4F, 1, 1F/textureWidth*(8+16), 1F/textureHight*(8));
				tessellator.addVertexWithUV(1, 0.4F, 0.5, 1F/textureWidth*(8+16), 1F/textureHight*(0));
				tessellator.addVertexWithUV(0, 0.4F, 0.5, 1F/textureWidth*(8), 1F/textureHight*(0));
				tessellator.addVertexWithUV(0, 0.4F, 1, 1F/textureWidth*(8), 1F/textureHight*(8));
			}
			
			if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord)==7){
				tessellator.addVertexWithUV(1, 0.4F, 0.5, 1F/textureWidth*(8), 1F/textureHight*(32));
				tessellator.addVertexWithUV(1, 0.4F, 0, 1F/textureWidth*(8), 1F/textureHight*(8+16));
				tessellator.addVertexWithUV(0.5, 0.4F, 0, 1F/textureWidth*(0), 1F/textureHight*(8+16));
				tessellator.addVertexWithUV(0.5, 0.4F, 0.5, 1F/textureWidth*(0), 1F/textureHight*(32));
			}
			
			if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord)==8){
				tessellator.addVertexWithUV(1, 0.4F, 1, 1F/textureWidth*(8), 1F/textureHight*(8+16));
				tessellator.addVertexWithUV(1, 0.4F, 0, 1F/textureWidth*(8), 1F/textureHight*(8));
				tessellator.addVertexWithUV(0.5, 0.4F, 0, 1F/textureWidth*(0), 1F/textureHight*(8));
				tessellator.addVertexWithUV(0.5, 0.4F, 1, 1F/textureWidth*(0), 1F/textureHight*(8+16));
			}
			
			if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord)==9){
				tessellator.addVertexWithUV(1, 0.4F, 1, 1F/textureWidth*(8), 1F/textureHight*(8));
				tessellator.addVertexWithUV(1, 0.4F, 0.5, 1F/textureWidth*(8), 1F/textureHight*(0));
				tessellator.addVertexWithUV(0.5, 0.4F, 0.5, 1F/textureWidth*(0), 1F/textureHight*(0));
				tessellator.addVertexWithUV(0.5, 0.4F, 1, 1F/textureWidth*(0), 1F/textureHight*(8));
			}
		}
		tessellator.draw(); // Ends
	GL11.glPopMatrix();
	}
}

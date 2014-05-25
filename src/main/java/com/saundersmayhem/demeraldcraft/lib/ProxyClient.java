package com.saundersmayhem.demeraldcraft.lib;

import com.saundersmayhem.demeraldcraft.blocks.TileEntityWindmill;
import com.saundersmayhem.demeraldcraft.blocks.TileEntityWindmillBase;
import com.saundersmayhem.demeraldcraft.renderer.tileEntity.TileEntityRenderWindmill;
import com.saundersmayhem.demeraldcraft.renderer.tileEntity.TileEntityRenderWindmillBase;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ProxyClient extends ProxyCommon{
	
	public void registerRenderInfomation(){
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWindmill.class, new TileEntityRenderWindmill());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWindmillBase.class, new TileEntityRenderWindmillBase());
		
	}
	
}

package com.saundersmayhem.demeraldcraft.blocks;

import net.minecraft.tileentity.TileEntity;

public class TileEntityWindmill extends TileEntity {
	
	public float rotation = 0;
	
	public void updateEntity(){
		rotation++;
	}

}

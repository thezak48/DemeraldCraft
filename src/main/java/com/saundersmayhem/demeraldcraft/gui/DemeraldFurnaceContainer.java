package com.saundersmayhem.demeraldcraft.gui;

import com.saundersmayhem.demeraldcraft.blocks.DemeraldFurnaceTileEntity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class DemeraldFurnaceContainer extends Container{

	private DemeraldFurnaceTileEntity DemeraldFurnacTileEntity;
	
	public DemeraldFurnaceContainer(InventoryPlayer invPlayer, DemeraldFurnaceTileEntity entity){
		this.DemeraldFurnacTileEntity = entity;
	}
	@Override
	public boolean canInteractWith(EntityPlayer arg0) {
		
		return DemeraldFurnacTileEntity.isUseableByPlayer(arg0);
	}
	
	
	
}

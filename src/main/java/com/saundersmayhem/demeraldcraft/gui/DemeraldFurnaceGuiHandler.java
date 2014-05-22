package com.saundersmayhem.demeraldcraft.gui;

import com.saundersmayhem.demeraldcraft.blocks.DemeraldFurnaceTileEntity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class DemeraldFurnaceGuiHandler implements IGuiHandler{

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		switch(ID){
		case 0:
			if(entity != null && entity instanceof DemeraldFurnaceTileEntity){
				return new DemeraldFurnaceGui(player.inventory, (DemeraldFurnaceTileEntity)entity);
			}
		}
		return null;
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		switch(ID){
		case 0:
			if(entity != null && entity instanceof DemeraldFurnaceTileEntity){
				return new DemeraldFurnaceContainer(player.inventory, (DemeraldFurnaceTileEntity) entity);
			}
			else{
				return null;
			}
		}
		return null;
	}

}

package com.saundersmayhem.demeraldcraft.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class DemeraldFurnaceTileEntity extends TileEntity implements IInventory{

	private ItemStack[] inventory;
	
	public DemeraldFurnaceTileEntity(){
		inventory = new ItemStack[1];
	}
	
	@Override
	public void closeInventory() {
		
	}

	@Override
	public ItemStack decrStackSize(int arg0, int arg1) {
		ItemStack itemstack = getStackInSlot(arg0);
		if(itemstack != null){
			if(itemstack.stackSize <= arg1){
				setInventorySlotContents(arg0, null);
			}
			else{
				itemstack = itemstack.splitStack(arg1);
				onInventoryChanged();
			}
		}
		return null;
	}

	private void onInventoryChanged() {
		
	}

	@Override
	public String getInventoryName() {
		
		return "DemeraldFurnace";
	}

	@Override
	public int getInventoryStackLimit() {
		// TODO Auto-generated method stub
		return 64;
	}

	@Override
	public int getSizeInventory() {
		// TODO Auto-generated method stub
		return inventory.length;
	}

	@Override
	public ItemStack getStackInSlot(int arg0) {
		// TODO Auto-generated method stub
		return inventory[1];
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int arg0) {
		ItemStack itemstack = getStackInSlot(arg0);
		setInventorySlotContents(arg0, null);
		return itemstack;
	}

	@Override
	public boolean hasCustomInventoryName() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isItemValidForSlot(int arg0, ItemStack arg1) {
		return true;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer arg0) {
		if(arg0.getDistanceSq(xCoord = (int) 0.5D, yCoord + 0.5D, zCoord + 0.5) <= 64){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public void openInventory() {
		
	}

	@Override
	public void setInventorySlotContents(int arg0, ItemStack arg1) {
		inventory[arg0] = arg1;
		if(arg1 != null && arg1.stackSize > getInventoryStackLimit()){
			arg1.stackSize = getInventoryStackLimit();
		}
	}

}

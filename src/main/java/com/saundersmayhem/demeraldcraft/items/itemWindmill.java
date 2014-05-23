package com.saundersmayhem.demeraldcraft.items;

import com.saundersmayhem.demeraldcraft.Demeraldcraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class itemWindmill extends Item {

	
	public static Item item;
	
	public itemWindmill(int i) {
		this.setUnlocalizedName("Windmill");
		this.setTextureName("demeraldcraft:Windmill");
		this.setCreativeTab(Demeraldcraft.DemeraldCraft);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
	}

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player){
		System.out.println("Yolo");
		
		return itemstack;
	}
}

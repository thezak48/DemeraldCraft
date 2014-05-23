package com.saundersmayhem.demeraldcraft.items;

import com.saundersmayhem.demeraldcraft.Demeraldcraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Demerald extends Item {
	
	public static Item item;

	public Demerald(int i) {
		this.setUnlocalizedName("Demerald");
		this.setTextureName("demeraldcraft:Demerald");
		//this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setCreativeTab(Demeraldcraft.DemeraldCraft);
		//this.setCreativeTab(CreativeTabs.tabAllSearch);
	}
}

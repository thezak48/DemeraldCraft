package com.saundersmayhem.demeraldcraft.items;

import com.saundersmayhem.demeraldcraft.Demeraldcraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class itemWindmill extends Item {
	
	public itemWindmill(int i) {
		this.setUnlocalizedName("Windmill");
		this.setTextureName("demeraldcraft:itemWindmill");
		this.setCreativeTab(Demeraldcraft.DemeraldCraft);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
	}

	public boolean onItemUse(ItemStack itemstack,EntityPlayer player, World world, int x, int y, int z, int side, float x2, float y2, float z2){
		if(!world.isRemote){
			if(side==1 && world.getBlock(x, y, z)==(Demeraldcraft.BlockWindmillBase) && world.getBlockMetadata(x, y, z) == 5){	
				for(int y1 = 0; y1 < 7; y1++){
						world.setBlock(x, y+y1+1, z, Demeraldcraft.BlockWindmill, y1+1, 2);
					}	
				return true;
			}
		}
		return false;
	}
	
}

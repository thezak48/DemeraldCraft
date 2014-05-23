package com.saundersmayhem.demeraldcraft.blocks;

import java.util.Random;

import com.saundersmayhem.demeraldcraft.Demeraldcraft;
import com.saundersmayhem.demeraldcraft.items.Demerald;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class DemeraldOre extends Block {

	public DemeraldOre(int i, Material iron) {
		super(iron);
		this.setBlockTextureName("demeraldcraft:DemeraldOre");
		this.setCreativeTab(Demeraldcraft.DemeraldCraft);
		this.setStepSound(soundTypeStone);
		this.setHardness(4f);
		this.setResistance(5f);
		this.setBlockName("DemeraldOre");
		this.setStepSound(Block.soundTypeStone);
		this.setHarvestLevel("pickaxe", 2);
		//this.setCreativeTab(CreativeTabs.tabAllSearch);
	}
	
	public Item getItemDropped(int par1, Random par2Random, int par3){
		return Demerald.item;
		}
}
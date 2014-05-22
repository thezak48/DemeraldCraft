package com.saundersmayhem.demeraldcraft.blocks;

import com.saundersmayhem.demeraldcraft.Demeraldcraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DemeraldBlock extends Block {

	public DemeraldBlock(int i, Material iron) {
		super(iron);
		this.setBlockTextureName("demeraldcraft:DemeraldBlock");
		this.setCreativeTab(Demeraldcraft.DemeraldCraft);
		this.setStepSound(soundTypeMetal);
		this.setHardness(4f);
		this.setResistance(5f);
		this.setBlockName("DemeraldBlock");	
		this.setCreativeTab(CreativeTabs.tabAllSearch);	
	}
}
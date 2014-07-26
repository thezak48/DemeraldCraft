package com.saundersmayhem.demeraldcraft.init;

import com.saundersmayhem.demeraldcraft.block.BlockDC;
import com.saundersmayhem.demeraldcraft.block.BlockDemerald;
import com.saundersmayhem.demeraldcraft.block.BlockDemeraldOre;
import com.saundersmayhem.demeraldcraft.reference.Names;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks 
{
	public static final BlockDC DemeraldBlock = new BlockDemerald();
	public static final BlockDC DemeraldOre = new BlockDemeraldOre();
	
	public static void init()
	{
		GameRegistry.registerBlock(DemeraldBlock, Names.Blocks.DemeraldBlock);
		GameRegistry.registerBlock(DemeraldOre, Names.Blocks.DemeraldOre);
	}
}
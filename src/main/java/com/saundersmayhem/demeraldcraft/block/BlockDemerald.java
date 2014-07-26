package com.saundersmayhem.demeraldcraft.block;

import com.saundersmayhem.demeraldcraft.reference.Names;

import net.minecraft.block.material.Material;

public class BlockDemerald extends BlockDC
{
	public BlockDemerald()
	{
		super(Material.iron);
		this.setBlockName(Names.Blocks.DemeraldBlock);
		this.setHardness(10f);
		this.setResistance(10f);
		this.setStepSound(soundTypeMetal);
	}
}
package com.saundersmayhem.demeraldcraft.block;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.saundersmayhem.demeraldcraft.init.ModItems;
import com.saundersmayhem.demeraldcraft.reference.Names;

public class BlockDemeraldOre extends BlockDC
{
	public BlockDemeraldOre()
	{
		super(Material.rock);
		this.setBlockName(Names.Blocks.DemeraldOre);
		this.setHardness(10f);
		this.setResistance(10f);
		this.setStepSound(soundTypeStone);
	}
	
	@Override
	public Item getItemDropped(int par1, Random random, int par2)
	{
		return ModItems.demerald;
	}
	
	@Override
	public int quantityDropped(Random random)
	{
		return (random.nextInt(2) + 1);
	}
}

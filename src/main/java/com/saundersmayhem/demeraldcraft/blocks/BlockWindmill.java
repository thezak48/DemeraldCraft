package com.saundersmayhem.demeraldcraft.blocks;

import com.saundersmayhem.demeraldcraft.Demeraldcraft;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockWindmill  extends BlockContainer{

	public BlockWindmill(int i, Material iron) {
		super(iron);
		this.setBlockTextureName("demeraldcraft:blockWindmill");
		this.setCreativeTab(Demeraldcraft.DemeraldCraft);
		this.setStepSound(soundTypeMetal);
		this.setHardness(4f);
		this.setResistance(5f);
		this.setBlockName("WindmillBlock");	
		//this.setCreativeTab(CreativeTabs.tabAllSearch);
	}
	
	public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z){
		float pixel = 1F/16F;
		
		if(world.getBlockMetadata(x, y, z) < 7) this.setBlockBounds(pixel*4, 0, pixel*4, 1-pixel*4, 1, 1-pixel*4);
		else this.setBlockBounds(0, 0, 0, 1, 1, 1);
	}
	
	public int getRenderType(){
		return -1;
	}
	
	public boolean isOpaqueCube(){
		
		return false;
	}

	public boolean renderAsNormalBlock(){
		
		return false;
	}
	
	@Override
	public TileEntity createNewTileEntity(World arg0, int arg1) {

		return new TileEntityWindmill();
	}
	
	public void breakBlock(World world, int x, int y, int z, Block block, int metadata){
		if(world.getBlock(x, y+1, z) == (Demeraldcraft.BlockWindmill)) world.setBlockToAir(x, y+1, z);
		if(world.getBlock(x, y-1, z) == (Demeraldcraft.BlockWindmill)) world.setBlockToAir(x, y-1, z);
	}
}

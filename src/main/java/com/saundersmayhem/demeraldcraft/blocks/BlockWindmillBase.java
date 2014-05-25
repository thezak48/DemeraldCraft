package com.saundersmayhem.demeraldcraft.blocks;

import com.saundersmayhem.demeraldcraft.Demeraldcraft;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class BlockWindmillBase extends BlockContainer {

	public BlockWindmillBase(int i, Material iron) {
		super(iron);
		this.setBlockTextureName("demeraldcraft:WindmillBase");
		this.setCreativeTab(Demeraldcraft.DemeraldCraft);
		this.setStepSound(soundTypeStone);
		this.setHardness(4f);
		this.setResistance(5f);
		this.setBlockName("WindmillBase");	
		//this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setBlockBounds(0, 0, 0, 1, 0.4f, 1);
	}
	
	public int getRenderType(){
		return -1;
	}

	public boolean renderAsNormalBlock(){
		return false;
	}
	
	public boolean isOpaqueCube(){
		
		return false;
	}
	
	public void onNeighborBlockChange(World world, int x, int y, int z, Block neighborBlock){
		updateMultiBlockStructure(world, x, y, z);
	}
	
	public void onBlockAdded(World world, int x, int y, int z){
		updateMultiBlockStructure(world, x, y, z);
	}
	
	public void updateMultiBlockStructure(World world, int x, int y, int z){
		isMultiBlockStructure(world, x, y, z);
	}
	
	public boolean isMultiBlockStructure(World world, int x1, int y1, int z1){
		boolean mStructure = false;
		
		boolean currentCheckStructure = true;
		
		for(int x2 = 0; x2 < 3; x2++){
			for(int z2 = 0; z2 < 3; z2++){	
				if(!mStructure){
					currentCheckStructure = true;
					
					for(int x3 = 0; x3 < 3; x3++){
						for(int z3 = 0; z3 < 3; z3++){
							if(currentCheckStructure && !world.getBlock(x1+x2-x3, y1, z1+z2-z3).equals(Demeraldcraft.BlockWindmillBase)){
								currentCheckStructure = false;
							}
						}
					}
					if(currentCheckStructure){
						for(int x3 = 0; x3 < 3; x3++){
							for(int z3 = 0; z3 < 3; z3++){
								world.setBlockMetadataWithNotify(x1+x2-x3, y1, z1+z2-z3, x3*3+z3+1, 2);
								}
							}
						}
					}
				mStructure = currentCheckStructure;
			}
		}

		if(mStructure) return true;
		
		if(world.getBlockMetadata(x1, y1, z1) > 0) world.setBlockMetadataWithNotify(x1, y1, z1, 0, 3);
		
		return currentCheckStructure;
	}

	@Override
	public TileEntity createNewTileEntity(World arg0, int arg1) {
		return new TileEntityWindmillBase();
	}
}
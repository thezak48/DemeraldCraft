package com.saundersmayhem.demeraldcraft;

import com.saundersmayhem.demeraldcraft.blocks.BlockWindmill;
import com.saundersmayhem.demeraldcraft.blocks.DemeraldFurnaceTileEntity;
import com.saundersmayhem.demeraldcraft.items.itemWindmill;
import com.saundersmayhem.demeraldcraft.lib.ProxyCommon;
import com.saundersmayhem.demeraldcraft.lib.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = References.MODID,
	version = References.VERSION)

public class Demeraldcraft
{
    @SidedProxy(clientSide = References.Client, serverSide = References.Common)
    
    public static ProxyCommon proxy;
    
    @instance("demeraldcraft")
    public static Demeraldcraft instance;
    
    //Items
    	public static Item Demerald = new com.saundersmayhem.demeraldcraft.items.Demerald(3000);
    	public static Item itemWindmill = new itemWindmill(3001);
    
    //CreativeTab
    	public static CreativeTabs DemeraldCraft = new CreativeTabs("Demerald Craft"){
    		public Item getTabIconItem(){
    			return new Item();
    		}
    	};
    	
    //Blocks
    	public static final Block DemeraldBlock = new com.saundersmayhem.demeraldcraft.blocks.DemeraldBlock(2000, Material.iron);

		public static final Block DemeraldOre = new com.saundersmayhem.demeraldcraft.blocks.DemeraldOre(2001, Material.rock);
		
		public static final Block DemeraldFurnace = new com.saundersmayhem.demeraldcraft.blocks.DemeraldFurnace(2002, Material.iron);
		
		public static Block BlockWindmill = new BlockWindmill(2003, Material.iron);
    	
    //Crafting Recipes
    @EventHandler
    public void preInit(FMLInitializationEvent event){
    	//Demerald Block
    	GameRegistry.addRecipe(new ItemStack(DemeraldBlock), new Object[]{
    		"xxx",
    		"xxx",
    		"xxx",
    		'x', new ItemStack(Demerald)
    	});
    	//Demerald
    	GameRegistry.addShapelessRecipe(new ItemStack(Demerald, 9), new Object[]{
    		new ItemStack(DemeraldBlock)
    	});
    	GameRegistry.addRecipe(new ItemStack(Demerald), new Object[]{
    		"xxx",
    		"xyx",
    		"xxx",
    		'x', new ItemStack(Items.gold_ingot), 'y', new ItemStack(Items.emerald)
    	});
    	//DemeraldFurnace
    	GameRegistry.addRecipe(new ItemStack(DemeraldFurnace), new Object[]{
    		"xxx",
    		"x x",
    		"xxx",
    		'x', new ItemStack(Demerald)
    	});
    }
    	
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event) 
    {
    	proxy.registerRenderInfomation();
    }
    
    public void generateSurface(World world, java.util.Random rand, int chunkX, int chunkZ){
    	for(int i = 0; i < 3; i++){
    	int randPosX = chunkX + rand.nextInt(16);
    	int randPosY = rand.nextInt(77)+0;
    	int randPosZ = chunkZ + rand.nextInt(16);
    	(new WorldGenMinable(DemeraldOre, 2)).generate(world, rand, randPosX, randPosY, randPosZ);
    	}
    	}
    
    public Demeraldcraft(){	
    	//Item Registry
    		//GameReg
    			GameRegistry.registerItem(Demerald, "Demerald");
    		//LangReg
    	//Block Registry
    		//GameReg
    			GameRegistry.registerBlock(DemeraldBlock, "Demerald Block");
    			GameRegistry.registerBlock(DemeraldOre, "Demerald Ore");
    			GameRegistry.registerBlock(DemeraldFurnace, "Demerald Furnace");  			
    		//LangReg
    		//TileReg
    			GameRegistry.registerTileEntity(DemeraldFurnaceTileEntity.class, "DemeraldFurnaceTileEntity"); 
    	//CreativeTabs
    			LanguageRegistry.instance().addStringLocalization("itemGroup.DemeraldCraft", "en_us", "Demerald Craft" );
    }
}

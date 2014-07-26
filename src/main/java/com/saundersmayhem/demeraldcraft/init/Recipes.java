package com.saundersmayhem.demeraldcraft.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes 
{
	public static void init()
	{
		GameRegistry.addRecipe(new ItemStack(ModBlocks.DemeraldBlock), new Object[]{
    		"xxx",
    		"xxx",
    		"xxx",
    		'x', new ItemStack(ModItems.demerald)
    	});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.demerald), new Object[]{
    		"xxx",
    		"xyx",
    		"xxx",
    		'x', new ItemStack(Items.gold_ingot), 'y', new ItemStack(Items.emerald)
    	});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.demerald, 9), new Object[]{
			new ItemStack(ModBlocks.DemeraldBlock)
		});
	}
}
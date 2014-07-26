package com.saundersmayhem.demeraldcraft.init;

import com.saundersmayhem.demeraldcraft.item.ItemDC;
import com.saundersmayhem.demeraldcraft.item.ItemDemerald;
import com.saundersmayhem.demeraldcraft.reference.Names;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems 
{
	public static final ItemDC demerald = new ItemDemerald();
	
	public static void init()
	{
		GameRegistry.registerItem(demerald, Names.Items.Demerald);
	}
}

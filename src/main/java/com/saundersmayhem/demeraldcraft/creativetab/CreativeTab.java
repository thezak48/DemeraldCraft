package com.saundersmayhem.demeraldcraft.creativetab;

import com.saundersmayhem.demeraldcraft.init.ModItems;
import com.saundersmayhem.demeraldcraft.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.StatCollector;

public class CreativeTab
{
    public static final CreativeTabs DC_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.demerald;
        }
    };
}

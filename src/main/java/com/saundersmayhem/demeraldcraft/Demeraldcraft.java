package com.saundersmayhem.demeraldcraft;

import com.saundersmayhem.demeraldcraft.handler.ConfigurationHandler;
import com.saundersmayhem.demeraldcraft.init.ModBlocks;
import com.saundersmayhem.demeraldcraft.init.ModItems;
import com.saundersmayhem.demeraldcraft.init.Recipes;
import com.saundersmayhem.demeraldcraft.proxy.IProxy;
import com.saundersmayhem.demeraldcraft.reference.Reference;
import com.saundersmayhem.demeraldcraft.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class DemeraldCraft
{
    @Mod.Instance(Reference.MOD_ID)
    public static DemeraldCraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        
        ModItems.init();
        
        ModBlocks.init();
        
        LogHelper.info("Pre Initialization Complete!");
        
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();
        
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }
}
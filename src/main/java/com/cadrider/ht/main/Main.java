package com.cadrider.ht.main;

import com.cadrider.ht.proxy.CommonProxy;
import com.cadrider.ht.reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, name = Reference.NAME,
        version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_MINECRAFT_VERSION)


public class Main {
    @Instance
    public static Main instance;

    private static Logger logger;


    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent   event) {
        logger = event.getModLog();
    };

    @Mod.EventHandler
    public static void init(FMLInitializationEvent         event) { };

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) { };

}


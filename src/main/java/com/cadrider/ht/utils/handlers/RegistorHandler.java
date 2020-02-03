package com.cadrider.ht.utils.handlers;

import com.cadrider.ht.init.InitItems;
import com.cadrider.ht.utils.interfaces.ISimpleItemModel;
import com.cadrider.ht.utils.interfaces.IWrenchModel;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod.EventBusSubscriber
public class RegistorHandler {

    @SubscribeEvent
    public static void onItemRegistor(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(InitItems.ITEMS.toArray(new Item[0]));
    };

    @SubscribeEvent
    public static void onModelRegistor(ModelRegistryEvent event){
        for (Item item : InitItems.ITEMS){
            if(item instanceof IWrenchModel){
                ((IWrenchModel)item).registerModels();
            }
            else if(item instanceof ISimpleItemModel){
                ((ISimpleItemModel)item).registerModels();
            }
        }
    }
}

package com.cadrider.ht.items;

import com.cadrider.ht.init.InitItems;
import com.cadrider.ht.main.Main;
import com.cadrider.ht.utils.interfaces.ISimpleItemModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemPlate extends Item implements ISimpleItemModel {
    String type = "plate";
    public ItemPlate(String material) {
        setCreativeTab(CreativeTabs.MATERIALS);
        setRegistryName(type + "_" + material);
        setUnlocalizedName(type + "_" + material);
        setMaxStackSize(64);

        InitItems.ITEMS.add(this);

    }


    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");

    }
}

misharusru150101
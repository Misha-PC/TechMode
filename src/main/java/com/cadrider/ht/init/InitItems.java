package com.cadrider.ht.init;

import com.cadrider.ht.items.ItemIngot;
import com.cadrider.ht.items.ItemPlate;
import com.cadrider.ht.material.Materials;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class InitItems  {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //    public static final Item COPPER = new ItemIngot("copper");


    public static final Vector<Item> ingot = new Vector<>();
    public static final Vector<Item> plate = new Vector<>();

    Materials material = new Materials();

    InitItems(){
        material.start();

        while (material.next()){
            ingot.add( new ItemIngot(material.getMaterial()));
            plate.add( new ItemPlate(material.getMaterial()));
        }
    }

}

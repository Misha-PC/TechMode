package com.cadrider.ht.material;


import java.util.Vector;

public class Materials {

    private Vector<String> materials = new Vector<>();
    private int currentElemrnt;


    public Materials(){

//    ResourceLocation location = new ResourceLocation("techcraft:src\\main\\resources\\assets\\techcraft\\materials\\materials.txt");
//    BufferedReader reader = new BufferedReader(new FileReader(""));
//    public Materials() throws FileNotFoundException {
//    }

        materials.add("copper");
        materials.add("tin");
        materials.add("nickel");
        materials.add("bronze");
    }

    public boolean next(){
        currentElemrnt++;
        if(currentElemrnt < materials.size()){
            return true;
        }
        return false;
    }

    public String getMaterial(){
        return materials.get(currentElemrnt-1);
    }

    public void start(){
        currentElemrnt = 0;
    }

    public void addElement(String elem){
        materials.add(elem);
    }

}

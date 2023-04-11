/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 * 
 *
 * @author Thomas
 */


public class Suitcase {
    private ArrayList<Item> itemList;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.itemList = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item){
        if(this.totalWeight()+item.getWeight()<=this.maxWeight){
            this.itemList.add(item);
        }
    }

    public int getMaxWeight() {
        return maxWeight;
    }
    
    public String toString(){
        if(itemList.size() == 0){
            return "no items (0 kg)";
        } else if (itemList.size() == 1) {
            return itemList.size() + " item (" + this.totalWeight() + " kg)";
        } else {
        return itemList.size() + " items (" + this.totalWeight() + " kg)";
        }
    }
    
    public void  printItems(){
        for(Item item:itemList){
            System.out.println(item);
        }
    }
        
    public int totalWeight(){
        int totalWeight = 0;
        for(Item item:itemList){
            totalWeight = totalWeight+item.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem(){
        Item heaviestItem = new Item("null",0);
        
        if(itemList.isEmpty()){
            return null;
        } else {
            for(Item item:itemList){
                if(heaviestItem.getWeight() < item.getWeight()){
                    heaviestItem = item;
                }
            }
        }
        return heaviestItem;
    }
}

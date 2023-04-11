/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Thomas
 */
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcaseList;
    private int totalWeight;
    

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcaseList = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        
        if(totalWeight+suitcase.getMaxWeight() <= this.maxWeight){
            this.suitcaseList.add(suitcase);
            totalWeight +=suitcase.totalWeight();
        }
    }
    
    public String toString(){
        return this.suitcaseList.size() + " suitcases (" +
               totalWeight+" kg)";
    }
    
    public void printItems(){
        for(Suitcase suitcase:suitcaseList){
            suitcase.printItems();
        }
         
    }
    
}

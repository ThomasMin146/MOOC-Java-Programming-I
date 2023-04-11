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
public class BirdDatabase {
    private ArrayList<Bird> birdList;

    public BirdDatabase() {
        this.birdList = new ArrayList<>();
    }

    public ArrayList<Bird> getBirdList() {
        return birdList;
    }
    
    public void addBird(Bird bird){
        this.birdList.add(bird);
    }
    
    public void showDatabase(){
        for(Bird bird:birdList){
            System.out.println(bird);
        }
    }
    
    public ArrayList<String> showAllNames(){
        ArrayList<String> birdNames = new ArrayList<>();
        for(Bird bird:birdList){
            birdNames.add(bird.getName());
        }
        return birdNames;
    }
    
    public void birdObservation(String observationInput){
        if(showAllNames().contains(observationInput)){
            for(Bird bird:birdList){
                if(bird.getName().equals(observationInput)){
                    bird.addObservation();
                }
            }
             
        } else {
            System.out.println("Not a bird!");
        }
    }
    
    public void showOneBird(String oneInput){
        if(birdList.size()>0)
            for(Bird bird:birdList){
                if(bird.getName().equals(oneInput)){
                    System.out.println(bird);
                }
            }
                
    }
}

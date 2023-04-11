/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Thomas
 */
public class UserInterface {
    private BirdDatabase birdDatabase;

    public UserInterface() {
        this.birdDatabase = new BirdDatabase();
    }
    
    public void start(Scanner scan){
        
        
        while(true){
            
            System.out.println("?");
            String userInput = scan.nextLine();
            
            if(userInput.equals("Add")){
                
                System.out.println("Name:");
                String nameInput = scan.nextLine();
                System.out.println("Name in Latin:");
                String latinNameInput = scan.nextLine();
                birdDatabase.addBird(new Bird(nameInput,latinNameInput));
                
            } else if (userInput.equals("Observation")){
                
                System.out.println("Bird?");
                String observationInput = scan.nextLine();
                birdDatabase.birdObservation(observationInput);
                    
            } else if (userInput.equals("All")){
                
                //System.out.println(birdDatabase.getBirdList());
                birdDatabase.showDatabase();
                  
            } else if(userInput.equals("Quit")){
                break;
                
            } else if(userInput.equals("One")){
                
                System.out.println("Bird?");
                String oneInput = scan.nextLine();
                birdDatabase.showOneBird(oneInput);
            }
            
            
        }
    }
}

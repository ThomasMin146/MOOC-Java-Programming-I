
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
    private Scanner scanner;
    private Recipes recipes;
    
    public UserInterface() {
        scanner = new Scanner(System.in);
        recipes = new Recipes();
    }
    
    public void start(){
        System.out.println("File to read:");
        String fileNameInput = this.scanner.nextLine();
        recipes.readRecipesFromFile(fileNameInput);
        
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        
        while(true){
            System.out.println("Enter command:");
            String userInput = this.scanner.nextLine();
            
            if(userInput.equals("stop")){
                break;
                
            } else if(userInput.equals("list")){
                recipes.findRecipes();
                System.out.println("");
                
            } else if(userInput.equals("find name")){
                System.out.println("Searched word:");
                String searchedWord = scanner.nextLine();
                recipes.findByNames(searchedWord);
                System.out.println("");
                
            } else if (userInput.equals("find cooking time")){
                System.out.println("Max cooking time:");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                recipes.findByTime(maxCookingTime);
                System.out.println("");
                
            } else if (userInput.equals("find ingredient")){
                System.out.println("Ingredient:");
                String searchIngredient = scanner.nextLine();
                recipes.findByIngredient(searchIngredient);
                System.out.println("");
                
            }
        }
    }
}

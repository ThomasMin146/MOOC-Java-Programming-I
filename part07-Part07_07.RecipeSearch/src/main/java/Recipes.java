/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

/**
 *
 * @author Thomas
 */
public class Recipes {
    private ArrayList<Recipe> recipes;

    public Recipes() {
        this.recipes = new ArrayList<>();
    }
    
    public void readRecipesFromFile(String fileName){
        try(Scanner scanner = new Scanner(Paths.get(fileName))){
            while(scanner.hasNextLine()){
                String name = scanner.nextLine();
                int cookingTime = Integer.valueOf(scanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                
                while(scanner.hasNextLine()){
                    String ingredient = scanner.nextLine();
                    if(ingredient.isEmpty()){
                        break;
                    }
                    ingredients.add(ingredient);
                }
                
                Recipe recipe = new Recipe(name, cookingTime, ingredients);
                this.recipes.add(recipe);
            }
        } catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    public void findRecipes(){
        System.out.println("Recipes:");
        this.recipes.forEach(System.out::println);
    }
    
    public void findByNames(String searchedWord){
        System.out.println("Recipes:");
        for(Recipe recipe:this.recipes){
            if(recipe.getName().contains(searchedWord)){
                System.out.println(recipe);
            }
        }
    }
    
    public void findByTime(int maxCookingTime){
        System.out.println("Recipes:");
        for(Recipe recipe:this.recipes){
            if(recipe.getCookingTime()<=maxCookingTime){
                System.out.println(recipe);
            }
        }
    }
    
    public void findByIngredient(String searchIngredient){
        System.out.println("Recipes:");
        ArrayList<Recipe> searchIngr = new ArrayList<>();
        for(Recipe recipe:this.recipes){
            //for(String ingredient:recipe.getIngredients()){
                if(recipe.getIngredients().contains(searchIngredient)){
                    searchIngr.add(recipe);
                }
            
        }
        searchIngr.forEach(System.out::println);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Thomas
 */
public class JokeManager {
    private ArrayList<String> jokesList;
    
    
    public JokeManager(){
        this.jokesList = new ArrayList<>();
        
    }
    
    public void addJoke(String joke){
        this.jokesList.add(joke);
    }
    
    public String drawJoke(){
        Random randomDraw = new Random();
        if(jokesList.isEmpty()){
            return "Jokes are in short supply.";
        } else {
            int index = randomDraw.nextInt(jokesList.size());
            return jokesList.get(index);
        }
    }
    
    public void printJokes(){
        for(String joke:jokesList){
            System.out.println(joke);
        }
    }    
    
}

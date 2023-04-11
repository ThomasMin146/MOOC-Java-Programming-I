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
    private JokeManager jokeManager;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokeManager, Scanner scanner){
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");

            String chosenChoice = scanner.nextLine();

            if(chosenChoice.equals("1")){
                System.out.println("Write the joke to be added:");
                String addingJoke = scanner.nextLine();
                jokeManager.addJoke(addingJoke);
            } else if (chosenChoice.equals("2")){
                System.out.println(jokeManager.drawJoke());
            } else if (chosenChoice.equals("3")){
                jokeManager.printJokes();
            } else if (chosenChoice.equals("X")){
                break;
                
            }
        }
        
    }
}

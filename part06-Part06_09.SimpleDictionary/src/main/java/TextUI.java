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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDict;
    
    public TextUI(Scanner scanner, SimpleDictionary simpleDict){
        this.scanner = scanner;
        this.simpleDict = simpleDict;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String userInput = scanner.nextLine();
            
            if(userInput.equals("end")){
                System.out.println("Bye bye!");
                break;
                
            } else if(userInput.equals("add")){
                System.out.println("Word:");
                String word = scanner.nextLine();
                
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                        
                simpleDict.add(word, translation);
            
            } else if(userInput.equals("search")){ 
                System.out.println("To be translated:");
                String wordForTranslation = scanner.nextLine();
                
                if(simpleDict.translate(wordForTranslation)==null){
                    System.out.println("Word "+wordForTranslation+" was not found");
                
                } else {
                    System.out.println("Translation: "+simpleDict.translate(wordForTranslation));
                }
                
            } else{
                System.out.println("Unknown command");
            }
            
        }
        
    }
}

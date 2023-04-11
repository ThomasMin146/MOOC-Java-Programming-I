
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int age = 0;
        int temp = 0;
        
        String[] splitInput = {};
        
        while(true){
            String userInput = scanner.nextLine();
            
            if(userInput.equals("")){
                break;
            }
            
            splitInput = userInput.split(",");
            
            age = Integer.valueOf(splitInput[1]);
            if(age < temp){
                age = temp;
            }
            temp = age;
            
            
        }
        System.out.println("Age of the oldest: "+age);
        

    }
}

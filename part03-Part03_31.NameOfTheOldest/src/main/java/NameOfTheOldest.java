
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int age = 0;
        int temp = 0;
        String nameOldest = "";
        
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
                
            } else {
                temp = age;
                nameOldest = splitInput[0];
            }
            
            
            
        }
        System.out.println("Name of the oldest: "+nameOldest);

    }
}

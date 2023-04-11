
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tempNameLength = 0;
        String nameLongest = "";
        
        int sum = 0;
        int divisor = 0;
        
        while(true){
            String userInput = scanner.nextLine();
            
            if(userInput.equals("")){
                break;
            }
            
            String[] splitInput = userInput.split(","); // splitne array
            
            String name = splitInput[0]; // priradi prvy arraystring 
            
            int nameLength = name.length(); // priradi dlzku mena
            
            if(nameLength <= tempNameLength){
                
            } else{
                tempNameLength = nameLength;
                nameLongest = name;
            }
            
            int tempYear = Integer.valueOf(splitInput[1]);
            sum += tempYear;
            divisor++;
            
            
            
            
        }
        double average = 1.0*sum/divisor;
        System.out.println("Longest name: "+nameLongest);
        System.out.println("Average of the birth years: "+average);


    }
}

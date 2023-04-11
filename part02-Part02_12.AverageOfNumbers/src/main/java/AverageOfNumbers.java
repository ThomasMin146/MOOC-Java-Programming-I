
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double numofnum = 0.0;
        double sumofnum = 0.0;
        
        while (true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            sumofnum = sumofnum + num;
            numofnum = numofnum + 1;
            
            if(num == 0){
                break;
            } 
        }
        
        System.out.println("Average of the numbers: "+(sumofnum/(numofnum-1)));
    }
}

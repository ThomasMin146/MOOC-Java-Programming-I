
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numofnum = 0;
        int sumofnum = 0;
        
        while (true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            sumofnum = sumofnum + num;
            numofnum = numofnum + 1;
            
            if(num == 0){
                break;
            } 
        }
        System.out.println("Number of numbers: "+(numofnum-1));
        System.out.println("Sum of the numbers: "+sumofnum);
        
    }
}

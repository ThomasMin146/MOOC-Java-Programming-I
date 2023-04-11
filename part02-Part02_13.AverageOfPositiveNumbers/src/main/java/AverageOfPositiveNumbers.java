
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        double sumofnum = 0.0;
        double numofnum = 0.0;
        boolean posnumcheck = false;
        
        while (true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            
            
            if(num == 0){
                break;
            } else if(num > 0){
                posnumcheck = true;
                sumofnum = sumofnum + num;
                numofnum = numofnum + 1;
            }
        }
        
        if(!posnumcheck){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average of the numbers: "+(sumofnum/(numofnum)));
        }
    }
        
}

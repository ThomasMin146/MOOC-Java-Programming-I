
import java.util.Scanner;


public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int first = 0;
        int second = 0;
        int max = 100;

        while (true) {
            
            System.out.println("First: "+first+ "/"+ max);
            System.out.println("Second: "+second+ "/"+ max);

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            
            if(parts.length == 1 && parts[0].equals("quit")){
                break;
            } else {
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);

                if(command.equals("add")){

                    if (amount > 0 && first + amount <= max){
                        first = first + amount;
                    } else if (first + amount >= max){
                        first = max;
                    }

                } else if(command.equals("move")){

                    if(amount > 0 && amount >= first){
                        second += first;
                        first = 0;
                    } else if (amount > 0 && amount < first){
                        if(second + amount > max){
                            second = max;
                            first = first - amount;
                        } else {
                            second = second + amount;
                        first = first - amount;
                        }
                        
                    }
                } else if(command.equals("remove")){

                    if(amount <= second){
                        second -= amount;
                    } else if(amount >= second){
                        second = 0;
                    }

                }
            }
                
             
            
            
        }
    }
    
}


import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        
        
        while(true){
            int userInput = Integer.valueOf(scanner.nextLine());
            if(userInput == 9999){
                System.out.println();
                break;
            }
            arrayList.add(userInput);
            
        }
        
        int smallest = arrayList.get(0);;
        
        for(int i = 0; i < arrayList.size(); i++){
            
            if(smallest > arrayList.get(i)){
                smallest = arrayList.get(i);
            }
        }
        System.out.println("Smallest number: "+smallest);
        System.out.println("Found at index: "+arrayList.indexOf(smallest));
    }
}

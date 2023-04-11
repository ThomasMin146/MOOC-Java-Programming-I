
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try(Scanner scan = new Scanner(Paths.get(file))){
            int numbersfound = 0;
            
            while(scan.hasNextLine()){
                int numFromFile = Integer.valueOf(scan.nextLine());
                if(numFromFile >= lowerBound && numFromFile <= upperBound){
                    numbersfound++;
                }
                
                
            }
            System.out.println("Numbers: " +numbersfound);
            
        } catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }

}

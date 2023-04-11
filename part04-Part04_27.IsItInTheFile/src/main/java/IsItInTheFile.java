
import java.nio.file.Paths;
import java.util.Scanner;


public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try(Scanner scan = new Scanner(Paths.get(file))){
            
            boolean nameFound = false;
            
            while(scan.hasNextLine()){
                String desiredString = scan.nextLine();
                if(desiredString.equals(searchedFor)){
                    System.out.println("Found!");
                    nameFound = true;
                    break;
                } 
            }
            
            if(!nameFound){
                System.out.println("Not found.");
            }
            
        } catch (Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
        

    }
}

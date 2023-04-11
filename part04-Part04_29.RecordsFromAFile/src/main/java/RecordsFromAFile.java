
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String fileInput = scanner.nextLine();
        
        try(Scanner scan = new Scanner(Paths.get(fileInput))){
            while(scan.hasNextLine()){
                String textLine = scan.nextLine();
                String[] textSeparated = textLine.split(",");
                if(Integer.valueOf(textSeparated[1])==1){
                    System.out.println(textSeparated[0] + ", age: "+textSeparated[1]+" year");
                } else {
                    System.out.println(textSeparated[0] + ", age: "+textSeparated[1]+" years");
                }
                
            }
            
        } catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }

    }
}


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archiveList = new  ArrayList<>();
        
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identifierInput = scanner.nextLine();
            
            if(identifierInput.isEmpty()){
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String nameInput = scanner.nextLine();
            
            if(nameInput.isEmpty()){
                break;
            }
            
            Archive archive = new Archive(identifierInput, nameInput);
            
            if(!(archiveList.contains(archive))){
                archiveList.add(archive);
            }
            
            
        }
        
        System.out.println("==Items==");
        for(Archive archiveone:archiveList){
            System.out.println(archiveone);
        }
        
        
    }
}

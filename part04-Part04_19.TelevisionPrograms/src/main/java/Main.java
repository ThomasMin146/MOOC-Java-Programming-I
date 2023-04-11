import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Name:");
            String nameInput = scanner.nextLine();
            
            if(nameInput.isEmpty()){
                break;
            }
            
            System.out.println("Duration:");
            int durationInput = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(nameInput, durationInput));
            
        }
        
        System.out.println("Program's maximum duration?");
        int maxdurationInput = Integer.valueOf(scanner.nextLine());
        
        for(TelevisionProgram program: programs){
            if(program.getDuration() <= maxdurationInput){
                System.out.println(program.getName()+", "+program.getDuration()+" minutes");
            }
        }
        
    }
}

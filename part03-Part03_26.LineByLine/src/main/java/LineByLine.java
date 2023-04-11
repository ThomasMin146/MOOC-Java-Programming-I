
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            
            String userInput = scanner.nextLine();
            if(userInput.equals("")){
                break;
            }
            String[] splitted = userInput.split(" ");

            for(int i = 0; i < splitted.length; i++){
                System.out.println(splitted[i]);
            }
        }


    }
}

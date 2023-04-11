import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> book = new ArrayList<>();
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        while(true){
            System.out.println("Title:");
            String nameInput = scanner.nextLine();
            
            if(nameInput.isEmpty()){
                break;
            }
            
            System.out.println("Pages:");
            int pagesInput = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year:");
            int pubyearInput = Integer.valueOf(scanner.nextLine());
            
            book.add(new Book(nameInput, pagesInput, pubyearInput));
            
        }
        
        System.out.println("What information will be printed?");
        String infoInput = scanner.nextLine();
        
        if(infoInput.equals("everything")){
            for(Book bok:book){
                System.out.println(bok.toString());
            }
            
        } else if (infoInput.equals("name")){
            for(Book bok:book){
                System.out.println(bok.getName());
            }
        }
    }
}

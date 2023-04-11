
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeStatistics gradeStatistics = new GradeStatistics();
        ArrayList<Integer> numList = new ArrayList<>();
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        System.out.println("Enter point totals, -1 stops:");
        
        while(true){
            int userInput = Integer.valueOf(scanner.nextLine());
            if(userInput == -1){
                break;
            } 
            numList.add(userInput);
        }
        System.out.println("Point average (all): "+gradeStatistics.pointAverages(numList));
        if(gradeStatistics.passedPointAverages(numList)==0){
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): "+gradeStatistics.passedPointAverages(numList));
        }
        System.out.println("Pass percentage: "+gradeStatistics.passPercentage(numList));
        
        gradeStatistics.gradeCounter(numList);
        
        System.out.println("Grade distribution:");
        for(int i = 5;i>=0;i--){
            System.out.print(i+": ");
            for(int j = 1; j <= gradeStatistics.getGrade(i) ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
    }
}

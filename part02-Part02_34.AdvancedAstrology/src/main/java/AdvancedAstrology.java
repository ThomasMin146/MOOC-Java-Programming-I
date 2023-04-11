
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for(int i = 0; i < number; i++){
            System.out.print("*");
        }
        
        
        
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 1; i<number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int temp = 1;
        for(int i = size;i > 0;i--){
            printSpaces(i);
            
            printStars(temp);
            System.out.println();
            temp++;
            
            
            
        }
        //printStars(size);
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int temp = 1;
        for(int i = height;i > 0;i--){
            printSpaces(i);
            
            printStars(temp);
            printStars(temp-1);
            
            System.out.println();
            temp++;
            
        }
        printSpaces(height-1);
        printStars(3);
        System.out.println();
        printSpaces(height-1);
        printStars(3);
        System.out.println();
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
        
        
    }
}

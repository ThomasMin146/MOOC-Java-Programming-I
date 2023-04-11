import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        // indices:       0  1  2  3   4
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};

        MainProgram.sort(numbers);
        
    }
    
    public static int smallest(int[] array){
        int tempNum = 2147483647;
        for(int i = 0; i < array.length; i++)
            if(array[i] < tempNum){
                tempNum = array[i];
            }
        return tempNum;
    }
    
    public static int indexOfSmallest(int[] array){
        int tempNum = 2147483647;
        int indexOfSmallest = 0;
        for(int i = 0; i < array.length; i++)
            if(array[i] < tempNum){
                tempNum = array[i];
                indexOfSmallest = i;
            }
        return indexOfSmallest;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
    // write your code here
        int tempNum = 2147483647;
            int indexOfSmallest = 0;
            for(int i = startIndex; i < table.length; i++)
                if(table[i] < tempNum){
                    tempNum = table[i];
                    indexOfSmallest = i;
                }
            return indexOfSmallest;
    }
    
    public static void swap(int[] array, int index1, int index2) {
    // write your code here
    int tempNum = array[index1];
    array[index1] = array[index2];
    array[index2] = tempNum;
    }
    
    public static void sort(int[] array) {
        
        for(int i = 0; i < array.length; i++){
            MainProgram.swap(array, MainProgram.indexOfSmallestFrom(array,i), i);
            System.out.println(Arrays.toString(array));
        }
        
    }
    
}

package arrays;


import java.util.Arrays;
public class ReverseArray {
    
   
    private static void reverse(int[] array){
        int temp = 0 ;
        int[] newArray = new int[array.length];
        for (int i = array.length - 1; i >=0;  i--){
            newArray[i] = array[temp];
            temp++;
    }
    System.out.println("Array = " + Arrays.toString(array));
    System.out.println("Reversed Array = " + Arrays.toString(newArray));
    

}
}
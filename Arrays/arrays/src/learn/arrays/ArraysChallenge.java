package learn.arrays;
import java.util.Scanner;

public class ArraysChallenge {

    private Static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int[] myIntegers = getIntegers(5);
    }


    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values.\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

    }
    
    
}

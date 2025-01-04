
/* 1.	WAP to read 10 element
in an array and find the maximum and 
minimum element in an array.
 */
import java.util.Scanner;

public class smallest_highest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        
        // Read 10 elements into the array
        for (int i = 0; i<10; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        int maxElement = array[0];
        int minElement = array[0];
        
        // Find maximum and minimum elements int num: array this is used in replace of int i=0;i<array size; i++
        for (int num : array)  {
            if (num > maxElement) {
                maxElement = num;
            }
            if (num < minElement) {
                minElement = num;
            }
        }
        
        System.out.println("Maximum element: " + maxElement);
        System.out.println("Minimum element: " + minElement);
        
        scanner.close();
    }
}


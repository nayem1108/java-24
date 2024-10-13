package DS.Array;

import java.util.Scanner;

/* 
 * Linear search of 1d array
 * 
*/
public class LinearSearch {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int target = inputScanner.nextInt();
        boolean isFound = false;
        int foundAt = -1;

        int[] arr = { 10, 24, 53, 54, 32, 25, 53, 23, 52, 14 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                foundAt = i;
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("Target found at: " + foundAt);
        } else {
            System.out.println("Target not found");
        }

        inputScanner.close();
    }
}

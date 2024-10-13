package DS.Array.TwoDArr;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arr[][] = { { 1, 4 }, { 3, 5 }, { 6, 7 }, { 8, 9 }, { 12, 11 } };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int target = input.nextInt();

        int foundAtRow = -1;
        int foundAtCol = -1;
        boolean isFound = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    isFound = true;
                    foundAtRow = i;
                    foundAtCol = j;
                    break;
                }
            }
        }

        if (isFound) {
            System.out.println("Target found at index: array[" + foundAtRow + "][" + foundAtCol + "]");
        } else {
            System.out.println("Target not found");
        }

        input.close();
    }
}

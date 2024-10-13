package DS.Array;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int[] arr = { 2, 4, 6, 8, 9, 10, 23, 53 };
        System.out.println(arr);

        int target = inputScanner.nextInt();

        int left = 0, right = arr.length - 1;

        int foundeAt = -1;
        boolean isFound = false;

        while (left <= right) {
            System.out.println(left + " " + right);
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                foundeAt = mid;
                isFound = true;
                break;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (isFound) {
            System.out.println("Target found at index: " + foundeAt);
        } else {

            System.out.println("Target not found");
        }

        inputScanner.close();

    }
}

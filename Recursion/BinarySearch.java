package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 55, 66, 78 };
        int target = 21;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e) {

        // if not found s > e
        if (s > e) {
            return -1;
        }

        // find mid index of the array
        int m = s + (e - s) / 2;

        // if target equal to arr[m] then return m(array index of target)
        if (target == arr[m]) {
            return m;
        }

        // if target is less then array of mid then end will be mid-1 & start will be
        // remain
        if (target < arr[m]) {
            return search(arr, target, s, m - 1);
        }

        // if target is greater then array of mid then start will be mid+1 & end will be
        // remain

        return search(arr, target, m + 1, e);
    }
}

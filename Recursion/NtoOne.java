package Recursion;

public class NtoOne {
    public static void main(String[] args) {
        /**
         * Print n to 1 using recursion
         */
        int n = 10;
        print(n);

    }

    static void print(int n) {

        if (n < 1) {
            return;
        }
        System.out.println(n);
        print(n - 1);
    }
}

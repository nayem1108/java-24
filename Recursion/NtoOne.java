package Recursion;

public class NtoOne {
    public static void main(String[] args) {
        /**
         * Print n to 1 using recursion
         */
        int n = 10;
        fun(n);

    }

    static void fun(int n) {

        if (n < 1) {
            return;
        }

        // n to 1
        // System.out.println(n);
        fun(n - 1);

        // 1 to n
        System.out.println(n);
    }
}

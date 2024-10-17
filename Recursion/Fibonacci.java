package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int fib = fibo(50);
        System.out.println(fib);
    }

    static int fibo(int n) {

        if (n < 2) {
            return n;
        }
        // System.out.print((n - 1) + " " + (n - 2));
        // System.out.println();
        return fibo(n - 1) + fibo(n - 2);
    }

    /*
     * types of variable in recursion
     * 
     * 1. Argument fin(int n) n is argument variable
     * 
     * 2. function return type static int😛 fibo(int n)
     * here int😛 is return type of the methodn
     * 
     * 3. inside method body
     * {
     * some variable in here may be used
     * }
     */
}

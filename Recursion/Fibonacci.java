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
     * VVVI**
     * 
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

    /***
     * 
     * 
     * 
     * Types of recurrence relation in recursion
     * 
     * 1. Linear recurrence relation -> e.g *like fibonacci number
     * 
     * 2. Divide & Conquer recurrence *relation -> e.g. like binary search
     */

    /**
     * Efficient
     * 
     * Divide & conquer is efficient than linear recurrence
     * 
     * As devide and conquer divide the problem like divide the problem in half in
     * binary search how we do things
     * 
     * 
     * Linear recurrence relation solve problem like add some or substract some not
     * like divide the problem and solve the problem
     * 
     */

    /*
     * 50 is a small number in computer
     * 
     * but if we want to get fibo of 50 then we will understand why we need dynamic
     * programming
     * 
     */
}

package Recursion;

public class Recursion {
    /*
     * 
     * Recursion is a concept when a function is calling it self is called recursion
     * 
     * There is two point to archive recursion
     * 1. Base Condtion : where my recursion call will be end
     * 2. Untill aechive the best condition then call the function
     */
    public static void main(String[] args) {
        // We calling a function which will print 1,2,3,4,5
        print(1);
    }

    static void print(int n) {
        System.out.println(n);

        // When n is 5 then stop call the function
        /*
         * Base condtion is, when we should stop the method call
         */
        if (n == 5) {
            // stopping another call
            return;
        }

        // Until reach base condition, we will call this method again and again
        print(n + 1);
    }
}

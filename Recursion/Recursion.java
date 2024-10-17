package Recursion;

public class Recursion {
    /*
     * Recursion is a concept when a function is calling it self is called recursion
     * 
     * There is two point to archive recursion
     * 1. Base Condtion : where my recursion call will be end
     * 2. Untill aechive the best condition then call the function
     * 3. Method Body
     */
    public static void main(String[] args) {
        // We calling a function which will print 1,2,3,4,5
        print(1);
    }

    static void print(int n) {

        /*
         * Body
         */
        System.out.println(n);

        /*
         * Base condtion is, when we should stop the method call
         * When n is 5 then stop call the function
         * 
         */
        if (n == 5) {
            // stopping another call
            return;
        }

        /*
         * Recursion call
         * Until reach base condition, we will call this method again and again
         */
        print(n + 1);
    }
}

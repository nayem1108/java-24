package Recursion;

public class Main {
    public static void main(String[] args) {
        // Print 5 times hello world

        /*
         * There are some ways
         * Either call this message() 5 times
         * message();
         * message();
         * message();
         * message();
         * message();
         */

        /*
         * Or
         * message();
         */

        /*
         * Or
         */
        message();
    }

    static void message() {
        /*
         * Or
         * System.out.println("Hello World");
         * System.out.println("Hello World");
         * System.out.println("Hello World");
         * System.out.println("Hello World");
         * System.out.println("Hello World");
         */

        /*
         * Or
         */
        System.out.println("Hello World");

        message2();
        message3();
        message4();
        message5();
    }

    static void message2() {
        System.out.println("Hello World!");
    }

    static void message3() {
        System.out.println("Hello World!");
    }

    static void message4() {
        System.out.println("Hello World!");
    }

    static void message5() {
        System.out.println("Hello World!");
    }
}

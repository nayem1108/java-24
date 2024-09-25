//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name = "Nayem uddin";
        int n = 10;
        System.out.println(name);


        /**
         * There are 2 types of data type
         * Premetive(build in) and non premetivw(User Defined)
         * Premetive 8 types
         *
         *
         * To Store Integer number
         * Type             Size                                        Range                                               formula for range -2^(n-1) - 2^(n-1)
         * byte             8 bit (8 combination of 0 & 1)              -128 - 127
         * short            16 bit (16 combination of 0 & 1)            -32768 - 32767
         * int              32 bit (32 combination of 0 & 1)            -2,147,483,648 - 2,147,483,647
         * long             64 bit (64 0&1 combination)                 -9,223,372,036,854,775,808 - 9,223,372,036,854,775,807
         *
         * To store char character
         * char             16 bit                                       -32768 - 32767
         *
         * decimal number
         * float            32 bit(after point 7 digit decimal e.g. X.XXXXXXX)
         * double           64bit(after point 16 digit decimal  e.g. X.xxxxxxxxxxxxxxxx)
         *
         * true false
         * boolean          1bit                                           true or false
         **/


        /**
         *
         * Example of all data types
         *
         **/

        byte b = 123;   // only 3 digit can be stored
        short s = 23475; // only digit of number can be stored
        int i = 1234875443; // Only 10 digit of number can be stored
        long l = 1234567898765456782L; //max 19 digit but ensure that L is there

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        char c = 'a';
        char ch = 'A';

        System.out.println(c);
        System.out.println(ch);


        float f = 1.324232323423423232323F;
        double d = 1.2345678987664534434534534534534534;

        System.out.println(f);
        System.out.println(d);


        System.out.println(c + ch);



    }
}
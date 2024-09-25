public class TypeCasting {
    public static void main(String[] args) {
        /*
         * Type Casting
         * there is two type of type casting
         * Implicit Type Casting & Explicit Type Castin
         *
         */
        System.out.println("Welcome to type casting lesson");


        /*
         * learn implicit type casting
         * also called automatic type casting
         * done by Java Virtual Mechine(JVM)
         * */

        int myInt = 10;
        System.out.println(myInt);

        double myDouble = myInt;
        System.out.println(myDouble);

        float myFloat = myInt;
        System.out.println(myFloat);


        /*
        * Explicit type casting
        * From large to small data conversion
        * is called explicit type casting
        *
        * example
        * shortDataType variableName = (shortDataType) largeData;
        *
        * Suppose we need to type cast from long to int then
        *
        * int newData = (int) LongData;
        * */

        long myLong = 1999999999999999999L;
        System.out.println(myLong);

        int myInt1 = (int) myLong;
        System.out.println(myInt1);

        short myShort = (short) myInt;
        System.out.println(myShort);

        short myShort1 = (short) myLong;
        System.out.println(myShort1);

        byte myByte = (byte) myInt1;
        System.out.println(myByte);

    }
}

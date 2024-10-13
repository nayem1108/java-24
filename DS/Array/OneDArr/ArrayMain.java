package DS.Array;

/**
 * ArrayMain
 */
public class ArrayMain {
    public static void main(String[] args) {

        // Boolean Array
        boolean[] arrboolean = new boolean[4];
        boolean[] arrboolean1 = { true, false, false, true };

        for (int i = 0; i < arrboolean1.length; i++) {
            System.out.println(arrboolean1[i]);
        }

        // Character Array
        char[] arrchar = new char[4];
        char[] arrchar1 = { 'a', 'A', 'B', '0' };

        for (int i = 0; i < arrchar1.length; i++) {
            System.out.println(arrchar1[i]);
        }

        // Byte Array
        byte[] arrbyte = new byte[4];
        byte[] arrbyte1 = { 2, 'A', 4, '0' };

        for (int i = 0; i < arrbyte1.length; i++) {
            System.out.println(arrbyte1[i]);
        }

        // Integer array
        int[] arrInt = new int[4];
        int[] arrInt1 = { 2, 3, 4, 5 };
        for (int i = 0; i < arrInt1.length; i++) {
            System.out.println(arrInt1[i]);
        }

        // Long Array
        long[] arrLong = new long[4];
        long[] arrLong1 = { 2, 3, 4, 5 };
        for (int i = 0; i < arrLong1.length; i++) {
            System.out.println(arrLong1[i]);
        }

        // Float Array
        float[] arrfloat = new float[4];
        float[] arrfloat1 = { 2, 3, 4, 5 };
        for (int i = 0; i < arrfloat1.length; i++) {
            System.out.println(arrfloat1[i]);
        }

        // Double Array
        double[] arrDouble = new double[4];
        double[] arrDouble1 = { 2, 3, 4, 5 };
        for (int i = 0; i < arrDouble1.length; i++) {
            System.out.println(arrDouble1[i]);
        }

        // Double Array
        String[] arrString = new String[4];
        String[] arrString1 = { "Nayem", "Uddin", "Fahim", "Ahmed" };
        for (int i = 0; i < arrString1.length; i++) {
            System.out.println(arrString1[i]);
        }

    }

}
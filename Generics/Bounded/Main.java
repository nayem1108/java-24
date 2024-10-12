package Generics.Bounded;

import Generics.Bounded.Impl.CommonImpl;

public class Main {
    public static void main(String[] args) {
        /**
         * Not allowed this generics for:
         * like String and character, boolean
         * 
         * Compile time error for these code
         * CommonImpl<String> commonImplStr = new CommonImpl<>();
         * CommonImpl<Character> commonImplChar = new CommonImpl<>();
         * CommonImpl<Boolean> commonImplBool = new CommonImpl<>();
         * 
         */

        /**
         * 
         * Only child classed of Number will excepted here
         * 
         */

        CommonImpl<Integer> commonImplInteger = new CommonImpl<>();
        CommonImpl<Double> commonImplDouble = new CommonImpl<>();
        CommonImpl<Float> commonImplFloat = new CommonImpl<>();
    }
}

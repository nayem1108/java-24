package Generics.Bounded.Impl;

import Generics.Bounded.Interface.Common;
import Generics.Bounded.Interface.Printable;

/**
 * 
 * Here it is called bounded type parameter in generics
 * We set a boundary of T, so that It only can receive Number
 * Number is a Super Class in java of Integer, Double, Float
 * Only Number is acceptable here in this generics
 */

/***
 * Now we added condition that only These types are acceptable who extends
 * Number and implements Printable
 * 
 * 
 * First element always A Class and after condition Interface (Keep Remember)*
 * public class CommonImpl<T extends Class & Interface>
 * 
 */
public class CommonImpl<T extends Number & Printable> implements Common<T> {
    private T item;

    @Override
    public void set(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return this.item;
    }
}

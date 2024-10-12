package Generics.Bounded.Impl;

import Generics.Bounded.Interface.Common;

/**
 * 
 * Here it is called bounded type parameter in generics
 * We set a boundary of T, so that It only can receive Number
 * Number is a Super Class in java of Integer, Double, Float
 * Only Number is acceptable here in this generics
 */
public class CommonImpl<T extends Number> implements Common<T> {
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

package Generics.Bounded.Impl;

import Generics.Bounded.Interface.Printable;

public class MyType extends Number implements Printable {
    @Override
    public void print() {
        System.out.println("Hello");
    }

    @Override
    public int intValue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'intValue'");
    }

    @Override
    public long longValue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'longValue'");
    }

    @Override
    public float floatValue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'floatValue'");
    }

    @Override
    public double doubleValue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'doubleValue'");
    }
}

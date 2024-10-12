package Generics.Impl;

import Generics.Interface.Container;

public class GenericContainerImpl<T> implements Container<T> {

    private T item;

    @Override
    public void set(T item) {
        this.item = item;
    }

    @Override
    public T get(T item) {
        return this.item;
    }

}

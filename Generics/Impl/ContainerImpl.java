package Generics.Impl;

import Generics.Interface.Container;

public class ContainerImpl implements Container<Integer> {

    private int item;

    @Override
    public void set(Integer item) {
        this.item = item;
    }

    @Override
    public Integer get() {
        return this.item;
    }

}

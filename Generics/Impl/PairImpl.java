package Generics.Impl;

import Generics.Interface.PairInterface;

public class PairImpl implements PairInterface<String, Integer> {

    private String key;
    private Integer value;

    @Override
    public void set(String key, Integer value) {

        this.key = key;
        this.value = value;
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public String getKey(Integer value) {
        return this.key;
    }

    @Override
    public Integer getValue() {
        return this.value;

    }

    @Override
    public Integer getValue(String key) {
        return this.value;
    }

}

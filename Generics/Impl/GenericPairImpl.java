package Generics.Impl;

import Generics.Interface.PairInterface;

public class GenericPairImpl<K, V> implements PairInterface<K, V> {

    private K key;
    private V value;

    @Override
    public void set(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public K getKey(V value) {
        return this.key;

    }

    @Override
    public V getValue() {
        return this.value;

    }

    @Override
    public V getValue(K key) {
        return this.value;
    }

    @Override
    public void get() {
        System.out.println("[ Key: " + this.key + ", Value: " + this.value + " ]");
    }
}

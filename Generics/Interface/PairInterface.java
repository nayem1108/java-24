package Generics.Interface;

public interface PairInterface<K, V> {
    void set(K key, V value);

    // Get the current key
    K getKey();

    // Get the key of given value
    K getKey(V value);

    // get current value
    V getValue();

    // Get the value of given key
    V getValue(K key);

    void get();
}

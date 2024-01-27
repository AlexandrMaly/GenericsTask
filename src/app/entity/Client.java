package app.entity;

public class Client<K,V> {

    private final K key;
    private final V value;

    public Client(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

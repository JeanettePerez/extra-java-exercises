package codewithmosh.generics;

public class KeyValuePair <K,V>{
    private K key;
    private V value;

    public KeyValuePair(K key, V value) { // how to declare multiple type parameters
        this.key = key;
        this.value = value;
    }
}

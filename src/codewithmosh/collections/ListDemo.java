package codewithmosh.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a","b","c");
        // list interface extends the collection interface.
        // all the method in collection is available
        // there is an overload to the add method where you can add an element to an index
        // List supports indexing, collection does not

    }
}

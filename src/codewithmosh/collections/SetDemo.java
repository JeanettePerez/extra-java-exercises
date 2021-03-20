package codewithmosh.collections;


import java.util.*;

public class SetDemo {
    public static void showSet() {
//        Set<String> set = new HashSet<>();
//            set.add("Sky");
//            set.add("is");
//            set.add("blue");
//            set.add("blue");
//        System.out.println(set); // will not return the duplicate
//        // do not rely on the order because it is not guaranteed
// TODO: you have a collection of items and you want to remove the duplicates

//        Collection<String> collection = new ArrayList<>();
//        Collections.addAll(collection, "a", "b","c","c");
//        Set<String> set = new HashSet<>(collection);
//        System.out.println(set); // [a, b, c]
// TODO: Create a new Set of String and by setting it to a new instance of the HashSet.
//      pass in your array as a parameter

        Set<String> set1 = new HashSet<>(Arrays.asList("a","b","c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b","c","d"));

        // === Side note 3 Set operators to use ===
            // Union operation
                // set1.addAll(set2);
                // System.out.println(set1); // [a,b,c,d]
                // returns both sets with no duplication

            // Intersection operation
                // set1.retainAll(set2);
                // System.out.println(set1); // [b,c]
                // returns what they have in common

            // Difference Operation
                // set1.removeAll(set2);
                // System.out.println(set1); // [a]
        // removing everything in set 2 and items in set one that are duplicates of set 2
  }
}

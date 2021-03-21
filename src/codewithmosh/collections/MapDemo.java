package codewithmosh.collections;


import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void showMap(){
// TODO: you have a list of customers and want to look for a
//  customer with a particular email
        var c1 = new Customer("a","e1");
        var c2 = new Customer("b","e2");
        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1); // using email of the customer as a key or String
        map.put(c2.getEmail(), c2);



        // === get(); ===
            // var customer = map.get("e1"); // to get customer from hash type
            // System.out.println(customer); // doesn't matter how big the list of customers is
            // it will get to it quickly
            // if you dont pass anything to the get you will get null

        // === getOrDefault(); ===
            // getOrDefault(key, default customer);
            // var unknown = new Customer("unknown","");
            // var customer = map.getOrDefault("e10", unknown);
            // System.out.println(customer); // returns unknown(what is in the key)
            //  if the key is not in the list

        // === containsKey(); ===
            // will return a boolean
            // var exists = map.containsKey("e10");
            // System.out.println(exists); // false

        // === replace(); ===
            // wanting to replace the customer
            // var customer = map.replace("e1", new Customer("a++", "e1"));
            // System.out.println(map);

        // ====== Iterating when Map isn't iterable

        // === keySet(); ===
//            for (var key : map.keySet())
//                System.out.println(key); // iterates through emails

        // === entrySet(); ===
//            for (var entry : map.entrySet())
////                System.out.println(entry); // iterates key=value pairs
//                System.out.println(entry.getKey()); // iterates the key or email
        // === values(); ===
//            for (var customer : map.values())
//                System.out.println(customer); // iterates customer names or the values of the key value pairs


    }
}

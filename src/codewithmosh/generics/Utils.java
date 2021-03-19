package codewithmosh.generics;
// ========= Generic Methods =========
public class Utils { // make util classes static so you don't have to create an instance of the utils class
    // want the max of two values
    public static <T extends Comparable<T>> T max(T first, T second) { // tell compiler that T is an object that implements comparable interface
        // extend comparable in order for java to know we are comparing objects
        return (first.compareTo(second) < 0) ? second : first;
    }
    // ========= Multiple Type Parameters =========
    // creating a method for printing a key and a value
    public static <K,V> void print(K key, V value) { // when having two type parameters you use K: key and V: value
        System.out.println( key + "=" + value);
    }
    // ========= Generic Classes and Inheritance =========
    public static void printUser(User user) { // here you can pass a User class or any of it's derivatives
        System.out.println(user); // in the main class you can pass a new instance of a user or Instructor in this case
    }

    // when using wildcard compiler creates an anonymous type under the hood called
    // class CAP#1 {} the one represents number of wildcard
    // CAP#1 extends User {} which means you can only pass User or subtype of users
    //
    public static void printUsers(GenericList<? extends User> users) { // ? is the wildcard character and represents an unknown type
        User x = users.get(0); // get returns an instance of the capture class
        // to restrict the type of object that could be passed we extend users
        // extends keyword allows you to read from the list
        // super keyword allows you to add to the list
    }

}

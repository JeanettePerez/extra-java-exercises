package codewithmosh.collections;

public class Customer implements Comparable<Customer>{
    private String name;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }


    @Override
    public int compareTo(Customer other) {
       // this < other -> -1
        // this == other -> 0
        // this > other -> 1
        // comparison operator can only be used for characters or numbers
        // in order to do what we need above we write code like below
        return name.compareTo(other.name); // not very flexible when you want to compare emails or addresses
    }

    @Override
    public String toString() {
        return name; // you want it to return the name of the customer when converting to a string
    }
}

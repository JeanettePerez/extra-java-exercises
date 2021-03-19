package codewithmosh.generics;
// how to implement Comparable Interface
public class User implements Comparable<User>{ // always specify the generic type argument
    private int points; // initialize it in our constructor

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User other) {
        // if the current user object is less than other user object
        // than return a negative value. this < o -> -1
        // if they are equal then return 0. this  == o -> 0
        // if the current user object is greater than the other user object then
        // return positive value this > o -> 1
        return points - other.points;
        // if the user has more points than the other user then result is positive
        // if equal it is 0
        // if the user has less points than o.points it'll be zero


    }

    @Override
    public String toString() { // in order to get the output ** in main section Generic Methods
        return "points= " + points;
    }
}

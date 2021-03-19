package codewithmosh.generics;
// common misunderstand:
    //
public class Instructor extends User{
    // before building a constructor you will have an error
    // because of the constructor to pass number of points in the User class
    // the instructor class doesn't know what values to pass to the parent constructor
    // custom constructor will fix this
    public Instructor(int points) {
        super(points);
    }
}

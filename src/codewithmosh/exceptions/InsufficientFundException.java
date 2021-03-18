package codewithmosh.exceptions;


// Checked -> extend the exception class
// unchecked (runtime) -> extend the runtime exception class
public class InsufficientFundException extends Exception {
    //this is a checked exception because is something
    // we are anticipating and should recover from
    // we do this by adding extends Exception in the method declaration
    // in order to create a custom exception
    // optional we can add a constructor that takes a message
    public InsufficientFundException(){
        super("Insufficient funds in your account"); // if a message isn't supplied this will be used
    }
    public InsufficientFundException(String message) {
        super(message); // pass the argument to the constructor of the parent class
    }



}

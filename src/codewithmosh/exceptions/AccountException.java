package codewithmosh.exceptions;

public class AccountException extends Exception{
    // a similar way to chain exception is to add a custom constructor that
    // takes the cause of the exception
    public AccountException(Exception cause) {
        // use super keyword to pass this object to one of the constructors in the base class
        super(cause);
    }
}

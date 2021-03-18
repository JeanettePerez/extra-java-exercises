package codewithmosh.exceptions;

import java.io.IOException;

public class Account {
   // private float balance; // for custom exceptions and Chaining exceptions

    // ========= Throwing a unchecked exception
//    public void deposit(float value) {
//        if(value <= 0)
//            throw new IllegalArgumentException(); // unchecked exceptions program error. defensive programming
//    }
    // ========= Throwing a checked exception
// this exception needs to be handle instead of a try catch block
// you can put throws IOException after the parameter to tell your application
// that this could throw a possible error.
//public void deposit(float value) throws IOException {
//    if(value <= 0)
//        throw new IOException();
//}
    // ========== Custom Exceptions
//public void deposit(float value) throws IOException {
//    if(value <= 0)
//        throw new IOException();
//}
//    public void withdraw(float value) throws InsufficientFundException {
//        if (value > balance)
//            throw new InsufficientFundException();// this will be an unintentional event we want to recover from
//    }
    // ========= Chaining Exceptions
    // this is when you wrap an Exception in a more general exception
    // used when building library's build a general exception to figure out what caused it
    // Steps:
    //      1. make a class that extends Exception Class
    //      2. create a code block that hold a new InsufficientFundsException object
    //      3. create a new AccountException object from the class we created not java
    //      4. the accountException was caused by fundsException so we attach initCause which passes a throwable object
    //      5. pass an instance of the throwable class or any of it's derivatives
//    public void deposit(float value) throws IOException {
//        if (value <= 0)
//            throw new IOException();
//    }
//
//    // === with no custom constructor in AccountExceptions class
////    public void withdraw(float value) throws AccountException{
////        if (value > balance) {
////            var fundsException = new InsufficientFundException();
////            var accountException = new AccountException();
////            accountException.initCause(fundsException);
////            throw accountException; //
////        }
////    }
//    // === with custom constructor in AccountException class
//    public void withdraw(float value) throws AccountException {
//        if (value > balance)
//            throw new AccountException(new InsufficientFundException());
//    }
}

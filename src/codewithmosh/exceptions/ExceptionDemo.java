package codewithmosh.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo {
    // ========= what is an exception
//    public static void show(){
//        sayHello(null); // when the show method is called you will get a NullPointerException
//                            // which is a class declared in the java.lang package
    // this is an unchecked exception
//    }
//
//    public static void sayHello(String name) {
//        System.out.println(name.toUpperCase());
//    }
    // ========= types of Exceptions
//    public static void show() {
//    // checked: checked at compile time
//        //var reader = new FileReader("file.txt");
//            //the code above will be underlined red and show in
//            // problems to tell you that the file does not exist
//            // this is an example of checked exceptions
//    // unchecked: checked at runtime
//
//
//    }
    // ========= Catching Exceptions
//    public static void show() {
//        // wrapping the code in a try block to handle an error
//        // the proper way to handle checked exceptions
//        try {
//        var reader = new FileReader("file.txt");
//        System.out.println("file opened");
//        } catch (FileNotFoundException ex) { // ex is the instance of the FileNotFoundException
//            System.out.println("File does not exist");
//            System.out.println(ex.getMessage()); // file.txt (No such file or directory)
//        }
//    }
    // ========= Catching Multiple Exceptions
//    public static void show() {
//
//        try {
//            var reader = new FileReader("file.txt");
//            var value = reader.read();
//            new SimpleDateFormat().parse("");
//        }
//        catch (IOException | ParseException e) { // can catch type IOExceptions or ParseExceptions. IOExceptions can catch FileNotFoundExceptions
//            System.out.println("Could not read data");
//        }
//    }
    // ========= The finally block
//    public static void show() {
//        FileReader reader = null; // in order for the reader to be recognized in the finally block
//        try {
//            reader = new FileReader("file.txt");
//            // if we open a file we should also close it
//            // if this file existed and tried to open to read
//            // when every you get the FileReader to read  a file you should always release them
//            // other process won't be able to access the resources
//            var value = reader.read(); // if something goes wrong here we couldnt close the file
//            // reader.close(); this would give us a problem of never being able to close the reader
//
//        }
//        catch (IOException e) {
//            System.out.println("Could not read data");
//        }
//        finally { // in order to close the reader even if an exception is thrown
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
    // although this is very messy the take away is that the finally block will always get executed
    // ========= the try-with-resources Statement
    // a better way to close a resource
//    public static void show() {
//
//        try (
//                var reader = new FileReader("file.txt");
//                var writer = new FileWriter("...")
//        ) {  // declare and initialize our resources in the try statement it is called a try with resource statement
//            // with the structure above the compile will add the finally block and explicitly close the object
//            // in order for it to work we have to implement the AutoClosable Interface
//            var value = reader.read();
//
//        } catch (IOException e) {
//            System.out.println("Could not read data");
//        }
//    }
    // ======== Throwing Exceptions
    //=== unchecked
//    public static void show() {
//        var account = new Account();
//        account.deposit(-1);
//    }
    // === checked exception
//    public static void show() throws IOException{
//        var account = new Account();
//        try {
//            account.deposit(-1); // this will give a "did not handle error exception and is
//        } catch (IOException e) {
//           // e.printStackTrace(); // instead of this we are printing logging
//            System.out.println( "logging");
//            throw e; // this will give you an error that you have to add throw IOException into the method declaration
//        }
    // where you would do a try catch block
    // in real world application you want to store the catched exceptions in a file or database
    // in order to see the error had in the application

    // ========= Custom Exceptions
//    public static void show() {
//        var account = new Account();
//        try {
//            account.withdraw(10);
//        } catch (InsufficientFundException e) {
//            System.out.println(e.getMessage());
//        }
//    }
    // ========= Chaining Exceptions
//    public static void show() {
//        var account = new Account();
//        try {
//            account.withdraw(10);
//        } catch (AccountException e) {
//            e.printStackTrace(); // traces where the exception was thrown
//            var cause = e.getCause();
//            System.out.println(cause.getMessage()); // will print out the cause of the error
//        }
//    }
}

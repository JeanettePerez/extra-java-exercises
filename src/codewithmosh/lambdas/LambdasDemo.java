package codewithmosh.lambdas;

import java.util.List;
import java.util.function.*;

public class LambdasDemo {
//    public static String prefix = "-"; // used for E3


//      === E4.1 referencing static
// signature matches Printer interface
//    public static void print(String message) {}

//      === E4.2 referencing instance
//    public void print(String message) {}
//      === E4.3 referencing Constructor
//    public LambdasDemo(String message){
//        System.out.println("this will display in the console from E4.3");
//    }



    public static void showLambdas() {
        // ========== example of a Anonymous inner class ========= E1
//        greet(new Printer() {
//            @Override
//            public void print(String message) {
//                System.out.println(message);
//            }
//        });
//
    // ========== example of lambdas expression ==========E2
//        greet(message -> System.out.println(message)); // in the parenthesis you want to pass an implementation of the anonymous function
// ========== Variable Capture ========= E3

//        greet(message -> System.out.println(prefix + message));
        // can only access local variables in the enclosing object
        // as well as static or instance fields in the enclosing class
// ========== Method Referencing ========= E4
//      === static E4.1 - top
//         greet(LambdasDemo::print);
//      === Instance E4.2
//        var demo = new LambdasDemo();
//        greet(demo::print);
//      === Constructor E4.3
//        greet(LambdasDemo::new);
// ========== using Consumer interface ==========
//        List<Integer> list = List.of(1,2,3);
//        list.forEach(item -> System.out.println(item)); // for each item in this list print it
// ========== Chaining Consumer ==========
//        List<String> list = List.of("a","b","c");
//        Consumer<String> print = item -> System.out.println(item); // declaring an operation named print that names and item and prints it on a terminal
//        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
//        // TODO: iterate over the list and for each item we want to execute the two operations in sequence
//        list.forEach(print.andThen(printUpperCase)); // for each item we are going to print it then print it in uppercase
// ========== The supplier Interface ==========
//        Supplier<Double> getRandom = () -> Math.random(); // function is not executed till we call it
//        var random = getRandom.get(); // how we call it
//        System.out.println(random);
// =========== The function Interface ==========
//       // Function<String, Integer> map = str -> str.length();
//        Function<String, Integer> map = String::length; // can also use this
//        var length = map.apply("sky");
//        System.out.println(length);
// ========== Composing Functions ===========
// TODO: take a string in the format "key:value" pass the string through two transformations it to
//  first: "key=value" and second: "{key=value}". declare two small functions and compose them to a larger more complex function

//       Function<String, String> replaceColon = str -> str.replace(":","=");
//       Function<String, String> addBraces = str -> "{" + str + "}";
//       // you can either do result1 or result2 they will give you the same results
//
//       var results1 = replaceColon
//               .andThen(addBraces)
//               .apply("key:value");
//
//       var results2 = addBraces.compose(replaceColon).apply("key:value"); // same as above
//        System.out.println(results1);
//        System.out.println(results2);
// ========== The predicate Interface ==========
        Predicate<String> isLongerThan5 = str -> str.length() > 5;
        // var results = isLongerThan5.test("sky"); // example of how to call it

// =========== Combining Predicates ==========
    // combining predicates to make more complex predicates
//        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
//        Predicate<String> hasRightBrace = str -> str.endsWith("}");
//
//        // this will bring up
//        // .add() // &&
//        // .or() // ||
//        // .negate() // returns the opposite of the first argument
//        Predicate<String> hasLeftAndRightBraces = hasLeftBrace.and(hasRightBrace);
//        hasLeftAndRightBraces.test("{This will return true because both curly braces are present}");
// ========== BinaryOperator Interface ==========
//        BinaryOperator<Integer> add = (a,b) -> a + b;
//        Function <Integer, Integer> sqaure = a -> a * a;
//        var results = add.andThen(sqaure).apply(1,2);
//        System.out.println(results);
        // if working wth large number of primitive integers
        // use IntBinaryOperator for faster processing
// ========== UnaryOperator ===========
//        TODO: increment a value and get the square of the result
//    UnaryOperator<Integer> square = n -> n * n;
//    UnaryOperator<Integer> increment = n -> n + 1;
//
//    var result1 = increment.andThen(sqaure).apply(1); // 1 is the number we are incrementing andThen squaring
//        System.out.println(result1);


    }



    public static void greet(Printer printer) { // used in E1, E2. E3
        printer.print("Hello World");
    }

    public static void main(String[] args) {
        showLambdas();
    }

}

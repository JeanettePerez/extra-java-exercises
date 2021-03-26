package codewithmosh.lambdas;

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




    }



    public static void greet(Printer printer) { // used in E1, E2. E3
        printer.print("Hello World");
    }

    public static void main(String[] args) {
        showLambdas();
    }

}

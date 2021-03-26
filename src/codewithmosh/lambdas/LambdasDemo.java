package codewithmosh.lambdas;

public class LambdasDemo {

    public static void showLambdas() {
        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
    }
    public static void greet(Printer printer) {
        printer.print("Hello World");
    }

    public static void main(String[] args) {
        showLambdas();
    }

}

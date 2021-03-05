public class CreatingMethod {

    public static void main(String[] args) {
       String message = greetUser("Jeanette", "Perez"); // Hello Jeanette Perez
        System.out.println(message);
    }

    // creating methods to pass into main to have cleaner code
    // greetUser will return an input so
    // declare String variable called name
    // name is a parameter of the method
    // you can write code within a method to be later passed
    // in the main. keeps main from being cluttered 
    public static String greetUser(String firstName, String lastName) {
        return "Hello, " + firstName + " " + lastName; // returning a value
    }

}

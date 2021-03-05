import com.sun.security.jgss.GSSUtil;

import java.util.Locale;
import java.util.Scanner;

public class ControlFlow {

    public static void main(String[] args) {
        // Temp if statements
//       int temp = 32;
//       if(temp > 30) {
//           System.out.println("It's a hot day");
//           System.out.println("Drink Water");
//       }
//       else if(temp > 20 && temp <= 30)
//           System.out.println("Beautiful day");
//       else
//           System.out.println("cold day");

       // Simplifying If Statements
//        int income = 120_000;
//        boolean hasHighIncome = (income > 100_000);

    // The Ternary Operator
//        int income = 120_000;
//        String className;
//        if(income >100_000)
//            className = "First";
//        else
//            className = "Economy";
//  refactored above to be a ternary Operator
//        int income = 120_000;
//        String className = income > 100_000 ? "First" : "Economy";
//        System.out.println(className);
//  Switch Statements
//    String role = "admin";
//
//    switch (role) {
//        case "admin":
//            System.out.println("You're an admin");
//            break;
//        case "moderator":
//            System.out.println("You're a moderator");
//            break;
//        default:
//            System.out.println("You're a guest");
//    }
// FizzBuzz
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter a number between 1 to 100: ");
//        int num = sc.nextInt();
//        if ((num % 3 == 0) && (num % 5 == 0))
//            System.out.println("FizzBuzz");
//        else if(num % 3 == 0)
//            System.out.println("Fizz");
//        else if (num % 5 == 0)
//            System.out.println("Buzz");
//        else
//        System.out.println(num);
//  While loop
        // writing a program where you ask the user to continuously write something until they type quit
        // when they type quit terminate the program
//            Scanner sc = new Scanner(System.in);
//            String input = "";
//            while (!input.equalsIgnoreCase("quit")) {
//                System.out.print("input: ");
//                input = sc.next();
//                if(!input.equalsIgnoreCase("quit"))
//                    System.out.println(input);
//            }
//  break and continue
//        Scanner sc = new Scanner(System.in);
//        String input = "";
//        while (true) { // if using while true you need a break statement
//            System.out.print("input: ");
//            input = sc.next();
//            if(input.equalsIgnoreCase("pass"))
//                continue; // moves control to the begin of the loop
//            if(input.equalsIgnoreCase("quit"))
//                break; // breaks out of the loop so quit will not be displayed
//                System.out.println(input);
//        }
// for-each loop
        String[] fruits = { "Apple", "Mango", "Orange"};
        // iterating through with a for loop
            for (int i = 0; i < fruits.length; i++)
                System.out.println(fruits[i]);
        // iterating through with a for each loop
        // limitations is it is forward only. can't go from last index to first
        // also we don't have access to the index of the item
            for (String fruit : fruits)
                System.out.println(fruit);



    }

}

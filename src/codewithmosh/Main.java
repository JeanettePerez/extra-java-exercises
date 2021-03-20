package codewithmosh;

//import codewithmosh.collections.CollectionsDemo;
import codewithmosh.collections.Customer;
import codewithmosh.collections.EmailComparator;
import codewithmosh.collections.ListDemo;
import codewithmosh.exceptions.ExceptionDemo;
import codewithmosh.generics.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//   ======== classes and objects ========
//        TextBox textBox1 = new TextBox();
//        TextBox textBox2 = textBox1;
//
//        textBox2.setText("Hello World");
//        System.out.println(textBox1.text);

//  ========= Encapsulation =========
//    Employee employee = new Employee();
//    employee.baseSalary = 50_000;
//    employee.hourlyRate = 20;
//    int wage = employee.calculateWage(10);
//        System.out.println(wage);
// the issue with this code is there are no conditions
// that code lead to a bug later if the numbers are set to
// things that are not in range.

// ========= Getters and Setters - title =========
        // Employee employee = new Employee();
        // one way to fix the problem from above
        // is writing an if statement, but you would
        // have to write it everywhere and it will
        // get messy. instead we want to encapsulate the
        // logic in the Employee class.
        // step one: hide employee.baseSalary field so
        // it's not accessible outside the employee class
        // declare a method employee.setBaseSalary(-1);
//        employee.setBaseSalary(50000);
//        employee.setHourlyRate(-1);
//        int wage = employee.calculateWage(10);
//        System.out.println(wage);
        //  the problem with this code is that you would have to write it in the correct
        // order and others don't have the correct information in order to write it correctly
        // fixing this problem below
// ========= Constructors =========
//        Employee employee = new Employee(
//                50_000, 20); // job of constructors is to initialize our fields to a default value
//        Employee.printNumberOfEmployees(); // now the employee class has two members on field and one method
//        // === default values ===
//            //  booleans are false
//            //  numbers are zero
//            //  reference types are null
//        int wage = employee.calculateWage(10);
//        System.out.println(wage);
// ========= Mortgage calculator =========

//        int principal = (int) Console.readNumber("Principal: ", 1_000, 1_000_000);
//        float annualInterest = (float) Console.readNumber("Annual Interest rate: ", 1, 30);
//        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);
//
//        var calculator = new MortgageCalculator(principal, annualInterest, years);
//        var report = new MortgageReport((calculator));
//
//        report.printMortgage();
//        report.printPaymentSchedule();

// ========= Inheritance lesson =========
//        var control = new TextBox(); // because the TextBox class extends the UIControl class it has all the methods of UIControl
//        control.disable();
//        System.out.println(control.isEnabled());
// ========= Constructors and inheritance =========
//        var textBox = new TextBox();
// ========= UpCasting and DownCasting
//        var control = new UIControl(true);
//        var textbox = new TextBox();
//        show(textbox);
//// ========= Comparing objects =========
//        var point1 = new Point(1, 2);
//        var point2 = new Point(1, 2);
////        System.out.println(point1 == point2); // false, both are reference types so value stored is address in memory
////        System.out.println(point1.equals(point2)); // false, default is to compare objects based on their references
//        // the two sout above are reasons to override the equals method
//        System.out.println(point1.equals(point2)); // after override. True
//        // after overriding the hash method
//        System.out.println(point1.hashCode()); // 994, the both have the same hasCode because it is based on the content of the objs
//        System.out.println(point2.hashCode()); // 994,
//        // the original hasCode compares objs based on the reference in memory
// ========= Polymorphism ========
        //   create an array of control objects and render each object on the console
//        UIControl[] controls = { new TextBox(), new CheckBox() }; // you can do this if you need to render a form with multiple boxes
//        // in order to not have a big if statement we make a render method in the parent and override it in the child
//            for (var control : controls) // control is taking many forms when it is being iterated through
//                control.render(); // polymorphism
// ========= Creating an Interface

        // === Constructor Injection: more common
        // hand writing a dependency is what they call poor man dependency injection
        // in larger applications you have 100s of classes with larger dependency so you shouldn't
        // create objects and pass them to constructors of your classes.
        // spring is a dependency injection framework
//    var calculator = new TaxCalculator2018(100_000);
//    var report = new TaxReport(calculator);

        // === Setter Injection: only use if this is what you need
        // change the dependency of a class throughout the lifetime of an application
        // allows us to change the dependency of the class at runtime
        // but you have to remember to call it
//        var calculator = new TaxCalculator2018(100_000);
//        var report = new TaxReport(calculator); // calculator the new instance of TaxCalculator2018 which is a parameter of the TaxReport constructor
//        report.show(); // show method when it didnt have a parameter
//
//        // below uses the setter method
//        report.setCalculator(new TaxCalculator2019()); // calling our setter and passing an instance of a class
//        report.show(); // show method when it didn't have a parameter

        // === Method Injection
        // passing a dependency to the method that needs that dependency
//        var calculator = new TaxCalculator2018(100_000);
//        var report = new TaxReport();
//        report.show(calculator); // passing the instance of TaxCalculator2018
//        report.show(new TaxCalculator2019()); // when you want to show the report again you can pass a new dependency
// === Interface Segregation Principle
        // based on the principle we should segregate or divide interfaces into smaller ones
        // reduces the impact of changes
// ========= Exceptions =========
        // === What is an exception
//        ExceptionDemo.show(); // unchecked exception
        // === Catching exceptions
//        try {
//            ExceptionDemo.show();
//        } catch (Throwable e) { // throwable is th parent to all exceptions and errors in java
//            System.out.println("An exception error occurred ");
//        }
// ========= The need for Generics =========
        // Integer list
//       var list = new GenericList<Integer>(); // in the <> you store the type of object you want as the list
//        list.add(1);
//       int number = list.get(0);
        // User list
//      var list = new GenericList<User>();
//      list.add(new User());
//      User user = list.get(0);
        // generics will help you catch mistakes at compile time
// ========= Generics and Primitive Types =========
//    GenericList<Integer> numbers = new GenericList<>();
//    numbers.add(1); // the java compiler will create an instance of the Integer class to store the numeric value
//        // the process above is called boxing
//    int number = numbers.get(0); // unboxing
        // above is how to create primitive types that work with primitive values
        // can only store reference types in this GenericList
        // if you wat to store primitive type in the GenericList you have to use the
        // the wrapper class
        //   int -> Integer
        //   float -> Float
        //   boolean -> Boolean


// =========== Comparable Interface
//        var user1 = new User(10);
//        var user2 = new User(20);
//        // < and > are used to compare numbers and characters not reference types
//        if (user1.compareTo(user2) < 0)// to compare to user objects then check if the result is less than zero
//            System.out.println("user1 is less than user1");
//        else if (user1.compareTo(user2) == 0)
//            System.out.println("user1 is equal to user2");
//        else
//            System.out.println("user1 is greater than user2");
// ========= Generic Methods
        // create a generic method in a none generic class
        // getting the max number between the integers
//        var max1 = Utils.max(1, 3);
//        System.out.println(max1);
//
//        //
//        var max2 = Utils.max(new User(10), new User(20));
//        System.out.println(max2); // have to override the two string in order to get the correct output
// ========= Multiple Type Parameters
//    Utils.print(1, 10); // you can do different type parameters
//    }
// ========= Generic Classes and Inheritance
// if you have a variable of type user we can set it to an instance of user or it's derivatives
// however if you were wanting a list of instructors you have to do extra steps
// a generic list of instructors is not a subtype of User
        // generic list are single class use
//        var instructors = new GenericList<Instructor>();
//        var users = new GenericList<User>(); // to fix this problem is using a wildcard
//        Utils.printUsers(instructors); // with the wildcard you can pass instructors into printUsers
//  ========= The need for Iterables / The Iterable Interface
       // problem1: how to iterate over a list and not know anything about it's implementation
        // solution1: is to implement The iterable Interface
//        var list = new GenericList<String>();
//        var iterator = list.iterator(); // how we loop over our list without knowing anything about implementation
//
//        while (iterator.hasNext()) { // the loop is asking "do you have more items" condition is true while there are still items in the list
//            var currentObject = iterator.next(); // return the current object. will loop through until the condition is false
//            System.out.println(currentObject);
//        }
        // syntax sugar: use a for loop instead of the while. the compiler does the conversion for you
        // Getting an array list of unknown using a for loop
//        var list = new GenericList<String>();
//        list.add("a");
//        list.add("b");
//        for (var item : list)
//            System.out.println(item);
// ========== Collection Interface
       // CollectionsDemo.show();
// ========== List Interface
      //  ListDemo.show();
// ========== Comparable Interface
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("b" , "e3"));
        customers.add(new Customer("a", "e2"));
        customers.add(new Customer("c", "e1"));
        Collections.sort(customers, new EmailComparator());
        System.out.println(customers);
// ========== Queue Interface





    }














    // Upcasting and DownCasting
//    public static void show(UIControl control) {
//        if (control instanceof TextBox) {
//            var textBox = (TextBox) control;
//            textBox.setText("Hello World");
//        }
//        System.out.println(control);
//    }

}




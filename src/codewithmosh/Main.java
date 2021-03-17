package codewithmosh;

import codewithmosh.exceptions.ExceptionDemo;

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
        ExceptionDemo.show();





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



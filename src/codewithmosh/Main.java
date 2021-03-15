import org.w3c.dom.Text;

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
        var control = new UIControl(true);
        var textbox = new TextBox();
        show(textbox);
    }

    public static void show(UIControl control) {
        if (control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("Hello World");
        }
        System.out.println(control);
    }

}



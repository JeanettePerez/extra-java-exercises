
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        final byte MONTHS_IN_YEAR = 12;
//        final byte PERCENT = 100;
//
//        int principal = 0;
//        float monthlyInterest = 0;
//        int numberOfPayments = 0;
//
//        Scanner sc = new Scanner(System.in);
//
//        while(true) {
//            System.out.print("Principal ($1k - $1M): ");
//            principal = sc.nextInt();
//            if (principal >= 1000 && principal <= 1_000_000)
//                break;
//            System.out.println("Enter a number between 1,000 and 1,000,000.");
//        }
//
//        while (true) {
//            System.out.print("Annual Interest rate: ");
//            float annualInterest = sc.nextFloat();
//            if(annualInterest >= 1 && annualInterest <= 30) {
//                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
//                break;
//            }
//            System.out.println("Enter a value between 1 and 30");
//        }
//
//        while (true) {
//            System.out.print("Period (Years): ");
//            byte years = sc.nextByte();
//            if(years >= 1 && years <= 30) {
//            numberOfPayments = years * MONTHS_IN_YEAR;
//                break;
//            }
//            System.out.println("Enter value between 1 and 30");
//        }
//
//        double mortgage = principal
//                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
//                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
//
//        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.print("Mortgage: " + mortgageFormatted);
// ======= refactored mortgage calculator
        // when refactoring into methods
        //  1. look for lines of code that go together.
        //      putting the calculations together. that way you can use the method later
        //  2. What is repetitive. where is the pattern
        //      looking at the while loop statements

       int principal = (int) readNumber("Principal: ", 1_000, 1_000_000);
       float annualInterest = (float) readNumber("Annual Interest rate: ", 1, 30);
       byte years = (byte) readNumber("Period (Years): ", 1, 30);

        double mortgage = calculateMortgage(principal, annualInterest, years);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " + mortgageFormatted);

    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if(value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }

    // using a double as the return type because it is the data type we use for storing methods
    // as parameters we add what we are calculating with the correct data type
    public static double calculateMortgage(
            int principal,
            float annualInterest,
            byte years) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return mortgage;
    }

}
// java virtual machine takes out ByteCode and translates it
// the native code for the underline operating system
package codewithmosh;

public class TaxReport {

    // we want our TaxReport class to be dependent on a interface
    private TaxCalculator calculator;


    // Constructor injection: injecting a dependency using the constructor
//    public TaxReport(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }

    public void show(TaxCalculator calculator) {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
    // setter injection: the benefit is that we can change the dependency throughout the life time of the program

//    public void setCalculator(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }
//}
}
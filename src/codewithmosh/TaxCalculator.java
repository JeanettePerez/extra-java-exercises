package codewithmosh;


// when creating interfaces you want to make sure they are small and light weight.
// so they are less likely to change
public interface TaxCalculator {
    // only have method declarations that determine what needs to be done
    // this is a public contract
    double calculateTax();

}

package codewithmosh;

public class Employee {

    private int baseSalary; // implementation details
    private int hourlyRate;

    public static int numberOfEmployees;

    public Employee(int baseSalary, int hourlyRate) { // creating a constructor. they dont need a return type
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++; // everytime you create a new employee object increment number of employees
    }

    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmployees);
    }
    public Employee(int baseSalary){ // this is if you have employees that can't get extra hour.
        this(baseSalary, 0); // this is constructor overloading
    }


    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
    public int calculateWage() {
        return calculateWage(0);
    }

    private void setBaseSalary(int baseSalary) {
        if(baseSalary <= 0 )
            throw new IllegalArgumentException("Salary can not be zero or less");
        this.baseSalary = baseSalary;
    }
    private int getBaseSalary() {
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if(hourlyRate <= 0)
            throw new IllegalArgumentException("hourly rate can not be zero or less");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate(){
        return hourlyRate;
    }

}

package lv.lu.training.lesson8.homework2;

public class HourlyEmployee extends Employee {
    private int hoursWorked;
    private double payRate;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double payRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.payRate = payRate;
    }

    @Override
    public double pay() {
        return hoursWorked * payRate;
    }

    public void addHours(int hours) {
        hoursWorked += hours;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getPayRate() {
        return payRate;
    }

    @Override
    public String toString() {
        return "Hourly employee: Employee " + getFirstName() + " " + getLastName() + "  " + getSocialSecurityNumber() + " rate: " + getPayRate() +
                " hours worked: " + hoursWorked;

    }
}
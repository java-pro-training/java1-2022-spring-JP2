package lv.lu.training.lesson8.homework2;

public class HourlyEmployee extends Employee {
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double payRate) {
        super(firstName, lastName, socialSecurityNumber);
    }
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }
    public void addHours(int hours) {
        hoursWorked += hours;
    }

    private int hoursWorked;
    private double payRate;

    @Override
    public double pay() {
        double result = hoursWorked * payRate;
        hoursWorked = 0;
        return result;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "firstName='" + firstName +
                ", lastName='" + lastName +
                ", socialSecurityNumber='" + socialSecurityNumber +
                ", salary=" + salary +
                ", hoursWorked=" + hoursWorked +
                ", payRate=" + payRate +
                '}';
    }
}

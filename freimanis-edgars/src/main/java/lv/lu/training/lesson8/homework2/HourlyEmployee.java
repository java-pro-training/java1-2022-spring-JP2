package lv.lu.training.lesson8.homework2;

public class HourlyEmployee extends Employee {
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
    private int hoursWorked;
    private double payRate;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double payRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.payRate=payRate;
    }
    public void addHours(int hours) {
        hoursWorked += hours;
    }


    @Override
    public double pay() {
        double result = hoursWorked * payRate;
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

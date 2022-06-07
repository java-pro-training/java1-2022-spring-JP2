package lv.lesson8.homework.part2;

public class HourlyEmployee extends Employee {

    public void setHoursWorked(int hoursWorked) {this.hoursWorked = hoursWorked;}
    public void setPayRate(double payRate) {this.payRate = payRate;}
    public int getHoursWorked() {return hoursWorked;}
    public double getPayRate() {return payRate;}

    int hoursWorked;
    double payRate;

    public HourlyEmployee(String firstName, String lastName, String SSN, double payRate) {
        super(firstName, lastName, SSN);
        this.payRate = payRate;
    }

    void addHours(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double pay() {
        double result = hoursWorked * payRate;
        hoursWorked = 0;
        return result;
    }

    @Override
    public String toString(){
        return "hourly employee: Employee " + getFirstName() +
                " " + getLastName() +
                ", SSN: " + getSSN() +
                ", rate: $" + getPayRate() +
                ", hours worked N: " + getHoursWorked() +
                ".";
    }
}

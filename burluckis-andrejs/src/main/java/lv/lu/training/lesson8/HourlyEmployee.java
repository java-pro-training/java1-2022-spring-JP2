package lv.lu.training.lesson8;

public class HourlyEmployee extends Employee {
    private int hoursWorked;
    private double payRate;

    @Override
    public double Pay() {
        return hoursWorked * payRate;
    }
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double payRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.payRate = payRate;
    }
    public void setHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    public int getHoursWorked(){
        return hoursWorked;
    }
    public void setPayRate(int payRate){
        this.payRate = payRate;
    }
    public double getPayRate(){
        return payRate;
    }
    public void addHours(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    @Override
    public String toString(){
        return "Hourly employee: Employee " + getFirstName() + " " + getLastName() + " " + getSocialSecurityNumber() + " Rate: " + getPayRate() + " hours worked: " + getHoursWorked();
    }
}

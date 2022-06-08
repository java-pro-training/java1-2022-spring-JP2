package lv.lesson8.homework.part2;

public class SalariedEmployee extends Employee{

    public void setWeeklySalary(double weeklySalary) {this.weeklySalary = weeklySalary;}
    public double getWeeklySalary() {return weeklySalary;}

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String SSN, double weeklySalary) {
        super(firstName, lastName, SSN);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double pay() {
        return weeklySalary;
    }

    @Override
    public String toString(){
        return "salaried employee: Employee " + getFirstName() +
                " " + getLastName() +
                ", SSN: " + getSSN() +
                ", Weekly salary: $" + getWeeklySalary() +
                ".";
    }
}

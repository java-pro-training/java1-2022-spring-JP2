package lv.lu.training.lesson8homework2;

public class SalariedEmployee extends Employee {
    //Šajā klasē ievietojam laukus “double weeklySalary”.

    double weeklySalary;

    //Konstruktors
    public SalariedEmployee(String firstName, String lastName, String SSN, double weeklySalary) {
        super(firstName, lastName, SSN);
        this.weeklySalary =weeklySalary;
    }


    //aizvietojam (override) metodi pay kura atgriež weeklySalary.

    @Override
    public double pay() {
        return weeklySalary;
    }

    //Pievienojiet seteru un geteru metodes visiem laukiem

    //Set and Get weekly Salary
    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    public double getWeeklySalary () {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return "Salaried employee: Employee " + getFirstName() + " " + getLastName() + "  "+ getSSN() + " weekly salary: " + getWeeklySalary();
    }
}

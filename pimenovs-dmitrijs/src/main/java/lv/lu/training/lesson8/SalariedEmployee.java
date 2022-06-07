package lv.lu.training.lesson8;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String SSN,double weeklySalary){
        super (firstName, lastName, SSN);
        this.weeklySalary=weeklySalary;
    }
    @Override
    public double pay(){
return weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return "Salaried Employee: Employee " + getFirstName() +
                " " + getLastName() +
                " " + getSSN() +
                " Weekly Salary: " + getWeeklySalary();
    }
}

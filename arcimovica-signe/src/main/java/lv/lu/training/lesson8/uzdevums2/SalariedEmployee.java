package lv.lu.training.lesson8.uzdevums2;

public class SalariedEmployee extends Employee {

    private double weeklySalary;

    @Override
    public double pay(){
        return weeklySalary;
    }

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary){
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public String toString(){
        return "SalariedEmployee{" +
                "firstName='" + getFirstName() +'\'' +
                ", lastName='" + getLastName() +'\'' +
                ", socialSecurityNumber='" + getSocialSecurityNumber() +'\'' +
                ", salary='" + getSalary() +'\'' +
                ", weeklySalary='" + weeklySalary +'\'' +
                "}";
    }
}

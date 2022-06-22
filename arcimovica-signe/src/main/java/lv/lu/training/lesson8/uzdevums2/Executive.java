package lv.lu.training.lesson8.uzdevums2;

public class Executive extends Employee{

    private double bonus;

    public Executive(String firstName, String lastName, String socialSecurityNumber, double salary){
        super(firstName, lastName, socialSecurityNumber, salary);
    }

    public void awardBonus(double bonus){this.bonus += bonus;}

    @Override
    public double pay(){return super.pay() + bonus;}

    @Override
    public String toString(){
        return "SalariedEmployee{" +
                "firstName='" + getFirstName() +'\'' +
                ", lastName='" + getLastName() +'\'' +
                ", socialSecurityNumber='" + getSocialSecurityNumber() +'\'' +
                ", salary='" + getSalary() +'\'' +
                ", salary plus bonus='" + pay() +'\'' +
                "}";
    }
}

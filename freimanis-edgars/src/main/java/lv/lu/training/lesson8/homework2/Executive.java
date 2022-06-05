package lv.lu.training.lesson8.homework2;

public class Executive extends Employee {

    private double bonus;

    public Executive(String firstName, String lastName, String socialSecurityNumber, double salary) {
        super(firstName, lastName, socialSecurityNumber, salary);
    }

    public void awardBonus(double bonus) {
        this.bonus += bonus;
    }

    @Override
    public double pay() {
        return pay() + bonus;
    }

    @Override
    public String toString() {
        return "Executive{" +
                "firstName='" + firstName +
                ", lastName='" + lastName +
                ", socialSecurityNumber='" + socialSecurityNumber +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
}
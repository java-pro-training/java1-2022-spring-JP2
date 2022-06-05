package lv.lu.training.lesson8.homework2;

public class Executive extends Employee {

    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    private double getBonus()

    {
        return bonus;
    }
        private double bonus;


    public Executive(String firstName, String lastName, String socialSecurityNumber, double salary) {
        super(firstName, lastName, socialSecurityNumber, salary);
    }

    @Override
    public double pay() {
        double result = getSalary() + getBonus();
               return result;
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
package lv.lu.training.lesson8.homework2;

public class Executive extends Employee {
    private double bonus;

    public Executive(String firstName, String lastName, String socialSecurityNumber, double salary) {
        super(firstName, lastName, socialSecurityNumber, salary);
    }

    public void awardBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double pay() {
        return super.pay() + bonus;
    }

    @Override
    public String toString() {
        return "Executive employee: Employee " + getFirstName() + " " + getLastName() + "  " + getSocialSecurityNumber() + " bonus: " + getBonus() + " salary plus award: " + pay();
    }
}

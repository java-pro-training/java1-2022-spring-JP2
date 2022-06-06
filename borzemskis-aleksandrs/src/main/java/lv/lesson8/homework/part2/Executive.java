package lv.lesson8.homework.part2;

public class Executive extends Employee {

    public void setBonus(double bonus) {this.bonus = bonus;}
    public double getBonus() {return bonus;}    private double bonus;

    public Executive(String firstName, String lastName, String SSN, double salary) {
        super(firstName, lastName, SSN, salary);
    }

    void awardBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double pay() {
        double result = getSalary() + getBonus();
        bonus = 0;
        return result;
    }
    @Override
    public String toString(){
        return "executive employee: Employee " + getFirstName() +
                " " + getLastName() +
                ", SSN: " + getSSN() +
                ", Weekly salary: $" + getSalary() +
                ", award : $" + getBonus() +
                ".";
    }
}

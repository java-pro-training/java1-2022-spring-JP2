package lv.lu.training.lesson8;

public class Executive extends Employee{
    private double bonus;

    public Executive(String firstName,String lastName, String SSN, double salary){
        super(firstName, lastName, SSN, salary);
    }
    public void awardBonus (double bonus){
        this.bonus=bonus;
    }
    @Override
    public double pay(){
        return super.pay() + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Executive Employee: Employee " + getFirstName() +
                " " + getLastName() +
                " " + getSSN() +
                " salary: " + getSalary() +
                " bonus: " + getBonus() +
                " salary plus award: " + pay();
    }
}

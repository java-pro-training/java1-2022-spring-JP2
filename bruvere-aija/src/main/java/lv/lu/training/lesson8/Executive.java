package lv.lu.training.lesson8;

import java.net.PortUnreachableException;

public class Executive extends Employee{
    private double bonus;

    public Executive (String firstName, String lastName, String SSN, double Salary){
        super(firstName, lastName, SSN, Salary);
    }
    @Override
    public double pay(){
        return super.pay() + bonus;
    }
    public void awardBonus(double bonus){
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
    @Override
    public String toString(){
        return "Executive employee: Employee " + getFirstName() + " " + getLastName() + "  "+ getSSN() + " bonus: " + getBonus() + " salary plus award: " + pay();
    }
}

package lv.lu.training.lesson8;

public class Executive extends Employee{

    private double bonus;

    public void awardBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public double Pay(){
        return getSalary() + getBonus();
    }

  public Executive (String firstName, String lastName, String socialSecurityNumber, double Salary){
        super(firstName, lastName, socialSecurityNumber, Salary);
  }

public void setBonus(double bonus){
        this.bonus = bonus;
}
public double getBonus(){
        return bonus;
}
@Override
    public String toString(){
        return "Ëxecutive employee: Employee " + getFirstName() + " " + getLastName() + " " + getSocialSecurityNumber() + " bonus: " + getBonus() + " Award salary: " + Pay();
    }
}
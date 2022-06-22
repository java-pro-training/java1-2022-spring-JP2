package lv.lu.training.lesson8;

public class SalariedEmployee extends Employee{
   private double weeklySalary;

@Override
public double Pay() {
    return weeklySalary;
}
   public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary){
       super(firstName, lastName, socialSecurityNumber);
       this.weeklySalary = weeklySalary;
   }
    public void setWeeklySalary(int weeklySalary){
        this.weeklySalary = weeklySalary;
    }
    public double getWeeklySalary(){
        return weeklySalary;}
}

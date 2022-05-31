package lv.lu.training.lesson8.uzdevums2;

public class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary){
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary=weeklySalary;
    }

//    public void setWeeklySalary(int weeklySalary) {this.weeklySalary = weeklySalary;}

    public double getWeeklySalary(){return weeklySalary;}

    @Override
    public double pay(){
        return weeklySalary;
    }

    @Override
    public String toString(){
        return "Salaried employee: "+getFirstName()+" "+getLastName()+" "+getSocialSecurityNumber()+"; Weekly salary: $"+getWeeklySalary()+",";
    }


}

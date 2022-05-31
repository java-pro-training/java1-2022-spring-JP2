package lv.lu.training.lesson8.uzdevums2;

public class Executive extends Employee{

    private double bonus;

    public Executive(String firstName, String lastName, String socialSecurityNumber, double salary){
        super(firstName, lastName, socialSecurityNumber,salary);
    }

 /*
    public void setBonus(double bonus) {this.bonus = bonus;}
    public double getBonus() {return bonus;}
*/

    public void awardBonus(double value){
        this.bonus=value;
    }

    @Override
    public double pay(){
        return (super.pay()+bonus);
 //       Executive.setBonus(0);
    }


    @Override
    public String toString(){
        return "Executive: "+getFirstName()+" "+getLastName()+" "+getSocialSecurityNumber()+", Salary plus award: $"+bonus;
    }

}

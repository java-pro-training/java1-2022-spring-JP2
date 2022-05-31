package lv.lu.training.lesson8.uzdevums2;

public class HourlyEmployee extends Employee{

    private int hoursWorked;
    private double payRate;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double payRate){
        super(firstName, lastName, socialSecurityNumber);
        this.payRate=payRate;
    }

/*    public void setHoursWorked(int hoursWorked) {this.hoursWorked = hoursWorked;}
    public void setPayRate(int payRate) {this.payRate = payRate;}
*/

    public int getHoursWorked() {return hoursWorked;}
    public double getPayRate() {return payRate;}

    public void addHours(int value){
        this.hoursWorked=value;
    }

    @Override
    public double pay(){
        return hoursWorked*payRate;
 //       setHoursWorked(0);
    }


    @Override
    public String toString(){
        return "Hourly employee: "+getFirstName()+" "+getLastName()+" "+getSocialSecurityNumber()+"; Hours worked: "+getHoursWorked()+
                ", Pay rate: $"+getPayRate()+",";
    }





}

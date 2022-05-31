package lv.lu.training.lesson8homework2;

 //Izveidojam specializētu Employee klasi nosaucot to HourlyEmployee
public class HourlyEmployee extends Employee {
    //Šajā klasē ievietojam laukus “int hoursWorked” un “double payRate”

     private int hoursWorked;
     private double payRate;

     //Konstruktors
     public HourlyEmployee(String firstName, String lastName, String SSN, double payRate) {
         super(firstName, lastName, SSN);
         this.payRate = payRate;
     }



     //Aizvietojam (override) metodi pay kura atgriež hoursWorked * payRate. Pēc metodes izpildes hoursWorked = 0

     @Override
     public double pay() {
         return hoursWorked * payRate;

     }
     // Is this "Pēc metodes izpildes"? I guess we will see

     //Pievienojiet seteru un geteru metodes visiem laukiem

     //Set and Get hours worked
     public void addHours(int hoursWorked) {
         this.hoursWorked = hoursWorked;
     }
     public int getHoursWorked () {
         return hoursWorked;
     }

     //Set and Get payRate
     public void setPayRate(double payRate) {
         this.payRate = payRate;
     }
     public double getPayRate() {
         return payRate;
     }

     @Override
     public String toString() {
         return "Hourly employee: Employee " + getFirstName() + " " + getLastName() + "  "+ getSSN() + " rate: " + getPayRate() +
                 " hours worked: " + getHoursWorked();
     }

}

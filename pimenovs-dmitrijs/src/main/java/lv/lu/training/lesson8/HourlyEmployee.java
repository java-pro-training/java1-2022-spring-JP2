package lv.lu.training.lesson8;

public class HourlyEmployee extends Employee {
   private int hoursWorked;
   private double payRate;


public HourlyEmployee (String firstName, String lastName, String SSN, double payRate){
    super (firstName, lastName, SSN);
    this.payRate=payRate;
}
public void addHours(int hoursWorked){
    this.hoursWorked=hoursWorked;
}

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    @Override
public double pay(){
return hoursWorked*payRate;
}

    @Override
    public String toString() {
        return "Hourly Employee: Employee " + getFirstName() +
                " " + getLastName() +
                " " +getSSN() +
                " Pay Rate: " + getPayRate() +
                " Hours Worked: " + getHoursWorked();
    }
}

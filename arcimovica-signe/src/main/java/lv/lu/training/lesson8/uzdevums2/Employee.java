package lv.lu.training.lesson8.uzdevums2;

public abstract class Employee implements Payable {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double salary;

    public Employee(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Employee(String firstName, String lastName, String socialSecurityNumber, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.salary = salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    public double getSalary() {
        return salary;
    }

    @Override
    public double pay(){return salary;}

}

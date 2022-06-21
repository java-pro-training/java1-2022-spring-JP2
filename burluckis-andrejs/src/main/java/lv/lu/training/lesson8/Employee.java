package lv.lu.training.lesson8;

public abstract class Employee implements Payable{
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

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    @Override
    public double Pay(){
        return salary;
    }
    @Override
    public String toString(){
        return "Employee: " + getFirstName() + " " + getLastName() + " " + getSocialSecurityNumber() + " Salary" + " " + getSalary();
    }
}

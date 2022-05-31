package lv.lesson8.homework.part2;

import lombok.Data;
@Data
public abstract class Employee implements Payable {
    private String firstName;
    private String lastName;
    private String SSN;
    private double salary;

    public Employee(String firstName, String lastName, String SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    public Employee(String firstName, String lastName, String SSN, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "First name: " + getFirstName() +
                ", Last name: " + getLastName() +
                ", Social security number: " + getSSN() +
                ", Salary: " + getSalary() +
                ".";
    }



}

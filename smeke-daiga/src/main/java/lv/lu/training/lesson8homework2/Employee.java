package lv.lu.training.lesson8homework2;

//Izveidojam abstraktu klasi Employee. Šī klase implementē interfeisu Payable.

/*Šī klase ir abstrakta jo nav domāta tiešai izmantošanai,
bet gan specializētu apakšklašu veidošanai.
Šajā klasē ievietosim kopējās loģikas kodu un apakšklasēs tikai specializētu kodu.*/

public abstract class Employee implements Payable {
    //Klasē ievietojam laukus: firstName, lastName, SSN (Social Security Number) un salary (alga)

    private String firstName;
    private String lastName;
    private String SSN;
    private double salary;

    //Izveidojam 2 konstruktorus ar 3 un 4 parametriem, iekļaujam vienā no tiem salary

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

    //Pievienojiet seteru un geteru metodes visiem laukiem

    //Set and Get first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    //Set and Get last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }

    //Set and Get SSN
    public void setSSN (String SSN) {
        this.SSN = SSN;
    }
    public String getSSN () { return SSN; }

    //Set and Get salary
    public void setSalary (double salary) {
        this.salary = salary;
    }
    public double getSalary () { return salary; }

    @Override
    public double pay() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee " + getFirstName() + " " + getLastName() + "  "+ getSSN() + " salary: " + getSalary();
    }


}

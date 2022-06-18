package lv.lu.training.lesson8.Otra_Dala;

public abstract class Employee implements Payable {

    private static final double DEFAULT_SALARY = 0.0;

    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;
    protected double salary;

    public Employee(String firstName, String lastName, String socialSecurityNumber, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.salary = salary;
    }

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this(firstName, lastName, socialSecurityNumber, DEFAULT_SALARY);
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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public double pay() {
        return salary;
    }

}

package lv.lu.training.lesson8;

public class Employee extends Person {

    private String jobTitle;

    public Employee(String firstName, String lastName, String jobTitle) {
        super(firstName, lastName);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }


}

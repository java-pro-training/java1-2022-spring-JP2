package lv.lu.training.lesson8;

public class MainPersonInheritance {

    public static void main(String[] args) {
        Person teacher = new Person("Oļegs", "Ganzins");
        Employee employee = new Employee("Oļegs", "Ganzins", "Teacher");

        System.out.println(teacher.getName());
        System.out.println(employee.getJobTitle() + " " + employee.getName());
    }

}

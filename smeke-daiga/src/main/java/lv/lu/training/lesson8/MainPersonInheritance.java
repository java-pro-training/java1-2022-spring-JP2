package lv.lu.training.lesson8;

public class MainPersonInheritance {
    public static void main(String[] args) {
        Person me = new Person("Me", "Myself");

        Employee newEmployee = new Employee("Me", "Myself", "Hardworker");

        System.out.println(me.getName());

        System.out.println(newEmployee.getName() + " " + newEmployee.getJobTitle());
    }
}

package lv.lu.training.darupati.AstotaaLekcija;

public class MainPersonInheritance {
    public static void main(String[] args){
        Person teacher = new Person("Agita",  "Berkmane");  //Uztaisa jaunu ierakstu klasē

        Employee employee = new Employee("Agita", "Berkmane", "Skolotāja");

        System.out.println(teacher.getName());
        System.out.println(employee.getJobTitle() +  " " + employee.getName());
    }
}

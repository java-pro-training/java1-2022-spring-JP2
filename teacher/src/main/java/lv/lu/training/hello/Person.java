package lv.lu.training.hello;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Person person = new Person("Jānis Bērziņš");

        System.out.println(person.getName());
    }

}

package lv.lu.training.lesson12;

public class Person {

    private final String name;
    private int age;
    private Address address;

    public Person(String name, int age, String country, String city, String street, String house, String quarter) {
        this.name = name;
        this.age = age;
        address = new Address(country, city, street, house, quarter);
    }

    public String getFullAddress() {
        return address.getFullAddress();
    }

}

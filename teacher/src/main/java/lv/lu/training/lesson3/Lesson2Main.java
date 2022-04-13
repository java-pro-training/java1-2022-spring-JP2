package lv.lu.training.lesson3;

public class Lesson2Main {

    public static void main(String[] args) {
        Address address = new Address();
        address.setCity("Rīga");
        address.setStreet("Tērbatas iela");
        address.setHouseNumber(44);
        address.setZipCode("LV1001");
        address.setCountry("Latvija");


        Person person = new Person();
        person.setGivenName("Oļegs");
        person.setFamilyName("Ganzins");
        person.setAge(36);
        person.setAddress(address);

        System.out.println("Given name: " + person.getGivenName());
        System.out.println("Family name: " + person.getFamilyName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Full name: " + person.getFullName());

        System.out.println("Address: " + person.getFullAddress());
        System.out.println("Address (from class address): " + person.getAddress().getFullAddress());
    }

}

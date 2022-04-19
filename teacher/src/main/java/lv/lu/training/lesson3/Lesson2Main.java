package lv.lu.training.lesson3;

public class Lesson2Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setGivenName("Oļegs");
        person.setFamilyName("Ganzins");
        person.setAge(36);
        person.setAddress( getOlegsAddress());

        System.out.println("Given name: " + person.getGivenName());
        System.out.println("Family name: " + person.getFamilyName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Full name: " + person.getFullName());

        System.out.println("Address: " + person.getFullAddress());
        System.out.println("Address (from class address): " + person.getAddress().getFullAddress());

        Address oneMoreAddress = getOneMoreAddress();
        System.out.println("One more address: " + oneMoreAddress.getFullAddress());
    }

    private static Address getOneMoreAddress() {
        Address oneMoreAddress = new Address();
        oneMoreAddress.setCity("Talsi");
        oneMoreAddress.setStreet("Rīgas iela");
        oneMoreAddress.setHouseNumber(10);
        oneMoreAddress.setZipCode("LV3200");
        oneMoreAddress.setCountry("Latvija");
        return oneMoreAddress;
    }

    private static Address getOlegsAddress() {
        Address address = new Address();
        address.setCity("Rīga");
        address.setStreet("Tērbatas iela");
        address.setHouseNumber(44);
        address.setZipCode("LV1001");
        address.setCountry("Latvija");
        return address;
    }

}

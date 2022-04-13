package lv.lu.training.lesson3;

public class PersonMain {

    public static void main(String[] args) {
        Person person = new Person();
        person.setGivenName("Oļegs");
        person.setFamilyName("Ganzins");
        person.setAge(36);

        String givenName = person.getGivenName();
        String familyName = person.getFamilyName();

        System.out.println("Given name: " + givenName);
        System.out.println("Family name: " + person.getFamilyName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Full name: " + givenName + " " + familyName);
    }

}

package lv.lu.training.lesson3;

public class Person {

    private String givenName;
    private String familyName;
    private int age = 0;

    public Person(String givenName, String familyName) {
        this.givenName = givenName;
        this.familyName = familyName;
    }

    public Person(String givenName) {
        this.givenName = givenName;
        this.familyName = "";
    }

    public Person() {
        this.givenName = "Unknown";
        this.familyName = "Unknown";
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return givenName + " " + familyName;
    }

}

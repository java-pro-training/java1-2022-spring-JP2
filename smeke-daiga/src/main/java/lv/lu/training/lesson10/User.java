package lv.lu.training.lesson10;

//Izveidojam jaunu klasi User ar nepieciešamajiem laukiem un konstruktoru un geteriem

public class User {

    private final String name;
    private final String surname;
    private final int age;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;

    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\r\n" + "Surname: " + getSurname() + "\r\n" + "Age: " + getAge();

    }
}

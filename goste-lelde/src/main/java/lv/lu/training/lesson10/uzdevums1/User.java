package lv.lu.training.lesson10.uzdevums1;

public class User {

    private final String name;
    private final String surname;
    private final int age;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() { return name;}
    public String getSurname() { return surname;}
    public int getAge() { return age;}

    public String getUser (){
        return name + " " + surname +", Vecums: "+age;
    }

}

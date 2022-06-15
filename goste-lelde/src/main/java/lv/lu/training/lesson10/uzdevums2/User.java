package lv.lu.training.lesson10.uzdevums2;

public class User {

    private String name;
    private String surname;
    private int age;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public User(){

    }

    public User(String name){
        this.name = name;
    }

    public User(int age){
        this.age=age;
    }

    public String getName() { return name;}
    public String getSurname() { return surname;}
    public int getAge() { return age;}
    public String getUser (){
        return name + " " + surname +", Age: "+age;
    }

    public void setName(String name) {this.name = name;}
    public void setSurname(String surname) {this.surname = surname;}
    public void setAge(int age) {this.age = age;}
}

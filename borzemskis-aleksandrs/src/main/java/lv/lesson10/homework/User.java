package lv.lesson10.homework;

import lombok.Data;

@Data
public class User {

    private String name;
    private String surname;
    private int age;

    User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

}

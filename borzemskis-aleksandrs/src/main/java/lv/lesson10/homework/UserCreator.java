package lv.lesson10.homework;

import java.util.ArrayList;
import java.util.List;

public class UserCreator {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();

        User userMartin = new User("Martins", "Ceske", 37);

        User[] tabOfUsers = new User[10];
        tabOfUsers[0] = new User("Aleksandrs", "Borzemskis", 152);

        validator.validate(userMartin);
        validator.validate(tabOfUsers[0]);
        validator.validate(new User("Olegs","Timofeevgkjhgkjhgk", 49));


    }
}
//
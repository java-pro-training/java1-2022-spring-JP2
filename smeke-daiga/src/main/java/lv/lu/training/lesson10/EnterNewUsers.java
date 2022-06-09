package lv.lu.training.lesson10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EnterNewUsers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        EntryValidator validator = new EntryValidator();
        String name;
        String surname;
        int age;

        do {

            try {
                System.out.println("Enter user's name: ");
                name = console.next();
                validator.validateEnteredName(name);
            } catch (ValidationException e) {
                System.out.println(e);
                continue;
            }

            try {
                System.out.println("Enter user's surname: ");
                surname = console.next();
                validator.validateEnteredName(surname);
            } catch (ValidationException e) {
                System.out.println(e);
                continue;
            }

            try {
                System.out.println("Enter user's age: ");
                age = console.nextInt();
                validator.validateEnteredAge(age);
            } catch (ValidationException e) {
                System.out.println(e);
                continue;
            }

            break;

        } while (true);

        User createdUser = new User(name, surname, age);
        System.out.println("New user created" + "\r\n" + createdUser);


    }


}

package lv.lu.training.lesson10.homework2;

import java.util.Scanner;

public class UserCreator {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ievadiet lietotāja vārdu:");
                String firstName = scanner.next();
                UserValidator.validate(firstName);

                System.out.println("Ievadiet lietotāja uzvārdu:");
                String lastName = scanner.next();
                UserValidator.validate(lastName);

                System.out.println("Ievadiet lietotāja vecumu");
                int age = scanner.nextInt();
                UserValidator.validate(age);

                User user = new User(firstName, lastName, age);
                scanner.close();
                break;
            } catch (ValidationException exception) {
                System.out.println("Notikusi kļūda ievadot lietotāju:");
                System.out.println(exception.getMessage());
            }
        }
    }

}

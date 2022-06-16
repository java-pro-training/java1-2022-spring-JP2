package lv.lu.training.lesson10.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserCreator {

    public static void main(String[] args) {
        try(Scanner console = new Scanner(System.in)) {
            while (true) {
                try {
                    User user = readUserFrom(console);
                    validate(user);
                    break;
                } catch (ValidationException | InputMismatchException e) {
                    System.out.println("Kļūdaini lietotāja dati");
                    System.out.println("Lūdzu atkārtoti ievadiet datus");
                } finally {
                    console.reset();
                }
            }
        }
    }

    private static User readUserFrom(Scanner console) {
        String name = readNameFrom(console);
        String surname = readSurnameFrom(console);
        int age = readAgeFrom(console);
        return new User(name, surname, age);
    }


    private static String readNameFrom(Scanner console) {
        System.out.println("Ievadiet lietotāja vārdu:");
        return console.next();
    }

    private static String readSurnameFrom(Scanner console) {
        System.out.println("Ievadiet lietotāja uzvārdu:");
        return console.next();
    }

    private static int readAgeFrom(Scanner console) {
        System.out.println("Ievadiet lietotāja vecumu:");
        int age = console.nextInt();
        return age;
    }

    private static void validate(User user) {
        UserValidator validator = new UserValidator();
        validator.validate(user);
    }

}

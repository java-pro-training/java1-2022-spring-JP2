package lv.lu.training.lesson10;

import java.util.Scanner;

public class UserCreatorScanner {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your firstname:");
                String firstName = scanner.next();
                System.out.println("Enter your lastname:");
                String lastName = scanner.next();
                System.out.println("Enter your age:");
                int age = scanner.nextInt();

                User user = new User(firstName, lastName, age);
                UserValidator validator = new UserValidator();
                validator.validate(user);
                break;
            } catch (ValidationException exception) {
                System.out.println("User is entered incorrectly");
                System.out.println(exception.getMessage());
            }
        }
    }
}
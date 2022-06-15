package lv.lesson10.homework;

import java.util.Scanner;

public class UserCreatorConsole {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        User user = new User("name", "surname", 0);
        do {//input next user
            boolean exception;
            do {//if input has a mistake, return input
                exception = tryInputCustomer(validator, user);
                printInsertedUser(user);
                if (exception) {
                    System.out.println("\nThe inserted date has a mistake! Please, input again before put it into database!\n");
                }
            } while (exception);
        } while (doYouWantToPlayAgain());
    }

    private static boolean tryInputCustomer(UserValidator validator, User user) {
        Scanner scanner = new Scanner(System.in);
        boolean exception = false;
        System.out.println("Please, enter a client. " +
                "Name and surname must be min 3 and max 12 characters. " +
                " Max age is 120 years");
        System.out.print("Please, enter name: ");
        String word = scanner.next();
        user.setName(toGetConvertedWord(word));

        System.out.print("Please, enter surname: ");
        word = scanner.next();
        user.setSurname(toGetConvertedWord(word));

        System.out.print("Please, enter age: ");
        user.setAge(validator.isInputNumberIsInteger());

        try {
            validator.validate(user);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
            exception = true;
        } catch (Quit e) {
            System.out.println(e.getMessage());
        }
        return exception;
    }

    private static void printInsertedUser(User user) {
        System.out.println("Your inserted next information: \nname '"
                + user.getName() +
                "' surname '" + user.getSurname() +
                "' age is " + user.getAge());

    }

    private static String toGetConvertedWord(String word) {
        //A method to convert name to upper case in the first character
        word = word.toLowerCase();
        String[] arrayFromInputWord = word.split("");
        arrayFromInputWord[0] = arrayFromInputWord[0].toUpperCase();
        word = "";
        for (String s : arrayFromInputWord) {
            word += s;
        }
        return word;
    }

    static boolean doYouWantToPlayAgain() {
        System.out.print("Do You want to try input another customer? (Y/N) ");
        Scanner scanner = new Scanner(System.in);
        String doYouWantToPlayAgain = scanner.nextLine().toLowerCase();//--to avoid caps lock in a keyboard
        return doYouWantToPlayAgain.equals("y");
    }

}

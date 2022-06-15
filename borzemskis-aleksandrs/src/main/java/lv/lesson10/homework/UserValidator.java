package lv.lesson10.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserValidator {
    int inputNumber;
    private static final int MIN_TEXT_LENGTH = 3;
    private static final int MAX_TEXT_LENGTH = 15;
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 120;

    void validate(User user) {
        if (hasInvalidLength(user.getName()) || hasInvalidLength(user.getName())) {
            throw new ValidationException("Name has to be 3 to 15 characters long");
        }else if(hasInvalidLength(user.getSurname()) || hasInvalidLength(user.getSurname())) {
            throw new ValidationException("Surname has to be 3 to 15 characters long");
        }else if (ageCheck(user.getAge())) {
            throw new ValidationException("Age must be within human possibility : 0 - 120");
        }
    }
    private boolean hasInvalidLength(String text) {
        return text.length() < MIN_TEXT_LENGTH || text.length() > MAX_TEXT_LENGTH;
    }
    private boolean ageCheck(int age) {
        return age < MIN_AGE || age > MAX_AGE;
    }
    //---A method to input integer number
     int isInputNumberIsInteger(){
        boolean tryIntInput;
        do {
            tryIntInput = false;
            Scanner scanner = new Scanner(System.in);
            try {
                inputNumber = scanner.nextInt();
            } catch (InputMismatchException exception) {//try if input is not integer
                tryIntInput = true;
                System.out.print("Please write an integer number: ");
            }
        } while (tryIntInput);
        return inputNumber;
    }

}

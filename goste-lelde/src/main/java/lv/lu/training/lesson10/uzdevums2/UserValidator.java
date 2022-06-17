package lv.lu.training.lesson10.uzdevums2;

import lv.lu.training.lesson10.uzdevums1.ValidationException;

public class UserValidator {

    private static final int MIN_TEXT_LENGTH = 3;
    private static final int MAX_TEXT_LENGTH = 15;
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 120;



    private boolean ageCheck(int age) {
        return age < MIN_AGE || age > MAX_AGE;
    }



    public void validateName(String name) {
        char[] characters = name.toCharArray();
        for (char character :characters){
            if (Character.isDigit(character)){
                throw new ValidationException("Numbers can't be used in name!");
            }
        }

        if (name.length()<MIN_TEXT_LENGTH || name.length() > MAX_TEXT_LENGTH) {
            throw new ValidationException("Name and surname has to be 3 to 15 characters long");
        }


    }

    public void validateAge(int age) {
        if (ageCheck(age)) {
            throw new ValidationException("Age must be within human possibility : 0 - 120");
        }

    }


}

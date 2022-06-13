package lv.lu.training.lesson10;

import static java.awt.SystemColor.text;

public class UserValidator {

    private static final int MIN_TEXT_LENGTH = 3;
    private static final int MAX_TEXT_LENGTH = 15;
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 120;


    public void validate(User user) {
        if (hasInvalidLength(user.getName()) || hasInvalidLength(user.getSurname())) {
            throw new ValidationException("Vārdam un uzvārdam jābūt 3 līdz 15 simbolus garam");
        }
        if (ageCheck(user.getAge())) {
            throw new ValidationException("Vecumam jābūt norādītam robežās no 0 līdz 120");
        } else {
            System.out.println(user.getUser());
        }
    }

        private boolean hasInvalidLength (String text){
            return text.length() < MIN_TEXT_LENGTH || text.length() > MAX_TEXT_LENGTH;
        }

        private boolean ageCheck(int age){
        return age<MIN_AGE || age> MAX_AGE;


    }


}

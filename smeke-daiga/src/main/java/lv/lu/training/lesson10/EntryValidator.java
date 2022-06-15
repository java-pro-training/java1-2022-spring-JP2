package lv.lu.training.lesson10;

public class EntryValidator {

    //UserValidator klasē pieliekam pārbaudi simbolu virknes garumam
    private static final int MIN_TEXT_LENGTH = 3;
    private static final int MAX_TEXT_LENGTH = 15;
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 120;


    private boolean hasInvalidLength(String text) {
        return text.length() < MIN_TEXT_LENGTH || text.length() > MAX_TEXT_LENGTH;
    }

    private boolean hasInvalidAge(int age) {
        return age < MIN_AGE || age > MAX_AGE;
    }

    //pievienojam pārbaudes metodi validate
    //Gadījumā, ja pārbaude izgāžas, tad metam kļūdu
    public void validateEnteredName(String name) {
        if (hasInvalidLength(name)) {
            throw new ValidationException("Name and surname has to be 3 to 15 characters long");
        }
    }

    public void validateEnteredAge(int age) {
        if (hasInvalidAge(age)) {
            throw new ValidationException("Age must be within human possibility : 0 - 120");
        }
    }



}

package lv.lu.training.lesson10;

// Uzrakstīt klases UserValidator, kas pārbauda klases User lietotāja vārdu, uzvārdu un vecumu
// Atļauts veidot lietotājus, kuru vārda un uzvārda garums ir no 3 līdz 15 simboliem
// Atļauts ievadīt cilvēka vecumu no 0 līdz 120
// Uzdevuma realizācijā ir jāizmanto pašu veidots Exception tips

public class UserValidator {

    //UserValidator klasē pieliekam pārbaudi simbolu virknes garumam
    private static final int MIN_TEXT_LENGTH = 3;
    private static final int MAX_TEXT_LENGTH = 15;
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 120;


    //pievienojam pārbaudes metodi validate
    //Gadījumā, ja pārbaude izgāžas, tad metam kļūdu
    public void validate(User user) {
        if (hasInvalidLength(user.getName()) || hasInvalidLength(user.getSurname())) {
            throw new ValidationException("Name and surname has to be 3 to 15 characters long");
        } else if (hasInvalidAge(user.getAge())) {
            throw  new ValidationException("Age must be within human possibility : 0 - 120");
        }
    }

    private boolean hasInvalidLength(String text) {
        return text.length() < MIN_TEXT_LENGTH || text.length() > MAX_TEXT_LENGTH;
    }

    private boolean hasInvalidAge(int age) {
        return age < MIN_AGE || age > MAX_AGE;
    }

}

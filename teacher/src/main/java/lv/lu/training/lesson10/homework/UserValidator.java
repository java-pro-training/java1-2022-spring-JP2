package lv.lu.training.lesson10.homework;

public class UserValidator {

    private static final int MIN_TEXT_LENGTH = 3;
    private static final int MAX_TEXT_LENGTH = 15;
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 120;

    public void validate(User user) {
        validate(user.getName());
        validate(user.getSurname());
        validate(user.getAge());
    }

    private void validate(String field) {
        if (hasInvalidLength(field)) {
            throw new ValidationException("Name and surname has to be 3 to 15 characters long");
        }
    }

    private boolean hasInvalidLength(String text) {
        return text.length() < MIN_TEXT_LENGTH || text.length() > MAX_TEXT_LENGTH;
    }

    private void validate(int age) {
        if (hasInvalidAge(age)) {
            throw new ValidationException("Age must be within human possibility : 0 - 120");
        }
    }

    private boolean hasInvalidAge(int age) {
        return age < MIN_AGE || age > MAX_AGE;
    }


}

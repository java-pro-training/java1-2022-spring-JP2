package lv.lu.training.lesson10;

public class UserValidator {

    private static final int MIN_TEXT_LENGTH = 3;
    private static final int MAX_TEXT_LENGTH = 15;
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 120;

    public void validate(User user) {
        if (hasInvalidLength(user.getName()) || hasInvalidLength(user.getSurname())) {
            throw new User.ValidationException("Name and surname has to be 3 to 15 characters long");
        }
    }

    private boolean hasInvalidLength(String text) {
        return text.length() < MIN_TEXT_LENGTH || text.length() > MAX_TEXT_LENGTH;

    }

    private void validate(String name, String surname, int age) {

        if (ageCheck(User.getAge())) { //neiet!!
            throw new User.ValidationException("Age must be within human possibility : 0 - 120");
        }
   }

   private boolean ageCheck(int age) {
        boolean hasInvalidAge = (0 < age) && (age < 120);
        return age < MIN_AGE || age > MAX_AGE;
        }

   }



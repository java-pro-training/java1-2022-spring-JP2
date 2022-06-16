package lv.lu.training.lesson10.homework2;

public class UserValidator {

    public void validate(User user) {
        validate(user.getFirstName());
        validate(user.getLastName());
        validate(user.getAge());
    }

    public static void validate(String name) {
        if (name.length() < 3 || name.length() > 15) {
            throw new ValidationException("Vārdam un uzvārdam ir jābūt garākam par 3 simboliem un mazākam par 15 simboliem!");
        }
        for (char character : name.toCharArray()) {
            if (Character.isDigit(character)) {
                throw new ValidationException("Vārdā un uzvārdā nedrīkst būt cipari!");
            }
        }
    }

    public static void validate(int age) {
        if (age < 0 || age > 120) {
            throw new ValidationException("Vecumam ir jābūt no 0 līdz 120 gadiem!");
        }
    }


}

package lv.lu.training.lesson10;

public class UserCreator {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        validator.validate(new User("Martins", "Ceske", 37));
        validator.validate(new User("Anna", "Liepiņa", 12));
        validator.validate(new User("Bite", "Saldā", -3));
    }
}

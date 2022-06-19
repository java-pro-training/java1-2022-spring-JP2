package lv.lu.training.lesson10.homework1;

public class UserCreator {
    public static void main (String[] args){
        UserValidator validator = new UserValidator();
        validator.validate(new User("Zane", "Berga-Bergmane", 109));
    }
}

package lv.lu.training.lesson10.PirmaisUzdevums;



public class UserCreator {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        validator.validate(new User("Martins", "Ceske", 37));
       // validator.validate(new User("Ma", "Ceske", 37));
      //  validator.validate(new User("Martins", "Ceske", 307));
    }
}

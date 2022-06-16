package lv.lu.training.lesson10;

public class UserCreator {
    public static void main(String[] args) {

        UserValidator validator = new UserValidator();
        validator.validate(new User("Dmitrijs","Pimenovs",31));
      // validator.validate(new User("Sergejs","Stankovs",121));
       // validator.validate(new User("Vi","Muratovs",40));
       // validator.validate(new User("Elena","Ez",24));
    }
}

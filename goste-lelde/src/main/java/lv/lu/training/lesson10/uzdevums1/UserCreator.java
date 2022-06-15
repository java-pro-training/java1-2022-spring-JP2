package lv.lu.training.lesson10.uzdevums1;

public class UserCreator {

    public static void main (String[] args){

        UserValidator validator = new UserValidator();
        validator.validate(new User("Martins", "Ceske", 37));

/*
        validator.validate(new User("Janis","Avotins",178));
        validator.validate(new User("A", "Berzina", 64));
        validator.validate(new User("Loreta", "Bi", 25));
*/


    }
}

package lv.lu.training.lesson9.homework.lesson;

public class Customer implements Person {

    public String getName() {
        return "Klients";
    }

    @Override
    public String getFirstName() {
        return "Vērtīgs klients";
    }

}

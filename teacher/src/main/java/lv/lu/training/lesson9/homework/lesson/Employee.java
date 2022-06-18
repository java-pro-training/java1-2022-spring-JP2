package lv.lu.training.lesson9.homework.lesson;

public class Employee implements Person {

    public String getName() {
        return "Darbinieks";
    }

    @Override
    public String getFirstName() {
        return "Labs";
    }

}

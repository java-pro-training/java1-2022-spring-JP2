package lv.lu.training.lesson5;

public class PersonWithoutEncapsulation {

    public String name;

    public static void main(String[] args) {
        PersonWithoutEncapsulation teacher = new PersonWithoutEncapsulation();
        String name = "Oļegs Ganzins";
        teacher.name = name.toUpperCase();

        PersonWithoutEncapsulation student = new PersonWithoutEncapsulation();
        String studentName = "Jānis Bērziņš";
        student.name = studentName.toUpperCase();
    }

}

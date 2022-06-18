package lv.lu.training.lesson10;

public class User {

    private final String name;
    private final String surname;
    private final int age;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }


    public static class ValidationException extends RuntimeException {

        public ValidationException(String message) {
            super(message);
        }

    }
}

package lv.lesson10.homework;

public class UserCreator {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();

//        User userMartin = new User("Martins", "Ceske", 37);

        User[] tabOfUsers = new User[10];
        tabOfUsers[0] = new User("Aleksandrs", "Borzemskis", 45);
        tabOfUsers[1] = new User("Sergejs", "Golans", 101);
        tabOfUsers[2] = new User("Irina", "Golovina", 0);
        tabOfUsers[3] = new User("Janis", "Bērziņš", 120);
        tabOfUsers[4] = new User("Juris", "Ozols", 121);
        tabOfUsers[5] = new User("Jana", "Plauda", -5);
        tabOfUsers[6] = new User("Janis", "Bērziņš", 152);
        tabOfUsers[7] = new User("Janisjanisjabishjgjhgjh", "Bērziņš", 120);
        tabOfUsers[8] = new User("Janis", "BērziņšBērziņšBērziņšBērziņšBērziņš", 120);
        tabOfUsers[9] = new User("Janis Bērziņš", "Bērziņš", 120);

//        validator.validate(userMartin);
//        validator.validate(tabOfUsers[0]);
//        validator.validate(new User("Olegs","Timofeevgkjhgkjhgk", 49));

        checkArray(validator, tabOfUsers);


    }

    private static void checkArray(UserValidator validator, User[] tabOfUsers) {
        for (User tabOfUser : tabOfUsers) {
            printArray(tabOfUser);

            try {
                validator.validate(tabOfUser);
            } catch (ValidationException e) {
                System.out.println(e.getMessage());
            }

        }
    }

    public static void printArray(User user) {
        System.out.println("Firstname: " + user.getName() +
                ", Lastname: " + user.getSurname() +
                ", age: " + user.getAge());
    }
}
//
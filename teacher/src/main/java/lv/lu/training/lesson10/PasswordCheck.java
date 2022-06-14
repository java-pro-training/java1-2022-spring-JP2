package lv.lu.training.lesson10;

import java.util.Scanner;

public class PasswordCheck {

    private static final String CORRECT_PASSWORD = "admin";

    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {
            int timesPasswordChecked = 0;
            while (true) {
                if (CORRECT_PASSWORD.equals(console.next())) {
                    break;
                }
                timesPasswordChecked++;
                if (timesPasswordChecked == 3) {
                    throw new UserAuthenticationFailedException();
                }
            }
            System.out.println("Lietotājs ir veiksmīgi autentificējies!");
        } catch (UserAuthenticationFailedException e) {
            System.out.println(e.getMessage());
        }
    }

}

package lv.lu.training.lesson6;

import java.util.Scanner;

public class WhilePinValidator {

    private static final String VALID_PIN = "2244";

    public static void main(String[] args) {
        int i = 0;
        boolean pinCodeValid = false;
        Scanner scanner = new Scanner(System.in);
        String pinCode;
        while (!pinCodeValid) {
            pinCode = scanner.next();
            pinCodeValid = VALID_PIN.equals(pinCode);
            i++;
            if (i == 3) {
                break;
            }
        }
        if (pinCodeValid) {
            System.out.println("Valid PIN code is entered");
        } else {
            System.out.println("Card is blocked");
        }
    }
}

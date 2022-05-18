package lv.lu.training.lesson6;

import java.util.Scanner;

public class PinCodeValidator {

    private static final String VALID_PIN_CODE = "1234";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pinCode;
        boolean isPinValid = false;
        for (int i = 0; i < 3; i++) {
            if (!isPinValid) {
                pinCode = scanner.next();
                isPinValid = VALID_PIN_CODE.equals(pinCode);
            }
        }

        if (isPinValid) {
            System.out.println("Valid PIN is entered");
        } else {
            System.out.println("Card is blocked!");
        }
    }

}

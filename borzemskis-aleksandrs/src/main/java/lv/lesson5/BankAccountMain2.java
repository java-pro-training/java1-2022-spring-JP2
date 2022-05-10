package lv.lesson5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAccountMain2 {
    public static void main(String[] arg) {
        String checkPin;
        String resume;//This var for playing again
        int i;
        int chooseYourToDo;
        int chooseYourWithdraw;
        boolean tryInput;
        BankAccount arturKotovs = new BankAccount(
                "LV67PARX321323513213",
                "8745",
                168.45,
                300);
        do {
            i = 3;//You cau input wrong PIN 3 times
            do {
                System.out.print("Please, input the PIN code :");
                Scanner scanner = new Scanner(System.in);
                checkPin = scanner.next();
                if (arturKotovs.isWrongPin(checkPin)) {//Check PIN
                    System.out.println("\nWrong PIN!");
                    i--;
                    System.out.println("You can try input right PIN " + i + " times");
                } else {
                    System.out.println("PIN Ok!");
                    break;
                }
            } while (i > 0);

            if (i == 0) {//If you input wrong PIN 3 times
                System.out.println("YOUR CARD IS DISABLED");
            } else {
                System.out.println(arturKotovs);
                System.out.println("""

                        Please, input what you want to do:
                        Input 1 if you want to take money;
                        Input 2 if you want to withdraw money;
                        Input 3 if you want quit""");

                do {//Input what you want to do
                    chooseYourToDo = 0;
                    tryInput = false;
                    Scanner scanner = new Scanner(System.in);
                    try {
                        chooseYourToDo = scanner.nextInt();
                    } catch (InputMismatchException exception) {//try if input is not integer
                        tryInput = true;
                        System.out.println("Please write a number");
                    }
                    if (chooseYourToDo != 1 && chooseYourToDo != 2 && chooseYourToDo != 3) {//--try if input is not 1, 2 or 3
                        tryInput = true;
                        System.out.println("Please write ~1~ or ~2~");
                    }
                } while (tryInput);
                System.out.println("Your have chosen " + chooseYourToDo);

                switch (chooseYourToDo) {
                    case 1 -> {// Iemaksat naudu
                        arturKotovs.topUp(100, arturKotovs.getUserPin());
                        System.out.println(arturKotovs);
                    }
                    case 2 -> {// Saņemt naudu
                        System.out.print("Please, input how many money you want to get: ");
                        Scanner scanner = new Scanner(System.in);
                        chooseYourWithdraw = scanner.nextInt();
                        if (arturKotovs.isEnoughMoney(chooseYourWithdraw)) {
                            arturKotovs.withDraw(chooseYourWithdraw, arturKotovs.getUserPin());
                            System.out.println(arturKotovs);
                        } else {
                            System.out.println("\nThe account does not have enough money");
                        }
                    }
                    default -> System.out.println("Do you really want to quit?");
                }
            }
            //--Start part of program if you want to play again
            System.out.println("Do You want try again? (Y/N) ");
            Scanner scanner = new Scanner(System.in);
            resume = scanner.nextLine().toLowerCase();//--to avoid caps lock in a keyboard
        } while (resume.equals("y"));
        //--End part of program if you want to play again
    }
}

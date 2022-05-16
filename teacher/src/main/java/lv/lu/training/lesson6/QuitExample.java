package lv.lu.training.lesson6;

import java.util.Scanner;

public class QuitExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String lineFromConsole = scanner.next();
            if ("quit".equals(lineFromConsole)) {
                break;
            }
        }
    }

}

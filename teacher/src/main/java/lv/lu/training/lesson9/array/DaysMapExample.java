package lv.lu.training.lesson9.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DaysMapExample {

    public static void main(String[] args) {
        Map<String, Integer> dayNumber = new HashMap<>();

        dayNumber.put("Pirmdiena", 1);
        dayNumber.put("Otrdiena", 2);
        dayNumber.put("Trešdiena", 3);
        dayNumber.put("Ceturtdiena", 4);
        dayNumber.put("Piektdiena", 5);
        dayNumber.put("Sestdiena", 6);
        dayNumber.put("Svētdiena", 7);

        Scanner scanner = new Scanner(System.in);
        String day = scanner.next();
        Integer number = dayNumber.get(day);
        if (number != null) {
            System.out.println("Dienas " + day + " kārtas numurs nedēļā ir " + number);
        } else {
            System.out.println("Nedēļā nav šāda " + day + " diena");
        }

        scanner.close();
    }

}

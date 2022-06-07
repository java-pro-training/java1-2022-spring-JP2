package lv.lu.training.lesson9.array;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapLoops {

    public static void main(String[] args) {
        Map<String, Integer> dayNumber = new HashMap<>();

        dayNumber.put("Pirmdiena", 1);
        dayNumber.put("Otrdiena", 2);
        dayNumber.put("Trešdiena", 3);
        dayNumber.put("Ceturtdiena", 4);
        dayNumber.put("Piektdiena", 5);
        dayNumber.put("Sestdiena", 6);
        dayNumber.put("Svētdiena", 7);

        System.out.println("Printing keys...");
        for (String key : dayNumber.keySet()) {
            System.out.println(key);
        }

        System.out.println("Printing values...");
        for (Integer number : dayNumber.values()) {
            System.out.println(number);
        }
    }

}

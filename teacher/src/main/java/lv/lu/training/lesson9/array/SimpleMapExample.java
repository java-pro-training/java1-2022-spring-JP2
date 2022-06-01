package lv.lu.training.lesson9.array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleMapExample {

    public static void main(String[] args) {
        String[] daysArray = new String[]{"Pirmdiena",
                "Otrdiena", "Trešdiena", "Ceturtdiena", "Piektdiena", "Sestdiena", "Svētdiena"};

        List<String> daysList = List.of("Pirmdiena",
                "Otrdiena", "Trešdiena", "Ceturtdiena", "Piektdiena", "Sestdiena", "Svētdiena");

        Map<Integer, String> daysMap = new HashMap<>();
        daysMap.put(0, "Pirmdiena");
        daysMap.put(1, "Otrdiena");
        daysMap.put(2, "Trešdiena");
        daysMap.put(3, "Ceturtdiena");
        daysMap.put(4, "Piektdiena");
        daysMap.put(5, "Sestdiena");
        daysMap.put(6, "Svētdiena");

        for (int i = 0; i < daysMap.size(); i++) {
            System.out.println(daysMap.get(i));
        }

    }

}

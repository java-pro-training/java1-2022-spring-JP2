package lv.lu.training.lesson9.array;

import java.util.ArrayList;
import java.util.List;

public class BetterListExample {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(List.of("Red", "Blue", "Green", "Yellow", "Black"));
        colors.add("Pink");
        colors.remove(0);

        for (String color : colors) {
            System.out.println(color);
        }
    }

}

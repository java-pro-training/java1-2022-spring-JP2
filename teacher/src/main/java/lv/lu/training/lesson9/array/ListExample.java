package lv.lu.training.lesson9.array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(5);
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Pink");
        colors.remove(0);
        colors.remove("Yellow");

        colors.addAll(List.of("Purple", "White"));

        print(colors);

        System.out.println("Does list contain black - " + colors.contains("Black"));
        System.out.println("Does list contain red - " + colors.contains("Red"));

        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Color " + colors.get(i) + " index is " + i);
        }

        colors.clear();
        colors.add("Orange");

        print(colors);

        colors.add("Grey");
        colors.add("Violet");
        colors.add("Gold");
        colors.add("Silver");

        colors.sort(Comparator.comparing(String::toString));

        print(colors);

        List<Double> amounts = new LinkedList<>();
        amounts.add(1.2);

        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(16);
        numbers.add(16);
        numbers.add(16);
        numbers.add(16);
        numbers.add(16);
        numbers.add(null);
    }

    private static void print(List<String> colors) {
        System.out.println();
        for (String color : colors) {
            System.out.println(color);
        }
    }

}

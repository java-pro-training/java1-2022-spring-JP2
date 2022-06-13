package lv.lu.training.lesson9.set;

import java.util.HashSet;
import java.util.Set;

public class ColorSet {

    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        for (String color : colors) {
            System.out.println(color);
        }
    }

}

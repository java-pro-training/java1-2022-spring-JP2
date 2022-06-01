package lv.lu.training.lesson9.array;

public class ArrayExample {

    public static void main(String[] args) {
        String[] colors = new String[]{"Red", "Blue", "Green", "Yellow", "Black"};

        String[] colorsWithPinkAdded = new String[colors.length + 1];
        for (int i = 0; i < colors.length; i++) {
            colorsWithPinkAdded[i] = colors[i];
        }
        colorsWithPinkAdded[colorsWithPinkAdded.length - 1] = "Pink";
        colors = colorsWithPinkAdded;

        String[] colorsWithRedRemoved = new String[colors.length - 1];
        for (int i = 1; i < colorsWithRedRemoved.length; i++) {
            colorsWithRedRemoved[i] = colors[i];
        }
        colors = colorsWithRedRemoved;

        for (String color : colors) {
            System.out.println(color);
        }
    }

}

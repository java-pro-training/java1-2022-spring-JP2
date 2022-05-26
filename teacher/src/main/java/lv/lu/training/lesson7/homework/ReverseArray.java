package lv.lu.training.lesson7.homework;

import java.util.Arrays;

public class ReverseArray {

    public static int[] reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = array[i];
        }
        return reversedArray;
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        int[] reversedNumbers = ReverseArray.reverse(numbers);

        System.out.println(Arrays.toString(reversedNumbers));
        print(reversedNumbers);
    }

}

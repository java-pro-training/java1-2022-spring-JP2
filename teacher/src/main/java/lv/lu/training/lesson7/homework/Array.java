package lv.lu.training.lesson7.homework;

import java.util.Arrays;

public class Array {

    public static int[] reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = array[i];
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        var reversedArray = Array.reverse(new int[]{1, 2, 3});

        System.out.println(Arrays.toString(reversedArray));
    }

}

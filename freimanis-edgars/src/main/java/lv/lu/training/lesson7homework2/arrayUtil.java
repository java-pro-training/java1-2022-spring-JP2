package lv.lu.training.lesson7homework2;

import java.util.Arrays;

public class arrayUtil {
    public static int[] reverse(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
        }
        return reverseArray;

    }

    public static void main(String[] args){
        int[] numbers = new int[] {1,2,3,4,5};
        int[] reversedNumbers = arrayUtil.reverse(numbers);

        System.out.println(Arrays.toString(reversedNumbers));
    }
}
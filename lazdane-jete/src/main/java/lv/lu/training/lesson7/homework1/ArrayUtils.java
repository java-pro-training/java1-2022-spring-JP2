package lv.lu.training.lesson7.homework1;

public class ArrayUtils {
    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            result[j] = array[i];
        }
        return result;
    }
}
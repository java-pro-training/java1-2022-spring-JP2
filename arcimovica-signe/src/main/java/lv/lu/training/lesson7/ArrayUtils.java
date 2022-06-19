package lv.lu.training.lesson7;

public class ArrayUtils {

    public static int[] reverse(int[] array){
        int[] reverseArray = new int[array.length];
        for (int i = array.length-1, j=0; i>=0; i--, j++){
            reverseArray[j] = array[i];
        }
        return reverseArray;

    }

}

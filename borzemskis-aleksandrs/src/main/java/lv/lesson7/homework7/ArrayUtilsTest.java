package lv.lesson7.homework7;

import java.util.Arrays;

public class ArrayUtilsTest {

    static void checkResult(int[] array){
        int[] resultedArray = ArrayUtils.reverse(array);
        System.out.println("We try to test ArrayUtils method 'reverse'");
        if (resultedArray[0] == 3 && resultedArray[1] == 2 && resultedArray[2] == 1){
            System.out.println("Result is Ok!");
        }else {
            System.out.println("Result is wrong!");
        }
        System.out.println(Arrays.toString(arrayFrom1To3));
    }
    static int [] arrayFrom1To3 = new  int[3];


    public static void main(String[] args) {
        arrayFrom1To3[0] = 1;
        arrayFrom1To3[1] = 2;
        arrayFrom1To3[2] = 3;

        checkResult(arrayFrom1To3);
    }
}

package lv.lu.training.lesson7;

import java.util.Arrays;

public class ArrayUtilsTest {

    public static void main(String[] args) {
        int[] reverseArray = ArrayUtils.reverse(new int[]{1, 2, 3});
        System.out.println("Testējam klases ArrayUtils metodi 'reverse', darbojas ..");
        if (reverseArray [0] ==3 && reverseArray[1] ==2 && reverseArray[2] ==1){
            System.out.println("PAREIZI");
        } else {
            System.out.println("NEPAREIZI");
        }
        System.out.println(Arrays.toString(reverseArray));
    }

}

package lv.lu.training.lesson7.homework1;

import lv.lu.training.lesson7.homework1.ArrayUtils;

public class ArrrayUtilsTest {
    public static void main (String[] args){
        int[] result = ArrayUtils.reverse(new int[]{1,2,3});

        System.out.println("Testējam klases ArrayUtlis metodi 'reverse', tā darbojas:");
        if (result[0] == 3 || result[1] == 2 || result[2] == 1){
            System.out.println ("pareizi!");
        } else {
            System.out.println ("nepareizi!");
        }
    }
}

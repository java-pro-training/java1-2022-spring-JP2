package lv.lu.training.lesson7;

import java.util.Arrays;

public class Numbers {

    public static void main(String[] args) {
        int[] oneToTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < oneToTen.length; i++) {
            System.out.print(oneToTen[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(oneToTen));
    }

}

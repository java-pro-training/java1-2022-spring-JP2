package lv.lu.training.lesson7;

import java.util.Arrays;

public class DaysOfWeek {
    public static void main(String[] args) {
        String[] daysOfWeek = new String[7];

        daysOfWeek[0] = "Monday";
        daysOfWeek[1] = "Tuesday";
        daysOfWeek[2] = "Wednesday";
        daysOfWeek[3] = "Thursday";
        daysOfWeek[4] = "Friday";
        daysOfWeek[5] = "Saturday";
        daysOfWeek[6] = "Sunday";


        System.out.println("2nd day of the week is... " + daysOfWeek[1]); //printline

        int[] oneToTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        for (int i = 0; i < oneToTen.length; i++){
            System.out.println(oneToTen[i]);
        }
        }



}

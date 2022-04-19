package lv.lu.training.lesson3;

import java.util.Random;

public class PatvaligoSkaitluGenerators {

    public static void main (String[] args){

        Random randomNumberGenerator = new Random();
        int sk1 = randomNumberGenerator.nextInt();
        int sk2 = randomNumberGenerator.nextInt();
        int sk3 = randomNumberGenerator.nextInt();
        int summa = sk1+sk2+sk3;
System.out.println("skaitļu " + sk1 + ", " + sk2 + ", " +sk3 + " SUMMA IR  " + summa);
        System.out.println( " CITS PIERAKSTS: ");
        System.out.println(sk1 + " + " + sk2 + " + " +sk3 + "  =  " + summa);
    }


}

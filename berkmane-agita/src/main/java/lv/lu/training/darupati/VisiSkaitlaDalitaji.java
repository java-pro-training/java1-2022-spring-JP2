package lv.lu.training.darupati;

public class VisiSkaitlaDalitaji {
    public static void main(String[] args) {
        System.out.println("VISI SKAITĻA DALĪTĀJI");
        System.out.println(printFactors(20));

    }

    public static int printFactors(int number) {
        if (number < 1) {System.out.println("Invalid Value");}

        for (int i = 1; i <= number; i++){ //ja grib, lai nedrukā 2 reizes pašu skaitli, tad nomaina uz <0
            if (number%i ==0) {
                System.out.println(i);
        }

    }

   return number; }

}
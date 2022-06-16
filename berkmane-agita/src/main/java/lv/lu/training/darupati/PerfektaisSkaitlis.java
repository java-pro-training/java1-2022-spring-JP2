package lv.lu.training.darupati;

public class PerfektaisSkaitlis {
    public static void main(String[] args) {
        System.out.println("CIPARU SUMMA VIENĀDA AR DOTO SKAITLI");
        //System.out.println(printFactors(20));

    }

    public static boolean isPerfectNumber(int number){
        int summa = 0;

        if (number<1) {return false;}
        for (int i = 1; i < number; i++){
            if (number%i ==0) {
                summa = summa  + i;
            }
            if (summa == number)  {return true;}

    }
      return false;
    }




}

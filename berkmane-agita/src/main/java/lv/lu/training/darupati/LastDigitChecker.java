package lv.lu.training.darupati;

public class LastDigitChecker {
    public static void main (String[] args) {
        System.out.println("Programma strādā");
      System.out.println(hasSameLastDigit(145,125,22));
        System.out.println(hasSameLastDigit(14,121,22));
    }

   public static boolean isValid(int sk){
       System.out.println("Programma strādā");
       if ((sk<10) || (sk>1000)) {
           return false;
       }
       return true;
  }
    public static boolean hasSameLastDigit (int sk1, int sk2, int sk3) {
        if ((sk1<10 ) || (sk1>1000)) {return false;}
        if ((sk1<10 ) || (sk1>1000)) {return false;}
        if ((sk1<10 ) || (sk1>1000)) {return false;}

        if ((sk1%10 == sk2%10) || (sk2%10 == sk3%10) || (sk3%10 == sk1%10)) {return true;}
        return false;
    }







    }


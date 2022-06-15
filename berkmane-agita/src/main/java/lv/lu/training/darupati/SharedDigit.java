package lv.lu.training.darupati;

public class SharedDigit {
    public static void main (String[] args) {
        System.out.println("Programma strādā");
        System.out.println(hasSharedDigit(12, 43));
        System.out.println(hasSharedDigit(1, 30));
        System.out.println(hasSharedDigit(12, 3));
        System.out.println(hasSharedDigit(12, 31));
    }
    public static boolean hasSharedDigit (int sk1, int sk2){
        if ((sk1<10) || (sk2<10)) {return false;}
        if ((sk1>99) || (sk2>99)) {return false;}

        int sk1cip2 = sk1%10;
        System.out.println(sk1cip2);
        int sk1cip1 = sk1/10;
        System.out.println(sk1cip1);
        int sk2cip2 = sk2%10;
        System.out.println(sk2cip2);
        int sk2cip1 = sk2/10;
        System.out.println(sk2cip1);
        if (sk1cip1 == sk2cip1) {return true;}
        if (sk1cip1 == sk2cip2) {return true;}
        if (sk1cip2 == sk2cip1) {return true;}
        if (sk1cip2 == sk2cip2) {return true;}


        //int cip11 = sk1%10;
     //   int cip12 = sk1/10;

    //    int cip21 = sk2%10;
    //    int cip22 = sk2/10;


     //   if ((cip11 == cip21) || (cip12 == cip22)) {return true;}
    //    if ((cip12 == cip21) || (cip21 == cip21)) {return true;}



return false;
    }

}

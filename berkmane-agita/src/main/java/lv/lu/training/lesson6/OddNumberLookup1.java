package lv.lu.training.lesson6;

public class OddNumberLookup1 {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(printOddWithin(3,9));
    }

     public static int printOddWithin(int from, int till) {

            System.out.print("Nepāra skaitļi inetrvālā no " + from + " līdz " + till + " ir ");
            for (int i = from; i <= till; i++) {
                if (i % 2 > 0) {
                    System.out.print(i + " ");
                }
            }
        System.out.println();
        return from;  // uzrakstītā metode ir ar datu tipu int un prasa atgriezt int. Vai šādi rakstot, ir iespēja
         // to kaut kā apiet? Ko lai atgriež?
         //Nomainīt uz void datu tipu metodei programma neļauj.
    }
    }



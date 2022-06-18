package lv.lu.training.darupati;

public class ciparuSumma {

        public static void main (String[] args) {
            System.out.println("Skaitļa 125 cipartu summa ir " + ciparuSumma(125));
            System.out.println("Skaitļa -125 cipartu summa ir " + ciparuSumma(-125));
            System.out.println("Skaitļa 1 cipartu summa ir " + ciparuSumma(1));
            System.out.println("Skaitļa 12 cipartu summa ir " + ciparuSumma(12));
        }
        private static int ciparuSumma (int skaitlis){
            if (skaitlis<10) {
                return -1;
            }

            int summa=0;
            while (skaitlis>0){
                int cipars = skaitlis%10; //atrod, kāds ir pēdējais cipars skaitlī
                summa = summa + cipars;
                skaitlis = skaitlis/10;
            }
            return summa;
        }
    }



package lv.lu.training.darupati;
import java.util.Scanner;

public class IevaditoSkaitluSumma {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int counter = 0;
    int sum  =0;
    while (true){
        int order = counter +1;
        System.out.println(" Ievadi skaitli Nr." + order + ": ");
        boolean isAnInt = scanner.hasNextInt(); // pārbauda, vai ievadīts skaitlis
                // ja nebūs ievadīts int, boolean būs false
        if(isAnInt){
            int number = scanner.nextInt();
            counter++;
            sum +=number;
            if (counter==10){
                break;
            }
        } else {
            System.out.println("Invalid number!!!");
        }
        scanner.nextLine(); // pāriet  jaunā rindā, kad ievada enter.
    }
        System.out.println("Summa ir " + sum);
    scanner.close();
    }

}

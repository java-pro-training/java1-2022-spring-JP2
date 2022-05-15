package lv.lu.training.lesson6;

public class DoWhilePrintOddNumbers {

    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.println("i=" + i++);
        } while (i <= 10);


    }

}

package lv.lu.training.lesson6;

public class WhilePrintOddNumbers {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.println("i=" + i);
            i++;

        }
    }

}

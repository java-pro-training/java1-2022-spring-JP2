package lv.lu.training.lesson6;

public class ForWithContinue {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5 || i == 6) {
                continue;
            }
            System.out.println("i=" + i);
        }
    }

}

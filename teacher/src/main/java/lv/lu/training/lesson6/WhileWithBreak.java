package lv.lu.training.lesson6;

public class WhileWithBreak {

    public static void main(String[] args) {
        int i = 1;

        while (i < 20) {
            if (i == 11) {
                break;
            }
            System.out.println("i=" + i);
            i++;
        }
        System.out.println("The end of while loop...");
    }

}

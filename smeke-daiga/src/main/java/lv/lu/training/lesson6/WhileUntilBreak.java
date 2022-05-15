package lv.lu.training.lesson6;

public class WhileUntilBreak {
    public static void main(String[] args) {

            int i = 1;

            while (i < 20) {
                if (i==10) {
                    break;
                }
                System.out.println("i="+i);
                i++;
            }

            System.out.println("I've broken free from cycling");

    }
}

package lv.lu.training.lesson6;

public class WhileFactorial {

    public static void main(String[] args) {
        int i = 1;
        int factorialAmount = 1;

        while (factorialAmount <= 10000) {
            factorialAmount *= i;
            i++;
        }

        System.out.println("Used number count: " + i);

    }

}

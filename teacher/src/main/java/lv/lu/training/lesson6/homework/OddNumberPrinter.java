package lv.lu.training.lesson6.homework;

public class OddNumberPrinter {

    private final int from;
    private final int till;

    public OddNumberPrinter(int from, int till) {
        this.from = from;
        this.till = till;
    }

    public void print() {
        for (int i = from; i <= till; i++) {
            printIfOddNumber(i);
        }
        System.out.println();
    }

    private void printIfOddNumber(int i) {
        if (isOddNumber(i)) {
            System.out.print(i + " ");
        }
    }

    private boolean isOddNumber(int number) {
        return number % 2 != 0;
    }

    public static void main(String[] args) {
        OddNumberPrinter oddNumberPrinter = new OddNumberPrinter(1, 30);
        oddNumberPrinter.print();
    }

}

package lv.lu.training.lesson6.homework;

public class OddNumberLookup {

    public void printOddWithing(int from, int till) {
        for (int i = from; i <= till; i++) {
            if (isOdd(i)) {
                System.out.print(i);
                if (i != till && i != till - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }

    private boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static void main(String[] args) {
        OddNumberLookup oddNumberLookup = new OddNumberLookup();
        oddNumberLookup.printOddWithing(3, 10);
    }

}

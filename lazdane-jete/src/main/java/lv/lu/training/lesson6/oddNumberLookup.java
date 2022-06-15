package lv.lu.training.lesson6;

public class oddNumberLookup {

    public void printOddWithin(int from, int till) {
        for (int i = from; i <= till; i++) {
            if (isOdd(i)) {
                System.out.println(i);
            }
        }
    }

    private boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static void main(String[] args) {
        oddNumberLookup oddNumberLookup = new oddNumberLookup();
        oddNumberLookup.printOddWithin(89, 108);
    }

}
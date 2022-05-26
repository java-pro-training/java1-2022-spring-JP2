package lv.lu.training.lesson6;

public class OddNumberLookupTeacher {

    public void printOddWithin(int from, int till) {
        for (int i = from; i <= till; i++) {
            if (isOdd(i)) {
                System.out.println(i + " ");
            }
        }
    }

    private boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static void main(String[] args) {
        OddNumberLookupTeacher oddNumberLookup = new OddNumberLookupTeacher();
        oddNumberLookup.printOddWithin(7,12);
    }

}

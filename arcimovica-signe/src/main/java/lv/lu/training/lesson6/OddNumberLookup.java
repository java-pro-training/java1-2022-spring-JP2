package lv.lu.training.lesson6;

public class OddNumberLookup {

    public void printOddWihin(int from, int till){
        for (int i=from; i< till; i++){
            if (isOdd(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private boolean isOdd(int number){
        return number % 2 != 0;
    }

    public static void main(String[] args) {
        OddNumberLookup oddNumberLookup = new OddNumberLookup();
        oddNumberLookup.printOddWihin(3,7);

    }
}

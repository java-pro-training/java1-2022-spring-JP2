package lv.lu.training.lesson7;

public class LowestNumberInArray {

    public static void main(String[] args) {
        int[] numbers = {-1, 10, 6, 9, -10000000, 12, 24, 3, -125};
        int lowestNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            if (lowestNumber > currentNumber) {
                lowestNumber = currentNumber;
            }
        }

        System.out.println("Mazākais skaitlis " + lowestNumber);
    }

}

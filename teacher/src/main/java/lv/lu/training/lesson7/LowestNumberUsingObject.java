package lv.lu.training.lesson7;

public class LowestNumberUsingObject {

    private int[] numbers;

    public LowestNumberUsingObject(int[] numbers) {
        this.numbers = numbers;
    }

    public int getLowestNumber() {
        int lowestNumber = numbers[0];
        for (int currentNumber : numbers) {
            if (lowestNumber > currentNumber) {
                lowestNumber = currentNumber;
            }
        }
        return lowestNumber;
    }

    public static void main(String[] args) {
        int[] numbers = {-1, 2, 5, -5, 10};
        LowestNumberUsingObject lowestNumberUsingObject = new LowestNumberUsingObject(numbers);

        System.out.println("Mazākais skaitlis ir " + lowestNumberUsingObject.getLowestNumber());
    }


}

package lv.lu.training.lesson7;

public class LowestNumberUsingStaticMethod {

    public static int getLowestNumber(int[] numbers) {
        int lowestNumber = numbers[0];
        for (int currentNumber : numbers) {
            if (lowestNumber > currentNumber) {
                lowestNumber = currentNumber;
            }
        }
        return lowestNumber;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 5, -7, 10, -6};
        System.out.println("Mazākais skaitlis ir " + LowestNumberUsingStaticMethod.getLowestNumber(numbers));
    }


}

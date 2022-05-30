package lv.lu.training.lesson7;

public class SmallestNumberInArray {
    public static void main(String[] args) {
        int[] numbers = {10, 2, -8, 9, 12, 24};
        int smallestNumberInArray = numbers[0];

        for (int i = 1; i < numbers.length; i++) { //jo pirma iteracija ir lieka del ta, ka smallestNumberInArray ir inicializets
            int currentNumber = numbers[i];
            if (smallestNumberInArray > currentNumber)
                smallestNumberInArray = currentNumber;
        }

        System.out.print(smallestNumberInArray);
    }
}

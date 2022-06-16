package lv.lu.training.lesson11;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int sum(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

    public boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public int multiply(int a, int b) {
        return a * b;
    }


}

package lv.lu.training.lesson11;

public class Calculator {

    public int sum(int a, int b) {
        return a+b;
    }

    public int subtract(int a, int b) {
        return a-b;
    }

    public int divide(int a, int b) {
        return a/b;
    }

    public int sumArray(int[] numbers) {
        int result = 0;
        for (int i:numbers)
            result += i;
        return result;
    }

    public boolean isOdd (int num) {
        return num%2 != 0;
    }
}

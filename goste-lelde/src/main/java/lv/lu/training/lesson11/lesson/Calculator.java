package lv.lu.training.lesson11.lesson;

public class Calculator {

    public int sum(int a, int b){
        return a+b;
    }

    public int subract(int a, int b){
        return a-b;
    }

    public int divide(int a, int b){
        return a/b;
    }

    public int sum(int[] numbers){
        int result = 0;
        for (int number : numbers){
             result += number;
        }
        return result;
    }

    public boolean isOddNumber (int number){
        return number % 2 != 0;

    }

    public int multiply(int a, int b){
        return a*b;
    }

}

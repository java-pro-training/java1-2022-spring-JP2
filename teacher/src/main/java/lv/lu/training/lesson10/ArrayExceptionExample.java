package lv.lu.training.lesson10;

public class ArrayExceptionExample {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        if (numbers.length >= 4) {
            System.out.println(numbers[4]);
        }
    }

}

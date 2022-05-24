package lv.lu.training.lesson7;

public class BubbleSort {

    private final int[] numbers;

    public BubbleSort(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] sort() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - 1; j++) {
                if (numbers[j - 1] > numbers[j]) {
                    int temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }


    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort(new int[]{1, 6, 2, 3, 10});
        System.out.println(bubbleSort.sort());
    }

}

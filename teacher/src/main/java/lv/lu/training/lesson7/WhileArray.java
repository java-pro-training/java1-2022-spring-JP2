package lv.lu.training.lesson7;

public class WhileArray {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 2, 10, 3};

        int i = 0;
        while (numbers[i] % 2 == 0 && i < numbers.length) {
            i++;
        }

        if (i < numbers.length) {
            System.out.println("Pirmais nepāra skaitrlis ir " + numbers[i]);
        }
    }

}

package lv.lu.training.lesson4;

public class GreatestOfThree {
    public static void main (String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Ievadi pirmo skaitli!");
        int firstNumber = scanner.nextInt();

        System.out.println("Ievadi otro skaitli!");
        int secondNumber = scanner.nextInt();

        System.out.println("Ievadi trešo skaitli!");
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println(firstNumber + " ir lielākais!");
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println(secondNumber + " ir lielākais!");
        } else {
            System.out.println(thirdNumber + " ir lielākais!");
        }
    }
}


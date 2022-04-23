package lv.lu.training.lesson4;

public class BadIfStatement {
    public static void main(String[] args) {
        int age = 100;

        if (age > 50) {
            System.out.println("-------------------------");
            System.out.println("Vecums ir lielāks par 50");
            System.out.println("-------------------------");
        } else if (age > 100) {
            System.out.println("Vecums ir lielāks par 100");
        } else if (age > 10) {
            System.out.println("Vecums ir lielāks par 10");
        } else {
            System.out.println("Vecums ir mazāks par 10");
        }

    }
}

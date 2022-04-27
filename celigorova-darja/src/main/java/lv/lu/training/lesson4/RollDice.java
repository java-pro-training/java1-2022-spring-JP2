package lv.lu.training.lesson4;

public class RollDice {
    public static void main(String[] args) {

        java.util.Random random = new java.util.Random();
        int dice1 = random.nextInt(1,7);
        int dice2 = random.nextInt(1,7);
        int result = dice1 + dice2;

        System.out.println(result);
        if (result == 7 || result == 11) {
            System.out.println("Spēle ir vinnēta!");
        } else {
            System.out.println("Spēle ir zaudēta!");
        }
    }
}
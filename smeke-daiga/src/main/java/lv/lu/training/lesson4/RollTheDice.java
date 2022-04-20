package lv.lu.training.lesson4;

public class RollTheDice {
    public static void main(String[] args) {
        int dice1;
        int dice2;
        int result;

        //veido objektu java.util.Random objektu, ar kura palīdzību tiks ģenerēti skaitļi. Not really sure this is correct. Seems to work.
        java.util.Random random = new java.util.Random();


        //metode “nextInt” atgriež izvēles skaitļus no 0 līdz norādītajai robežai
        //The nextInt(int n) is used to get a random number between 0(inclusive) and the number passed in this argument(n), exclusive.
        dice1 = random.nextInt(6) + 1;
        dice2 = random.nextInt(6) + 1;
        result = dice1 + dice2;

        System.out.println(dice1);
        System.out.println(dice2);
        System.out.println(result);

        if (result==7 || result==11)
            System.out.println("spēle ir vinnēta");
        else
            System.out.println("Spēle ir zaudēta");
    }
}

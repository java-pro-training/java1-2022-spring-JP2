package lv.lu.training.lesson6;

public class RollTheDiceExtension {
    public static void main(String[] args) {
        int dice1;
        int dice2;
        int result = 0;
        int wonGames = 0;
        int lostGames = 0;

        //veido objektu java.util.Random objektu, ar kura palīdzību tiks ģenerēti skaitļi. Not really sure this is correct. Seems to work.
        java.util.Random random = new java.util.Random();


        //metode “nextInt” atgriež izvēles skaitļus no 0 līdz norādītajai robežai
        //The nextInt(int n) is used to get a random number between 0(inclusive) and the number passed in this argument(n), exclusive.

        while (result != 12) {
            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
            result = dice1 + dice2;
            System.out.println(result);
                if (result == 12) {
                    System.out.println("You rolled 12. The game is finished" + "\r\n" +
                            "Number of rounds won: " + wonGames + "\r\n" +
                            "Number of rounds lost: " + lostGames);
                }
                else if (result==7 || result==11) {
                    wonGames++;
                    System.out.println("You win this round." + "\r\n" +
                            "Number of rounds won: " + wonGames + "\r\n" +
                            "Number of rounds lost: " + lostGames);
                    }
                else if (result==2 || result==3 || result==6) {
                    lostGames++;
                    System.out.println("You lost this round." + "\r\n" +
                            "Number of rounds won: " + wonGames + "\r\n" +
                            "Number of rounds lost: " + lostGames);
                    }
                else
                    System.out.println("Neither won nor lost" + "\r\n" +
                            "Number of rounds won: " + wonGames + "\r\n" +
                            "Number of rounds lost: " + lostGames + "\r\n" +
                            "Let's continue this loop of madness");

            }

        }
    }

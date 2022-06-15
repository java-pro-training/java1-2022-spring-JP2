package lv.lu.training.darupati;

public class SkaitlisVardos {
    public static void main(String[] args) {
        System.out.println("DOTO SKAITLI UZRAKSTĪT AR VĀRDIEM");
        System.out.println("Ciparu skaits " + getDigitCount(235));
        System.out.println("Apgrieztais skaitlis:  " + reverse(235));
        System.out.println("Skaitlis izteikts vārdos ir: " + numberToWords(235));

    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int ciparuSkaits = 1;
        while (number > 9) {
            number /= 10;
            ciparuSkaits++;
        }
        return ciparuSkaits;
    }

    public static int reverse(int number) {

        int reverseNumber = 0;

        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }
        return reverseNumber;
    }

    public static int numberToWords(int number) {
        for (int i = 0; i <= getDigitCount(number)+1; i++) {
            int lastDigit = number % 10;


            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
            }
            number /= 10;

        }
        return number;
    }
}

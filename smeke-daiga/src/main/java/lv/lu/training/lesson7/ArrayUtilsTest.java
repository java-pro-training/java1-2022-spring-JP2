package lv.lu.training.lesson7;

//Izveidojam jaunu klasi ar nosaukumu ArrayUtilsTest
public class ArrayUtilsTest {

    //pievienojam “main” metodi
    public static void main(String[] args) {
    /*Tā kā metode “reverse” ir statiska, tad mēs varam to izsaukt bez objekta veidošanas.
    Izsaucam to klases ArrayUtilsTest metodē “main” un rezultātu ievietojam mainīgajā “result”*/

        int[] result = ArrayUtils.reverse(new int[]{1, 2, 3});

        System.out.print("Testējam klases ArrayUtils metodi 'reverse', darbojas ..");
        if (result[0] == 3 && result[1] == 2 && result[2] == 1) {
            System.out.println("PAREIZI");
        } else {
            System.out.println("NEPAREIZI");
        }

    }
}

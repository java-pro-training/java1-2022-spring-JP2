package lv.lu.training.lesson7;

public class ArrayUtilsTest {

    public static void main(String[] args) {
        int[] result = ArrayUtils.reverse(new int[]{1, 2, 3});

        System.out.print("Testējam klases ArrayUtils metodi 'reverse', darbojas ..");
        if (result[0] == 3 && result[1] == 2 && result[2] == 1) {
            System.out.println("PAREIZI");
        } else {
            System.out.println("NEPAREIZI");
        }

//********* JAUTĀJUMS *****************
        //  Ja es vēlos izdrukāt iegūto masīvu "result" un rakstu:
        //    System.out.println(result);

        //  Tiek izdrukāta skaitļu un burtu virkne. Atradu lekcijas materiālos, ka to jāpārveido ar
        //  Override iebūvēto metoti String to String, bet nesanāca no izdarīt.
        //  Kā to pareizi izdarīt?

        //    @Override
        //    public String toString ()



    }
}



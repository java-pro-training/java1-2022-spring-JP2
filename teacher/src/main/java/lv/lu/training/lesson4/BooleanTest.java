package lv.lu.training.lesson4;

public class BooleanTest {

    public static void main(String[] args) {
        System.out.println("True and True: " + (true && true));
        System.out.println("True and False: " + (true && false));
        System.out.println("False and True: " + (false && true));
        System.out.println("False and False: " + (false && false));

        System.out.println("True or True: " + (true || true));
        System.out.println("True or False: " + (true || false));
        System.out.println("False or True: " + (false || true));
        System.out.println("False or False: " + (false || false));

        System.out.println("True xor True: " + (true | true));
        System.out.println("True xor False: " + (true | false));
        System.out.println("False xor True: " + (false | true));
        System.out.println("False xor False: " + (false | false));
    }

}

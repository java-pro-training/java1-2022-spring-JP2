package lv.lu.training.lesson4;

public class IfStatement {

    public static void main(String[] args) {
        int age = 12;

        boolean isAdult = age > 17;
        if (isAdult) {
            System.out.println("Ir sasniegta pilngadība!");
        } else {
            System.out.println("Pilngadība nav sasniegta!");
        }

    }

}

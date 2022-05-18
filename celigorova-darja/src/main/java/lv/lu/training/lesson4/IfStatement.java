package lv.lu.training.lesson4;

public class IfStatement {
    public static void main(String[] args) {
        int age = 30;
        if (age >= 17) {
            System.out.println("Ir sasniegta pilngadība!");
        }
        if (age >= 18 && age <= 65) {
            System.out.println("Ir darbspējīgs vecums");
        }
    }
}



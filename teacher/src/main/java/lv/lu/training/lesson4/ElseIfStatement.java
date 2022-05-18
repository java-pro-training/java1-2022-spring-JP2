package lv.lu.training.lesson4;

public class ElseIfStatement {

    public static void main(String[] args) {
        int age = 11;

        if (age > 17 && age < 65) {
            System.out.println("Ir darbspējigs vecums.");
        } else if (age > 13 && age <= 17) {
            System.out.println("Ir pusaudžu darbspējīgs vecums.");
        } else if (age >= 0 && age <= 13) {
            System.out.println("Nav sasniegts darbspējīgs vecums.");
        } else if (age < 0) {
            System.out.println("Nekorekti norādīts vecums.");
        } else {
            System.out.println("Ir sasniegts pensionēšanās vecums.");
        }

    }

}

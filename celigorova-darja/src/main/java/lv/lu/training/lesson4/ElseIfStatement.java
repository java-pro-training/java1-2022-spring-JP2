package lv.lu.training.lesson4;

public class ElseIfStatement {
    public static void main(String[] args) {
        int age = 65;
        if (age > 17 && age < 65) {
            System.out.println("Ir darbspējīgs vecums");
        } else if (age > 13 && age <= 17) {
            System.out.println("Ir pusaudžu darbspējīgs vecums.");
        } else if (age <=13) {
            System.out.println("Darbspējīgs vecums nav sasniegts");
        } else {
            System.out.println("Ir sasniegts pensionēšanas vecums");
        }
    }

}

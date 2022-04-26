package lv.lu.training.lesson4;

public class NotEqualsCOmplexExample {
    public static void main(String[] args) {
        int age = 17;

        if (!(age < 18) && !(age > 64)) {
            System.out.println("Ir sasniegts darbspējīgs vecums.");
        } else if (age < 18) {
            System.out.println("Nav sasniegts darbspējīgs vecums.");
        } else {
            System.out.println("Ir sasniegts pensionēšanās vecums.");
        }

    }
}

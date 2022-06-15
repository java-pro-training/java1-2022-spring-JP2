package lv.lu.training.lesson10;

public class NullString {

    public static void main(String[] args) {
        System.out.println(length("Saule"));
        System.out.println(length("Mežs"));
        System.out.println(length(null));
        System.out.println(length("Ūdens"));
    }

    public static int length(String value) {
        if (value != null) {
            return value.toCharArray().length;
        } else {
            throw new NullPointerException("Simbolu virknei nav vērtības!");
        }
    }

}

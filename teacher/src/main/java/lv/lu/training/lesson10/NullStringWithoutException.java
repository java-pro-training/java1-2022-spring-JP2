package lv.lu.training.lesson10;

public class NullStringWithoutException {

    public class NullString {

        public static void main(String[] args) {
            System.out.println(length("Saule"));
            System.out.println(length("Mežs"));
            if (length(null) == -1) {
                return;
            } else {
                System.out.println(length(null));
            }

            System.out.println(length("Ūdens"));
        }

        public static int length(String value) {
            if (value != null) {
                return value.toCharArray().length;
            } else {
               return -1;
            }
        }

    }


}

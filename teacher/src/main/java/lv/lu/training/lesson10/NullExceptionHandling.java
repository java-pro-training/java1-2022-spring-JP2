package lv.lu.training.lesson10;

public class NullExceptionHandling {

    public static void main(String[] args) {
        System.out.println("Programmas sākums");
        try {
            printWords();
        } catch (NullPointerException exception) {
            System.out.println("Vārdu massīvs satur vārdu ar vērtību null.");
            exception.printStackTrace();
        } finally {

        }

        System.out.println("Programmas beigas");
    }

    private static void printWords() {
        String[] words = new String[]{"Saule", "Mežs", null, "Zeme"};
        int i = 0;
        for (String word : words) {
            try {
                System.out.println("Vārds " + word + " ar indexu " + i + " ir " + word.length() + " simbolus garš.");
            }catch (NullPointerException | ArrayIndexOutOfBoundsException | OutOfMemoryError e) {
                System.out.println("Vārdam nav vērtības!");
            }
            i++;
        }
    }

}

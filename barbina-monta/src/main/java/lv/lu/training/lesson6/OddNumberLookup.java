package lv.lu.training.lesson6;

public class OddNumberLookup {
    public int from;
    public int till;

    public OddNumberLookup(int from, int till) {
        this.from=from;
        this.till=till;
    }

    public int getFrom() {return from;}
    public int getTill() {return till;}

    public static boolean isOdd(int number){
        return number % 2 != 0;

    }

    public static void main(String[] args) {

        OddNumberLookup example = new OddNumberLookup(20, 90);

        for (int i = example.getFrom(); i <= example.getTill(); i++) {
            if (isOdd(i)) {

                System.out.println(i);

            }
        }
    }}



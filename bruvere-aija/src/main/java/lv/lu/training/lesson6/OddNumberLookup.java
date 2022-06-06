package lv.lu.training.lesson6;

public class OddNumberLookup {
    public int from;
    public int till;

    public OddNumberLookup(int from, int till){
        this.from = from;
        this.till = till;
    }

    public int getFrom() {
        return from;
    }

    public int getTill() {
        return till;
    }
    public static boolean isOdd(int number){
        return number % 2 !=0;
    }
    public static void main(String[] args){
        OddNumberLookup interval = new OddNumberLookup(3,7);
        for (int i = interval.getFrom();i <= interval.getTill();i++){
            if (isOdd(i)){
                System.out.println(i);
            }
        }
    }
}

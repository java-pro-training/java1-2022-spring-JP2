package lv.lu.training.lesson11;

public class OddNumberLookup {
    private int from;
    private int till;


    public OddNumberLookup(int from,int till){
        this.from=from;
        this.till=till;
    }
    public boolean isOdd (int number){
        return (number % 2 !=0);
    }

    public int getFrom() {
        return from;
    }

    public int getTill() {
        return till;
    }
}

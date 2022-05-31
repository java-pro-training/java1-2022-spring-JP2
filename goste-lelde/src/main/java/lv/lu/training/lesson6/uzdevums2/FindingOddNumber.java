package lv.lu.training.lesson6.uzdevums2;

public class FindingOddNumber {

    public int from;
    public int till;

    public FindingOddNumber(int from, int till){
        this.from = from;
        this.till = till;
    }

    public int getFrom() {return from;}
    public int getTill() {return till;}


    public static boolean isOdd(int number){
        return (number % 2 != 0);
    }

    public static void main (String [] args){

        FindingOddNumber interval = new FindingOddNumber(12,42);

        if (interval.getFrom()>interval.getTill()){
            System.out.println("Nepareizs formats.");
            System.out.println("Skaitlis 'no' ir lielaks par skaitli 'lidz'.");
            System.out.println("Meginiet velreiz!");
        } else {
            for (int i=interval.getFrom();i<=interval.getTill();i++){
                if (isOdd(i)) {
                    System.out.println(i);
                }
            }
        }
    }

}

package lv.lu.training;

import java.util.Random;

public class randomNumber {
    private int result;

    public void sum(int a,int b,int c){
        result = a+b+c;
    }

    public int getResult() {
        return result;
    }

    public static void main(String[] args) {
        randomNumber mathematics = new randomNumber();
        Random numberAdder = new Random();
        int a = numberAdder.nextInt(99);
        int b = numberAdder.nextInt(88);
        int c = numberAdder.nextInt(77);
        mathematics.sum(a,b,c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(mathematics.getResult());


    }
}

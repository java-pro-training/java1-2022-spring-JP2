package lv.lu.training.lesson5;

public class SimpleCounter {
    private int value;
    private int step;

    public int getValue() {
        return value;
    }
    //Void vienigais datu tips, kas atlauj rakstit metodi bez return
    public void increment() {
        value += 1;
    }

    public void decrement() {
        value -= 1;
    }

    public void clear() {
        value = 0;
    }


    public static void main(String[] args) {
        SimpleCounter myCounter = new SimpleCounter();
        myCounter.increment();
        myCounter.increment();
        myCounter.decrement();
        System.out.println("Value is: " + myCounter.getValue());
    }
}

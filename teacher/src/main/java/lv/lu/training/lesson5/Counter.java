package lv.lu.training.lesson5;

public class Counter {

    private int value;
    private int step;

    public Counter() {
        step = 1;
    }

    public Counter(int step) {
        if (step > 0) {
            this.step = step;
        } else {
            this.step = 1;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value >= 0) {
            this.value = value;
        } else {
            System.out.println("Vērtībai ir jābūt lielākai vai vienādai ar 0");
        }
    }

    public void increment() {
        // value += step; // value = value + 1;
        value++;
    }

    public void decrement() {
        //value -= step; // value = value - 1;
        value--;
    }

    public void clear() {
        value = 0;
    }


    public static void main(String[] args) {
        Counter myCounter = new Counter(-10);
        myCounter.setValue(10);
        myCounter.increment();
        myCounter.increment();
        myCounter.decrement();

        System.out.println("Rezultāts ir : " + myCounter.getValue());
    }

}

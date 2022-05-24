package lv.lu.training.lesson5.praktiskie_darbi;

public class Counter {

    private int value; // int datu tipam noklusētā vērtība = 0
    private int step;

    public Counter(){
        step=1;
    }

    public Counter(int step){
        if (step > 0){
            this.step = step;
        }else{
            this.step = (0-step);
        }


    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        if (isGreaterThanZero(value)){
            this.value = value;
        } else {
            System.out.println("Vērtībai ir jābūt lielākais vai vienādai ar 0");
        }

    }

    private boolean isGreaterThanZero(int value) {
        return value >= 0;
    }

    public void increment(){
         value += step; //value ++;
    }

    public void decrement(){
        value -= step; // value --;
    }

    public void clear(){
        value = 0;
    }

    public static void main (String[] args){
        Counter myCounter = new Counter(-10);
        myCounter.setValue(10);
        myCounter.increment();
        myCounter.increment();
        myCounter.decrement();

        System.out.println("Rezultāts ir:" + myCounter.getValue());

    }


}

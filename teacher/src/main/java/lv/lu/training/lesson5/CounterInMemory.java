package lv.lu.training.lesson5;

public class CounterInMemory {

    public static void main(String[] args) {
        Counter firstCounter = new Counter();
        firstCounter.setValue(1);

        Counter secondCounter = firstCounter;
        secondCounter.setValue(2);
        firstCounter.setValue(1);

        Counter thirdCounter = new Counter();
        thirdCounter.setValue(3);

        System.out.println("Pirmā skaitītāja vērtība : " + firstCounter.getValue());
        System.out.println("Otrā skaitītāja vērtība : " + secondCounter.getValue());
        System.out.println("Trešā skaitītāja vērtība : " + thirdCounter.getValue());

        System.out.println("Pirmais un otrais skaitītājs atsaucās uz vienu objektu atmiņā : " + (firstCounter == secondCounter));
        System.out.println("Otrais un trešais skaitītājs atsaucās uz vienu objektu atmiņā : " + (secondCounter == thirdCounter));
    }

}

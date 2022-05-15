package lv.lu.training.lesson6;

public class Continue {
    public static void main(String[] args) {

        //FOR loop - parcel pie cikla modificesanas izteiksmes

        for (int i = 1; i <= 10; i++) {
            if (i == 5 || i == 6) {
                continue; // will not print 5 and 6
            }
            System.out.println("i="+i);
        }

        for (int i = 1; i <= 10; i++) {
            if (i%2 == 0) {
                continue; // will not even numbers
            }
            System.out.println("i="+i);
        }

        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.println("i="+i++); //Atgriezt 1 un inkrementet par 1

        }
    }
}

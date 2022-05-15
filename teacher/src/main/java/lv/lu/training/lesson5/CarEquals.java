package lv.lu.training.lesson5;

public class CarEquals {

    public static void main(String[] args) {
        String car1 = "BMW";
        String car2 = car1;
        String car3 = "BMW";
        String car4 = "Audi";

        if (car1.equals(car1)) {
            System.out.println("Car1 is the same as Car1");
        }

        if (car1.equals(car2)) {
            System.out.println("Car1 is the same as Car2");
        }

        if (car2.equals(car3)) {
            System.out.println("Car2 is equal to Car3");
        }

        if (car1.equals(car3)) {
            System.out.println("Car1 is equal to Car3");
        }

        if (!car1.equals(car4)) {
            System.out.println("Car1 is not equal to Car4");
        }

    }

}

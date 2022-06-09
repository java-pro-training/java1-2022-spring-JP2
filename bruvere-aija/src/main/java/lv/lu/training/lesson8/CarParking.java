package lv.lu.training.lesson8;

import java.util.Arrays;

public class CarParking {
    private static boolean car;

    public static void main(String[] args) {
        Bus myNewBus = new Bus("Red", 2020, "Volvo", 50);
        Bus myOldBus = new Bus("Yellow", 1990, "Man", 15);

        System.out.println("myNewBuss: " + myNewBus);
        System.out.println("myOldBuss: " + myNewBus);
        System.out.println("Are busses equals: " + myNewBus.equals(myOldBus));

        Truck myTruck = new Truck("black", 2010, "Man", 3000);
        Car myCar = new Car("Green", 2021, "BMW");

        System.out.println(car);
        }
    }


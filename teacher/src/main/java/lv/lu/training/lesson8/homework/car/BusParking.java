package lv.lu.training.lesson8.homework.car;

import java.util.List;

public class BusParking {

    public static void main(String[] args) {
        Bus redVolvoBus = new Bus("Red", 2022, "Volvo", 50);
        Bus yellowManBus = new Bus("Yellow", 2020, "Man", 40);

        System.out.println("New bus: " + redVolvoBus);
        System.out.println("Old bus: " + yellowManBus);

        System.out.println("Are buses equal: " + redVolvoBus.equals(yellowManBus));

        Truck manTruck = new Truck("Black", 2010, "Man", 3000);
        Car audi = new Car("Black", 2022, "Audi");

        List<Car> vehicles = List.of(redVolvoBus, yellowManBus, manTruck, audi);
        for (Car vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

}

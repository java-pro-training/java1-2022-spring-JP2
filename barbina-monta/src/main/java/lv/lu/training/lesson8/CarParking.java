package lv.lu.training.lesson8;

import java.util.Arrays;
import java.util.List;

public class CarParking {

    public static void main(String[] args) {

        Buss MyVeryOldBuss = new Buss("yellow", 1992, "Volvo", 20);
        Buss MySomehowNewerBuss = new Buss("orange", 1993, "Carrot", 59);
        Truck veryGoodOne = new Truck("black", 2020, "Toyota",771);
        Car aFineCar = new Car("blue", 2021, "Hyundai");


        System.out.println("My very old buss: " + MyVeryOldBuss);
        System.out.println("My somehow newer buss: " + MySomehowNewerBuss);
        System.out.println("Are thees busses the same: " + MyVeryOldBuss.equals(MySomehowNewerBuss));
        System.out.println();


        List<Car>allMyVehicles = Arrays.asList(MyVeryOldBuss, MySomehowNewerBuss, veryGoodOne, aFineCar);
        for (Car car: allMyVehicles){
            System.out.println(car);
        }

    }
}

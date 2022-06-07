package lv.lesson8.homework.part1;

import java.util.Arrays;
import java.util.List;

public class CarParking {
    public static void main(String[] args) {
        Buss myNewBuss = new Buss("Red",2020,"Volvo",50);
        Buss myOldBuss = new Buss("Yellow", 1990,"Man",15);

        System.out.println("myNewBuss: "+myNewBuss);
        System.out.println("myOldBuss: "+myOldBuss);
        System.out.println("All busses equals: "+myNewBuss.equals(myOldBuss));

        Truck myTrack = new Truck("black",2010,"Man",3000);
        Car myCar = new Car("Green",2021,"BMW");
        List<Car> allMyVehicles = Arrays.asList(myNewBuss,myOldBuss,myTrack,myCar);
        for (Car car : allMyVehicles){
            System.out.println(car);
        }
    }
}

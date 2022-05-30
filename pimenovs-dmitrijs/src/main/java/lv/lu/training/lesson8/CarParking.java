package lv.lu.training.lesson8;

import java.util.Arrays;
import java.util.List;

public class CarParking {
    public static void main(String[] args) {
        Buss myNewBuss = new Buss("blue",2015,"icarus",15);
        Buss myOldBuss= new Buss("grey", 2001, "mercedes", 10);
Car myCar = new Car("White" , 2003, "Mercedes-Benz");
Truck myTruck = new Truck("Black",1998,"Man",2500);
        List<Car> allMyVehicles = Arrays.asList(myNewBuss,myOldBuss,myCar,myTruck);
        for (Car car: allMyVehicles){
            System.out.println(car);
            System.out.println("========================");
        }
        System.out.println("myNewBuss " + myNewBuss);
        System.out.println("myOldBuss " + myNewBuss);
        System.out.println("Are busses equals: " + myNewBuss.equals(myOldBuss));
    }
}

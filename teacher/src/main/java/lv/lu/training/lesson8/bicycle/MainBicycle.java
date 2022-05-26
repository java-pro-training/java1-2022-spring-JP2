package lv.lu.training.lesson8.bicycle;

public class MainBicycle {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Saliekamais velosipēds", 15);
        MountainBike mountainBike = new MountainBike("Cube", 42, 10);

        bicycle.accelerate();

        mountainBike.accelerate();
        mountainBike.changeGear(2);

        System.out.println(bicycle);
        System.out.println(mountainBike);

        System.out.println(mountainBike.brand);
        System.out.println(mountainBike.getBrand());

    }

}

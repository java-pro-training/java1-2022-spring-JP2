package lv.lu.training.lesson8;

public class Bicycles {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Pinarello", 15);
        MountainBicycle mountainBicycle = new MountainBicycle("BMC", 42, 2);
        System.out.println(bicycle);
        System.out.println(mountainBicycle);

        System.out.println("Pedal to the metal!");
        mountainBicycle.accelerate(); //metode no bicycle accelerate that will increase speed of the Mountain bike
        System.out.println(bicycle);
        System.out.println(mountainBicycle);
    }
}

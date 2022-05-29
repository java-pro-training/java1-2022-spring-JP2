package lv.lu.training.lesson8.bicycle;

public class MountainBike extends Bicycle {

    private int gear;
    public String brand;

    public MountainBike(String brand, int speedInKilometersPerHour, int gear) {
        super(brand, speedInKilometersPerHour);
        this.gear = gear;
    }

    public void changeGear(int gear) {
        this.gear = gear;
    }

    @Override
    public String getSerialNumber() {
        return "MB:" + serialNumber;
    }

    @Override
    public String toString() {
        return "MountainBike{gear=" + gear +
                ",brand=" + brand +
                ",speedInKilometersPerHour=" +
                speedInKilometersPerHour +
                "}";
    }

}

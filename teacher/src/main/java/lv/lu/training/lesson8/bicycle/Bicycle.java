package lv.lu.training.lesson8.bicycle;

public class Bicycle {

    protected String brand;
    protected int speedInKilometersPerHour;
    protected String serialNumber;

    public Bicycle(String brand, int speedInKilometersPerHour) {
        this.brand = brand;
        this.speedInKilometersPerHour = speedInKilometersPerHour;
    }

    public void accelerate() {
        speedInKilometersPerHour++;
    }

    public void decelerate() {
        speedInKilometersPerHour--;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "Bicycle{brand=" + brand +
                ",speedInKilometersPerHour=" +
                speedInKilometersPerHour +
                "}";
    }

}

package lv.lu.training.lesson8;

import lv.lu.training.lesson8.bicycle.Bicycle;

public class RetroBike extends Bicycle {

    private int age;

    public RetroBike(int age, String brand, int speedInKilometersPerHour) {
        super(brand, speedInKilometersPerHour);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getSerialNumber() {
        return "RB:" + serialNumber;
    }

}

package lv.lu.training.lesson8.homework.car;

import java.util.Objects;

public class Car {

    protected final String color;
    protected final int year;
    protected final String manufacturer;

    public Car(String color, int year, String manufacturer) {
        this.color = color;
        this.year = year;
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", year=" + year +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(color, car.color) && Objects.equals(manufacturer, car.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, year, manufacturer);
    }
}

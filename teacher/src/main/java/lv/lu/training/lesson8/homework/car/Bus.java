package lv.lu.training.lesson8.homework.car;

import java.util.Objects;

public class Bus extends Car implements PassengerVehicle {

    private final int seatCount;

    public Bus(String color, int year, String manufacturer, int seatCount) {
        super(color, year, manufacturer);
        this.seatCount = seatCount;
    }

    @Override
    public int seatCount() {
        return seatCount;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "seatCount=" + seatCount +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return seatCount == bus.seatCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), seatCount);
    }
}

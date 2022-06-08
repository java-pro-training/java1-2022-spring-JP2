package lv.lu.training.lesson8;

public class Buss extends Car implements Passenger  {

    private final int seatCount;


    public Buss(String color, int year, String manufacturer, int seatCount) {
        super(color, year, manufacturer);
        this.seatCount = seatCount;
    }


    @Override
    public int seatCount() {
        return this.seatCount;
    }
    @Override
    public String toString() {
        return "Buss{" +
                "color='" + getColor() + '\'' +
                ", year='" + getYear() + '\'' +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", passengerSeatCount=" + seatCount +
                "} ";
    }
    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Buss buss = (Buss) that;
        return seatCount == buss.seatCount
                && getColor().equals(buss.getColor())
                && getYear() == buss.getYear()
                && getManufacturer().equals(buss.getManufacturer());
    }

}





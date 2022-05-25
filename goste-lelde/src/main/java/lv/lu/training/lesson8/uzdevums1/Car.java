package lv.lu.training.lesson8.uzdevums1;

import java.util.Objects;

public class Car {

    private final String colour;
    private final int year;
    private final String manufacturer;


    public Car(String colour, int year, String manufacturer){
        this.colour = colour;
        this.year = year;
        this.manufacturer = manufacturer;
    }

    public String getColour(){return colour;}
    public int getYear(){return year;}
    public String getManufacturer(){return manufacturer;}

    @Override
    public String toString(){
        return "Car{colour='"+colour+"' ,year='"+year+"' ,manufacturer='"+manufacturer+"'}";
    }

    @Override
    public boolean equals(Object that){
        if (this==that) return true;
        if (this==null || getClass() != that.getClass()) return false;
        Car car = (Car) that;
        return Objects.equals(colour,car.colour)&&Objects.equals(year,car.year)&&
                Objects.equals(manufacturer,car.manufacturer);
    }

}

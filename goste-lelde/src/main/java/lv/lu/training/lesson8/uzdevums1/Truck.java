package lv.lu.training.lesson8.uzdevums1;

public class Truck extends Car{

    private long loadCapacity;

    public Truck(String colour, int year, String manufacturer, long loadCapacity){
        super(colour, year, manufacturer);
        this.loadCapacity=loadCapacity;
    }

    @Override
    public String toString(){
        return "Truck{colour='"+getColour()+"', year='"+getYear()+
                "', manufacturer='"+getManufacturer()+"', load capacity='"+loadCapacity+"'}";
    }

    @Override
    public boolean equals(Object that){
        if (this==that) return true;
        if (that==null || getClass()!=that.getClass()) return false;
        Truck truck = (Truck) that;
        return loadCapacity == truck.loadCapacity && getColour().equals(truck.getColour())&&
                getYear()==truck.getYear()&&getManufacturer().equals(truck.getManufacturer());
    }


}

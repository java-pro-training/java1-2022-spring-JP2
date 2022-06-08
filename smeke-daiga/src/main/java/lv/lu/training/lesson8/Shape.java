package lv.lu.training.lesson8;

public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    abstract double area();
}

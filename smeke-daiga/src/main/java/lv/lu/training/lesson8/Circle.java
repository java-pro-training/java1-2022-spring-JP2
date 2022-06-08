package lv.lu.training.lesson8;

public class Circle extends Shape {
    private int radius;
    public Circle(String color,int radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    double area() {
        return 3.14*radius*radius;
    }
}

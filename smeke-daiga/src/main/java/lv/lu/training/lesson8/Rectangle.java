package lv.lu.training.lesson8;

public class Rectangle extends Shape {
    private int width;
    private int height;
    public Rectangle (String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    double area() {
        return width * height;
    }
}

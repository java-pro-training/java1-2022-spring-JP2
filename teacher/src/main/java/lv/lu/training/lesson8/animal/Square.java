package lv.lu.training.lesson8.animal;

public class Square extends Shape {

    private int sideLength;

    public Square(String color, int sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public int getArea() {
        return sideLength * sideLength;
    }
}

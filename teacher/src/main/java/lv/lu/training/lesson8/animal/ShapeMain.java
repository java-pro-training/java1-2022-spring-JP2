package lv.lu.training.lesson8.animal;

public class ShapeMain {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Red", 10, 5);
        Square square = new Square("Green", 10);

        ShapePrinter.print(rectangle);
        ShapePrinter.print(square);

    }


}

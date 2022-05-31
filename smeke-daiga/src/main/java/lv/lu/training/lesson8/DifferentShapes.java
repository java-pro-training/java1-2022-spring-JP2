package lv.lu.training.lesson8;

public class DifferentShapes {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 3);
        Shape rectangle = new Rectangle("Blue", 2, 4);
        /*System.out.println("Circle area = " + circle.area());
        System.out.println("Rectangle area = " + rectangle.area());*/

        ShapePrinter.print(circle);
        ShapePrinter.print(rectangle);
    }
}

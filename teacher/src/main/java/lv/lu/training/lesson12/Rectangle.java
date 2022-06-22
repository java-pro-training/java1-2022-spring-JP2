package lv.lu.training.lesson12;

public class Rectangle {

    private int height;
    private int width;

    public void setValue (String name, int value) {
        if (name.equals("height")) {
            height = value;
        }
        if (name.equals("width")) {
            width = value;
        }
    }

    public int area() {
        return width * height;
    }

}

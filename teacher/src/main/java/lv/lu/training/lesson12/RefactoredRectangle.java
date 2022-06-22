package lv.lu.training.lesson12;

public class RefactoredRectangle {

    private int height;
    private int width;

    @Deprecated
    public void setValue(String name, int value) {
        if (name.equals("height")) {
            setHeight(value);
        }
        if (name.equals("width")) {
            setWidth(value);
        }
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area() {
        return width * height;
    }

}

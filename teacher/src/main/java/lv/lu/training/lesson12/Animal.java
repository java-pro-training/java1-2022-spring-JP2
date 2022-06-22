package lv.lu.training.lesson12;

public class Animal {

    private static final int MAMMAL = 0, BIRD = 1, REPTILE = 2;
    private int kind;

    public Animal(int kind) {
        this.kind = kind;
    }

    String getSkin() {
        switch (kind) {
            case MAMMAL:
                return "hair";
            case BIRD:
                return "feathers";
            case REPTILE:
                return "scales";
            default:
                return "skin";
        }
    }
}


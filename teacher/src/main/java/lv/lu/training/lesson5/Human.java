package lv.lu.training.lesson5;

public class Human extends Animal {

    private String name;

    public Human() {
        this.name = "Unknown";
    }

    public Human(String name) {
        this.name = name;
    }

    @Override
    protected void printAction() {
        System.out.println("Cilvēks skrien!");
    }

}

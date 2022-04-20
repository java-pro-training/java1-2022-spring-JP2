package lv.lu.training.lesson3;

public class CatOwner {
    public static void main(String[] args) {

        Cat myCat = new Cat("Mayflower", "silver", 3.5);

        System.out.println("myCat's name - " + myCat.getName());
        System.out.println("color - " + myCat.getColor());
        System.out.println("weight - " + myCat.getWeight());
    }
}

package lv.lu.training.lesson3;

public class CatOwner {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.setColor("black");
        myCat.setName("Tom");
        myCat.setSpecies("bezšķirnes");
        myCat.setAge(5);
        myCat.setWeight(6);

        System.out.println("My cat's color - " + myCat.getColor());
        System.out.println("name - " + myCat.getName());
        System.out.println("species -" + myCat.getSpecies());
        System.out.println("age - " + myCat.getAge());
        System.out.println("weight - " + myCat.getWeight());
}}



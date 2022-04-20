package lv.lu.training.lesson3;

public class homeWorkLesson3CatOwner {

    public static void main(String[] args) {

        homeWorkLesson3Cat myCat = new homeWorkLesson3Cat("White", "Tom", 8);

        myCat.setAge(10);
        myCat.setSpecies("Siamese");
        System.out.println("My cat's color - " + myCat.getColor());
        System.out.println("Cat's name - " + myCat.getName());
        System.out.println("Species - " + myCat.getSpecies());
        System.out.println("Age - " + myCat.getAge());
        System.out.println("Weight - " + myCat.getWeight());

    }

}

package lv.lu.training.lesson3;

public class CatOwner {
    public static void main (String[] args){
        Cat myCat = new Cat("White and grey", "Putra", 5, 5,"Metiss");

        System.out.println("My cat's color - " + myCat.getColor());
        System.out.println("Name - " + myCat.getName());
        System.out.println("Species -" + myCat.getSpecies());
        System.out.println("Age -" + myCat.getWeight());
        System.out.println("Weight - " + myCat.getAge());

    }

}

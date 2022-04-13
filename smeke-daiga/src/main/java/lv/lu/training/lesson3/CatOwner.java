package lv.lu.training.lesson3;

public class CatOwner {
    //klase CatOwner ar metodi “main"
    public static void main(String[] args) {
    //metodē “main” izveidot klases Cat objektu
        //Objekts no klases Cat, kur konstruktora tika ievietots String color, String name, int weight
        Cat myCat = new Cat("black", "Tom", 5);

        //Ar “get” metodi izdrukāt visu lauku vērtības
        System.out.println("My cat's color - " + myCat.getColor());
        System.out.println("name - " + myCat.getName());
        System.out.println("species - " + myCat.getSpecies());
        System.out.println("age - " + myCat.getAge());
        System.out.println("weight - " + myCat.getWeight());

        //This will be output:
        //    My cat's color - black
        //    name - Tom
        //    species - null
        //    age - 0
        //    weight - 5
        //Why? I guess it is because when the object "myCat" was created "black", "Tom" and 5 were entered
        //which according to class constructor corresponded to color, name and weight in that order
        //Poor computer does not have any information on species and age at the moment
        //"null" for species probably because it is string
        //"0" for age because it is int. Is it a "true" zero or does it represent lack of data?
        //How would a true 0 look?

        myCat.setAge(2);
        myCat.setSpecies("Tomcat");

        System.out.println("species - " + myCat.getSpecies());
        System.out.println("age - " + myCat.getAge());
    }
}

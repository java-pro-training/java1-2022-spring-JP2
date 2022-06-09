package lv.lu.training.lesson3;

public class CatOwner {
    public static void main(String[] args) { //klases objekts main metodē
        Cat myCat = new Cat("Eira", "white", 4); // objekts ar konstruktoru
        myCat.setSpecies("wild"); // "set" metodes, lai saliktu vērtības tiem laukiem, kam nav konstruktora
        myCat.setAge(8);

        //objekta lauku vērtību izvade konsolē, izmantojot "get" metodes
        System.out.println("name - " + myCat.getName());
        System.out.println("My cat's color - " + myCat.getColor());
        System.out.println("Species - " + myCat.getSpecies());
        System.out.println("age - " + myCat.getAge());
        System.out.println("weight - " + myCat.getWeight());
    }
}

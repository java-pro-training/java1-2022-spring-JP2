package lv.lu.training.lesson3.majasdarbs1;

public class CatOwner {
    public static void  main(String[] args){
    Cat myCat = new Cat("black", "Tom", 5); // Tā kā mēs izmantojam tikai 3 parametrus, tikai tie arī būs iesetēti. Pārējie nav iesetēti, tāpēc tur būs "null"(jo String) un "0"(jo int)
        myCat.setAge(2);
        myCat.setSpecies("Russian Blue");
        System.out.println("My cat`s color - " + myCat.getColor());
        System.out.println("name - " + myCat.getName());
        System.out.println("species - " + myCat.getSpecies());
        System.out.println("age - " + myCat.getAge());
        System.out.println("weight - " + myCat.getWeight());
        myCat.setName("Murzik");
        myCat.setColor("Blue");
        myCat.setWeight(7);
        System.out.println("New cat`s name is " + myCat.getName());
        System.out.println("Murzik`s color is " + myCat.getColor());
        System.out.println("Murzik`s weight is " + myCat.getWeight());
    }
}

package lv.lesson3.homework3;

public class OurCustomersCats {

    public static void main(String[] args) {
        Cat firstCat = new Cat( "Pusi","white", 5.2f);
        firstCat.setAgeOfCat(8);
        firstCat.setSpecieOfCat("home");

        Cat secondCat = new Cat("Pusicat","black", 10.5f);
        secondCat.setAgeOfCat(6);
//        secondCat.setSpecieOfCat("tiger");

        Cat catOfMery = new Cat();
        catOfMery.setNameOfCat("May");
        catOfMery.setColorOfCat("grey");
        catOfMery.setWeightOfCat(6.8f);
        catOfMery.setAgeOfCat(3);
        catOfMery.setSpecieOfCat("street");

        String outputCat = "Mery`s cat is: " + catOfMery.getNameOfCat() +
                "\nIt`s color is: " + catOfMery.getColorOfCat() +
                "\nIt`s weight is: " + catOfMery.getWeightOfCat() +
                "\nIt`s age is: " + catOfMery.getAgeOfCat() +
                "\nIt`s species is: " + catOfMery.getSpecieOfCat();

        System.out.println("Our first client`s cat is: " + firstCat.getFullDescribeOfCat());
        System.out.println("Our second client`s cat is: " + secondCat.getFullDescribeOfCat());

        System.out.println("Mery`s cat is: " + catOfMery.getNameOfCat());
        System.out.println("It`s color is: " + catOfMery.getColorOfCat());
        System.out.println("It`s weight is: " + catOfMery.getWeightOfCat());
        System.out.println("It`s age is: " + catOfMery.getAgeOfCat());
        System.out.println("It`s species is: " + catOfMery.getSpecieOfCat());

        System.out.println("\n" + outputCat);
    }



}

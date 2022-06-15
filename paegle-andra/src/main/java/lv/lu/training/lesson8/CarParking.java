package lv.lu.training.lesson8;

public class CarParking {

    public static void main(String[] args) {
        Buss myNewBuss = new Buss("Red", 2022, "Scania", 11);
        Buss myOldBuss = new Buss("White", 1967, "Volvo", 7);

         System.out.println("myNewBuss: " + myNewBuss);
         System.out.println("myOldBuss: " + myNewBuss);
         System.out.println("Are busses equals: " + myNewBuss.equals(myOldBuss));

    }
}
//bija divas problēmas, ko nespēju pati atrisināt, atlika vien piekrist ieteikumiem.
package lv.lu.training.lesson6;

public class OddNumberLookup2 {
    public static void main (String[] args){
        OddNumberLookup2 oddNumberLookup2 = new OddNumberLookup2();
        oddNumberLookup2.printOddWithin(5, 17);
    }

    public void printOddWithin(int from, int till){
        for (int i= from; i<=till; i++){
            if (isOdd(i)){
                System.out.print(i + "  ");
            }
        }
    }


   private boolean isOdd(int number){
       return number%2 !=0;
   }
}




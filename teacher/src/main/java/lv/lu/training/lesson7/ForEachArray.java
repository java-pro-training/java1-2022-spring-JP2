package lv.lu.training.lesson7;

public class ForEachArray {

    public static void main(String[] args) {
        String[] daysOfWeek = {"Pirmdiena", "Otrdiena", "Trešdiena", "Ceturtdiena", "Piektdiena", "Sestdiena", "Svētdiena"};

        int i = 1;
        for (String day : daysOfWeek) {
            System.out.println(day);
            System.out.println("Dienas kārtas numurs ir - " + i);
            i++;
        }

    }

}

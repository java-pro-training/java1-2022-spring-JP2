package lv.lu.training.lesson2;

public class Lesson2UzdevumsII {

    public static void main (String[] args) {
        // kvadrāta malu garums (kvadrātam visas malas ir vienādas, bet tāds uzdevums)
        int side1 = 10;
        int side2 = 15;
        int side3 = 14;
        int side4 = 25;
        int result = side1; //deklarēšana un piešķiršana
        result = result + side2;
        result += side3; //infix operācija
        result += side4;
        System.out.println("perimetrs: " + result);
    }

}

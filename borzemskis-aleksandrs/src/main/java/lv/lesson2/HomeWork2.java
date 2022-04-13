package lv.lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        String part1 = "Hello";
        String part2 = "World";
        String result1 = part1 + " " + part2;
        System.out.println(result1);

        int side1 = 10;
        int side2 = 15;
        int side3 = 14;
        int side4 = 25;
        int kvadrataPerimetrs = side1;
        kvadrataPerimetrs = kvadrataPerimetrs + side2;
        kvadrataPerimetrs += side3;
        kvadrataPerimetrs += side4;
        System.out.println("Perimetrs: " + kvadrataPerimetrs);

        int base = 10;
        int height = 20;
        int triangleArea = (base * height) / 2;
        System.out.println("Triangle Area Result Is: " + triangleArea);
    }
}

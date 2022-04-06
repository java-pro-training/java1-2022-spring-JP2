package lv.lu.training.lesson2;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String part1 = "Hello";
        String part2 = "World!";
        String greeting = part1+" "+part2;
        System.out.println(greeting);


        int side1 = 10;
        int side2 = 15;
        int side3 = 13;
        int side4 = 25;
        int result = side1;
        result = result + side2;
        result +=side3;
        result +=side4;
        System.out.println("perimetrs: " + result);


    }

}

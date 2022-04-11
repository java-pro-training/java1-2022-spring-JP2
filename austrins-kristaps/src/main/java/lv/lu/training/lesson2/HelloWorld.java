package lv.lu.training.lesson2;

public class HelloWorld {

    public static void main(String[] args) {
        String greeting = "Hello world!";

        System.out.println(greeting);

        System.out.println("Hello world!");

        String part1 = "Hello ";
        String part2 = "world!";

        System.out.println(part1 + part2);

        String result = part1 + "" + part2;

        System.out.println(result);

    }
}

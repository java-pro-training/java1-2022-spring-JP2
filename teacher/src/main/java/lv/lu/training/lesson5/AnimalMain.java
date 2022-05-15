package lv.lu.training.lesson5;

public class AnimalMain {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.run();

        Human human = new Human();
        human.run();

        Animal anotherAnimal = new Human();
        anotherAnimal.run();
    }

}

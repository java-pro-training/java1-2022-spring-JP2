package lv.lu.training.lesson8.animal;

public abstract class Dog implements Animal, Mammal {

    public abstract String getName();

    @Override
    public void speak() {
        System.out.println("Woof!");
    }

    @Override
    public void produceMilk() {
        System.out.println("Dog milk");
    }

}

package lv.lu.training.lesson8.animal;

public class Bird implements Animal {

    @Override
    public void speak() {
        System.out.println("Tweet!");
    }
}

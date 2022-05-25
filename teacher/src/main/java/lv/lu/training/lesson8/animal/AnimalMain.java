package lv.lu.training.lesson8.animal;

public class AnimalMain {

    public static void main(String[] args) {
        GermanShepard germanShepard = new GermanShepard();

        callProduceMilk(germanShepard);
    }

    public static void callProduceMilk(Mammal mammal) {
        mammal.produceMilk();
    }

}

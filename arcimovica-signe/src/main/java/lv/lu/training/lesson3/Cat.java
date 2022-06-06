package lv.lu.training.lesson3;

public class Cat {
    //izveidot klasi Cat ar laukiem
    private String name;
    private String color;
    private String species;
    private int age;
    private int weight;

    public Cat(String name, String color, int weight){
        //klasei ir konstruktors ar 3 parametriem
        this.name = name;
        this.color = color;
        this.weight = weight;
}
    //pievienot visiem laukiem "get" un "set" metodes
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getSpecies(){
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }


}

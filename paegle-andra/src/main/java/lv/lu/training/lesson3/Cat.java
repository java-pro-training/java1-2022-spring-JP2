package lv.lu.training.lesson3;

public class Cat {
    private String color;
    private String name;
    private String species;
    private int age;
    private double weight ;

    public Cat(String name, String color, double weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }


}

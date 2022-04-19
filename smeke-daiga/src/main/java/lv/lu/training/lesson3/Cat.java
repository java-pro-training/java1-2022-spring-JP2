package lv.lu.training.lesson3;

//Izveidot klasi Cat
public class Cat {
    //Klases lauki:
    //Krāsa (color)
    //Nosaukums (name)
    //Suga (species)
    //Vecums (age)
    //Svars (weight)
    private String color;
    private String name;
    private String species;
    private int age;
    private int weight;

    //Klases konstruktors
    public Cat(String color, String name, int weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    //Set and Get cat's color
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    //Set and Get cat's name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    //Set and Get cat's species
    public void setSpecies(String species) {
        this.species = species;
    }
    public String getSpecies() {
        return species;
    }

    //Set and Get cat's age
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    //Set and Get cat's weight
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }

}

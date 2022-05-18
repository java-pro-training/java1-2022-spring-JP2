package lv.lu.training.lesson3;

public class Cat {
    private String color;
    private String name;
    private String species;
    private int age;
    private int weight;

    public Cat (String color, String name, int weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
        this.species = species;
        this.age = age;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    public String getSpecies() {
        return species;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }




}

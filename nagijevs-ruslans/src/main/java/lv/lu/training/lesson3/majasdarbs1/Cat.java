package lv.lu.training.lesson3.majasdarbs1;

public class Cat {
    private String color;
    private String name;
    private int age;
    private String species;
    private int weight;

    public Cat(String color, String name, int weight) { //Izmantoti tikai 3 parametri, tāpēc sākuma būs "null" pie "species" un "0" pie "age"
        this.color = color;
        this.name = name;
        this.weight = weight;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Mistake! Age cannot be negative.");
        }
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >= 0) {
            this.weight = weight;
        } else {
            System.out.println("Mistake! Weight cannot be negative.");
        }
    }
}


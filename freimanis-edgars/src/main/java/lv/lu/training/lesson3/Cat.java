package lv.lu.training.lesson3;

public class Cat {
    public String color;
    public String name;
    public String species;
    public int age;
    public int weight;

    public Cat(String color, String name, int weight, int age, String species) {
        this.color = color;
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.species = species;
    }

        public String getColor() {
            return color;
    }
        public String getName() {
            return name;
    }
        public String getSpecies() {
            return species;
    }
        public int getAge() {
            return age;
    }
        public int getWeight() {
        return weight;
    }





}

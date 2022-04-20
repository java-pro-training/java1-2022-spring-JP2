package lv.lu.training.lesson3;

public class Cat {

    private String colour;
    private String name;
    private String species;
    private int age;
    private int weight;

    public Cat(String colour, String name, int weight){
        this.colour = colour;
        this.name = name;
        this.weight = weight;
    }

    public String getColour() { return colour; }
    public void setColour(String colour) { this.colour=colour; }

    public String getName() { return name; }
    public void setName(String name) { this.name=name; }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species=species; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age=age; }

    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight=weight; }

    public static void main(String[] args) {
        Cat myCat = new Cat("Grey", "Puce", 5);
        myCat.setAge(2);
        myCat.setSpecies("Mixed-breed");

        System.out.println("My cat's color: " + myCat.getColour());
        System.out.println("name: " + myCat.getName());
        System.out.println("breed: " + myCat.getSpecies());
        System.out.println("age: " + myCat.getAge());
        System.out.println("weight: " + myCat.getWeight());

    }
}

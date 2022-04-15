package lv.lu.training.lesson3;

import javax.swing.plaf.ColorUIResource;
import java.awt.*;

public class Cat {

    private String color;
    private String name;
    private String species;
    private int age;
    private int weight;


public Cat (String color, String name, int weight, int age, String species) {
    this.color = color;
    this.name = name;
    this.weight = weight;
    this.age = age;
    this.species = species;
}

public void setColor(String color) {
        this.color = color;
}
public String getColor() {
    return color;
}
public void setName(String name) {
    this.name = name;
}
public String getName() {
    return name;
}
public void setWeight(int weight) {
    this.weight = weight;
    }
public int getWeight() {
    return weight;

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
public int getAge(){
    return age;
}


}

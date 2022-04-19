package lv.lesson3.homework3;

public class Cat {
    public String getColorOfCat() {return colorOfCat;}
    public void setColorOfCat(String colorOfCat) {this.colorOfCat = colorOfCat;}

    public String getNameOfCat() {return nameOfCat;}
    public void setNameOfCat(String nameOfCat) {this.nameOfCat = nameOfCat;}

    public String getSpecieOfCat() {return specieOfCat;}
    public void setSpecieOfCat(String specieOfCat) {this.specieOfCat = specieOfCat;}

    public int getAgeOfCat() {return ageOfCat;}
    public void setAgeOfCat(int ageOfCat) {this.ageOfCat = ageOfCat;}

    public float getWeightOfCat() {return weightOfCat;}
    public void setWeightOfCat(float weightOfCat) {this.weightOfCat = weightOfCat;}

    private String colorOfCat;
    private String nameOfCat;
    private String specieOfCat;
    private int ageOfCat;
    private float weightOfCat;

    public Cat(String nameOfCat, String colorOfCat, float weightOfCat){
        this.nameOfCat = nameOfCat;
        this.colorOfCat = colorOfCat;
        this.weightOfCat = weightOfCat;
    }
    public  Cat(){}
    public String getFullDescribeOfCat(){
        return nameOfCat +
                ", color: " + colorOfCat +
                ", species: " + specieOfCat +
                ", age: " + ageOfCat +
                ", weight: " + weightOfCat + "kg.";
    }
}

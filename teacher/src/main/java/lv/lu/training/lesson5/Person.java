package lv.lu.training.lesson5;

public class Person {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null && object.getClass() == this.getClass()) {
            return this == object ||
                    this.name.equals(((Person) object).getName());
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Person : " + name;
    }

}

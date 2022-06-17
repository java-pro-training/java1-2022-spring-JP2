package lv.lu.training.darupati.AstotaaLekcija;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getFirstName(){       //metode, kā dabūt vārdu
        return firstName;
    }

    public String getLastName(){        //metode, kā dabūt uzvārdu
        return lastName;
    }

    public String getName(){        //metode, kā dabūt vārdu un uzvārdu
        return firstName + " " + lastName;
    }


}

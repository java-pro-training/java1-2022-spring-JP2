package lv.lu.training.lesson8homework2;
//Izveidojam specializētu Employee klasi nosaucot to Executive.

public class Executive extends Employee{
    //Šajā klasē ievietojam lauku “double bonus”....
    private double bonus;

    //...un metodi awardBonus(double), kas pieliek bonusu ??? Isn't set gonna do it?

    //KOnstruktors
    public Executive(String firstName, String lastName, String SSN, double salary) {
        super(firstName, lastName, SSN, salary);

    }

    //Metode “pay” atgriež virsklases pay metodes rezultātu ar pieskaitītu bonus. Pēc metodes izpildes bonus = 0

    @Override
    public double pay() {
        return super.pay() + bonus;
    }


    //Pievienojam seteru un geteru metodes visiem laukiem

    //Set and Get Bonus
    public void awardBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Executive employee: Employee " + getFirstName() + " " + getLastName() + "  "+ getSSN() + " bonus: " + getBonus() + " salary plus award: " + pay();
    }
}

package lv.lu.training.lesson5;

public class BankAccount {

    private double amount;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    double getAmount() {
        return amount;
    }

    void add(double amount) {
        this.amount += amount; // this.amount = this.amount + amount;
    }

    void subtract(double amount) {
        if (this.amount >= amount) {
            this.amount -= amount;
            System.out.println("No konta noņemts: " + amount);
            System.out.println("Konta atlikums pēc veiksmīgas operācijas: " + this.amount);
        } else {
            System.out.println("Kontā nepietiek līdzekļu darbības veikšanai!");
        }
    }

}

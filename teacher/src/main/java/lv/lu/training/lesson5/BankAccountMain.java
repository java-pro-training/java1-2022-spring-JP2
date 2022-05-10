package lv.lu.training.lesson5;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAmount(100);
        bankAccount.subtract(50);
        bankAccount.subtract(60);

        System.out.println("Konta atlikums: " + bankAccount.getAmount());
    }

}

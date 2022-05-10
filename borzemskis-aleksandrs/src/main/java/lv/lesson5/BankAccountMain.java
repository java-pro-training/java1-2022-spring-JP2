package lv.lesson5;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount janisBerzins = new BankAccount(
                "LV56HABA254213456413",
                "4566",
                0,
                200);
        System.out.println(janisBerzins);
        janisBerzins.topUp(100, "456");
        System.out.println(janisBerzins);
        janisBerzins.withDraw(15,"4566");
        System.out.println(janisBerzins);
        janisBerzins.topUp(300,"4566");
        System.out.println(janisBerzins);

    }
}

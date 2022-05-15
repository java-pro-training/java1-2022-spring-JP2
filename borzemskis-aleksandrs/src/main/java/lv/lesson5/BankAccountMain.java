package lv.lesson5;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount janisBerzins = new BankAccount(
                "LV56HABA254213456413",
                "e566",
                0,
                200);
        System.out.println(janisBerzins);
        janisBerzins.topUp(100, "e566");
        System.out.println(janisBerzins);
        janisBerzins.withDraw(150,"e566");
        System.out.println(janisBerzins);
        janisBerzins.topUp(300,"E566");
        System.out.println(janisBerzins);

    }
}

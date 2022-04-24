package lv.lu.training.lesson4;

public class ChargeCreditCard {
    public static void main(String[] args) {
        String creditCardStatus = "Active";
        switch (creditCardStatus) {
            case "Active": {
                System.out.println("Credit card is chargable");
                System.out.println("Credit card amount is 3000.00 EUR");
                break;
            }
            case "Blocked": {
                System.out.println("Credit card is blocked");
                break;
            }
            default: {
                System.out.println("Unknown status: " + creditCardStatus);
            }
        }

        System.out.println("The end...");
    }
}

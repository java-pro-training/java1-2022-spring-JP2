package lv.lu.training.lesson12;

public class PriceCalculator {

    public static double calculatePrice(double itemPrice, int quantity) {
        if (quantity * itemPrice > 1000)
            return quantity * itemPrice * 0.95;
        else
            return quantity * itemPrice * 0.98;
    }

}

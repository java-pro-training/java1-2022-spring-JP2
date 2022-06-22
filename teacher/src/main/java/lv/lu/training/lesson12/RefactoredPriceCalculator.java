package lv.lu.training.lesson12;

public class RefactoredPriceCalculator {

    public static double calculatePrice(double itemPrice, int quantity) {
        double totalPrice = itemPrice * quantity;
        if (totalPrice > 1000) {
            return totalPrice * 0.95;
        }
        return totalPrice * 0.98;
    }

}

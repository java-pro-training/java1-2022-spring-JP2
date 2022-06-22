package lv.lu.training.lesson12.order;

import java.util.List;

public class Order {

    private User user;
    private List<Product> products;

    public Order(User user, List<Product> products) {
        this.user = user;
        this.products = products;
    }

    public double calculateTotal() {
        double total = calculateTotalPrice();
        return applRegionalDiscounts(total);
    }

    private double calculateTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.quantity * product.price;
        }
        return total;
    }

    private double applRegionalDiscounts(double total) {
        switch (user.country) {
            case "US":
                total *= 0.85;
                break;
            case "RU":
                total *= 0.75;
                break;
            case "LV":
                total *= 0.9;
                break;
            case "LT":
                total *= 0.7;
                break;
            case "EE":
                total *= 0.76;
                break;

        }
        return total;
    }

}
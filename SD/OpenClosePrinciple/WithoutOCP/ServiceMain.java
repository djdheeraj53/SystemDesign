import java.util.ArrayList;
import java.util.List;

interface PricedItem {
    double getPrice();
}

// Product class implementing PricedItem
class Product implements PricedItem {
    private String name;
    private double price;

    public Product(String name, double price) {
        System.out.println("Creating product: " + name + " with price: " + price);
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        System.out.println("Calculating price for product: " + name);
        return price;
    }
}

// Service class implementing PricedItem
class Service implements PricedItem {
    private String name;
    private double hourlyRate;
    private int hours;

    public Service(String name, double hourlyRate, int hours) {
        System.out.println("Creating service: " + name + " with hourly rate: " + hourlyRate + " and hours: " + hours);
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public double getPrice() {
        System.out.println("Calculating price for service: " + name);
        return hourlyRate * hours;
    }
}

// ShoppingCart class
class ShoppingCart {
    private List<PricedItem> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(PricedItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0.0;
        for (PricedItem item : items) {
            System.out.println("Adding price of item: " + item.getPrice() + " to total.");
            total += item.getPrice();
        }
        return total;
    }
}

// Main class to test the functionality
public class ServiceMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding products and services
        cart.addItem(new Product("Laptop", 50000));
        cart.addItem(new Service("Repair Service", 500, 2));

        System.out.println("Total Price: " + cart.calculateTotal());
    }
}
import java.util.ArrayList;
import java.util.List;

// Interface for all items with a price
interface PricedItem {
    double getPrice();
}

// Product class
class Product implements PricedItem {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

// Service class
class Service implements PricedItem {
    private String name;
    private double hourlyRate;
    private int hours;

    public Service(String name, double hourlyRate, int hours) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public double getPrice() {
        return hourlyRate * hours;
    }

    public String getName() {
        return name;
    }
}

// Discount class
class Discount implements PricedItem {
    private String name;
    private double amount;

    public Discount(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public double getPrice() {
        return -amount; // Discounts reduce the total price
    }

    public String getName() {
        return name;
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
            total += item.getPrice();
        }
        return total;
    }

    public void showItems() {
        for (PricedItem item : items) {
            if (item instanceof Product) {
                System.out.println("Product: " + ((Product) item).getName() + " | Price: " + item.getPrice());
            } else if (item instanceof Service) {
                System.out.println("Service: " + ((Service) item).getName() + " | Price: " + item.getPrice());
            } else if (item instanceof Discount) {
                System.out.println("Discount: " + ((Discount) item).getName() + " | Amount: " + item.getPrice());
            }
        }
    }
}

// Main class to test ShoppingCart
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding products
        cart.addItem(new Product("Laptop", 50000));
        cart.addItem(new Product("Mouse", 500));

        // Adding services
        cart.addItem(new Service("Repair Service", 500, 2));
        cart.addItem(new Service("Installation Service", 300, 1));

        // Adding discount
        cart.addItem(new Discount("New Year Discount", 1000));

        // Show items and total
        cart.showItems();
        System.out.println("Total Price: " + cart.calculateTotal());
    }
}
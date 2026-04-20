package SystemDesign.SD.DesignPattern.FactoryDesignPattern.Pizza;

abstract class Pizza {
    public abstract void prepare();
}

class VegPizza extends Pizza {
    public void prepare() {
        System.out.println("Preparing Veg Pizza 🍕");
    }
}

class ChickenPizza extends Pizza {
    public void prepare() {
        System.out.println("Preparing Chicken Pizza 🍗🍕");
    }
}

class PizzaFactory {

    public static Pizza createPizza(String type) {

        if (type.equalsIgnoreCase("veg")) {
            return new VegPizza();
        } 
        else if (type.equalsIgnoreCase("chicken")) {
            return new ChickenPizza();
        }

        throw new IllegalArgumentException("Unknown pizza type: " + type);
    }
}

public class Main {
    public static void main(String[] args) {

        Pizza pizza1 = PizzaFactory.createPizza("veg");
        pizza1.prepare();

        Pizza pizza2 = PizzaFactory.createPizza("chicken");
        pizza2.prepare();
    }
}

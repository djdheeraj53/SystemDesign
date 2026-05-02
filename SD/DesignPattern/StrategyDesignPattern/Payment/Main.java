package SD.DesignPattern.StrategyDesignPattern.Payment;

interface PaymentStrategy {
  void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {
  public void pay(int amount) {
    System.out.println("Paid " + amount + " using Credit Card");
  }
}

class UPIPayment implements PaymentStrategy {
  public void pay(int amount) {
    System.out.println("Paid " + amount + " using UPI");
  }
}

class PaymentContext {
  private PaymentStrategy strategy;

  public PaymentContext(PaymentStrategy strategy) {
    this.strategy = strategy;
  }

  public void setStrategy(PaymentStrategy strategy) {
    this.strategy = strategy;
  }

  public void payAmount(int amount) {
    strategy.pay(amount);
  }
}

public class Main {
  public static void main(String[] args) {

    PaymentContext context = new PaymentContext(new CreditCardPayment());
    context.payAmount(1000);

    // Change strategy at runtime
    context.setStrategy(new UPIPayment());
    context.payAmount(500);
  }
}

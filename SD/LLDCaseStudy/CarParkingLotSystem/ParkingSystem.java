package SD.LLDCaseStudy.CarParkingLotSystem;

// -------------------- Parking Spot --------------------
abstract class ParkingSpot {
  private int id;
  private boolean isFree;

  public ParkingSpot(int id) {
    this.id = id;
    this.isFree = true;
  }

  public boolean isFree() {
    return isFree;
  }

  public void setFree(boolean free) {
    isFree = free;
  }

  public int getId() {
    return id;
  }

  // Important for LLD
  public abstract boolean canFitVehicle(Vehicle vehicle);
}

class LargeSpot extends ParkingSpot {
  public LargeSpot(int id) {
    super(id);
  }

  @Override
  public boolean canFitVehicle(Vehicle vehicle) {
    return true; // can fit all
  }
}

class CompactSpot extends ParkingSpot {
  public CompactSpot(int id) {
    super(id);
  }

  @Override
  public boolean canFitVehicle(Vehicle vehicle) {
    return vehicle instanceof Car;
  }
}

class MotorcycleSpot extends ParkingSpot {
  public MotorcycleSpot(int id) {
    super(id);
  }

  @Override
  public boolean canFitVehicle(Vehicle vehicle) {
    return vehicle instanceof Motorcycle;
  }
}

// -------------------- Vehicle --------------------
abstract class Vehicle {
  private String licenseNumber;
  private ParkingTicket ticket;

  public Vehicle(String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }

  public String getLicenseNumber() {
    return licenseNumber;
  }

  public abstract boolean assignTicket(ParkingTicket ticket);
}

class Car extends Vehicle {
  public Car(String licenseNumber) {
    super(licenseNumber);
  }

  @Override
  public boolean assignTicket(ParkingTicket ticket) {
    System.out.println("Assigning ticket to car: " + getLicenseNumber());
    return true;
  }
}

class Motorcycle extends Vehicle {
  public Motorcycle(String licenseNumber) {
    super(licenseNumber);
  }

  @Override
  public boolean assignTicket(ParkingTicket ticket) {
    System.out.println("Assigning ticket to motorcycle: " + getLicenseNumber());
    return true;
  }
}

// -------------------- Payment --------------------
abstract class Payment {
  protected double amount;
  protected String status;

  public Payment(double amount) {
    this.amount = amount;
    this.status = "Pending";
  }

  public abstract void initiateTransaction();
}

class CashPayment extends Payment {
  public CashPayment(double amount) {
    super(amount);
  }

  @Override
  public void initiateTransaction() {
    System.out.println("Processing cash payment: $" + amount);
    this.status = "Completed";
  }
}

class CreditCardPayment extends Payment {
  public CreditCardPayment(double amount) {
    super(amount);
  }

  @Override
  public void initiateTransaction() {
    System.out.println("Processing credit card payment: $" + amount);
    this.status = "Completed";
  }
}

// -------------------- Parking Ticket --------------------
class ParkingTicket {
  private int ticketNumber;
  private long timestamp;
  private double amount;
  private Payment payment;

  public ParkingTicket(int ticketNumber, double amount) {
    this.ticketNumber = ticketNumber;
    this.timestamp = System.currentTimeMillis();
    this.amount = amount;
  }

  public void setPayment(Payment payment) {
    this.payment = payment;
  }

  public Payment getPayment() {
    return payment;
  }

  public int getTicketNumber() {
    return ticketNumber;
  }
}

// -------------------- Parking Lot --------------------
class ParkingLot {
  private String name;
  private String address;

  public ParkingLot(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public ParkingTicket getParkingTicket(Vehicle vehicle) {
    System.out.println("Generating ticket for vehicle: " + vehicle.getLicenseNumber());

    int ticketId = (int) (Math.random() * 1000);
    ParkingTicket ticket = new ParkingTicket(ticketId, 0.0);

    vehicle.assignTicket(ticket);
    return ticket;
  }
}

// -------------------- Main --------------------
public class ParkingSystem {
  public static void main(String[] args) {
    ParkingLot parkingLot = new ParkingLot("City Center Parking", "123 Main St");

    Vehicle car = new Car("ABC123");

    ParkingTicket ticket = parkingLot.getParkingTicket(car);

    Payment payment = new CashPayment(20.0);
    payment.initiateTransaction();
    ticket.setPayment(payment);

    System.out.println("Parking ticket processed: " + ticket.getTicketNumber());
  }
}